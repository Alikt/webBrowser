package com.cheggMate.web;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import static com.cheggMate.web.DriverFactory.DriverType.CHROME;
import com.cheggMate.web.WebElements.*;

import java.util.List;
import java.util.Set;


public class WebSanityTests extends BasePage {

    public WebDriver driver;
    WebElements webElements;

    @BeforeTest
    public void StartDriver(){

         driver = DriverFactory.getDriverByType(CHROME);
    }



    @Test(enabled=true)
    public void LogIN () throws Exception {

        System.out.println("-------------------Navigating to CheggMateWeb--------------------------");
        driver.get("http://trunk.live.test.cheggnet.com/cheggmate");
        webElements = new WebElements(driver);

        Actions.clickOnItem(webElements.getSignIn(), driver);

        Actions.SendKey(webElements.getUser(),"mate444@chegg.com");
        Actions.SendKey(webElements.getPassWord(),"Ch123456");
        Actions.clickOnItem(webElements.getSubmit(), driver);


        Thread.sleep(5000);
        driver.get("http://trunk.live.test.cheggnet.com/cheggmate");
        Thread.sleep(10000);


    }




}