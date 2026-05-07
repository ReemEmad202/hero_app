package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");
    public KeyPressPage(WebDriver driver){
        this.driver=driver;
    }

    public void setText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
       return driver.findElement(result).getText();
    }
}
