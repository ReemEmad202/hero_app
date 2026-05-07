package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.PublicKey;

public class HoversPage {
    private final WebDriver driver;
    private By figureBox = By.cssSelector("[class='figure']");
    private By figureCaption = By.className("figcaption");
    public HoversPage(WebDriver driver){
        this.driver=driver;
    }

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }

    public class FigureCaption{
        private WebElement caption;
        private By Header = By.tagName("h5");
        private By linkText = By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption=caption;
        }

        public boolean isDisplayedCaption(){
            return caption.isDisplayed();
        }

        public String getName(){
            return caption.findElement(Header).getText();
        }

        public String getLinkText(){
            return caption.findElement(linkText).getText();
        }

        public String getLink(){
            return caption.findElement(linkText).getAttribute("href");
        }
    }
}
