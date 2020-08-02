package Pages.Facebook;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

import java.util.Set;

public class LandingPage extends BasePage {

    // locators for web-element on Landing Page
    By loginEmailLocator = By.id("email");
    By loginPasswordLocator = By.id("pass");
    By loginButtonLocator = By.id("loginbutton");
    By signupButtonLocator = By.xpath("//button[@name='websubmit']");
    By termsLocator = By.id("terms-link");
    By dataPolicyLocator = By.id("privacy-link");
    By cookiesLocator = By.id("cookie-use-link");


    // methods to interact with Landing Page elements
    public void enterLoginEmail(String userEmail) {
        type(loginEmailLocator, userEmail);
    }

    public void enterLoginPassword(String userPassword) {
        type(loginPasswordLocator, userPassword);
    }

    public void clickLoginButton() {
        clickThis(loginButtonLocator);
    }

    public boolean isLoginButtonEnabled() {
        return isWebElementEnabled(loginButtonLocator);
    }

    public boolean isSignupButtonEnabled() {
        return isWebElementEnabled(signupButtonLocator);
    }

    public void clickTermsLink() {
        clickThis(termsLocator);
    }


    public void clickDataPolicyLink() {
        clickThis(dataPolicyLocator);
    }


    public void clickCookiesLink() {
        clickThis(cookiesLocator);
    }

    public boolean verifyTitle(String expHeader) {
        boolean isHeaderFound = false;
        Set<String> allHandles = getAllWindowHandles();
        for (String handle:allHandles) {
            switchWindow(handle);
            if (getWebPageTitle().equals(expHeader)) {
                isHeaderFound = true;
                break;
            }
        }
        return isHeaderFound;
    }


}