import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By goToHomePageLocator = new By.ByCssSelector(".main-header-logo > svg");
    By cartPageLocator = new By.ByCssSelector("//div/h1");
    By productNameLocator = new By.ByCssSelector("span.rd-cart-item-title");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnCartPage() {
        return isDisplayed(cartPageLocator);
    }

    public void goToHomePage() {
        click(goToHomePageLocator);
    }

   // private List<WebElement> getProducts(){
      //

   // public boolean isOnCartPage() {
        //return isDisplayed(cartPageLocator);
    }


//
// }

