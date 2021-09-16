package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramePage {

    private WebDriver driver;

    NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }


    public String getTextFromLeftFrame() {
        switchToLeftFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        switchToParent();
        switchToParent();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToBottomFrame();
        String text = driver.findElement(By.tagName("body")).getText();
        switchToParent();
        return text;
    }

    private void switchToLeftFrame() {
        String topFrame = "frame-top";
        String leftFrame = "frame-left";
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }

    private void switchToBottomFrame() {
        String bottomFrame = "frame-bottom";
        driver.switchTo().frame(bottomFrame);
    }

    private void switchToParent() {
        driver.switchTo().parentFrame();
    }
}
