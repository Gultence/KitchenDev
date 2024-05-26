package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.Catalog;
import pages.LoginPage;
import utility.ConfigurationReader;
import utility.Driver;

public class CatalogStepDef {

    LoginPage login = new LoginPage();
    Catalog catalog = new Catalog();
    Actions action  = new Actions(Driver.getDriver());

    @Given("User can login and click Catalog")
    public void user_can_login_and_click_catalog() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(2);
        login.email.sendKeys(ConfigurationReader.getProperty("user"));
        Driver.wait(2);
        login.password.sendKeys(ConfigurationReader.getProperty("pass"));
        Driver.wait(2);
        login.loginButton.click();
        Driver.wait(8);

        action.moveToElement(catalog.Catalog).click().perform();
        Driver.wait(5);

    }
    @Given("User can made changes in Files&History")
    public void user_can_made_changes_in_files_history() {
       catalog.Files_History.click();
    }

}
