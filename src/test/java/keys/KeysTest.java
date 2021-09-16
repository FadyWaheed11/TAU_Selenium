package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage = homePage.clickOnKeyPressesPage();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Result is incorrect");
    }
}
