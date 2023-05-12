package com.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class P2RoboPage {
    WebDriver driver;
    By roboTab = By.xpath("//*[@id=\"root\"]/header/div/ul/li[2]/a");
    By roboAgreement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/button[1]");
    By roboHead = By.xpath("//*[@id=\"head\"]/option[4]");
    By roboBody = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/form/div[2]/div/div[3]/label");
    By roboLegs = By.xpath("//*[@id=\"1683875896055\"]");
    By roboShippingAdress = By.xpath("//*[@id=\"address\"]");
    By roboPreviewTab = By.xpath("//*[@id=\"preview\"]");
    By roboOrderingButton = By.xpath("//*[@id=\"order\"]");

    public P2RoboPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickRoboTab() {
        WebElement roboTabElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(roboTab));
        roboTabElement.click();
    }

    public void clickRoboAgreement() {
        WebElement roboAgreementElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(roboAgreement));
        roboAgreementElement.click();
    }

    public void chooseHead() {
        WebElement roboHeadElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(roboHead));
        roboHeadElement.click();
    }

    public void chooseBody() {
        WebElement roboBodyElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(roboBody));
        roboBodyElement.click();
    }

    public void chooseLegs() {
        WebElement roboLegsElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(roboLegs));
        //roboLegsElement.click();
        roboLegsElement.sendKeys("1");
    }

    public void enterShippingAdress() {
        WebElement roboShippingAddressElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(roboShippingAdress));
        roboShippingAddressElement.sendKeys("Bulgaria");
    }

    public void roboPreview() {
        WebElement roboPreviewTabElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(roboPreviewTab));
        roboPreviewTabElement.click();
    }

    public void roboOrder() {
        WebElement roboOrderElement = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(roboOrderingButton));
        roboOrderElement.click();
    }
}