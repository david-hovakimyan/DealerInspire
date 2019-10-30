package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.DealerInspireHomePage;
import utilities.Config;
import utilities.Driver;

public class DealerInspire_Steps {
    DealerInspireHomePage dealerInspireHomePage = new DealerInspireHomePage();
    @Given("User is on at https:\\/\\/conversations.dealerinspire.com")
    public void user_is_on_at_https_conversations_dealerinspire_com() {
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @When("User attempts a login with invalid credentials")
    public void user_attempts_a_login_with_invalid_credentials() {
        dealerInspireHomePage.usernameBox.sendKeys(Config.getProperty("invalidUsername"));
        dealerInspireHomePage.passwordBox.sendKeys(Config.getProperty("invalidPassword"));
        dealerInspireHomePage.loginButton.click();
    }

    @Then("Verify warning message displays as expected")
    public void verify_warning_message_displays_as_expected() {
        Assert.assertTrue("Warning message IS NOT displaying",dealerInspireHomePage.warningMessage.isDisplayed());
        Assert.assertEquals("The username or password you entered is not correct.", dealerInspireHomePage.warningMessage.getText());
    }

    @When("User attempts to reset the password with an invalid username")
    public void user_attempts_to_reset_the_password_with_an_invalid_username() {
        dealerInspireHomePage.usernameBox.clear();
        dealerInspireHomePage.usernameBox.sendKeys(Config.getProperty("invalidUsernameReset"));
        dealerInspireHomePage.loginButton.click();
    }

    @Then("Verify warning message displays as expected and verify text color")
    public void verify_warning_message_displays_as_expected_and_verify_text_color() {
        Assert.assertTrue("Warning message IS NOT displaying",dealerInspireHomePage.warningMessage.isDisplayed());
        Assert.assertEquals("The username or password you entered is not correct.", dealerInspireHomePage.warningMessage.getText());
        String colorRGB = (String)((JavascriptExecutor)Driver.getDriver()).executeScript("return getComputedStyle(document.querySelector(\".auth-errors\")).color;");
        String expectedColor = "rgb(169, 68, 66)";
        Assert.assertEquals("The of the message is red",colorRGB,expectedColor );
    }
}
