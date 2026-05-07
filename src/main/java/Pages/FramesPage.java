package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By NestedFramesButton = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver){
        this.driver=driver;
    }

    public NestedFramesPage clickOnNestedFrames(){
        driver.findElement(NestedFramesButton).click();
        return new NestedFramesPage(driver);
    }
}
