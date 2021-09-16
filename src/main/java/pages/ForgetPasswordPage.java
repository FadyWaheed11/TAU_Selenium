package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By submitButton = By.id("form_submit");

    ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(submitButton).click();
    }
}
