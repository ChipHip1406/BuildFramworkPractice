package PageObject;

import PageObject.element.HomePage;
import PageObject.element.loginPageElement;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import PageObject.element.loginPageElement;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void acceptCookie(){
        explicitShortWaitForElementDisplay(loginPageElement.cookieBtn);
        clickElement(loginPageElement.cookieBtn);
    }
    public void inputUserName(){
        explicitShortWaitForElementDisplay(loginPageElement.userName);
        sendKeyToElement(loginPageElement.userName,"uyen dcc2");

    }
    public void inputPassword(){
        explicitShortWaitForElementDisplay(loginPageElement.password);
        sendKeyToElement(loginPageElement.password,"123456");

    }

    public void clickLoginBtn(){
        explicitShortWaitForElementDisplay(loginPageElement.loginBtn);
        clickElement(loginPageElement.loginBtn);
    }

    public boolean isUserNameDisplayCorrectly(String username){
        explicitShortWaitForElementDisplay(HomePage.username);
        String getUserName = getTextElement(HomePage.username);
        if(username.equals(getUserName)){
            return true;
        }
        else {
            return false;
        }
    }
}
