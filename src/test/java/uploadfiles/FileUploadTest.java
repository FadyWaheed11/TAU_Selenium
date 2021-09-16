package uploadfiles;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void testUploadFile() {
        FileUploadPage fileUploadPage = homePage.clickOnUploadFile();
        fileUploadPage.uploadFile("F:\\TestAutomationU\\resources\\chromedriver.exe");
        Assert.assertEquals(fileUploadPage.getUploadedFile(), "chromedriver.exe", "File not uploaded");
    }
}
