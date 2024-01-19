import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_anotacija_2 {


    //SVI testovi se izvrsavaju u JEDNOM browser-u
    //ChromeDriver() se nalazi u @BeforeClass, zato se sve izvrsava u jednom broswer-u
    WebDriver driver;
    WebElement usernameField;
    WebElement passwordField;
    WebElement submitButton;
    String validUsername, validPassword, inValidUsername, loggedInURL, invalidPassword;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        validUsername = "student";
        validPassword = "Password123";
        loggedInURL = "https://practicetestautomation.com/logged-in-successfully/";

        inValidUsername = "student1";
        invalidPassword = "password";
    }

    @BeforeMethod
    public void pageSetUp() {

        driver.get("https://practicetestautomation.com/");

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

        usernameField.sendKeys(validUsername);
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
        usernameField.sendKeys(inValidUsername);
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
        usernameField.sendKeys(validUsername);
        passwordField.sendKeys(invalidPassword);
        submitButton.click();

        Thread.sleep(1000);
        WebElement errorMessage = driver.findElement(By.id("error"));
        String error = errorMessage.getText();
        Assert.assertEquals(error, "Your password is invalid!");

        Assert.assertNotEquals(driver.getCurrentUrl(), loggedInURL);
    }

    //Dakle, sda zelimo svaki put kada zavrsimo testove da obrisemo cookies
    //Jos jesto cemu moze da sluzi AfterMethod je da kad padne neki test uhvati screenshot

//    @AfterMethod
//    public void tearDown() {
//        driver.manage().deleteAllCookies();
//    }
}
