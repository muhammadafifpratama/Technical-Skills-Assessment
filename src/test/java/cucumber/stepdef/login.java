package cucumber.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Given("halaman login")
    public void halamanLogin(){
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("input username")
    public void inputUsername() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    }

    @And("input password")
    public void inputPassword() {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    }

    @And("click login button")
    public void clicklogin() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("user in on dashboard page")
    public void dashboard() {
       String title = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals(title,"Dashboard");
//        driver.close();
//        System.out.printf("user is in dashboard");
    }

    @When("user click profile")
    public void profile(){
        driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
    }

    @And("user click logout")
    public void logot(){
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    @Then("user out on login page")
    public void login(){
        String title = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
        Assert.assertEquals(title,"Login");
    }

    @And("input wrong password")
    public void salah(){
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abdfhbgehfju");
    }

    @Then("user receives error")
    public void error(){
        String title = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
        Assert.assertEquals(title,"Invalid credentials");
    }
}
