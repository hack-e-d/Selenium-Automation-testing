package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String args[]) {
		
//		Creating a instance for accessing the web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		Telling which site to access
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
//		used to maximize the webApp
		driver.manage().window().maximize();
		

//		finding using tag name
		driver.findElement(By.tagName("INPUT")).sendKeys("Sample@gmail.com");

	}
}
