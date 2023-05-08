import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchBox extends BasePage{


    // We found the search box
    By searchBoxLocator = By.id("twotabsearchtextbox");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        // type ‘Apple iPhone 14 Pro’ in the Search box
        type(searchBoxLocator,text);
        Actions actions = new Actions(driver);
        // press 'ENTER' in the Search box
        actions.sendKeys(Keys.ENTER).perform();
    }
}
