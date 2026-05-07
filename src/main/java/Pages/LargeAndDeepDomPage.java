package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By tableLocator = By.id("large-table");
    public LargeAndDeepDomPage (WebDriver driver){
        this.driver=driver;
    }

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(tableLocator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",tableElement);
    }
}
