package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import static org.example.stepDefs.hooks.driver;

public class D06_homeSlidersStepDef {
P03_homePage home = new P03_homePage() ;
    @When("user clicks on slider")
    public void user_Clicks_On_Slider()
    {
        home .Slider() .click() ;
    }
    @When("user clicks on slider click button 2")
    public void user_clicks_on_slider_2()
    {
     home.Slider2BClick() .click() ;

    }


    @And("user clicks on slider 2")
    public void userClicksOnSlider() {
        home .Slider() .click() ;
    }

    @Then("Right slider page nokia will displayed")
    public void rightSliderNokiaPageWillDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert .assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020" );

    }
    @Then("Right slider page iphone will displayed")
    public void rightSliderPageIphoneWillDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert .assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6" );

    }


}
