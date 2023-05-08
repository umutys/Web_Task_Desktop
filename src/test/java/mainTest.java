import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class mainTest {

    WebDriver driver;

    // I used "WebDriverManager" for automatically to update chromedriver
    // you can check this website "https://github.com/bonigarcia/webdrivermanager"
    // setUp and tearDown are especial methods
    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //  I want to go to the 'www.amazon.com'
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }
    @AfterAll
    public void tearDown(){
        driver.quit();

    }

}
