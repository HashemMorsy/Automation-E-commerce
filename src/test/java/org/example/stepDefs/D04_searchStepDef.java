package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D04_searchStepDef {
P03_homePage home = new P03_homePage();

    @When("^user enter product name as \"([^\"]*)\" in search par$")
    public void userEnterProductNameAsInSearchPar(String arg0) {
        home.searchPar().sendKeys(arg0);
    }

    @And("click on search button")
    public void clickOnSearchButton()
    {
        home.searchButton().click();
    }

    @Then("^success search result is displayed \"([^\"]*)\"$")
    public void successSearchResultIsDisplayed(String arg1)

    {
        System.out.println("Number of elements:" +home .searchResult() .size());
        String itemSmale;
        String item=null ;
        for (int i = 0; i < home.EuroSymbol().size(); i++) {
            item = home.searchResult().get(i).getText() ;
            itemSmale= item.toLowerCase();
            Assert.assertTrue(itemSmale.contains(arg1 ), "error in search result");

        }


    }

    @Given("user enter product sku as {string} in search par")
    public void userEnterProductSkuAsInSearchPar(String arg3) {
            home.searchPar().sendKeys(arg3);
    }

    @When("user open product page")
    public void userOpenProductPage() {
        home.searchItem().click();
    }

    @Then("^success search result \"([^\"]*)\" is displayed$")
    public void successSearchResult(String arg4)
    {
        String expectedR =arg4 ;
        System.out.printf( expectedR +  "اهوووو");

        String actual = home.suk().getText();
        System.out.printf( actual  +  "اهوووو");


        Assert.assertTrue(actual.contains(expectedR), "error in SUK خرااااااااااااا");
    }
}
