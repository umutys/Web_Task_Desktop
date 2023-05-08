import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = By.id("nav-cart-count-container");
    By cartContainerLocator= new By.ByCssSelector("span.nav-cart-count");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        // if product number is equal to 0 this meaning we do not add anything to cart
        return getCartCount() > 0;
    }

    // navigate to Cart
    public void goToCart() {
        click(cartContainerLocator);
    }

    // check the cart count number
    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);

    }
}
