import java.io.IOException;
import javax.imageio.ImageIO;

public class Magikarp extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pidgeyDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pidgeyAtras"));
	
	public Magikarp() {
		super(40, 45, 40, 35, 35, 56, "Magikarp", "Agua");
		
		MovimientoFisico salpicadura   = new MovimientoFisico  ( 0,  95, 35, "Normal", "Salpicadura");
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoFisico golpeCabeza   = new MovimientoFisico  (70, 100, 15, "Normal", "Golpe Cabeza");
		MovimientoEspecial burbuja     = new MovimientoEspecial(35, 100, 30, "Agua", "Burbuja");
		
		this.movimientos[0] = salpicadura;
		this.movimientos[1] = placaje;
		this.movimientos[2] = golpeCabeza;
		this.movimientos[3] = burbuja;

	}
	
	public void magikarp() {
		
		System.out.println("Soy un magikarp\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		magikarp();
	}
}