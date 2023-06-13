import java.io.IOException;
import javax.imageio.ImageIO;

public class Gengar extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/gengarDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/gengarAtras"));
	
	public Gengar() {
		super(60, 65, 60, 130, 75, 110, "Gengar", "Fantasma");
		
		MovimientoEspecial residuos    = new MovimientoEspecial(65, 100, 20, "Veneno", "Residuos");
		MovimientoEspecial rayo        = new MovimientoEspecial(90, 100, 15, "Electrico", "Rayo");
		MovimientoEspecial bolaSombra  = new MovimientoEspecial(80, 100, 15, "Fantasma", "Bola Sombra");
		MovimientoFisico lenguetazo    = new MovimientoFisico  (80, 100, 15, "Fantasma", "Lenguetazo");
		
		this.movimientos[0] = residuos;
		this.movimientos[1] = rayo;
		this.movimientos[2] = bolaSombra;
		this.movimientos[3] = lenguetazo;

	}
	
	public void gengar() {
		
		System.out.println("Soy un gengar\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		gengar();
	}
}

