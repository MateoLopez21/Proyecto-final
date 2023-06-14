package proyectoFinal.userInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class deleteCart_POM extends PageObject{
	
	public static Target BTN_Delete1 = Target.the("Este botón nos permite eliminar el producto 1").locatedBy("//body[1]/app-root[1]/div[1]/app-carrito[1]/app-mi-carrito[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/a[1]/span[1]");
	public static Target LBL_ProductsCart = Target.the("Verifica si hay productos en el carrito").locatedBy("//body/app-root[1]/div[1]/app-carrito[1]/app-mi-carrito[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	public static Target TXT_Cart = Target.the("Este mensaje aparece si no hay ningun producto en el carrito").locatedBy("//div[contains(text(),'¡Tu carrito de compras está vacío!')]");
	
	
	//public static Target BTN_Delete1 = Target.the("Este botón nos permite eliminar el producto 1").locatedBy("//span[contains(text(),'Eliminar este producto')]");

}
