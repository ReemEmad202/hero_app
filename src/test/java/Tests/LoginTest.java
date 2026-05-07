package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.SecurePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void successfulTests(){
        LoginPage loginPage = homePage.formAuthenticationLinkClick();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.loginButtonClick();
        assertTrue(securePage.getText().contains("You logged into a secure area!"),"You logged into a secure area!");
    }
}
