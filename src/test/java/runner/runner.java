package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/features",glue = "steps")//cargamos features y y glue son los steps en java

    
public class runner {

}