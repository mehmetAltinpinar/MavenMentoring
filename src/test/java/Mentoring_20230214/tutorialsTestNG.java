package Mentoring_20230214;

/**
 * Navigate to "http://tutorialsninja.com/demo/"
 * Click on Laptops & Notebooks
 * Click on Show All Laptops & Notebooks
 * Sort the products according to their price(Lowest first)
 * Click on the second one.
 * Click on the add to cart
 * check if you see the success message
 * */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tutorialsTestNG {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://tutorialsninja.com/demo/");

//        <a href="http://tutorialsninja.com/demo/index.php?route=product/category&amp;path=18" class="dropdown-toggle"
//        data-toggle="dropdown" aria-expanded="true">Laptops &amp; Notebooks</a>
//
        WebElement laptopsAndDesktops = driver.findElement(By.linkText("Laptops & Notebooks"));
        laptopsAndDesktops.click();

        WebElement showAllComputers = driver.findElement(By.linkText("Show All Laptops & Notebooks"));
        showAllComputers.click();

        WebElement sortButton = driver.findElement(By.id("input-sort"));

        Select sortButtonSelect = new Select(sortButton);

        sortButtonSelect.selectByVisibleText("Price (Low > High)");

        WebElement secondProduct = driver.findElement(By.linkText("MacBook"));
        secondProduct.click();

        WebElement addToCartButton = driver.findElement(By.id("button-cart"));
        addToCartButton.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
