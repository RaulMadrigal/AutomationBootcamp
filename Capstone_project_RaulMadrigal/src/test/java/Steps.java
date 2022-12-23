import com.sun.org.glassfish.external.probe.provider.annotations.ProbeListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Steps extends BaseTest{
    public static void validateCategories(){
        String actualCategories = driver.findElement(By.xpath("//a[@id='cat']")).getText();
        CustomAssertions.validateText(actualCategories,Constants.Categorie);
        String actualPhone = driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).getText();
        CustomAssertions.validateText(actualPhone,Constants.Phone);
        String actualLaptop = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).getText();
        CustomAssertions.validateText(actualLaptop,Constants.Laptop);
        String actualMonitor = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).getText();
        CustomAssertions.validateText(actualMonitor,Constants.Monitor);
    }
    public static void clickbutton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[5]/div/div/h4/a")).click();
        Thread.sleep(1000);
    }

    public static void validateProductInfo(){
        String actualProduct = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h2")).getText();
        CustomAssertions.validateText(actualProduct,Constants.Product);
        String actualPrice = driver.findElement(By.xpath(" //h3[@class='price-container']")).getText();
        CustomAssertions.validateText(actualPrice,Constants.Price);
        String actualDescription = driver.findElement(By.xpath("//*[@id=\"more-information\"]/p")).getText();
        CustomAssertions.validateText(actualDescription,Constants.ProductDescription);
        String actualButton = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).getText();
        CustomAssertions.validateText(actualButton,Constants.button);
    }
    public static void addToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
    }
    public static void displayProductInfo() throws InterruptedException {
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(1000);
        CustomAssertions.isElementDisplayed(driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[1]/img")));
        String Total=driver.findElement(By.id("totalp")).getText();
        CustomAssertions.validateText(Total,Constants.Price.substring(1,4));
        String Title=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
        CustomAssertions.validateText(Title,Constants.Product);
        CustomAssertions.isElementDisplayed(driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a")));
        CustomAssertions.isElementDisplayed(driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
        Thread.sleep(1000);
        String placeOrder=driver.findElement(By.xpath("//*[@id=\"orderModalLabel\"]")).getText();
        CustomAssertions.validateText(placeOrder,Constants.Order);
        Thread.sleep(1000);
    }
}
