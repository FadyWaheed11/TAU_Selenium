package contextmenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickOnContextMenu();
        contextMenuPage.clickOnBoxContext();
        String alertResult = contextMenuPage.getAlertText();
        contextMenuPage.acceptAlert();
        Assert.assertEquals(alertResult, "You selected a context menu",
                "Alert test is incorrect");
    }
}
