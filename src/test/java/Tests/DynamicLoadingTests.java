package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void dynamicLoadingTests() {
        var dynamicLoading = homePage.clickOnDynamicLoading().clickONExampleOne();
        dynamicLoading.clickOnStartButton();
        assertTrue(dynamicLoading.loadingIsInvisible(),"The loading is not finished yet");
    }
}
