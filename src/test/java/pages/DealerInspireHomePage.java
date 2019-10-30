package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DealerInspireHomePage {
    public DealerInspireHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(tagName = "button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='auth-errors']")
    public WebElement warningMessage;


}
