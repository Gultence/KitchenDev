package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.ResourcePage;
import utility.ConfigurationReader;
import utility.Driver;

import java.time.Duration;

public class editResources {

    LoginPage login = new LoginPage();
    ResourcePage resources = new ResourcePage();
    Actions action = new Actions(Driver.getDriver());

    @Given("User login and click the resources")
    public void user_login_and_click_the_resources() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(2);
        login.email.sendKeys(ConfigurationReader.getProperty("user"));
        Driver.wait(2);
        login.password.sendKeys(ConfigurationReader.getProperty("pass"));
        Driver.wait(2);
        login.loginButton.click();
        Driver.wait(5);

        action.moveToElement(resources.resourceIcon).click().perform();
        Driver.wait(5);

        WebDriverWait wait1= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.elementToBeClickable(resources.editButton)).click();
        resources.editButton.click();



    }

    @When("User click label button and made changes")
    public void user_click_label_button_and_made_changes() {

        resources.LabelButton.click();

        resources.LabelButton.clear();
        resources.LabelButton.sendKeys("Hi");
        resources.saveButton.click();

    }
    @Then("User see popup message")
    public void user_see_popup_message() {
        Assert.assertTrue(resources.PopUp.isDisplayed());
    }


}
