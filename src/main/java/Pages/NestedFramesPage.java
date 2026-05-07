package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By frameBody = By.tagName("body");
    public NestedFramesPage(WebDriver driver){
        this.driver=driver;
    }

    public String getLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = driver.findElement(frameBody).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getBottomFrame(){
        driver.switchTo().frame(bottomFrame);
        String bottomText = driver.findElement(frameBody).getText();
        driver.switchTo().defaultContent();
        return bottomText;
    }

}
