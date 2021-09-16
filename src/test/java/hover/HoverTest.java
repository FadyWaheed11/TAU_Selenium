package hover;
import base.BaseTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1() {
        HoverPage hoverPage = homePage.clickOnHover();
        HoverPage.FigureCaption figureCaption = hoverPage.hoverOverFigure(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "No Caption Displayed");
        assertEquals(figureCaption.getTitle(), "name: user1", "Caption Title Incorrect");
        assertEquals(figureCaption.getLinkText(), "View profile", "Caption LinkText Incorrect");
        assertTrue(figureCaption.getLink().endsWith("/users/1"), "Link Incorrect");
    }
}
