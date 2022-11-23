package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.hooks.driver;

public class D02_loginStepDef {
    P02_login login =new P02_login();

    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        login.LoginLink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void loginWithAnd(String arg0, String arg1, String arg2)
    {
        login.Email().sendKeys(arg1 );
        login.password().sendKeys(arg2 );
    }

    @And("user press on login button")
    public void userPressOnLoginButton()
    {
        login.LoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        SoftAssert soft =new SoftAssert() ;
        //1
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/" );

        //2
        soft.assertTrue(driver.findElement(By.cssSelector("a[href=\"/customer/info\"]")).isDisplayed(),
                "my account tab not found"); ;

        soft.assertAll();
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String expected ="Login was unsuccessful";
        String actual= driver.findElement(By
                .cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        SoftAssert soft =new SoftAssert() ;
        //1
        soft.assertEquals(actual.contains(expected) ,true);
        //2
        soft.assertAll();

    }
    }

