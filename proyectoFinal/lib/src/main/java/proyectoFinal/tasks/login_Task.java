package proyectoFinal.tasks;
import proyectoFinal.tasks.login_Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class login_Task implements Task{
	private String Username;
	private String Password;
	
	private login_Task(String username, String password) {
		
		this.Username = username;
		this.Password = password;
		
		
	}
public static login_Task Using(String username, String password) {
		
		return new login_Task(username, password);
		
		
	}
@Override
public <T extends Actor> void performAs(T actor) {
	// TODO Auto-generated method stub
	actor.attemptsTo(
			Click.on(proyectoFinal.userInterface.login_POM.BTN_Account),
			WaitUntil.the(proyectoFinal.userInterface.login_POM.BTN_Login, isVisible()).forNoMoreThan(5).seconds(),
			Click.on(proyectoFinal.userInterface.login_POM.BTN_Login),
			WaitUntil.the(proyectoFinal.userInterface.login_POM.BTN_Correo, isVisible()).forNoMoreThan(5).seconds(),
			Click.on(proyectoFinal.userInterface.login_POM.BTN_Correo),
			WaitUntil.the(proyectoFinal.userInterface.login_POM.TXT_Username, isVisible()).forNoMoreThan(5).seconds(),
			Enter.theValue(Username).into(proyectoFinal.userInterface.login_POM.TXT_Username),
			Enter.theValue(Password).into(proyectoFinal.userInterface.login_POM.TXT_Password),
			Click.on(proyectoFinal.userInterface.login_POM.BTN_Sesion)
			
			
			);
	
}


}
