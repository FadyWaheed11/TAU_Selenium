package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalRangePage {

    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By rangeValue = By.id("range");

    HorizontalRangePage(WebDriver driver) {
        this.driver = driver;
    }

    private void setSlider(int range) {
        for (int i = 0; i < range; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public boolean isCorrectRange(int range) {
        setSlider(range);
        String sliderRange = driver.findElement(rangeValue).getText();
        int sliderValue = Integer.parseInt(sliderRange);
        int enteredValue = range / 2;
        return sliderValue == enteredValue;
    }

}
