import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_anotacija_3 {

    //SVI testovi se izvrsavaju u VISE browser-a
    //Premestili smo ChromeDriver() u @BeforeMethod, zato se izvrsavaju u vise browser-a
    WebDriver driver;
    WebElement usernameField;
    WebElement passwordField;
    WebElement submitButton;
    String validUsername, validPassword, inValidUsername, loggedInURL, invalidPassword;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        validUsername = "student";
        validPassword = "Password123";
        loggedInURL = "https://practicetestautomation.com/logged-in-successfully/";

        inValidUsername = "student1";
        invalidPassword = "password";
    }

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement practiceButton = driver.findElement(By.id("menu-item-20"));
        practiceButton.click();
        WebElement testLoginPage = driver.findElement(By.linkText("Test Login Page"));
        testLoginPage.click();

        usernameField = driver.findElement(By.id("username"));
        passwordField = driver.findElement(By.id("password"));
        submitButton = driver.findElement(By.id("submit"));
    }

    @Test(priority = 10)
    public void userCanLogIn() {

        usernameField.clear();
        usernameField.sendKeys(validUsername);
        passwordField.clear();
        passwordField.sendKeys(validPassword);
        submitButton.click();

        WebElement logoutButton = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logoutButton.isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(), loggedInURL);

        WebElement successfullyMessage = driver.findElement(By.className("post-title"));
        Assert.assertTrue(successfullyMessage.isDisplayed());
    }

    @Test(priority = 20)
    public void userCannotLogInWithInvalidUsername() throws InterruptedException {
        usernameField.clear();
        usernameField.sendKeys(inValidUsername);
        passwordField.clear();
        passwordField.sendKeys(validPassword);
        submitButton.click();

        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your username is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }


    @Test(priority = 30)
    public void userCannotLogInWithInvalidPassword() throws InterruptedException {
        usernameField.clear();
        usernameField.sendKeys(validUsername);
        passwordField.clear();
        passwordField.sendKeys(invalidPassword);
        submitButton.click();

        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your password is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }

    @Test(priority = 40)
    public void userCannotLoginWithEmptyUsernameFieldAndValidPassword() throws InterruptedException {
        usernameField.clear();
        usernameField.sendKeys("");
        passwordField.clear();
        passwordField.sendKeys(validPassword);
        submitButton.click();

        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your username is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }

    @Test(priority = 50)
    public void userCannotLoginWithEmptyPasswordFieldAndValidUsername() {
        usernameField.clear();
        usernameField.sendKeys(validUsername);
        passwordField.clear();
        passwordField.sendKeys("");
        submitButton.click();

        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your password is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }

    @Test
    public void userCannotLoginWithEmptyFields() throws InterruptedException {
        //1.nacin
        //usernameField.sendKeys("");
        //passwordField.sendKeys("");
        //submitButton.click();

        //2.nacin:
        //jednostavno nemate ove dve akcije

        //3.nacin:
        usernameField.clear();
        passwordField.clear();
        submitButton.click();

        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your username is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }
}
