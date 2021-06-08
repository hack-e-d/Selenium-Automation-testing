package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	public static void main (String a[]) {
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
		
//		selenium can alter the forward back and reload functions
		
		driver.navigate().back();

	}
}
