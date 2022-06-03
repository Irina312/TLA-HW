package Tests;

import Pages.HomePage;
import Pages.UserMgtPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class UserMgtTest extends BaseTest {
    HomePage homePage;
    UserMgtPage userMgtPage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        userMgtPage = new UserMgtPage(getDriver());
    }
    @Test(testName = "Verify title of User-Mgt page")
    public void test01() {
        userMgtPage.click(userMgtPage.userMgtBtn);
        userMgtPage.accessDBBtn.click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "User DB");
    }
}
// Verify title of the page is "User DB" when you open a window
// with the Access DB button in the User-Mgt page
