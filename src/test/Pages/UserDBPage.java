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
}

