package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[@type='submit']");

    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickOnLogin() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
