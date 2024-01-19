import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Zadatak_7_neuspesan_login {
    public static void main(String[] args) {

        // zadatak 7 - Testirati neuspesan Login:

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practiceLink = driver.findElement(By.id("menu-item-20"));
        practiceLink.click();

        //Jos jedan nacin za a href:
        WebElement loginPageButton = driver.findElement(By.linkText("Test Login Page"));
        loginPageButton.click();


        String invalidUserName = "student1";
        String validPassword = "Password123";

        WebElement inputName = driver.findElement(By.id("username"));
        inputName.sendKeys(invalidUserName);

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys(validPassword);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://practicetestautomation.com/practice-test-login/");
        Assert.assertTrue(submitButton.isDisplayed());

        WebElement error = driver.findElement(By.id("error"));
        String errorText = error.getText();

        Assert.assertEquals(errorText, "Your username is invalid");



    }
}
