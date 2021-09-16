package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private final WebDriver driver;
    private final By box = By.id("hot-spot");

    ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBoxContext() {
        Actions actions = new Actions(driver);
        WebElement boxElement = driver.findElement(box);
        actions.contextClick(boxElement).perform();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
