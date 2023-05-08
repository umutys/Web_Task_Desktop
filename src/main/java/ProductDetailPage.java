import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends HomePage{

    By addToCartButtonLocator = new By.ByCssSelector(".a-button-input[name='submit.add-to-cart']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return  isDisplayed(addToCartButtonLocator);
    }

    // add the product into the cart
    public void addToCart() {
        click(addToCartButtonLocator);

    }

}
