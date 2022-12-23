import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver;;

    @BeforeMethod
    public void BaseSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/rm1221/Repos/Capstone_project_RaulMadrigal/chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to( "https://www.demoblaze.com/");
        Thread.sleep(3000);
    }
    @AfterMethod
    public void Quit(){
        driver.quit();
    }
}
