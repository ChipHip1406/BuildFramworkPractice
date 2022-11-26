//package TestCase;
//
//import PageObject.element.loginPageElement;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import commons.BasePage;
//import org.testng.annotations.Test;
//
//public class Test1 {
//
//    public Test1(WebDriver driver) {
//        super(driver);
//    }
//
//    @Test
//    public void Login(){
//
//
//        WebDriverManager.chromedriver().arch64().setup();
//        driver = new ChromeDriver();
//
//
//        // Maximize the browser
//        driver.manage().window().maximize();
//
//        // Launch Website
//        driver.get("https://emrb-dev01.azurewebsites.net/");
//
//        //acceptCookie
//        clickToElementJS(loginPageElement.cookieBtn);
//
//        //Input userName
//        sendKeyToElementJS(loginPageElement.userName,"uyen dcc2");
//
//        //Input password
//        sendKeyToElement(loginPageElement.password,"123456");
//
//        //click Login
//        clickElement(loginPageElement.loginBtn);
//
//
//
//    }
//}
