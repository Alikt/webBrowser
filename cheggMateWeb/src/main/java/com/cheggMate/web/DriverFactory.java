package com.cheggMate.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alik on 07/03/2017.
 */

public class DriverFactory{

    public enum DriverType {
        CHROME

    }
    public static WebDriver getDriverByType(DriverType type){
          switch (type) {

                default:
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "/Users/alik/Downloads/chromedriver");
                    ChromeDriver chromeDriver = new ChromeDriver();
                    chromeDriver.manage().window().maximize();

                    return chromeDriver;
            }
        }

    }
