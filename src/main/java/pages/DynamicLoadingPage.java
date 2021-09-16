package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By startButton = By.id("start");
    private By text = By.id("finish");

    DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickOnStart() {
        driver.findElement(startButton).findElement(By.tagName("button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(text));
    }

    public String getLoadedText() {
        clickOnStart();
        return driver.findElement(text).getText();
    }
}
