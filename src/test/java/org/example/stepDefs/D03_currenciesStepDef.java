package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage() ;

    @When("user Select Euro currency from the dropdown list on the top left of home page")
    public void user_Select_Euro_currency()
    {
        home.customerCurrency().selectByVisibleText("Euro");
    }

    @Then("item change to Euro Symbol successfully")
    public void itemChangeToEuroSymbolSuccessfully() {
        String expected = "€";
        String actual = null;
        for (int i = 0; i < home.EuroSymbol().size(); i++) {
            actual = home.EuroSymbol().get(i).getText();
            Assert.assertTrue(actual.contains(expected), "error in EuroSymbol");
        }


    }
}