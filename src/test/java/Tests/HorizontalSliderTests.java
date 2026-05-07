package Tests;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void horizontalSliderToRight() {
        var horizontalSliderPage = homePage.clickOnHorizontalSlider();
        horizontalSliderPage.moveSliderToRight();
        horizontalSliderPage.moveSliderToRight();
        horizontalSliderPage.moveSliderToRight();
        Assert.assertEquals(horizontalSliderPage.getSliderValue(), "1.5", "The value is incorrect");
    }
    @Test
    public void horizontalSliderToLeft() {
        var horizontalSliderPage = homePage.clickOnHorizontalSlider();
        horizontalSliderPage.moveSliderToRight();
        horizontalSliderPage.moveSliderToLeft();
        Assert.assertEquals(horizontalSliderPage.getSliderValue(), "0", "The value is incorrect");
    }
}
