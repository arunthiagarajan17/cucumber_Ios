package com.demo.pages;

import com.demo.base.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HomePage extends Context {

    By nameLabel = By.name("Emma Smith");
    By roleLabel = By.name("Senior Test Analyst");
    By officeLabel = By.name("Pier Walk");
    By signOut = By.xpath("/XCUIElementTypeStaticText[@name=\"Sign Out\"]");


    public WebElement nameLabel(){
        return driver.findElement(nameLabel);
    }

    public WebElement roleLabel(){
        return driver.findElement(roleLabel);
    }

    public WebElement officeLabel(){
        return driver.findElement(officeLabel);
    }

    public WebElement signOut(){
        return driver.findElement(signOut);
    }
}
