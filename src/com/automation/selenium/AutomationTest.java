package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	public static void main(String arg[]) {
		AutomationTest automationTest = new AutomationTest();
		System.out.println(automationTest.helloMessage());

//		Creating a instance for accessing the web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		Telling which site to access
		driver.get("https://nxtgenaiacademy.com/demo-site/");
//		used to maximize the webApp
		driver.manage().window().maximize();
		
//		Locating by id
		driver.findElement(By.id("vfb-5")).sendKeys("vijay");
		
		driver.findElement(By.id("vfb-7")).sendKeys("P V");
		
//		Locator by name
		driver.findElement(By.name("vfb-13[address]")).sendKeys("ASD");
		
//		accessing link we can use either link text or partial link 
//		driver.findElement(By.linkText("HOME")).click();
////		this will match  the partial text
//		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		
//		identify with x path (Always use relative x path)
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("entered with xpath");

//		finding using tag name
		driver.findElement(By.tagName("INPUT")).sendKeys("Sample@gmail.com");
//		driver.close();
	}

	public String helloMessage() {
		return "Hello Earthlings!!!!!";
	}
}
