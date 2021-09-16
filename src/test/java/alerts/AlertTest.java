package alerts;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickOnJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickAcceptAlert();
        Assert.assertEquals(alertsPage.getResult(),
                "You successfully clicked an alert",
                "Result test incorrect");
    }

    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickOnJavaScriptAlerts();
        alertsPage.triggerConfirmAlert();
        String result = alertsPage.alert_getText();
        alertsPage.alert_clickDismissAlert();
        Assert.assertEquals(result, "I am a JS Confirm", "Alert test incorrect");
    }

    @Test
    public void testSendTextToAlert(){
        AlertsPage alertsPage = homePage.clickOnJavaScriptAlerts();
        alertsPage.triggerPromptAlert();
        alertsPage.alert_sendText("Fady Waheed");
        alertsPage.alert_clickAcceptAlert();
        Assert.assertEquals(alertsPage.getResult(),"You entered: Fady Waheed","Result test incorrect");
    }
}
