package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private final WebDriver driver;
    private final By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private final By triggerConfirmAlertButton = By.xpath("//button[text()='Click for JS Confirm']");
    private final By triggerPromptAlertButton = By.xpath("//button[text()='Click for JS Prompt']");
    private final By result = By.id("result");

    AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirmAlert() {
        driver.findElement(triggerConfirmAlertButton).click();
    }

    public void triggerPromptAlert() {
        driver.findElement(triggerPromptAlertButton).click();
    }

    public void alert_clickAcceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickDismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void alert_sendText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}
