package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.stepDefs.hooks.driver;

public class D07_followUsStepDef {
 P03_homePage home =new P03_homePage() ;


 @When("user opens facebook link")
 public void userOpensFacebookLink() {
  home.facebookLink() .click() ;
 }
 @When("user opens twitter link")
 public void userOpensTwitterLink()
 {
  home.twitterkLink().click();
 }

 @When("user opens rss link")
 public void userOpensRssLink()
 {
  home.rssLink() .click() ;
 }

 @When("user opens youtube link")
 public void userOpensYoutubeLink()
 {
  home .youtubekLink() .click() ;
 }
 @Then("{string} is opened in new tab")
 public void isOpenedInNewTab(String arg0) throws InterruptedException
 {
  Thread.sleep(2000);
  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

  driver.switchTo().window(tabs.get(1));

  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());

  Assert.assertEquals(driver.getCurrentUrl(),arg0);

  driver.close();
  driver.switchTo().window(tabs.get(0));

  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle());

 }
}
