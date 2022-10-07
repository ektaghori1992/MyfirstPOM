package com.demo.nopcommerce.Utilities;

import com.demo.nopcommerce.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class Utils {
    WebDriver driver;
    public Utils (WebDriver driver){

        this.driver =driver;
    }
    public WebElement getElement(By locator){
        WebElement element =driver.findElement(locator);
        return element;
    }
    public void doSendkey(By locator, String value){

        getElement(locator).sendKeys(value);
    }
    public void doClick(By locator) {
        getElement(locator).click();
    }
}
