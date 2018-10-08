package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/Features/createlead.feature", glue= {"createLead"},
//tags= {"@CreateLead","@createcontact"},
monochrome=true,snippets=SnippetType.CAMELCASE)

//,dryRun=true,snippets=SnippetType.CAMELCASE
@RunWith(Cucumber.class)
public class Runner {
	

}
