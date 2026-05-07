package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.swing.*;
import java.time.Duration;

public class JQueryMenuPage {
    WebDriver driver;
    By enable = By.xpath("//a[text()=\"Enabled\"]");
    By downloads = By.xpath("//a[text()=\"Downloads\"]");

    public JQueryMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void hoverToEnable(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(enable)).perform();
    }
    public void hoverToDownloads(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Actions action = new Actions(driver);
        wait.until(d->d.findElement(downloads).isDisplayed());
        action.moveToElement(driver.findElement(downloads)).perform();
    }
    public void clickOnPDF(){
        By pdf = By.xpath("//a[text()=\"PDF\"]");
        driver.findElement(pdf).click();
    }
}
