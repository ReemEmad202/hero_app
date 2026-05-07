package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JsAlertsTests extends BaseTest {

    @Test
    public void alertButton(){
        var javaScriptAlertsPage = homePage.clickOnAlerts();
        javaScriptAlertsPage.clickAlertButton();
        javaScriptAlertsPage.Alert_Accept();
        assertEquals(javaScriptAlertsPage.getResult(),"You successfully clicked an alert", "The result is incorrect");
    }

    @Test
    public void confirmButton(){
        var javaScriptAlertsPage = homePage.clickOnAlerts();
        javaScriptAlertsPage.clickConfirmButton();
        var text = javaScriptAlertsPage.Alert_getText();
        javaScriptAlertsPage.Alert_Dismiss();
        assertEquals(text,"I am a JS Confirm","The message is incorrect");
    }

    @Test
    public void promptButton(){
        var javaScriptAlertsPage = homePage.clickOnAlerts();
        var text = "Digi";
        javaScriptAlertsPage.clickPromptButton();
        javaScriptAlertsPage.Alert_setText(text);
        javaScriptAlertsPage.Alert_Accept();
        assertEquals(javaScriptAlertsPage.getResult(),"You entered: " +text);
    }
}
