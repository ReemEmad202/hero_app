package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends BaseTest {
    @Test
    public void Hovers(){
        var hoverPage = homePage.clickOnHover();
        var figureCaption = hoverPage.hoverOverFigure(2);
        assertTrue(figureCaption.isDisplayedCaption());
        assertEquals(figureCaption.getName(),"name: user1","The name is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","The text is incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"The link is incorrect");
    }
}
