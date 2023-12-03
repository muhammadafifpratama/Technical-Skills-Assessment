package cucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class cancel_leave {

    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @Given("user already log in")
    public void halamanLogin(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String title = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
        Assert.assertEquals(title,"Dashboard");
    }

    @When("user click my leave")
    public void leave(){ driver.findElement(By.xpath("//button[@title='My Leave']")).click(); }

    @Then("user click cancel")
    public void cancel(){ driver.findElement(By.xpath("//button[text()='Cancel']")); }
}
