package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask3 {

	public static void main(String[] args) {
		//		Handling check box

		String URL = "https://nxtgenaiacademy.com/demo-site/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//		Telling which site to access
		driver.get(URL);
		//		used to maximize the webApp
		driver.manage().window().maximize();

		WebElement checkBox = driver.findElement(By.id("vfb-20-1"));

		if(checkBox.isDisplayed()) {
			System.out.println("The check box is displayed");
		} else {
			System.out.println("The check box is not displayed");
		}
		
		if(checkBox.isEnabled()) {
			System.out.println("The check box is enabled");
		} else { 
			System.out.println("The check box is not enabled");
		}
		
		if(checkBox.isSelected()) {
			System.out.println("the check box is selected");
		} else {
			System.out.println("The check box is not selected");
			checkBox.click();
		}
		
//		After clicking
		if(checkBox.isSelected()) {
			System.out.println("the check box is selected");
			checkBox.click();
		} else {
			System.out.println("The check box is not selected");
			checkBox.click();
		}
		
//		Handling radio buttons
		
		WebElement femaleRadioButton = driver.findElement(By.id("vfb-8-2"));
		
		if(femaleRadioButton.isSelected()) {
			System.out.println("Female radio button is selected");
		} else {
			System.out.println("Female radio button is not selected");
			femaleRadioButton.click();
		}
		
		driver.quit();
	}
}
