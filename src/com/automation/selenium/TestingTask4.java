package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask4 {

	public static void main(String[] args) {
		/*
		 * Handling Images
		 * check if image is present 
		 * get image text
		 * click and navigate
		 * close
		 */
		
		String URL = "https://nxtgenaiacademy.com/demo-site/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//		Telling which site to access
		driver.get(URL);
		//		used to maximize the webApp
		driver.manage().window().maximize();

		WebElement robotImage = driver.findElement(By.xpath("//img[@alt='Automation']"));
		
		if(robotImage.isDisplayed()) {
			System.out.println("Robot image is displayed");
		} else { 
			System.out.println("Robot image is not displayed");
		}
		
		if(robotImage.getAttribute("alt") != null) {
			System.out.println("Alternate text of Robot image : "+robotImage.getAttribute("alt"));
		}
		
		robotImage.click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
