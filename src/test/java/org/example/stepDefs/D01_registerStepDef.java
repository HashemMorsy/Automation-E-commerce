package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.hooks.driver;
public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page()
    {
        register.registerlink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.genderMale().click() ;
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        register.FirstName().sendKeys(arg0);
        register.LastName() .sendKeys(arg1);

    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
// Day
        register.day() .selectByVisibleText("12");
// Month
        register.month() .selectByVisibleText("January");
// Year
        register.year() .selectByVisibleText("1995");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        register.Email().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        register.Password().sendKeys(arg0);
        register.ConfirmPassword().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.RegisterButton().click();

    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        String expected ="Your registration completed";
        String actual= driver.findElement(By.className("result")).getText();
SoftAssert soft =new SoftAssert() ;
        //1
        soft.assertEquals(actual.contains(expected) ,true);


        //2
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/" );

        soft.assertAll();
    }
}
