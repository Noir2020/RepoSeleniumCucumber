package StepDefinition.Darksky;

import Drivers.Web;
import Pages.BasePage;
import Pages.Darksky.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TodayTimelineSD {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on darksky landing page$")
    public void launchDarksky() throws InterruptedException {
        Web.initDriver("https://darksky.net/");

        Thread.sleep(2000);
    }

    @When("^I scroll on Today timeline$")
    public void scrollByWebElement() throws InterruptedException {
        landingPage.scrollWebPageByElement();
        Thread.sleep(5000);
    }

    @When("^I click on a plusButton to expend the bar$")
    public void clickPlusButton() {
        landingPage.clickExpandButtonLocator();
    }

    @Then("^I verify the temp values on timeLine is same as detail section$")
    public void verifyTempValuesSame() {
        int tempValueTimeLineLow = landingPage.convertLowTempTimeLineTextIntoNumber();
        int tempValueDetailSectionLow = landingPage.convertLowTempDetailsSectionTextIntoNumber();
        Assert.assertEquals(tempValueTimeLineLow, tempValueDetailSectionLow, "Temp doesn't match");

        int tempValueTimeLineHigh = landingPage.convertHighTempTimeLineTextIntoNumber();
        int tempValueDetailSectionHigh = landingPage.convertHighTempDetailsSectionTextIntoNumber();
        Assert.assertEquals(tempValueTimeLineHigh, tempValueDetailSectionHigh, "Temp doesn't match");


    }
}

