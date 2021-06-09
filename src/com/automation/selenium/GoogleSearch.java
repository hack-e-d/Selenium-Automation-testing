package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.google.com/";
        String value = "selenium";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //		Telling which site to access
        driver.get(URL);
        //		used to maximize the webApp
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));

        Actions builder = new Actions(driver);

        Action seriesOfActions = builder.moveToElement(searchBox)
                .keyDown(Keys.SHIFT)
                .sendKeys(searchBox,value)
                .pause(3000)
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .build();

        seriesOfActions.perform();

        Thread.sleep(5000);

        driver.quit();
    }
}
