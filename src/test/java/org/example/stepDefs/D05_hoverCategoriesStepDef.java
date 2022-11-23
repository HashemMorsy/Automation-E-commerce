package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefs.hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();

    @When("hover on Computers")
    public void hover_on_Computers() throws InterruptedException {
        Actions action = new Actions(driver);

        action.moveToElement(home.hover()).perform();
        Thread.sleep(4000);

    }

    @And("click on Desktops")
    public void clickOnDesktops() {
        home .DeskTops().click() ;
    }

    @Then("Right page will displayed")
    public void rightPageWillDisplayed() {
        String PageTitle = home.DeskTopsPageTitle().getText();
       String xx = PageTitle.toLowerCase().trim();
        String expected ="desktops";
        Assert.assertTrue(xx .contains(expected  ), "error ");


    }
}
