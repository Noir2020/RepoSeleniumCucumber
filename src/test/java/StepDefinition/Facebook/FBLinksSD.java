package StepDefinition.Facebook;

import Drivers.Web;
import Pages.BasePage;
import Pages.Facebook.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FBLinksSD {

    LandingPage landingPage = new LandingPage();

    @Given("^I am on facebook Landing Page$")
    public void launchFBPage() {
    }

    @When("^I click on Terms link$")
    public void clickOnTermsLink() {
       landingPage.clickTermsLink();
    }

    @Then("^I verify user is on '(.*)' page title$")
    public void verifyPageTitle(String header) {
        landingPage.verifyTitle(header);
    }

    @When("^I verify facebook landing page is open$")
    public void verifyLandingPageOpen() {
        landingPage.verifyTitle("Facebook - Log In or Sign Up");
    }

    @When("^I click on Data Policy link$")
    public void clickOnDataPolicyLink() {
        landingPage.clickDataPolicyLink();
    }

    @When("^I click on Cookie Policy link$")
    public void clickOnCookieLink() {
        landingPage.clickCookiesLink();
    }

}
