package Mentoring_20230213;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class exercise {

    /**
     * Navigate to "http://tutorialsninja.com/demo/"
     * Click on MyAccount
     * Click on Register
     * Fill the form
     * Accept the privacy policy
     * Click on Continue
     * */

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://tutorialsninja.com/demo/");

//<a href="http://tutorialsninja.com/demo/index.php?route=account/account" title="My Account" class="dropdown-toggle"
// data-toggle="dropdown"><i class="fa fa-user"></i> <span class="hidden-xs hidden-sm hidden-md">My Account</span> <span class="caret"></span></a>

        WebElement myAccountButton = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/account']"));
//        <a href="http://tutorialsninja.com/demo/index.php?route=account/register">Register</a>
        myAccountButton.click();

//        <a href="http://tutorialsninja.com/demo/index.php?route=account/register">Register</a>
        WebElement registerButton = driver.findElement(By.cssSelector("a[href='http://tutorialsninja.com/demo/index.php?route=account/register'"));
        registerButton.click();


//      Locating the first name  <input type="text" name="firstname" value="" placeholder="First Name" id="input-firstname" class="form-control">
        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Murat");
//      Locating the last name   <input type="text" name="lastname" value="" placeholder="Last Name" id="input-lastname" class="form-control">
        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Yilmaz");
//      Locating the email       <input type="email" name="email" value="" placeholder="E-Mail" id="input-email" class="form-control">
        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("muratyilmaz198039476@gmail.com");
//      Locating the phone       <input type="tel" name="telephone" value="" placeholder="Telephone" id="input-telephone" class="form-control">
        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("9999999");
//      Locating the password    <input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("MY123456");
//      Locating the retype password    <input type="password" name="confirm" value="" placeholder="Password Confirm" id="input-confirm" class="form-control">
        WebElement retypePassword = driver.findElement(By.id("input-confirm"));
        retypePassword.sendKeys("MY123456");
//      Locating the privacy policy    <input type="checkbox" name="agree" value="1">
        WebElement privacyPolicyBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        privacyPolicyBox.click();
//      Locating the continue button    <input type="submit" value="Continue" class="btn btn-primary">
        WebElement continueButton = driver.findElement(By.cssSelector("input[type='submit']"));
        continueButton.click();

//        Thread.sleep(3000);
//        driver.quit();

    }
}
