package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOIBIGOCitySelection {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.goibibo.com/";
        String firstNameInput = "Vijay";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //		Telling which site to access
        driver.get(URL);
        //		used to maximize the webApp
        driver.manage().window().maximize();

        String fromPlace = "Chennai";
        String toPlace = "Delhi";

        WebElement from = driver.findElement(By.id("gosuggest_inputSrc"));
        WebElement to = driver.findElement(By.id("gosuggest_inputDest"));

        from.sendKeys(fromPlace);
        Thread.sleep(3000);
        from.sendKeys(Keys.DOWN);
        Thread.sleep(3000);
        from.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        to.sendKeys(toPlace);
        Thread.sleep(3000);
        to.sendKeys(Keys.DOWN);
        Thread.sleep(3000);
        to.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        driver.findElement(By.id("departureCalendar")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='fare_20210616']")).click();
//        Thread.sleep(10000);

        driver.findElement(By.id("gi_search_btn")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
