package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");

    FramePage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramePage clickOnNestedFrames(){
        driver.findElement(nestedFrames).click();
        return new NestedFramePage(driver);
    }
}
