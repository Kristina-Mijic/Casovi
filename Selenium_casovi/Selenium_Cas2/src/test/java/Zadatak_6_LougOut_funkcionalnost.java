import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak_6_LougOut_funkcionalnost {
    public static void main(String[] args) {

        //zadatak 6 - Testirati LogOut funkcionalnost :

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practiceLink = driver.findElement(By.id("menu-item-20"));
        practiceLink.click();

        //Jos jedan nacin za a href:
        WebElement loginPageButton = driver.findElement(By.linkText("Test Login Page"));
        loginPageButton.click();


        String validUserName = "student";
        String validPassword = "Password123";

        WebElement inputName = driver.findElement(By.id("username"));
        inputName.sendKeys(validUserName);

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys(validPassword);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();


        ///--zadatak 6

        WebElement buttonLogOut = driver.findElement(By.linkText("Log out"));
        buttonLogOut.click();

        Assert.assertNotEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");

        WebElement submitButtonAfterLogin = driver.findElement(By.id("submit"));
        Assert.assertTrue(submitButtonAfterLogin.isDisplayed());








    }
}
