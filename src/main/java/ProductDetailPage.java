import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage {

    By ─▒sOnProductDetailLocator = new By.ByCssSelector("div#rightInfoBar > div:nth-of-type(1) .product-title");

    By addToCartButtonLocator = new By.ByCssSelector("a#pd_add_to_cart");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }


    public boolean ─▒sOnProductDetailPage() {
        return isDisplayed(─▒sOnProductDetailLocator);
    }
}
