package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ExampleOne = By.xpath("//a[contains(text(),'Example 1')]");
    public DynamicLoadingPage (WebDriver driver){
        this.driver=driver;
    }

    public LoadingExampleOnePage clickONExampleOne(){
        driver.findElement(ExampleOne).click();
        return new LoadingExampleOnePage(driver);
    }

}
