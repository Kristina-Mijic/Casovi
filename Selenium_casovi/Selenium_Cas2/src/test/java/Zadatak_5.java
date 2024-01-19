import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Zadatak_5 {
    public static void main(String[] args) throws InterruptedException {

        // Zadatak 5
        // Testirati log in stranice https://practicetestautomation.com/

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/");

        WebElement practiceLink = driver.findElement(By.id("menu-item-20"));
        practiceLink.click();

        //Jos jedan nacin za a href:
        WebElement loginPageButton = driver.findElement(By.linkText("Test Login Page"));
        loginPageButton.click();

//        WebElement loginPageLink = driver.findElement(By.xpath("/html/body/div/div/section/div/div/article/div[2]/div[1]/div[1]/p/a"));
//        loginPageLink.click();

        String validUserName = "student";
        String validPassword = "Password123";

        WebElement inputName = driver.findElement(By.id("username"));
        inputName.sendKeys(validUserName);

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys(validPassword);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Provera da li je element jedinstven:
//        List<WebElement> username = driver.findElements(By.id("username"));
//        System.out.println("Lista:" + username.size());


        //------------------dopuniti sa asertacijom nakon logovanja:

        String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);

        WebElement title = driver.findElement(By.className("post-title"));
        String actualTitle = title.getText();
        String expectedTitle = "Logged In Successfully";
        Assert.assertEquals(actualTitle, expectedTitle );


        WebElement logOutButton = driver.findElement(By.linkText("Log out"));
        String buttonLogOut = logOutButton.getText();
        String expectedButtonText = "Log out";
        Assert.assertEquals(buttonLogOut, expectedButtonText);


        WebElement welcomeText = driver.findElement(By.className("has-text-align-center"));
        Assert.assertEquals(welcomeText.getText(), "Congratulations " + validUserName + ". You successfully logged in!");


        WebElement pageText = driver.findElement(By.className("post-title"));
        Assert.assertTrue(pageText.isDisplayed());


        driver.quit();


        //Sleepers - ceka dok se ne zavrsi cekanje (bilo 3, 5 ili 10 sekundi ali prosledjujete milisekunde) i ceka do kraja bilo da se element pojavi ili ne
//Implicit wait - ceka odredjeno vreme dok ne baci "NoElementFound" Exception (ali ce cekati najvise onoliko vremena koliko prosledite - ovde je to 10 sekundi)
//Explicit wait - ceka dok se ne ispuni zadat uslov (ali ce cekati najvise onoliko vremena koliko prosledite u objektu - ovde je to 10 sekundi)

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement logInButton = driver.findElement(By.linkText("Log In"));
        logInButton.click();

//sleep ce uvek prvi put davati gresku jer nije dodat Exception na metodu
//Potrebno je samo da kliknete na sleep i zatim na 'Add exception'
//Klik na 'sleep' -> Alt + Enter -> klik na 'Add exception'
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));




        //zadatak 6 - Testirati LogOut funkcionalnost : - u novoj javaClass

        // zadatak 7 - Testirati neuspesan Login: - u novoj javaClass



    }
}
