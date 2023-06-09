package proyectoFinal.stepDefinition;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class base {
public static Actor Usuario = Actor.named("Usuario");
	
	@Managed(uniqueSession = true)
	public static WebDriver driver;

}
