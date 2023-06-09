package proyectoFinal.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")
public class login_POM extends PageObject {
	
	public static Target BTN_Account = Target.the("El boton de Mi Cuenta").located(By.xpath("(//button)[5]"));
	public static Target BTN_Login = Target.the("El boton para las opciones de inicio de sesion").located(By.xpath("/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
	public static Target BTN_Correo = Target.the("El boton de iniciar con correo").located(By.xpath("(//div[@class='d-flex align-items-center text--blue text--normal text--xl my-1'])[3]"));
	public static Target TXT_Username = Target.the("El input donde se digite el correo").located(By.name("usuario"));
	public static Target TXT_Password = Target.the("El input donde se digita la contraseña").located(By.name("contrasena"));
	public static Target BTN_Sesion = Target.the("El boton de iniciar sesion").located(By.xpath("//button[@type='submit']"));



}
