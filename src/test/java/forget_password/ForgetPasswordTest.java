package forget_password;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;

public class ForgetPasswordTest extends BaseTest {

    @Test
    public void forgetPassword(){
        ForgetPasswordPage forgetPasswordPage = homePage.clickOnForgetPassword();
        forgetPasswordPage.enterEmail("fadywaheed10@gmail.com");
    }
}
