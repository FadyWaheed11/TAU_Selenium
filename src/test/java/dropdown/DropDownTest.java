package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropDownPage;

import java.util.List;

public class DropDownTest extends BaseTest {

    @Test
    public void testDropDown() {
        SoftAssert softAssert = new SoftAssert();
        DropDownPage dropDownPage = homePage.clickOnDropDownList();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedElements = dropDownPage.getSelectedElements();
        softAssert.assertEquals(selectedElements.size(), 1, "Incorrect Size");
        softAssert.assertTrue(selectedElements.contains(option), "Incorrect value");
        softAssert.assertAll();
    }
}
