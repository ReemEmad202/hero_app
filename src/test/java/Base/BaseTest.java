package Base;

import Pages.HomePage;
import Utils.WindowManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage ;
    @BeforeTest
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws InterruptedException {
        if (ITestResult.FAILURE==result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File takeScreenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(takeScreenshot.toPath(), new File("resources/screenshots/"+result.getName()+".png").toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Thread.sleep(1000);
        driver.quit();
    }

}
