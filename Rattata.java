import java.io.IOException;
import javax.imageio.ImageIO;

public class Rattata extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/rattataDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/rattataAtras"));
	
	public Rattata() {
		super(30, 56, 35, 25, 35, 72, "Rattata", "Normal");
		
		MovimientoFisico placaje 	   = new MovimientoFisico(35,  95, 35, "Normal", "Placaje");
		MovimientoFisico hiperColmillo = new MovimientoFisico(80,  90, 15, "Normal", "Hiper Colmillo");
		MovimientoFisico superDiente   = new MovimientoFisico(120, 90, 10, "Normal", "Super Diente");
		MovimientoFisico derribo       = new MovimientoFisico(80, 100, 15, "Normal", "Derribo");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = hiperColmillo;
		this.movimientos[2] = superDiente;
		this.movimientos[3] = derribo;
		
	}
	
	public void rattata() {
		
		System.out.println("Soy un rattata\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		rattata();
	}
}
