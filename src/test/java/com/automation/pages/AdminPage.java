package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{

    @FindBy(xpath = "//ul//li[1]//a[@class='oxd-main-menu-item']")
    WebElement adminButton;
    @FindBy(xpath = "//label[text()='User Role']/../following-sibling::div")
    WebElement userRoleDropDown;
    @FindBy(xpath = "//label[contains(text(),'User Role')]/..//following-sibling::div/div/div[2]/div[2]/span")
    WebElement adminInUserDropDown;
    @FindBy(xpath = "//div[@class='oxd-form-actions']//button[2]")
    WebElement searchButton;
    @FindBy(xpath = "//div[@class=\"oxd-table-card\"]")
    List<WebElement> rows;

    public void clickOnAdminButton(){
        adminButton.click();
    }
    public void clickOnUserRoleDropDown(){
        userRoleDropDown.click();
    }
    public void clickOnAdminInUserRoleDropDown(){
        adminInUserDropDown.click();
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }
    public int noOfRows(){
        return rows.size();
    }
}
