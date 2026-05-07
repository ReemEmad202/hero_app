package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadPage {
    private WebDriver driver;
    private By chooseButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");
    public UploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void uploadFile(String path) throws Exception{
        StringSelection strSelection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
        driver.findElement(chooseButton).sendKeys(path);
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFileName(){
        return driver.findElement(uploadedFile).getText();
    }
}
