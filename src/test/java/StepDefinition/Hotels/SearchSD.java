package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchSD {

    LandingPage landingPage = new LandingPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    String userChoice;

    @Given("^I am on hotels landing page$")
    public void launchHotels() {
        Web.initDriver("https://www.hotels.com/");
    }

    @When("^I enter '(.*)' in search$")
    public void enterUserDestination(String destination) {
        landingPage.enterDestination(destination);
    }

    @When("^I select '(.*)' from autosuggestions$")
    public void selectFromLandingAutoSuggestions(String userPreference) {
        userChoice = userPreference;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        landingPage.selectDestFromAutoSuggestions(userPreference);
    }


    @When("^I click on Search button$")
    public void clickSearch() {
        landingPage.clickSearchButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I verify search result header is same as text selected from auto suggestion$")
    public void verifySearchHeader() {
        Assert.assertEquals(userChoice, searchResultPage.getDestinationHeader(), "Search Result header didn't match");
    }

    @Then("^I verify text under 'Destination, property, or landmark' is same as text selected from auto suggestion$")
    public void verifyDeatinationPropertyLandmarkText() {
        Assert.assertEquals(userChoice, searchResultPage.getDestinationPropertyLandmarkText(), "Text under Destination, Property and Landmark didn't match   ");
    }

    @When("^I enter Child (.*) age as \"(.*)\"$")
    public void enterChildrenAge(String childNum, String age) {

    }

    @Then("^I verify the lowest price is less than \\$100$")
    public void verifyPrice() {

    }



}