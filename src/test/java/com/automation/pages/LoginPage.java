package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInput;
    @FindBy(tagName = "button")
    WebElement loginBtn;

    public void openWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void doLogin(String Username,String Password){
        usernameInput.sendKeys(Username);
        passwordInput.sendKeys(Password);
        loginBtn.click();
    }

}
