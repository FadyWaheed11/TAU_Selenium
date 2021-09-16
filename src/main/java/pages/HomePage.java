package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickOnLinkText("Form Authentication");
        return new LoginPage(driver);
    }

    public DropDownPage clickOnDropDownList() {
        clickOnLinkText("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPassword() {
        clickOnLinkText("Forgot Password");
        return new ForgetPasswordPage(driver);
    }

    public HoverPage clickOnHover() {
        clickOnLinkText("Hovers");
        return new HoverPage(driver);
    }

    public KeyPressesPage clickOnKeyPressesPage() {
        clickOnLinkText("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalRangePage clickOnHorizontalSlider() {
        clickOnLinkText("Horizontal Slider");
        return new HorizontalRangePage(driver);
    }

    public AlertsPage clickOnJavaScriptAlerts() {
        clickOnLinkText("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickOnUploadFile() {
        clickOnLinkText("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickOnContextMenu() {
        clickOnLinkText("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickOnWysiwygEditor() {
        clickOnLinkText("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public FramePage clickOnFrames() {
        clickOnLinkText("Frames");
        return new FramePage(driver);
    }

    public WaitLoadingPage clickOnWaitLoading() {
        clickOnLinkText("Dynamic Loading");
        return new WaitLoadingPage(driver);
    }

    public LargeDeepPage clickOnLargeDeepPage() {
        clickOnLinkText("Large & Deep DOM");
        return new LargeDeepPage(driver);
    }

    public InfiniteScrollPage clickOnInfiniteScrollPage() {
        clickOnLinkText("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowPage clickOnMultipleWindowPage(){
        clickOnLinkText("Multiple Windows");
        return new MultipleWindowPage(driver);
    }

    private void clickOnLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

}
