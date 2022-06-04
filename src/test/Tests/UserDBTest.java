package Tests;

import Pages.UserDBPage;
import Pages.UserMgtPage;
import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserDBTest extends BaseTest {
    UserDBPage userDBPage;
    UserMgtPage userMgtPage;

    @BeforeMethod
    public void localSetUp() {
        userDBPage = new UserDBPage(getDriver());
    }

    @DataProvider(name = "Users info")
    public Object[][] testData2() {
        Object[][] data2 = new Object[3][5];
        data2[0][0] = "John";
        data2[0][1] = "Doe";
        data2[0][2] = "100-000-0001";
        data2[0][3] = "jd@test.com";
        data2[0][4] = "student";

        data2[1][0] = "Mary";
        data2[1][1] = "Smith";
        data2[1][2] = "200-000-0002";
        data2[1][3] = "ms@test.com";
        data2[1][4] = "mentor";

        data2[2][0] = "Nick";
        data2[2][1] = "Burns";
        data2[2][2] = "300-000-0003";
        data2[2][3] = "nb@test.com";
        data2[2][4] = "instructor";

        return data2;
    }

    @Test(testName = "New user", dataProvider = "Users info")
    public void test01(String firstName, String lastName, String phoneNumber,
                       String email, String role) {
        userMgtPage.click(userMgtPage.userMgtBtn);
        userDBPage.firstName.click();
        userDBPage.firstName.sendKeys(firstName);

        userDBPage.lastName.click();
        userDBPage.lastName.sendKeys(lastName);

        userDBPage.phoneNumber.click();
        userDBPage.phoneNumber.sendKeys(phoneNumber);

        userDBPage.email.click();
        userDBPage.email.sendKeys(email);

        Select select = new Select(userDBPage.roleSelect);
        select.selectByVisibleText(role);

        userDBPage.submitBtn.click();
    }
    @Test(testName = "Verify the user was added to DB")
    public void test02() {
        userDBPage.submitTableBtn.click();
        userMgtPage.accessDBBtn.click();

        String expectedUser = "";
        String actualUser = "";


    }
}


// Add a new user to the User-Mgt page, Submit a table to add to the Database,
// and verify the user was added to DB.
// Requirement: Use DataProviders to have 3 different users (mentor, student, instructor)
