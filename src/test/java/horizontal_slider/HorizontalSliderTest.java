package horizontal_slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalRangePage;

import static org.testng.Assert.assertTrue;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSlider(){
        HorizontalRangePage horizontalRangePage = homePage.clickOnHorizontalSlider();
        assertTrue(horizontalRangePage.isCorrectRange(4),"Range is incorrect");
    }
}
