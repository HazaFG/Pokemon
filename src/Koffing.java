import java.io.IOException;
import javax.imageio.ImageIO;

public class Koffing extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/koffingDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/koffingAtras"));
	
	public Koffing() {
		super(40, 65, 95, 60, 45, 35, "Koffing", "Veneno");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoEspecial polucion    = new MovimientoEspecial(30,  70, 20, "Veneno", "Polucion");
		MovimientoEspecial residuos    = new MovimientoEspecial(65, 100, 20, "Veneno", "Residuos");
		MovimientoEspecial rayo        = new MovimientoEspecial(90, 100, 15, "Electrico", "Rayo");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = polucion;
		this.movimientos[2] = residuos;
		this.movimientos[3] = rayo;
		
	}
	
	public void koffing() {
		
		System.out.println("Soy un koffing\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		koffing();
	}
}
