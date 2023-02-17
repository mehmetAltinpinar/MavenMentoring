package Mentoring_20230207;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driverChrome = new ChromeDriver();
        driverChrome.get("https://www.google.com/"); //opening google.com
        Thread.sleep(3000); //waiting for 3 seconds to open the next URL
        driverChrome.navigate().to("https://www.amazon.com/"); //opening amazon.com


//opening with Firefox
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driverFirefox = new FirefoxDriver();
//        driverFirefox.get("https://www.google.com/"); //opening google.com
//        Thread.sleep(3000); //waiting for 3 seconds to open the next URL
//        driverFirefox.navigate().to("https://www.amazon.com/"); //opening amazon.com


    }
}
