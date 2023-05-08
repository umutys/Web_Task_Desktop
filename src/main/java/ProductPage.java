import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPage extends HomePage{

    By checkingResultsLocator = new By.ByCssSelector("span.a-color-state");
    By productNameLocator = new By.ByCssSelector("span.a-size-medium");
    public ProductPage(WebDriver driver) {

        super(driver);
    }

    // we check which page has opened
    public boolean isOnProductPage() {
        return detailsContain().contains("Apple iPhone 14 Pro");
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);

    }

    private String detailsContain(){
        return find(checkingResultsLocator).getText();
    }

}
