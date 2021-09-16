package waits;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class DynamicLoadingPageTest extends BaseTest {

    @Test
    public void testDynamicLoadingPage() {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnWaitLoading()
                .clickOnDynamicLoadingPage();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Text from loading incorrect");
    }
}
