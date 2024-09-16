package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMAutomation extends BaseTest {

    @Test
    public void verifyAtLeastOneAdminUserIsPresent(){
        //login into OrangeHRM
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),
                ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Home Page is not loading properly");

        adminPage.clickOnAdminButton();
        adminPage.clickOnUserRoleDropDown();
        adminPage.clickOnAdminInUserRoleDropDown();
        adminPage.clickOnSearchButton();
        Assert.assertTrue(adminPage.noOfRows()>0,"More than one user is present in user list");
    }

    @Test
    public void verifyUserCanApplyForTheLeave(){
        //login into OrangeHRM
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"),
                ConfigReader.getConfigValue("login.password"));
        Assert.assertTrue(homePage.isHomePageDisplayed(),"Home Page is not loading properly");

        //click on leave button & verify leave page is displayed
        homePage.clickOnLeaveButton();
        Assert.assertTrue(leavePage.isLeavePageDisplayed(),"Leave Page is not loading properly");
        leavePage.clickOnApplyButton();
        leavePage.clickOnLeaveTypeDropDown();
        leavePage.clickOnFMLAOption();

        //enter leave dates
        leavePage.selectFromAndToDate(ConfigReader.getConfigValue("date.from"),
                ConfigReader.getConfigValue("date.to"));

        //Select Partial Days to "All Days"
        leavePage.setPartialDaysDropDown();

        //Duration "Half Day - Morning"
        leavePage.setDurationDropDown();

        //Click on apply button
        leavePage.clickOnApplyButtonInLeavePage();

        //Verify the success message is displayed
        Assert.assertEquals(leavePage.popUpText(),"Success\n" +
                "Successfully Saved\n"+"×");

        //Click on My Leave
        leavePage.clickOnMyLeaveOption();




    }

}
