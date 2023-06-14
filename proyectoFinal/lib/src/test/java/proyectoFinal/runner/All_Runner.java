package proyectoFinal.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="classpath:features",
                 glue="proyectoFinal.stepDefinition",
                 tags="")


public class All_Runner {

}
