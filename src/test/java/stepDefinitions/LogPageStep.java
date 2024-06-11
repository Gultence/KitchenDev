package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Dashboard;
import pages.DealerLoginPage;
import pages.LoginPage;
import pages.PassResetPage;
import utility.ConfigurationReader;
import utility.Driver;


public class LogPageStep {

    LoginPage login = new LoginPage();
    Dashboard dash = new Dashboard();
    PassResetPage passReset= new PassResetPage();
    DealerLoginPage dealerlogins = new DealerLoginPage();

    @Given("user goes the page")
    public void user_goes_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(2);
    }

    @When("user enters username")
    public void user_enters_username() {
        login.email.sendKeys(ConfigurationReader.getProperty("user"));
        Driver.wait(2);
    }

    @When("user enters password")
    public void user_enters_password() {
        login.password.sendKeys(ConfigurationReader.getProperty("pass"));
        Driver.wait(4);
    }

    @When("user click on button")
    public void user_click_on_button() {
        login.loginButton.click();
        Driver.wait(2);
    }

    @Then("user land on dashboard page")
    public void user_land_on_dashboard_page() {
        dash.link.isDisplayed();
        Driver.wait(2);

    }

    @When("user enters invalid username")
    public void userEntersInvalidUsername() {
        login.email.sendKeys("abc@abc.com");
        Driver.wait(2);
    }

    @When("user enters invalid password")
    public void userEntersInvalidPassword() {
        login.password.sendKeys("abc");
        Driver.wait(2);
    }

    @Then("user sees error message")
    public void userSeesErrorMessage() {
        login.alert.isDisplayed();
    }

    @When("user clicks forget password button")
    public void userClicksForgetPasswordButton() {
        login.forgetPassButton.click();
    }

    @Then("user land password reset page")
    public void userLandPasswordResetPage() {
        passReset.passResetPage.isDisplayed();

    }

    @When("User clicks go to dealer login button")
    public void userClicksGoToDealerLoginButton() {
    login.dealerLogin.click();
    }

    @Then("user land dealer login page")
    public void userLandDealerLoginPage() {
        dealerlogins.dealerLoinPage.isDisplayed();
    }

    @When("user clicks eye icon")
    public void userClicksEyeIcon() {
        login.icon.click();

    }

    @Then("user see typed password")
    public void userSeeTypedPassword() {
        login.password.isDisplayed();
    }
}