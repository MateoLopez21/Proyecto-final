package proyectoFinal.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import proyectoFinal.tasks.login_Task;
import proyectoFinal.userInterface.home_POM;
import proyectoFinal.userInterface.login_POM;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class login_Step extends base {
private login_POM login;
	
	@Before
	public void setUp() {
		
		Usuario.can(BrowseTheWeb.with(driver));
	}
	 @Given("^Un usuario que ingresa al login$")
	    public void un_usuario_que_ingresa_al_login() throws Throwable {
		 Usuario.wasAbleTo(Open.browserOn().the(login));
		
	        
	    }

	    @When("^El usuario ingresa credenciales validas$")
	    public void el_usuario_ingresa_credenciales_validas() throws Throwable {
	    	Usuario.attemptsTo(login_Task.Using("nadie@gmail.com", "nada123"));
	    	
	        
	    }

	    @Then("^El usuario ingresa a la pagina principal$")
	    public void el_usuario_ingresa_a_la_pagina_principal() throws Throwable {
	    	Usuario.should(seeThat(the(home_POM.LBL_UserIcon), isVisible()));
	    	
	        
	    }

}
