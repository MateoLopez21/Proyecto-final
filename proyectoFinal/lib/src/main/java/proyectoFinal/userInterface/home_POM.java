package proyectoFinal.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://librerianacional.com/")
public class home_POM {
	public static Target LBL_UserIcon = Target.the("Icono del usuario").located(By.xpath("//img[@src='./assets/images/profile-account.png']"));

}
