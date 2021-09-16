package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickOnWaitLoading().clickOnDynamicLoadingPage();
        getWindowManager().goBack();
        getWindowManager().goRefresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickOnMultipleWindowPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
