package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage {

    @FindBy(xpath = "//ul/li/a[text()='Apply']")
    WebElement applyButton;
    @FindBy(xpath = "//label[text()='Leave Type']/..//following-sibling::div")
    WebElement leaveTypeDropDown;
    @FindBy(xpath = "//span[text()='CAN - FMLA']")
    WebElement CANFMLAOption;

    @FindBy(xpath = "//label[text()='To Date']/..//following-sibling::div")
    WebElement openToDateMenu;
    @FindBy(xpath = "//label[text()='To Date']/..//following-sibling::div//div[@class='oxd-date-input']/input")
    WebElement toMonthSetInput;
    @FindBy(xpath = "//label[text()='From Date']/..//following-sibling::div")
    WebElement openFromDateMenu;
    @FindBy(xpath = "//label[text()='From Date']/..//following-sibling::div//div[@class='oxd-date-input']/input")
    WebElement fromMonthSetInput;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement applyButtonInLeavePage;

    @FindBy(xpath = "//label[text()='Partial Days']/..//following-sibling::div")
    WebElement openPartialDaysDropDown;
    @FindBy(xpath = "//span[text()='All Days']")
    WebElement selectAllDays;

    @FindBy(xpath = "//label[text()='Duration']/..//following-sibling::div")
    WebElement openDurationDropDown;
    @FindBy(xpath = "//span[text()='Half Day - Morning']")
    WebElement selectHalfDayMorning;

    @FindBy(xpath = "//div[contains(@class,'oxd-toast-container oxd-toast-container')]/div")
    WebElement popup;
    @FindBy(xpath = "//ul//li/a[text()='My Leave']")
    WebElement myLeaveButton;


    public Boolean isLeavePageDisplayed(){
        WebElement leaveTxt = driver.findElement(By.xpath("//span/h6[text()='Leave']"));
        WebElement leaveListTxt = driver.findElement(By.xpath("//div/h5[text()='Leave List']"));
        return leaveTxt.isDisplayed() && leaveListTxt.isDisplayed();
    }

    public void clickOnApplyButton(){
        applyButton.click();
    }
    public void clickOnLeaveTypeDropDown(){
        leaveTypeDropDown.click();
    }
    public void clickOnFMLAOption(){
        CANFMLAOption.click();
    }
    public void clickOnApplyButtonInLeavePage(){
        applyButtonInLeavePage.click();
    }
    public void clickOnMyLeaveOption(){
        myLeaveButton.click();
    }

    public void selectFromAndToDate(String fromDate,String toDate){
        openToDateMenu.click();
        toMonthSetInput.click();
        toMonthSetInput.sendKeys(toDate);
        openFromDateMenu.click();
        fromMonthSetInput.click();
        fromMonthSetInput.sendKeys(fromDate);
        applyButtonInLeavePage.click();
    }

    public void setPartialDaysDropDown(){
        openPartialDaysDropDown.click();
        selectAllDays.click();
    }

    public void setDurationDropDown(){
        openDurationDropDown.click();
        selectHalfDayMorning.click();
    }

    public String popUpText()
    {
        return popup.getText();
    }
}
