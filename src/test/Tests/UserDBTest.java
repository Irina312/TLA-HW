package Tests;

import Pages.UserDBPage;
import Pages.UserMgtPage;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserDBTest extends BaseTest {
    UserDBPage newUserPage;
    UserMgtPage userMgtPage;

    @BeforeMethod
    public void localSetUp() {
        newUserPage = new UserDBPage(getDriver());
    }

//    @DataProvider(name = "data2")
//    public Object[][] data2() {
//        return new Object[][]{{"mentor"}, {"instructor"}, {"student"}};
//    }

    @Test(testName = "New user")
    public void test01() {
        userMgtPage.click(userMgtPage.userMgtBtn);
        newUserPage.firstName.click();
        newUserPage.firstName.sendKeys("Join");

        //newUserPage.lastName.click();
        newUserPage.lastName.sendKeys("Doe");

        //newUserPage.phoneNumber.click();
        newUserPage.phoneNumber.sendKeys("100-000-0001");

        //newUserPage.email.click();
        newUserPage.email.sendKeys("jd@test.com");

        //newUserPage.roleSelect.sendKeys(role);


    }
}


// Add a new user to the User-Mgt page, Submit a table to add to the Database,
// and verify the user was added to DB.
// Requirement: Use DataProviders to have 3 different users (mentor, student, instructor)
