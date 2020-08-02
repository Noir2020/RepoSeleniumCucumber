package StepDefinition.Hotels;

import Drivers.Web;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchResultPage;
import Utils.DateHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.Date;

public class CalendarSD {

    LandingPage landingPage = new LandingPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    String userChoice;

    @When("^I enter (.*) as check in$")
    public void selectCheckInDate(String dateValue) {
        landingPage.clickCheckInCalendarIcon();
        if (dateValue.equalsIgnoreCase("today")) {
            landingPage.selectCheckInDate(DateHelper.getCurrentDateValue());
        } else if (dateValue.equalsIgnoreCase("tomorrow")) {
            landingPage.selectCheckInDate(DateHelper.getTomorrowDateValue());
        } else {
            landingPage.selectCheckInDate(dateValue);
        }
    }

    @When("^I enter (.*) as check out$")
    public void selectCheckOutDate(String dateValue) {
        landingPage.clickCheckOutCalendarIcon();
        if (dateValue.equalsIgnoreCase("today")) {
            landingPage.selectCheckOutDate(DateHelper.getCurrentDateValue());
        } else if (dateValue.equalsIgnoreCase("tomorrow")) {
            landingPage.selectCheckOutDate(DateHelper.getTomorrowDateValue());
        } else {
            landingPage.selectCheckOutDate(dateValue);
        }
    }

}