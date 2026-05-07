package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class JQueryMenuTests extends BaseTest {

    @Test
    public void verifyDownloadPDF(){
        var jQueryMenuPage = homePage.clickOnJQueryMenu();
        jQueryMenuPage.hoverToEnable();
        jQueryMenuPage.hoverToDownloads();
        jQueryMenuPage.clickOnPDF();
    }
}
