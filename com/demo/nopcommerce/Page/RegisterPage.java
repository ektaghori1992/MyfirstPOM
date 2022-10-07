package com.demo.nopcommerce.Page;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Utilities.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    By registerLinkl = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");

    By Gender = By.id("gender-female");

    By FirstName = By.id("FirstName");
    By LastName = By.id("LastName");
    By DateOfBirth = By.name("DateOfBirthDay");
    By DateOfMonth = By.name("DateOfBirthMonth");
    By DateOfYear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By RegButton = By.xpath("//*[@id=\"register-button\"]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }
    public void clickOnRegisterLink(){
        utils.doClick(registerLinkl);

    }
    public void doRegister(String fName, String lName,String dob, String mob, String yob, String EmailId, String pwd, String cpwd){
        utils.doClick(Gender);
        utils.doSendkey(FirstName,fName);
        utils.doSendkey(LastName,lName);
        utils.doSendkey(DateOfBirth,dob);
        utils.doSendkey(DateOfMonth,mob);
        utils.doSendkey(DateOfYear,yob);
        utils.doSendkey(Email,EmailId);
        utils.doSendkey(Password,pwd);
        utils.doSendkey(ConfirmPassword,cpwd);
        utils.doClick(RegButton);

    }
}
