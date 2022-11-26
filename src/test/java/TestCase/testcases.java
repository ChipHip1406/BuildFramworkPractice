package TestCase;

import PageObject.LoginPage;
import commons.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcases extends BaseTest {

    @Test
    public void scenario1(){

        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.acceptCookie();
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.isUserNameDisplayCorrectly("uyen DCC 2"));

    }
}
