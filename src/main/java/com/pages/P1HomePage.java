package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class P1HomePage {
    WebDriver driver;


    public By firstNameField = By.id("firstname");
    public By lastNameField = By.xpath("//*[@id=\"lastname\"]");
    public By salesTargetField = By.xpath("//*[@id=\"salestarget\"]/option[2]");
    public By salesResultField = By.xpath("//*[@id=\"salesresult\"]");
    public By submitButton = By.xpath("//*[@id=\"sales-form\"]/button");


    public P1HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillFirstName() {
        WebElement firstNameElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        firstNameElement.sendKeys("Don");
        assertEquals("Don", firstNameElement.getAttribute("value"));
    }

    public void fillLastName() {
        WebElement lastNameElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        lastNameElement.sendKeys("Johnson");
        assertEquals("Johnson", lastNameElement.getAttribute("value"));
    }

    public void setSalesTarget() {
        WebElement salesTargetElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(salesTargetField));
        salesTargetElement.click();
        assertTrue(salesTargetElement.isSelected());
    }

    public void fillResults() {
        WebElement salesResultElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(salesResultField));
        salesResultElement.sendKeys("10001");
        assertEquals("10001", salesResultElement.getAttribute("value"));
    }

    public void clickSubmitButton() {
        WebElement submitButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButtonElement.click();
    }
}
