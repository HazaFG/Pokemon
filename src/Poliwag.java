import java.io.IOException;
import javax.imageio.ImageIO;

public class Poliwag extends Pokemon{

	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/poliwagDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/poliwagAtras"));
	
	public Poliwag() {
		super(40, 50, 40, 40, 40, 90, "Poliwag", "Agua");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoEspecial burbuja     = new MovimientoEspecial(35, 100, 30, "Agua", "Burbuja");
		MovimientoEspecial pistolaAgua = new MovimientoEspecial(40, 100, 25, "Agua", "Pistola Agua");
		MovimientoEstado gruñido       = new MovimientoEstado  (    100, 40, "Normal", "Gruñido");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = burbuja;
		this.movimientos[2] = pistolaAgua;
		this.movimientos[3] = gruñido;
	}
	
	public void poliwag() {
		
		System.out.println("Soy un poliwag\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		poliwag();
	}
}
