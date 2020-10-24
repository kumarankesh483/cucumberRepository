package CucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/Features/rahulAcademy.feature"
 ,glue={"StepDefinitions"}
 ,
 plugin = {"progress",
         "html:build/report/html",
         "junit:build/report/junit/cucumber-report.xml",
         "json:build/report/json/cucumber-report.json"
 }
 )
 
public class TestRunner {
 
}