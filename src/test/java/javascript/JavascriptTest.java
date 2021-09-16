package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeDeepPage;

public class JavascriptTest extends BaseTest {

    @Test
    public void testScrollToTable(){
        LargeDeepPage largeDeepPage = homePage.clickOnLargeDeepPage();
        largeDeepPage.scrollToTable();
    }

    @Test
    public void testScrollFiveParagraphs(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickOnInfiniteScrollPage();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
