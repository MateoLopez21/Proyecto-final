package proyectoFinal.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import proyectoFinal.tasks.addCart_Task;
import proyectoFinal.userInterface.addCart_POM;
import proyectoFinal.userInterface.login_POM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class addCart_Step extends base {

	private login_POM Login;
	
	@Before
	public void setUp() {
		Usuario.can(BrowseTheWeb.with(driver));
	}
	
	
	@Given("El usuario se encuentra en el apartado libros")
    public void usuarioSeEncuentraEnApartadoLibros() throws Throwable{
		 Usuario.wasAbleTo(Open.browserOn().the(Login));
		
    }
	
	@When("El usuario agrega un libro al carrito")
    public void usuarioAgregaLibroAlCarrito() throws Throwable {
		 Usuario.attemptsTo(addCart_Task.toTheCart());
    }
    
	@Then("La pagina mostrara el libro en el carrito")
    public void paginaMostraraLibroEnCarrito() throws Throwable {
    	Usuario.attemptsTo(WaitUntil.the(addCart_POM.LBL_ProductsCart, isVisible()).forNoMoreThan(10).seconds());
    	Usuario.should(seeThat(the(addCart_POM.LBL_ProductsCart), isVisible()));






    	
    }
	
}
