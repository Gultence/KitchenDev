package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utility.ConfigurationReader;
import utility.Driver;

public class LoginPageStepdefs {

LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("kitchendev_url"));
    }

    @When("user enters username admin@democabinetry.example")
    public void userEntersUsernameAdminDemocabinetryExample() {
        loginPage.email.sendKeys("admin@democabinetry.example");
    }

    @And("user enters password Persist@{int}")
    public void userEntersPasswordPersist(int arg0) {
        loginPage.password.sendKeys("Persist@2023");
    }

    @And("user clicks to login button")
    public void userClicksToLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("user should see url contains quick-access")
    public void userShouldSeeUrlContainsQuickAccess() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("quick-access"));
    }
}
