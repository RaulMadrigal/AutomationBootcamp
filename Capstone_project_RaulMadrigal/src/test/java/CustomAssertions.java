import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CustomAssertions extends Assert {

    public static String validateText (String actualText, String expectedText) {
        String errorMessage = actualText + " is not as expected. Expected was: " + expectedText;
        Assert.assertEquals(actualText,expectedText);
        return errorMessage;
    }
    public static void isElementDisplayed (WebElement picture) {
        String errorMessage = "The element is not displayed";
        if (!picture.isDisplayed()){
            System.out.println(errorMessage);
        }
    }
}
