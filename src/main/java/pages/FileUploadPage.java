package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(chooseFile).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFile() {
        return driver.findElement(uploadedFile).getText();
    }
}
