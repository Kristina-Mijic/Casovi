import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_9_cookie {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wordpress.com/");

        Cookie cookie = new Cookie("wordpress_logged_in","kristinamijicphotography%7C1800042863%7CsMFvjDXU9anICZzgUIvtDKGdsycmRPntsoTHERlYq40%7C6a467a116509e495e089b23fe359a67293ede8af6adb965fcfe8a3d3e242e840");

        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        Thread.sleep(4000);

        //Mozemo da koristimo .deleteAllCookies() da obrisemo sve cookies da bi smo se izlogovali
        driver.manage().deleteAllCookies();

        driver.navigate().refresh();

        driver.quit();
    }
}
