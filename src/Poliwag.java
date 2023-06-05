import java.io.IOException;
import javax.imageio.ImageIO;

public class Poliwag extends Pokemon{

	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/poliwagDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/poliwagDelante"));
	
	public Poliwag() {
		super(40, 50, 40, 40, 40, 90, "Poliwag", "Agua");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoEspecial burbuja     = new MovimientoEspecial(40, 100, 30, "Agua", "Burbuja");
		MovimientoEstado gruñido       = new MovimientoEstado  (    100, 40, "Normal", "Gruñido");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = burbuja;
		this.movimientos[2] = gruñido;
	}
	
	public void poliwag() {
		
		System.out.println("Soy un poliwag\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		poliwag();
	}
}
