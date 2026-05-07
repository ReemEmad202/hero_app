package Pages;

import MultipleWindows.MultipleWindowPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver ;
    WebDriverWait wait ;
    public HomePage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver , Duration.ofSeconds(3));
    }
    public LoginPage formAuthenticationLinkClick(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickOnHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressPage ClickOnKeyPress(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }

    public JavaScriptAlertsPage clickOnAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public UploadPage clickOnUploadFile(){
        clickLink("File Upload");
        return new UploadPage(driver);
    }
    public FramesPage ClickOnFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickOnLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
     public HorizontalSliderPage clickOnHorizontalSlider() {
         clickLink("Horizontal Slider");
         return new HorizontalSliderPage(driver);
     }

     public JQueryMenuPage clickOnJQueryMenu() {
         clickLink("JQuery UI Menus");
         return new JQueryMenuPage(driver);
     }

    public MultipleWindowPage clickOnMultipleWindow(){
        clickLink("Multiple Windows");
        return new MultipleWindowPage(driver);
    }

    public void clickLink(String linkText) {
        WebElement link = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
        link.click();
    }
}
