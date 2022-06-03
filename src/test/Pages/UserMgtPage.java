package Pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMgtPage extends BasePage {
    protected WebDriver driver;

    public UserMgtPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='User-Mgt']")
    public WebElement userMgtBtn;

    @FindBy(xpath = "//button[@id='access-db-btn']//a[@id='practice-form']")
    public WebElement accessDBBtn;
}
