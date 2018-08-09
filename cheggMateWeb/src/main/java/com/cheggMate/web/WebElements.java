package com.cheggMate.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




/**
 * Created by alik on 06/03/2017.
 */
public class WebElements {

    //WebElements
    public WebElement SignIn;
    private WebElement User;
    private WebElement PassWord;
    private WebElement Submit;

    private WebDriver mDriver;

    public WebElements(WebDriver webDriver) {

        mDriver = webDriver;
    }

    public WebElement getSignIn() {
        return mDriver.findElement(By.xpath("//*[@id=\"root\"]/div/section/header/nav[2]/a"));
    }

    public WebElement getUser() {
        return mDriver.findElement(By.xpath("//*[@id=\"eggshell-25\"]/form/div/div/div/div/fieldset/input[1]"));
    }

    public WebElement getPassWord() {
        return mDriver.findElement(By.xpath("//*[@id=\"eggshell-25\"]/form/div/div/div/div/fieldset/input[3]"));
    }

    public WebElement getSubmit() {
        return mDriver.findElement(By.xpath("//*[@id=\"eggshell-25\"]/form/div/div/div/footer/button"));
    }
    //Strings

}

