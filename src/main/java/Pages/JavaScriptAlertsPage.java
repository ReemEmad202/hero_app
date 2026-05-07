package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private final WebDriver driver;
    private final By alretButton = By.xpath("//button[contains(.,'Alert')]");
    private final By confirmButton = By.xpath("//button[contains(.,'Confirm')]");
    private final By promptButton = By.xpath("//button[contains(.,'Prompt')]");
    private final By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAlertButton(){
        driver.findElement(alretButton).click();
    }
    public void clickConfirmButton(){
        driver.findElement(confirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(promptButton).click();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void Alert_Accept(){
        driver.switchTo().alert().accept();
    }

    public void Alert_Dismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void Alert_setText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String Alert_getText(){
        return driver.switchTo().alert().getText();
    }
}
