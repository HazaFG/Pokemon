import java.io.IOException;
import javax.imageio.ImageIO;

public class Pikachu extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pikachuDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pikachuAtras"));
	
	public Pikachu() {
		super(35, 55, 30, 50, 40, 90, "Pikachu", "Electrico");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal", "Placaje");
		MovimientoEspecial impactrueno = new MovimientoEspecial(40, 100, 30, "Electrico", "Impactrueno");
		MovimientoEspecial bolaSombra  = new MovimientoEspecial(80, 100, 15, "Fantasma", "Bola Sombra");
		MovimientoEstado ondaTrueno    = new MovimientoEstado  (     90, 20, "Electrico", "Onda Trueno");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = impactrueno;
		this.movimientos[2] = bolaSombra;
		this.movimientos[3] = ondaTrueno;

	}
	
	public void pikachu() {
		
		System.out.println("Soy un pikachu\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		pikachu();
	}
}
