import java.io.IOException;
import javax.imageio.ImageIO;

public class Pidgey extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pidgeyDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pidgeyAtras"));
	
	public Pidgey() {
		super(40, 45, 40, 35, 35, 56, "Pidgey", "Volador");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoEspecial tornado     = new MovimientoEspecial(40, 100, 35, "Volador", "Tornado");
		MovimientoFisico ataqueAla 	   = new MovimientoFisico  (60, 100, 35, "Volador", "Ataque Ala");
		MovimientoFisico golpeAereo    = new MovimientoFisico  (70, 100, 15, "Volador", "Golpe Aereo");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = tornado;
		this.movimientos[2] = ataqueAla;
		this.movimientos[3] = golpeAereo;

	}
	
	public void pidgey() {
		
		System.out.println("Soy un pidgey\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		pidgey();
	}
}


