package Selenium_Cas1.src.test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenium_zadatak2 {
    public static void main(String[] args) {

        //Zadatak 2
        //Otvoriti browser i jos 5 tabova
        //Na svakom tabu otvoriti URL po zelji
        //Zatvoriti sve tabove osim onog gde je otvoren Google


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //OTVARAMO 5 PRAZNIH TABOVA:
        for(int i = 0; i < 5; i++) {
            js.executeScript("window.open()");
        }

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

                                //Otvaranje i kreiranje novih tabova:

        driver.switchTo().window(listaTabova.get(0));
        driver.get("https://www.google.com/");

        driver.switchTo().window(listaTabova.get(1));
        driver.get("https://youtube.com");

        driver.switchTo().window(listaTabova.get(2));
        driver.get("https://itbootcamp.rs/");

        driver.switchTo().window(listaTabova.get(3));
        driver.get("https://www.netflix.com/rs/");

        driver.switchTo().window(listaTabova.get(4));
        driver.get("https://www.imdb.com/");

        driver.switchTo().window(listaTabova.get(5));
        driver.get("https://linkedin.com/");


                                            //Zatvaranje tabova:

        //PRVI NACIN ZA ZATVARANJE TABOVA:

        //driver.close();
        //driver.switchTo().window(listaTabova.get(1));


        //DRUGI NACIN ZA ZATVARANJE KROAZ FOR:

//        for(int i = 5; i > 0; i--) {
//            driver.switchTo().window(listaTabova.get(i));
//            driver.close();
//        }


        //TRECI NACIN ZA ZATVARANJE:

        for(int i = 0; i < listaTabova.size(); i++) {
            driver.switchTo().window(listaTabova.get(i));

            if(!driver.getCurrentUrl().equals("https://www.google.com/")) {
                driver.close();
            }
        }


    }
}
