package com.cheggMate.web;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import static com.cheggMate.web.DriverFactory.DriverType.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by alik on 09/03/2017.
 */
public class Actions {

    public static boolean clickOnItem(WebElement webElement, WebDriver driver) {


        long timeOutInSeconds = 20;

            WebElement present = new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(webElement));
            WebElement clickable = new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(webElement));

        try {
            webElement.click();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean SendKey(WebElement webElement, String string) {


        long timeOutInSeconds = 20;

        WebDriver driver  = DriverFactory.getDriverByType(CHROME);
        WebElement present = new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOf(webElement));
        WebElement clickable = new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.elementToBeClickable(webElement));

        try {
            webElement.sendKeys(string);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
