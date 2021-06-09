package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        String URL = "https://demoqa.com/droppable";
        String firstNameInput = "Vijay";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //		Telling which site to access
        driver.get(URL);
        //		used to maximize the webApp
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id(""));

        Actions builder = new Actions(driver);

    }
}
