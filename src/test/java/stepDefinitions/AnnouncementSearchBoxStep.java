package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;
import pages.Announcement;
import pages.LoginPage;
import utility.ConfigurationReader;
import utility.Driver;


    public class AnnouncementSearchBoxStep {
        LoginPage login =new LoginPage();
        Announcement ann = new Announcement();
        Actions action = new Actions(Driver.getDriver());


        @Given("user goes the announcement page")
        public void user_goes_the_announcement_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            Driver.wait(2);
            login.email.sendKeys(ConfigurationReader.getProperty("user"));
            Driver.wait(2);
            login.password.sendKeys(ConfigurationReader.getProperty("pass"));
            Driver.wait(2);
            login.loginButton.click();
            Driver.wait(2);

            // action.moveToElement(ann.dashSign).click().perform();
            Driver.wait(3);
            action.moveToElement(ann.announcementName).click().perform();
            Driver.wait(3);


        }

        @When("user click on search box")
        public void user_click_on_search_box() {
            ann.searchBox.click();
            Driver.wait(3);
        }

        @When("user type text in search box")
        public void user_type_in_text() {
            ann.searchBox.sendKeys("zq");
            Driver.wait(3);
        }

        @Then("user see the text on the page")
        public void user_see_the_text_on_the_page() {
            Assert.assertTrue(ann.zqText.isDisplayed());

        }
    }



