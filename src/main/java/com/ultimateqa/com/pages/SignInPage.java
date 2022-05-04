package com.ultimateqa.com.pages;

import com.ultimateqa.com.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
   // By email=By.xpath("//input[@id='user[email]");
   // By password=By.xpath("//input[@id='user[password]");
   // By signIn=By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By emailLink=By.name("user[email]");
    By passwordLink=By.id("user[password]");
    By getSignInButton=By.xpath("//div/input[@value='Sign in']");
    By errorMessage=By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void emailField(String text){
        sendTextToElement(emailLink,"text");
    }
    public void passwordField(String text){
        sendTextToElement(passwordLink,"text");
    }
    public void clickonsignin(){
        clickOnElement(getSignInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
