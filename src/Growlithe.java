import java.io.IOException;
import javax.imageio.ImageIO;

public class Growlithe extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/growlitheDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/growlitheAtras"));
	
	public Growlithe() {
		super(55, 70, 45, 70, 50, 60, "Growlithe", "Fuego");
		
		MovimientoFisico mordisco 	       = new MovimientoFisico  (60,  95, 35, "Normal", "Mordisco");
		MovimientoEspecial ascuas          = new MovimientoEspecial(40, 90, 15, "Fuego", "Ascuas");
		MovimientoFisico colmilloIgneo 	   = new MovimientoFisico  (65, 95, 15, "Fuego", "Colmillo Igneo");
		MovimientoFisico colmilloElectrico = new MovimientoFisico  (65, 95, 15, "Electrico", "Colmillo Electrico");
		
		this.movimientos[0] = mordisco;
		this.movimientos[1] = ascuas;
		this.movimientos[2] = colmilloIgneo;
		this.movimientos[3] = colmilloElectrico;

	}
	
	public void growlithe() {
		
		System.out.println("Soy un growlithe\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		growlithe();
	}
}

