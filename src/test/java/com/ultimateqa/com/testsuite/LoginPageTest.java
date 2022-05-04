package com.ultimateqa.com.testsuite;

import com.ultimateqa.com.pages.HomePage;
import com.ultimateqa.com.pages.SignInPage;
import com.ultimateqa.com.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        homePage.clickOnSignInLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.wecomeback();
        Assert.assertEquals(expectedMessage, actualMessage, "Welcomepage not displayed");


    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignInLink();
        signInPage.emailField("Prime123@gmail.com");
        signInPage.passwordField("Prime");
        signInPage.clickonsignin();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = signInPage.getErrorMessage();
        Assert.assertEquals(actualMessage,expectedMessage, "Error");


    }


}




