package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Prerequisites {

    WebDriver driver;

    @BeforeTest
    public void getBrowser() {
        //System.setProperty("webdriver.chrome.drive", "/home/tunay/Documents/Dependencies/chromedriver_linux64/chromedriver");
        // No longer needed. Webdriver is taken into IDE library.

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        String url = ("https://robotsparebinindustries.com/");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("maria");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("thoushallnotpass");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/form/button")).click();
    }

    @AfterTest

    public void closeTheDriver() {
        driver.quit();
    }
}

