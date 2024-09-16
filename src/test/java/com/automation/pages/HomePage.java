package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElement dashBoardText;
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement imageShown;

    @FindBy(xpath = "//ul//li[3]//a[@class='oxd-main-menu-item']")
    WebElement leaveButton;


    public Boolean isHomePageDisplayed(){
        return dashBoardText.isDisplayed() && imageShown.isDisplayed();
    }

    public void clickOnLeaveButton(){
        leaveButton.click();
    }


}
