package frames;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.NestedFramePage;

public class FrameTest extends BaseTest {

    @Test
    public void testFrames() {
        FramePage framePage = homePage.clickOnFrames();
        NestedFramePage nestedFramePage = framePage.clickOnNestedFrames();
        String leftText = "LEFT";
        String bottomText = "BOTTOM";
        Assert.assertEquals(nestedFramePage.getTextFromLeftFrame(), leftText,
                "Text from left frame incorrect");
        Assert.assertEquals(nestedFramePage.getTextFromBottomFrame(), bottomText,
                "Text from bottom frame incorrect");
    }
}
