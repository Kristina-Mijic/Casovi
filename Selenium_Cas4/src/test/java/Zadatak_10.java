import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_10 {
    public static void main(String[] args) {

        //Zadatak 10
        //Otici na stranicu https://imgflip.com/memegenerator
        //Uploadovati sliku od koje treba napraviti mim
        //Mim mora biti vezan za IT, QA ili kurs
        //Sliku rucno skinuti i ubaciti na Slack thread poruku
        //Autor mima sa najvise lajkova dobija pivo na druzenju

        //Napomena: Izazov zadatka je kod lokatora, assertove ne treba dodavati i ne treba raditi sa anotacijama


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://imgflip.com/memegenerator");

        String imageLocation = "C:\\Users\\Kristina\\Desktop\\memephoto.jpg";


        WebElement button = driver.findElement(By.id("mm-show-upload"));
        button.click();

        WebElement uploadImgButton = driver.findElement(By.id("mm-upload-file"));
        uploadImgButton.sendKeys(imageLocation);

        WebElement upload = driver.findElement(By.id("mm-upload-btn"));
        upload.click();

        WebElement topText = driver.findElement(By.cssSelector("textarea[placeholder='Top Text']"));
        topText.sendKeys("Imamo cas!");

        WebElement bottomText = driver.findElement(By.cssSelector("textarea[placeholder='Bottom Text']"));
        bottomText.sendKeys("Dragoljub casti pivo");

        WebElement generateBtn = driver.findElement(By.cssSelector(".mm-generate.b.but"));
        generateBtn.click();

        //driver.quit();

    }
}
