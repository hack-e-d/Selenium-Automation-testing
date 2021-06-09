package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        String URL = "https://www.demo.guru99.com/test/simple_context_menu.html";
        String firstNameInput = "Vijay";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gs1-vijayp\\SeleniumAutomation\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //		Telling which site to access
        driver.get(URL);
        //		used to maximize the webApp
        driver.manage().window().maximize();

        WebElement contextClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        WebElement copyOption = driver.findElement(By.xpath("//span[normalize-space()='Copy']"));

        Actions builder = new Actions(driver); //Actions are used to perform a series of tasks

        builder.moveToElement(contextClick)
                .contextClick() //context click denoted right click
                .pause(3000)
                .click(copyOption)
                .perform();

//        close pop up
        driver.switchTo().alert().dismiss(); //Used to close the alert box

        driver.quit();
    }
}
