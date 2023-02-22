import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest {
        backToHomePage backToHomePage ;
        HomePage homePage ;
        ProductDetailPage  productDetailPage ;
        CatogariesPage catogariesPage;
        CartPage cartPage;

       @Test
       @Order(1)
       public void go_to_catogariesPage(){
           homePage = new HomePage(driver);
           homePage.goToCatogariesPage();
           Assertions.assertTrue(catogariesPage.isOncatogariesPage() , "Southblue Çanta Ürünleri");
        }

        @Test
        @Order(2)
        public void select_a_product(){
           catogariesPage = new CatogariesPage(driver);
           catogariesPage.selectProduct();
           Assertions.assertTrue(productDetailPage.ısOnProductDetailPage(), "Kapitone Desenli Kadın Çapraz Çanta");
        }

        @Test
        @Order(3)
        public void add_product_to_cart(){
            productDetailPage = new ProductDetailPage(driver);
            productDetailPage.addToCart();
            Assertions.assertTrue(homePage.isCounterUp(), "SİPARİŞ ÖZETİ");

        }

        @Test
        @Order(4)
        public void go_to_cart(){
           cartPage= new CartPage(driver);
           homePage.goToCart();
           Assertions.assertTrue(cartPage.isOnCartPage(), "SİPARİŞ ÖZETİ");
        }

        @Test
        @Order(5)
        public void backToHomePage(){
        backToHomePage= new backToHomePage(driver);
        cartPage.goToHomePage();
        Assertions.assertTrue(backToHomePage.isOnHomePage() , "LC Waikiki Destek");

       }

}



