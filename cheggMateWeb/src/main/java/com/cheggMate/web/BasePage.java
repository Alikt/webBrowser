package com.cheggMate.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.NoSuchElementException;

import static com.cheggMate.web.DriverFactory.DriverType.CHROME;

public abstract class BasePage<T> {

    public T openScreen(Class<T> expectedScreen)
    {
        T screen = PageFactory.initElements(DriverFactory.getDriverByType(CHROME), expectedScreen);
        return screen;
    }

    public boolean isElementDisplay(WebElement element){
        try{
            if(element.isDisplayed()) return true;
        }
        catch(NoSuchElementException e){
            return false;
        }
        return false;
    }
}
