package proyectoFinal.userInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class addCart_POM extends PageObject {
	
	public static Target BTN_Account = Target.the("El boton de Mi Cuenta").located(By.xpath("(//button)[5]"));
	public static Target BTN_Libros = Target.the("Este botón nos permite redirigirnos al apartado de Libros").located(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
	public static Target LBL_Book1 = Target.the("Este botón nos permite seleccionar el libro 1").located(By.xpath("//body[1]/app-root[1]/div[1]/app-libros[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/figure[1]"));
	public static Target BTN_AddCart1 = Target.the("Este botón nos permite agreagar el elemento al carrito").located(By.xpath("//span[contains(text(), 'Agregar al carrito')]"));
	public static Target BTN_Cart = Target.the("Este botón nos permite dirigirnos al carrito").located(By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/span[1]"));
	public static Target BTN_Continue = Target.the("Este botón nos permitira seguir comprando").located(By.xpath("//a[contains(text(),'Seguir comprando')]"));
	public static Target LBL_ProductsCart = Target.the("Verifica si hay productos en el carrito").located(By.xpath("//body/app-root[1]/div[1]/app-carrito[1]/app-mi-carrito[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));

	






}
