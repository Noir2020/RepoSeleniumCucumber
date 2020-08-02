package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By searchBoxLocator = By.id("qf-0q-destination");
    By searchButtonLocator = By.xpath("//button[@type='submit']");
    By autoSuggestionsLocator = By.xpath("//div[@class='autosuggest-category-result']");
    By allDatesFromFirstCalendarLocator = By.xpath("(//div[@class='widget-datepicker-bd'])[1]//td[@data-date]//a");
    By checkInCalendarIconLocator = By.id("widget-query-label-1");
    By checkOutCalendarIconLocator = By.id("widget-query-label-3");

    By getAutoSuggestionsMiamiLocator = By.xpath("//div[@class='autosuggest-category-result']");


    public void selectMiamiLakes (String userChoice) {
        selectFromAutoSuggestion(getAutoSuggestionsMiamiLocator, userChoice);
    }


    public void enterDestination(String destination) {
        type(searchBoxLocator, destination);
    }

    public void clickSearchButton() {
        clickThis(searchButtonLocator);
    }

    public void selectDestFromAutoSuggestions(String userWantsToSelectThis) {
        selectFromAutoSuggestion(autoSuggestionsLocator, userWantsToSelectThis);
    }

    public void clickCheckInCalendarIcon() {
        clickThis(checkInCalendarIconLocator);
    }

    public void clickCheckOutCalendarIcon() {
        clickThis(checkOutCalendarIconLocator);
    }

    public void selectCheckInDate(String dateValue) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectDateFromCalendar(allDatesFromFirstCalendarLocator, dateValue);
    }

    public void selectCheckOutDate(String dateValue) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectDateFromCalendar(allDatesFromFirstCalendarLocator, dateValue);
    }



}