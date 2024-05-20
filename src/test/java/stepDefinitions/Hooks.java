package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.BrowserUtils;
import utility.ConfigurationReader;
import utility.Driver;

import java.util.concurrent.TimeUnit;

import static org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment.setup;

public class Hooks {
    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void setupMethod(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();


    }

    //@Before (value = "@login", order = 2 )
    public void login_scenario_before(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }

    /*
    @After will be executed automatically after EVERY scenario in the project.
     */


    @After
    public void teardownMethod(Scenario scenario){

        Driver.getDriver().manage().deleteAllCookies();

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }
}


   /* @BeforeStep
   public void setupStep(){
        System.out.println("-----> @BeforeSTEP : Running before each step!");
    }

    @AfterStep
   public void teardownStep(){
        System.out.println("-----> @AfterSTEP : Running after each step!");
    }
}

    */