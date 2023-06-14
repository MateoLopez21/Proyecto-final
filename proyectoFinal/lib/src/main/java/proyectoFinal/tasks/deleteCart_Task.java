package proyectoFinal.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.time.Duration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;



public class deleteCart_Task implements Task {
	
	public static deleteCart_Task delete() {
		return new deleteCart_Task();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				WaitUntil.the(proyectoFinal.userInterface.deleteCart_POM.LBL_ProductsCart, isVisible()).forNoMoreThan(10).seconds(),
				Click.on(proyectoFinal.userInterface.deleteCart_POM.BTN_Delete1)
				
				);
		
	}
}
