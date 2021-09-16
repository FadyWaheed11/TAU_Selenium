package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private final WebDriver driver;
    private final By target = By.id("target");
    private final By resultText = By.id("result");

    KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(target).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }
}
