package Pages.Hotels;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SearchResultPage extends BasePage {

    By destinationHeaderLocator = By.xpath("//h1[@class='destination-title']");
    By destinationPropertyLandmarkText = By.xpath("//label[text()='Destination, property, or landmark']/following-sibling::input[@id='q-destination']");


    public String getDestinationHeader() {
        return getTextFromElement(destinationHeaderLocator);
    }

    public String getDestinationPropertyLandmarkText() {
        return getAttributeValueFromElement(destinationPropertyLandmarkText, "value");
    }



}