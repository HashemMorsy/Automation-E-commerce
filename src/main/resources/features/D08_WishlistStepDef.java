package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.hooks.driver;

public class D08_WishlistStepDef
{
    P03_homePage home = new P03_homePage() ;
    @When("user clicks on wishlist button of htc")
    public void user_clicks_on_wishlist_button_of_htc()
    {
        home.htcAddToWishlist().get(2).click();

    }

    @Then("success message appears")
    public void successMessageAppears()
    {
        String expectedColor ="#ffffff";
        String expectedMessage="The product has been added to your wishlist";
        String actual =home .SuccessMessage() .getText() ;

        String actualMessage = home .SuccessMessage() .getText();
        String s = home.SuccessMessage() .getCssValue("color");
        String color = Color.fromString(s).asHex();
//        System.out.println(s) ;
//        System.out.println(color);
        SoftAssert soft = new SoftAssert() ;

        soft .assertTrue(actualMessage.contains(expectedMessage ),"success message" );
        soft.assertEquals(color ,expectedColor  ,"color error");

        soft.assertAll();


    }

    @And("wait until Success Message disappear")
    public void waitUntilSuccessMessageDisappear()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500L));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector
                ("div[class=\"bar-notification success\"]")));
    }

    @And("click on my Wishlist button")
    public void clickOnMyWishlistButton() {
        home.Wishlist().click();
    }

    @Then("verify wishlist result")
    public void verifyWishlistResult()
    {
        String  x = home .QTYWishlist() .getAttribute("name") ;
        int y = Integer.parseInt(x);
        Assert.assertTrue(0<y);
    }
}
