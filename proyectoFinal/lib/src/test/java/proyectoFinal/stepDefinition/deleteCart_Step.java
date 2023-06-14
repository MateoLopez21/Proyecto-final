package proyectoFinal.stepDefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import proyectoFinal.tasks.addCart_Task;
import proyectoFinal.tasks.deleteCart_Task;
import proyectoFinal.userInterface.deleteCart_POM;
import proyectoFinal.userInterface.login_POM;

public class deleteCart_Step extends base {
private login_POM Login;
	
	@Before
	public void setUp() {
		Usuario.can(BrowseTheWeb.with(driver));
	}

	@Given("Un usuario agrega un libro al carrito")
    public void usuarioAgregaLibroAlCarrito() throws Throwable {
		Usuario.wasAbleTo(Open.browserOn().the(Login));
		Usuario.attemptsTo(addCart_Task.toTheCart());

    }

	 @When("El usuario elimina un libro del carrito")
	    public void usuarioEliminaLibroDelCarrito() throws Throwable {
		Usuario.attemptsTo(deleteCart_Task.delete());
		
    }

	 @Then("La pagina no mostrara ningun libro en el carrito")
	    public void paginaNoMostraraLibroEnCarrito() throws Throwable {
		WaitUntil.the(deleteCart_POM.TXT_Cart, isVisible()).forNoMoreThan(10).seconds();
    	Usuario.should(seeThat(the(deleteCart_POM.TXT_Cart), isVisible()));
    
    	
    }
}
