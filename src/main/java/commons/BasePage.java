package commons;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class BasePage {
    public WebDriver driver ;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }


    public List<WebElement> getElements (By locator){
        return driver.findElements(locator);
    }

    public void clickElement(By locator){
        getElement(locator).click();
    }

    protected void sendKeyToElement(By locator, String value){
        getElement(locator).sendKeys(value);
    }

    public void clickElementAction(By locator){
        Actions action = new Actions(driver);
        action.click(getElement(locator)).perform();
    }

    public void sendKeyToElementAction(By locator, String value){
        Actions action = new Actions(driver);
        action.sendKeys(getElement(locator),value).perform();
    }

    public void clickToElementJS(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", getElement(locator));
    }

    public void sendKeyToElementJS(By locator, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', '" + value +"')", getElement(locator));
    }

    public String getTextElement(By locator){
        return getElement(locator).getText();
    }

    public void explicitLongWaitForElementDisplay(By locator){
        // explicit wait condition
        WebDriverWait waitExplicit = new WebDriverWait(driver,Duration.ofSeconds(Parameter.LONG_WAIT));
        // presenceOfElementLocated condition
        waitExplicit.until(ExpectedConditions.visibilityOf(getElement(locator)));
    }

    public void explicitShortWaitForElementDisplay(By locator){
        // explicit wait condition
        WebDriverWait waitExplicit = new WebDriverWait(driver,Duration.ofSeconds(Parameter.SHORT_WAIT));
        // presenceOfElementLocated condition
        waitExplicit.until(ExpectedConditions.visibilityOf(getElement(locator)));
    }

    public void setTextToElement(By locator, String value){
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }

    public void selectOptionDropdownByValue(By locator,String value ){
        Select element = new Select(getElement(locator));
        element.selectByValue(value);
    }

    public void  deselectOption(By locator, String value){
        Select element = new Select(getElement(locator));
        element.deselectByValue(value);
    }

    public void isEle123(){
        return;
    }


//    Assert(isEle123())























}
