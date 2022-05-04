package com.ultimateqa.com.pages;

import com.ultimateqa.com.driverfactory.ManageDriver;
import com.ultimateqa.com.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By singInLink=By.linkText("Sign In");
    By welcomeLink= By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickOnSignInLink(){
        clickOnElement(singInLink);
    }
    public String wecomeback( ){
        return getTextFromElement(welcomeLink);
    }

}
