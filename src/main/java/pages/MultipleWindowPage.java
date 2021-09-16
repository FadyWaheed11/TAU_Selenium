package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {

    private final WebDriver driver;
    private final By clickHere = By.linkText("Click Here");


    MultipleWindowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHere).click();
    }
}
