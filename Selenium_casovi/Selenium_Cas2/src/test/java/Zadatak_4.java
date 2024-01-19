import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Zadatak_4 {
    public static void main(String[] args) throws InterruptedException {

        //Zadatak 3
        //Otici na Google
        //Zatim ukucati "Wikipedia" u polje za pretragu
        //Odraditi pretragu i otvoriti stranicu
        //Na stranici Wikipedia pretraziti "Nikola Tesla"

        //kreiranje preko lokatora:

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Wikipedia");

       List<WebElement> searchButton = driver.findElements(By.name("btnK")); // dodajemo findElemntS na kraju jer imamo List na pocetku
        searchButton.get(0).click(); //ovo nije najsrecnije resenje, jer mozda se promeni redosled elementa i test bi pao.


        //Pogresan nacin:
        //WebElement wikipediaLink = driver.findElement(By.className("LC20lb MBeuO DKV0Md"));


        //Ispravan nacin:
        WebElement wikipediaLink = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
        wikipediaLink.click();


        WebElement wikipediaSearch = driver.findElement(By.id("searchInput"));
        wikipediaSearch.sendKeys("Nikola Tesla");

        WebElement wikipediaSearchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
        //WebElement wikipediaButton = driver.findElement(By.cssSelector("button[type='submit']")); - drugi nacin
        wikipediaSearchButton.click();


        //-----------------novo:

        String expectedURL = "https://en.wikipedia.org/wiki/Nikola_Tesla";

        //Na prvom mestu pisemo sta je zapravo nadjeno tj REALAN url, nakon zareza koristimo url koji OCEKUJEMO
        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);


        WebElement pageTitle = driver.findElement(By.className("mw-page-title-main"));
        String pageMainTitleText = pageTitle.getText();
        String expectedTitle = "Nikola Tesla";
        Assert.assertEquals(pageMainTitleText, expectedTitle);


        WebElement pageImage = driver.findElement(By.className("infobox-image"));
        Assert.assertTrue(pageImage.isDisplayed());

    }
}
