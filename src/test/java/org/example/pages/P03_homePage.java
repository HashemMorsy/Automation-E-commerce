package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.example.stepDefs.hooks.driver;

public class P03_homePage {

    public Select customerCurrency()
    {
        Select customerCurrency = new Select(driver.findElement(By.id("customerCurrency")));
        return customerCurrency;

    }

    public List<WebElement> EuroSymbol ()
    {
        List<WebElement> EuroSymbol = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return EuroSymbol;
    }
    public WebElement searchPar()
    {
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton()
    {
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement> searchResult ()
    {
        List<WebElement> SearchResult = driver.findElements(By.xpath("//div/h2/a") );
        return SearchResult;
    }
    public WebElement searchItem ()
    {
        return driver.findElement(By.xpath("//div/div/div/a/img[@title]")) ;
    }

    public WebElement suk ()
    {
        return driver.findElement(By.xpath("//div[@class=\"sku\"]/span[@class=\"value\"][@id]")) ;
    }
    public WebElement hover (){
        return driver.findElement(By.xpath("//a[@href=\"/computers\"]"));
    }
    public WebElement DeskTops ()
    {
        return driver .findElement(By.xpath("//a[@href=\"/desktops\"]") );
    }
    public WebElement DeskTopsPageTitle ()
    {
        return driver .findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement Slider2BClick()
    {
        return driver .findElement(By.cssSelector("a[rel=\"0\"]"));
    }
    public WebElement Slider()
    {
        return driver .findElement(By.cssSelector("a[style=\"display: none;\"]"));
    }
}
