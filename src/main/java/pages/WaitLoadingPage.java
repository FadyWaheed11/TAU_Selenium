package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitLoadingPage {

    private WebDriver driver;
    private By example2 = By.linkText("Example 2: Element rendered after the fact");

    WaitLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPage clickOnDynamicLoadingPage(){
        driver.findElement(example2).click();
        return new DynamicLoadingPage(driver);
    }
}
