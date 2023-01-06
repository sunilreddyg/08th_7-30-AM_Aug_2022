package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\features\\Datatable.feature",glue="stepdefination",dryRun=false,monochrome=true)
public class Run_Features 
{

}
