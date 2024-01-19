import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak_9 {
    public static void main(String[] args) throws InterruptedException {

        /*Zadatak 9
        //https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2
        Testirati dodavanje knjige u korpu i da li se knjiga obrise kada obrisete kolacice*/
        //Fokus u ovom zadatku treba da bude STA se tacno testira, vise nego kako cete to uspeti
        //Razmislite dobro sta asertujete i kada

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2");
        Thread.sleep(10000);

        WebElement cartBeforeAdding = driver.findElement(By.id("nav-cart-count"));

        String cartNumber = cartBeforeAdding.getText();

        Assert.assertEquals(cartNumber, "0");

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        WebElement successfulMessage = driver.findElement(By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS"));
        Assert.assertTrue(successfulMessage.isDisplayed());

        WebElement cartAfterAdding = driver.findElement(By.id("nav-cart-count"));
        cartNumber = cartAfterAdding.getText();
        Assert.assertEquals(cartNumber, "1");

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        WebElement carAfterRemoving = driver.findElement(By.id("nav-cart-count"));

        cartNumber = carAfterRemoving.getText();

        Assert.assertEquals(cartNumber, "0");



        driver.quit();

    }
}
