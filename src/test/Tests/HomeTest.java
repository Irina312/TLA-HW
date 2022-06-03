package Tests;

import Pages.HomePage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @Test(testName = "Verify PNP Travels link & page title")
    public void test01() {
        homePage.phpTravelsLink.click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Demo Script Test drive - PHPTRAVELS");
    }

    @Test(testName = "Verify Mercury-Tours link & page title")
    public void test02() {
        homePage.click(homePage.mercuryToursLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "newtours.demoaut.com");
    }

    @Test(testName = "Verify Internet link & page title")
    public void test03() {
        homePage.internetLink.click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "The Internet");
    }

    @Test(testName = "Verify eCommerce link & page title")
    public void test04() {
        homePage.click(homePage.ecommerceLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "My Store");
    }

    @Test(testName = "Verify Passion Tea Company link & page title")
    public void test05() {
        homePage.passionTeaCompanyLink.click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "www.practiceselenium.com");
    }

    @Test(testName = "Verify Saucedemo link & page title")
    public void test06() {
        homePage.click(homePage.sauceDemoLink);
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Swag Labs");
    }

    @Test(testName = "Verify Saucedemo link & page title")
    public void test07() {
        homePage.shoppingCartLink.click();
        String actualTitle = SeleniumUtils.switchToWindowAndVerifyTitle(getDriver());
        Assert.assertEquals(actualTitle, "Typescript React Shopping Cart");
    }
}

//  Verify all links on the homepage of the application are taken to the expected page
//  by using the title of the target website.
//  Requirement: Use data providers.
