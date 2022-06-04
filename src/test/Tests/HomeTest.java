package Tests;

import Pages.HomePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @DataProvider(name = "LinksTestData")
    public Object[][] testData1() {
        Object[][] data = new Object[7][2];
        data[0][0] = "php-travels";
        data[0][1] = "Demo Script Test drive - PHPTRAVELS";

        data[1][0] = "mercury-tours";
        data[1][1] = "Demoaut.com";

        data[2][0] = "internet";
        data[2][1] = "The Internet";

        data[3][0] = "e-commerce";
        data[3][1] = "My Store";

        data[4][0] = "passion-tea-company";
        data[4][1] = "";

        data[5][0] = "sauce-demo";
        data[5][1] = "Swag Labs";

        data[6][0] = "shopping-cart";
        data[6][1] = "Typescript React Shopping cart";

        return data;
    }

    @Test(dataProvider = "LinksTestData")
    public void test01(String linkText, String expectedTitle) {
        getDriver().findElement(By.id(linkText)).click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}

//  Verify all links on the homepage of the application are taken to the expected page
//  by using the title of the target website.
//  Requirement: Use data providers.
