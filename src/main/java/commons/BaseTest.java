package commons;
import PageObject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest{

    public WebDriver driver;
    @BeforeTest
    public void openBrowser(){
//        WebDriverManager.chromedriver().arch64().setup();

        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get("https://emrb-dev01.azurewebsites.net/");

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
