package proyectoFinal.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class addCart_Task implements Task {
	
	public static addCart_Task toTheCart() {
		return new addCart_Task();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				WaitUntil.the(proyectoFinal.userInterface.addCart_POM.BTN_Libros, isVisible()).forNoMoreThan(5).seconds(),
				Click.on(proyectoFinal.userInterface.addCart_POM.BTN_Libros),
				
				WaitUntil.the(proyectoFinal.userInterface.addCart_POM.LBL_Book1, isVisible()).forNoMoreThan(5).seconds(),
				MoveMouse.to(proyectoFinal.userInterface.addCart_POM.LBL_Book1),
				WaitUntil.the(proyectoFinal.userInterface.addCart_POM.BTN_AddCart1, isVisible()).forNoMoreThan(3).seconds(),
				Click.on(proyectoFinal.userInterface.addCart_POM.BTN_AddCart1),
				WaitUntil.the(proyectoFinal.userInterface.addCart_POM.BTN_Continue, isVisible()).forNoMoreThan(3).seconds(),
				Click.on(proyectoFinal.userInterface.addCart_POM.BTN_Continue),
				
				WaitUntil.the(proyectoFinal.userInterface.addCart_POM.BTN_Cart, isVisible()).forNoMoreThan(3).seconds(),
				Click.on(proyectoFinal.userInterface.addCart_POM.BTN_Cart)
				);
		
	}

}
