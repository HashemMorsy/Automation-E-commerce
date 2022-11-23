package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.hooks.driver;

public class P02_login {
public WebElement LoginLink(){
    return driver.findElement(By.className("ico-login"));
    }
    public WebElement Email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement LoginButton(){
    return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]") );
    }

}
