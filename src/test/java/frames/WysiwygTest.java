package frames;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class WysiwygTest extends BaseTest {

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickOnWysiwygEditor();
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea("Hello");
        wysiwygEditorPage.increaseIndention();
        wysiwygEditorPage.setTextArea("World");
        Assert.assertEquals(wysiwygEditorPage.getText(),"HelloWorld","Text from iframe incorrect");
    }
}
