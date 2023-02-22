import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

    public class CatogariesPage extends BasePage{

       By catogariesNameLacotor = By.cssSelector(".product-list-heading__heading");

       By productNameLacotor = By.xpath("/html//a[@id='pd_add_to_cart']");
        By catogoriesPageLocator = By.cssSelector (".product-grid [class='product-card product-card--one-of-4']:nth-of-type(2) .product-image__image");
        public CatogariesPage(WebDriver driver) {
            super(driver);
        }

        public void selectProduct() {
            click(catogoriesPageLocator);
        }
        public boolean isOncatogariesPage() {

           return isDisplayed(catogariesNameLacotor);
        }

        private List<WebElement> getAllProducts() {
            return findAll(productNameLacotor);

        }
    }

