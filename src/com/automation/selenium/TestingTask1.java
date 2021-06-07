package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTask1 {
	public static void main (String a[]) {
		/*
		 * Title validation
		 * click on python for data science 
		 * verify the link 
		 * check page source size
		 * Navigate to new link 
		 * click the new browser button and close
		 */
		
//		Creating a instance for accessing the web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		Telling which site to access
		driver.get("https://nxtgenaiacademy.com/demo-site/");
//		used to maximize the webApp
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The title of the page is : "+actualTitle);
		} else {
			System.out.println("The title is a mismatch.");
		}
		
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://nxtgenaiacademy.com/python/";
		
		if(currentURL.equals(expectedURL)) {
			System.out.println("The current URL : "+currentURL);
		} else {
			System.out.println("The URL is a mismatch.");
		}
		
		int pageSourceLength = driver.getPageSource().length();
		
		System.out.println("Page source size : "+pageSourceLength);
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		driver.findElement(By.name("newbrowserwindow123")).click();
		
//		the close function will close only the main browser
		driver.close();
		
//		quit will close all the windows
		driver.quit();
	}

}
