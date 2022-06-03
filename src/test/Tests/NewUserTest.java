package Tests;

import Pages.NewUserPage;
import Pages.UserMgtPage;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;

public class NewUserTest extends BaseTest {
    NewUserPage newUserPage;

    @BeforeMethod
    public void localSetUp() {
        newUserPage = new NewUserPage(getDriver());
    }

}


// Add a new user to the User-Mgt page, Submit a table to add to the Database,
// and verify the user was added to DB.
// Requirement: Use DataProviders to have 3 different users (mentor, student, instructor)
