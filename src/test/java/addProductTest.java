import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class addProductTest extends mainTest{

    // I used 4 different page because we will just see 4 different page
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchBox().search("Apple iPhone 14 Pro");
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on products page!");

    }
    @Test
    @Order(2)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");



    }
    @Test
    @Order(3)
    public void add_product(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");





    }
    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkProductAdded(),
                "Product did not add!");



    }

    // sometimes we need to wait for next step
    @BeforeEach
    public void waitBeforeTest() throws InterruptedException {
        Thread.sleep(1500);
    }

}
