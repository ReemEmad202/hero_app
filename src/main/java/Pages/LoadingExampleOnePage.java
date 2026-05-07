package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadingExampleOnePage {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By Title = By.xpath("//h4[text()='Hello World!']");
    public LoadingExampleOnePage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnStartButton(){
        driver.findElement(startButton).click();
    }

    public boolean loadingIsInvisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Title)));
        return true;
    }
}
