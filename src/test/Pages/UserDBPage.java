package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserDBPage extends BasePage {
    protected WebDriver driver;

    public UserDBPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = " //input[@id='Firstname']")
    public WebElement firstName;

    @FindBy(id = "Lastname")
    public WebElement lastName;

    @FindBy(id = "Phonenumber")
    public WebElement phoneNumber;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Select-role")
    public WebElement roleSelect;

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
}


