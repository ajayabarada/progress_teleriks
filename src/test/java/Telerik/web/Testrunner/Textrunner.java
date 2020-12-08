package Telerik.web.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/FeatureFile/Telerik.feature",
				glue= {"Telerik/web/stepdef"},
				plugin= {"json:target/cucumber.json",
                         "junit:target/cucumber-results.xml",
                         "pretty:target/cucumber-pretty.txt",
				         "html:target/cucumber-html-report"}
				)

public class Textrunner {

}
