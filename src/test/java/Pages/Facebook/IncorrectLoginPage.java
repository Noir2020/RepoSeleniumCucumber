package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class IncorrectLoginPage extends BasePage {

    By errorLocator = By.xpath("//div[contains(text(), 'The password that'");

    public String getErrorMsg() {

        return getTextFromElement(errorLocator);
    }
}
