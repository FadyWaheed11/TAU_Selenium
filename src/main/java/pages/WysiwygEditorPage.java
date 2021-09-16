package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WysiwygEditorPage {

    private WebDriver driver;
    private By textArea = By.id("tinymce");
    private By increaseIndention = By.xpath("//button[@title='Increase indent']");
    WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndention(){
        driver.findElement(increaseIndention).click();
    }

    public String getText(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToEditArea() {
        String editorId = "mce_0_ifr";
        driver.switchTo().frame(editorId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
