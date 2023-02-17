package Mentoring_20230207;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auxForTheTasks {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

//        <div class="container">
//                <a href="/index.html" class="brand">Zero Bank</a>
//            </div>
        WebElement linkText = driver.findElement(By.className("container"));
        System.out.println(linkText.getText());

//        the first verification
        if (linkText.getText().equals("Zero Bank")){
            System.out.println(0);
        }else{
            System.out.println(1);
        }

//        the second verification
        WebElement hrefText = driver.findElement(By.cssSelector("a[href='/index.html']"));
        System.out.println(hrefText.getAttribute("href"));

        Thread.sleep(1000);
        driver.quit();
    }
}
