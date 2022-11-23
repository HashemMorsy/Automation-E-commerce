package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefs.hooks.driver;

public class P01_register {
    public WebElement registerlink()
    {
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement genderMale()
    {
        return driver.findElement(By.id("gender-male"));
    }
    public WebElement FirstName()
    {
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName()
    {
        return driver.findElement(By.id("LastName"));
    }
    public WebElement Email()
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement Password()
    {
        return driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement RegisterButton(){
        return driver.findElement(By.id("register-button"));
}
    public Select day()
    {
        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        return Day;
    }
    public Select month()
    {
        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        return Month;
    }
    public Select year()
    {
        Select Year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        return Year;
    }


}
