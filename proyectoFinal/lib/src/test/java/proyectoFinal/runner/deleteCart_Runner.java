package proyectoFinal.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/deleteCart.feature",
                 glue="proyectoFinal.stepDefinition",
                 tags="")
public class deleteCart_Runner {

}



