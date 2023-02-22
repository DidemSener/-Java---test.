import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class backToHomePage extends BasePage {

    By ısOnHomePageLocator = new By.ByCssSelector("[class='col-lg-4 col-xs-12 form-col col-lg-offset-1'] .row:nth-of-type(1) .footer-button-label");
    By homePageLocator = By.xpath(".main-header-logo > svg > g > path:nth-of-type(6)");
    public backToHomePage(WebDriver driver) {

        super(driver);
    }

    public void backToHomePage() {
        click(homePageLocator);
    }

    public boolean isOnHomePage() {
       return isDisplayed(ısOnHomePageLocator);
    }
}

