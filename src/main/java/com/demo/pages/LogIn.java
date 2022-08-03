package com.demo.pages;

import com.demo.base.Context;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LogIn extends Context {

    By userName = By.xpath("//XCUIElementTypeStaticText[@name=\"TfL ID\"]");
    By password = By.xpath("//XCUIElementTypeApplication[@name=\"SignInApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
    By signIn = By.name("Sign in");

    By loginError = By.xpath("//XCUIElementTypeStaticText[@name=\"Login Error\"]\n");

    By doneBtn = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");

    public WebElement userName() {
        return driver.findElement(userName);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement signIn()
    {
        return driver.findElement(signIn);
    }

    public WebElement loginError()
    {
        return driver.findElement(loginError);
    }

    public WebElement doneButton()
    {
        return driver.findElement(doneBtn);
    }

    public boolean loginpresent()
    {
       return driver.findElement(userName).isDisplayed();


    }

}
