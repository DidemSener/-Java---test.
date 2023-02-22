import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

    By      cartCountLocator =   new By.ByCssSelector("span.badge-circle");
    By catogoriesPageLocator =new By.ByCssSelector ("a[href='https://www.lcwaikiki.com/tr-TR/TR/etiket/southblue-canta']");
    By    cartCountContainerLocator = new By.ByCssSelector(".header-section .cart-dropdown:nth-child(3) .dropdown-label");

    public HomePage(WebDriver driver) {

        super(driver);
    }
    public void goToCatogariesPage() {
        click(catogoriesPageLocator);
    }
    public void goToCart()
    {
        click(cartCountContainerLocator);


    }

    public boolean isCounterUp(){


        return getCartCount()  > 0;
    }


    private  int getCartCount(){

        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);

    }
}







