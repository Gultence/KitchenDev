  package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
               "pretty"
        },
        features = "src/test/resources/features" ,
        glue ="stepDefinitions",
        dryRun =false,
        tags =  "@smoke"
)
public class CukesRunner {
}
