import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tests extends BaseTest {

    @Test(description = "SRS-12111")
    @Description("The test case validates the following" +
            "1. Open homepage https://www.demoblaze.com/" +
            "2. Once open validate the 3 categories displayed in the left")
    public void testCategories() {
        Steps.validateCategories();
    }

    @Test(description = "SRS-12120")
    @Description("The test case validates the following" +
            "1. Open homepage https://www.demoblaze.com/ " +
            "2. Once open validate the 3 categories displayed in the left" +
            "3. Select and click on a product of the catalog"+
            "4. Validate the information of the product selected"
    )
    public void selectProduct() throws InterruptedException {
        Steps.validateCategories();
        Steps.clickbutton();
        Steps.validateProductInfo();
    }
    @Test(description = "SRS-12121")
    @Description("The test case validates the following" +
            "1. Open homepage https://www.demoblaze.com/ " +
            "2. Once open validate the 3 categories displayed in the left" +
            "3. Select and click on a product of the catalog"+
            "4. Validate the information of the product selected"+
            "5. Click to add to cart button"+
            "6. Validate the alert 'product added'"+
            "7. Accept OK button"
    )
    public void addToCart() throws InterruptedException {
        Steps.validateCategories();
        Steps.clickbutton();
        Steps.validateProductInfo();
        Steps.addToCart();
    }
    @Test(description = "SRS-12130")
    @Description("The test case validates the following" +
            "1. Open homepage https://www.demoblaze.com/ " +
            "2. Once open validate the 3 categories displayed in the left" +
            "3. Select and click on a product of the catalog"+
            "4. Validate the information of the product selected"+
            "5. Click to add to cart button"+
            "6. Validate the alert 'product added'"+
            "7. Accept OK button"+
            "8. Clicking the cart link will display the product information"
    )
    public void cartProductInfo() throws InterruptedException {
        Steps.validateCategories();
        Steps.clickbutton();
        Steps.validateProductInfo();
        Steps.addToCart();
        Steps.displayProductInfo();
    }
}
