import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class Selenium4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        /*
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys("IT Bootcamp");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys(ENTER);
         */

        //Da se ne bi ponavljao kod, mozemo da napravimo WebELement: PRIMER:

//        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));
//        searchBox.sendKeys("IT Bootcamp");
//        searchBox.sendKeys(ENTER);
//        driver.navigate().back();
//        searchBox.sendKeys("Wikipedia");
//        searchBox.sendKeys(ENTER);


        //LOKATORI / SELEKTORI

        // ID - prvi po hijearhiji, najbolji za koriscenje, jer postoji samo jedan ID. (ne mora biti jedinstven), najstabilniji za lokator
        WebElement searchBoxByID = driver.findElement(By.id("APjFqb"));

        // Name - drugi po hijerarhiji
        WebElement searchBoxByName = driver.findElement(By.name("q"));

        // Class
        WebElement searchBoxByClass = driver.findElement(By.className("gLFyf"));

        // CSS Selector
        WebElement searchBoxByCss = driver.findElement(By.cssSelector("textarea[type='search']"));

        //Primer kada koristimo CSS selektor preko klase koja unutar vrednosti ima 'space':
        WebElement searchBoxByFakeClass = driver.findElement(By.className("search box google")); // ne moze ovako sa razmakom
        WebElement searchBoxByFakeCss = driver.findElement(By.className(".search.box.google")); // ne moze ovako sa razmakom, i zato stavljamo tacke izmedju kao i na pocetku reci

        // Relative Xpath - Malo precizniji jer dajemo malo stabilniju putanju.
        WebElement searchBoxRelative = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        // Absolute Xpath - krenuce istpocetka i icice po redu DOM, poslednji u Hijerarhiji, najnestabilniji.
        WebElement searchBoxAbsolute = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea"));




    }
}
