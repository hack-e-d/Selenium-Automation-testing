package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask2 {
	public static void main(String a[]) {
		/*
		 * Handling text box :
		 * find the text box and check if its enabled 
		 */
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		String firstNameInput = "Vijay";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//		Telling which site to access
		driver.get(URL);
		//		used to maximize the webApp
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("vfb-5"));
		
		if(firstName.isDisplayed()) {
			System.out.println("First name is displayed");
		} else {
			System.out.println("First name is no displayed");
		}
		
		if(firstName.isEnabled()) {
			System.out.println("First name is enabled");
			firstName.sendKeys(firstNameInput);
		} else {
			System.out.println("First name is disabled");
		}
		
		System.out.println(firstName.getAttribute("name"));
		System.out.println("Value in first name before clearing : "+firstName.getAttribute("value"));
		
		firstName.clear();
		System.out.println("Value in first name after clearing : "+firstName.getAttribute("value"));

//		Web element button
		
		WebElement submitButton = driver.findElement(By.id("vfb-4"));
		
		if(submitButton.isEnabled()) {
			System.out.println("Submit button is enabled");
		} else {
			System.out.println("Submit button is not enabled");
		}
		submitButton.click();
		System.out.println("Submit button is clicked");
		driver.quit();
	}
}
