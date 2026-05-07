package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadFileTests extends BaseTest {

    @Test
    public void uploadFile() throws Exception {
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\hero_app\\resources\\reeeee.txt";
        var uploadPage = homePage.clickOnUploadFile();
        uploadPage.uploadFile(filePath);
        uploadPage.clickUploadButton();
        assertEquals(uploadPage.getUploadedFileName(),"reeeee.txt");
    }
}
