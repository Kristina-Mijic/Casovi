import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Zadatak_8 {
    public static void main(String[] args) throws InterruptedException {

        //Zadatak 8
        //Testirati log in na wordpress stranicu

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("https://wordpress.com/");


        String validEmail = "mijickristina18@gmail.com";
        String validPassword = "Sifrazawordpress123!";

        WebElement loginButton = driver.findElement(By.linkText("Log In"));
        loginButton.click();

        WebElement userNameOrEmailField = driver.findElement(By.id("usernameOrEmail"));
        userNameOrEmailField.sendKeys(validEmail);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(validPassword);

        //Moze da se napravi novo "dugme" ili da se iskoristi stare i da se doda samo .click()

        //WebElement loginButtonAfterFillFields = driver.findElement(By.cssSelector("button[type='submit']"));
        //loginButtonAfterFillFields.click();

        continueButton.click();

        //Thread.sleep(3000);
        wait.until(ExpectedConditions.urlToBe("https://wordpress.com/home/kristinnamijicphotography.wordpress.com"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://wordpress.com/home/kristinnamijicphotography.wordpress.com");

        WebElement profileButton = driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));
        profileButton.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".profile-gravatar__user-display-name"))));

        WebElement usernameTitle = driver.findElement(By.cssSelector(".profile-gravatar__user-display-name"));
        String userNameText = usernameTitle.getText();

        Assert.assertEquals(userNameText, validEmail);






    }
}
