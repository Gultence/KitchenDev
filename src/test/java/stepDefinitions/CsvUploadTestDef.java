package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DealerPage;
import pages.LoginPage;
import utility.ConfigurationReader;
import utility.Driver;

import java.time.Duration;
import java.util.List;


public class CsvUploadTestDef {
    LoginPage login = new LoginPage();
    DealerPage dealer = new DealerPage();
    Actions action = new Actions(Driver.getDriver());

    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofMinutes(1));


    @Given("user on the dealer")
    public void user_on_the_dealer() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(2);
        login.email.sendKeys(ConfigurationReader.getProperty("user"));
        Driver.wait(2);
        login.password.sendKeys(ConfigurationReader.getProperty("pass"));
        Driver.wait(2);
        login.loginButton.click();
        Driver.wait(4);
        action.moveToElement(dealer.dealerIcon).click().perform();
        Driver.wait(4);


    }

    @When("user click on csv button")
    public void user_click_on_csv_button() {
        dealer.iconCSV.click();
        Driver.wait(7);
    }

    @When("user click demo dealer file")
    public void user_click_demo_dealer_file() {
        //Driver.getDriver().switchTo().frame(dealer.demoCSV);
        dealer.demoCSV.click();
        //wait1.until(ExpectedConditions.elementToBeClickable(dealer.demoCSV)).click();
        Driver.wait(7);
    }

    @When("user click on choose file")
    public void user_click_on_choose_file() {
        Driver.wait(4);
        //dealer.chooseFile.click();
        Driver.wait(5);

        dealer.chooseFile.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Dealer.csv");
        Driver.wait(10);


    }

    @When("user click on upload")
    public void user_click_on_upload() {
        dealer.uploadButton.click();
        Driver.wait(2);
    }

    /*@Then("user see handle popup")
    public void user_see_handle_popup() {
        /*Alert alert= Driver.getDriver().switchTo().alert();
        String alertMessage=alert.getText();
        System.out.println(alertMessage);
        alert.accept();*/


    @When("user click on display column and select all")
    public void user_click_on_display_column_and_select_all() {
       /* Select selectDisplay=new Select(dealer.displayDropDown);
        List< WebElement> options= selectDisplay.getOptions();

        for(WebElement opt: options){
            selectDisplay.selectByVisibleText(opt.getText());
            System.out.println(opt.getText());
            Assert.assertTrue(opt.isSelected());


        }*/
    Driver.wait(3);
        dealer.displayDropDown.click();
        Driver.wait(4);

    }




    @Then("user un-select all column")
    public void user_un_select_all_column() {
        dealer.idInDropDownList.click();
        dealer.idInDropDownList.click();
        Assert.assertTrue(dealer.idOnTable.isDisplayed());




    }



}



