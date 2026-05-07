package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {

    @Test
    public void FrameTest(){
        var nestedFramesPage = homePage.ClickOnFrames().clickOnNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrame(), "LEFT", "The content is incorrect");
        assertEquals(nestedFramesPage.getBottomFrame(),"BOTTOM","The content is incorrect");
    }
}
