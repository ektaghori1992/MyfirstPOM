package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;



    public WebDriver initialiseDriver(String browserName){
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if (browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }else {
            System.out.println("Browser not matched");
        }



        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();



        return driver;
    }
    public Properties initialiseProperties()  {
        prop = new Properties();

        try {
            file = new FileInputStream("C:\\Users\\r1\\IdeaProjects\\ProjectObjectModel\\src\\test\\resources\\TestData\\Config.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            System.out.println("Config file is not found, Please check......");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Properties could not be loaded");
        }
        return prop;
    }

}
