package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.Dashboard;
import pages.LoginPage;
import pages.ResourcePage;
import utility.ConfigurationReader;
import utility.Driver;

/*
public class ResourceEditLinkStp {
    LoginPage login =new LoginPage();
    Dashboard dash =new Dashboard();
    Actions action=new Actions(Driver.getDriver());
    ResourcePage res=new ResourcePage();

    @Given("User goes app page")
    public void user_goes_app_page() {



            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            Driver.wait(2);
            login.email.sendKeys(ConfigurationReader.getProperty("user"));
            Driver.wait(2);
            login.password.sendKeys(ConfigurationReader.getProperty("pass"));
            Driver.wait(2);
            login.loginButton.click();
            Driver.wait(2);
            dash.link.isDisplayed();
            Driver.wait(2);

        }

        @When("User on the resource page")
        public void user_on_the_resource_page() {
            action.moveToElement(res.resourceIcon).click().perform();
            Driver.wait(2);
        }
        @Then("User click on the link")
        public void user_click_on_the_link() {
            res.createdLink.click();
            Driver.wait(2);

        }


        //@Then("User able to see pop-up window")
        // public void user_able_to_see_pop_up_window() {

    }

*/
