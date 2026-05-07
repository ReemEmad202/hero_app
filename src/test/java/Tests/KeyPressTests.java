package Tests;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeyPressTests extends BaseTest {
    @Test
    public void KeyPresses(){
        var keyPress = homePage.ClickOnKeyPress();
        keyPress.setText("a" + Keys.BACK_SPACE);
        assertEquals(keyPress.getResult() ,"You entered: BACK_SPACE" , "The text is incorrect");
    }
}
