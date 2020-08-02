package Pages.Darksky;

import Drivers.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

     // locators for web-element on Landing Page

     By webElementToScrollToLocator = By.xpath("//div[@id='week']/div[@class='summary']");

     By todayExpendButtonLocator = By.xpath("//a[@data-day='0']//span[@class='open']");

     By tempValueTimeLineLowLocator = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
     By tempValueTimeLineHighLocator = By.xpath("//a[@class='day revealed']//span[@class='maxTemp']");

     By tempValueDetailSectionLowLocator = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']//span[@class='temp']");
     By tempValueDetailSectionHighLocator = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']//span[@class='temp']");

     // methods to interact with Landing Page elements

     public void scrollWebPageByElement() {
     //     scrollUptoWebElement(webElementToScrollToLocator);
          scrollbyPixel(1200);
          scrollbyPixel(300);
     }

     public void clickExpandButtonLocator() {
          clickThis(todayExpendButtonLocator);
     }

     public int convertLowTempTimeLineTextIntoNumber () {
          String lowTempTimeLine = getTextFromElement(tempValueTimeLineLowLocator);
          String[] lowTempTimeLineNumber = lowTempTimeLine.split("\\W");
          return Integer.parseInt(lowTempTimeLineNumber[0]);
     }

     public int convertHighTempTimeLineTextIntoNumber () {
          String highTempTimeLine = getTextFromElement(tempValueTimeLineHighLocator);
          String[] highTempTimeLineNumber = highTempTimeLine.split("\\W");
          return Integer.parseInt(highTempTimeLineNumber[0]);
     }

     public int convertLowTempDetailsSectionTextIntoNumber () {
          String lowTempDetailSection = getTextFromElement(tempValueDetailSectionLowLocator);
          String[] lowTempDetailSectionNumber = lowTempDetailSection.split("\\W");
          return Integer.parseInt(lowTempDetailSectionNumber[0]);
     }

     public int convertHighTempDetailsSectionTextIntoNumber () {
          String highTempDetailSection = getTextFromElement(tempValueDetailSectionHighLocator);
          String[] highTempDetailSectionNumber = highTempDetailSection.split("\\W");
          return Integer.parseInt(highTempDetailSectionNumber[0]);
     }

}
