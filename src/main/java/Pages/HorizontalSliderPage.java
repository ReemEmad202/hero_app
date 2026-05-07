package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    WebDriver driver;
    By slider = By.cssSelector("input[type='range']");
    By value = By.id("range");
    int times = 6;

    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void moveSliderToRight() {
        WebElement sliderElement = driver.findElement(slider);
        sliderElement.sendKeys(Keys.ARROW_RIGHT);
    }
    public void moveSliderToLeft() {
        WebElement sliderElement = driver.findElement(slider);
        sliderElement.sendKeys(Keys.ARROW_LEFT);
    }

    public String getSliderValue(){
        WebElement valueElement = driver.findElement(value);
        return valueElement.getText();
    }
}
