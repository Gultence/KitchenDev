package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Dashboard;
import pages.LoginPage;
import utility.ConfigurationReader;
import utility.Driver;


public class LogPageStep {

    LoginPage login = new LoginPage();
    Dashboard dash = new Dashboard();

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
}