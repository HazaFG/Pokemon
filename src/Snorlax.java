
import java.io.IOException;
import javax.imageio.ImageIO;

public class Snorlax extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pikachuDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pikachuDelante"));
	
	public Snorlax() {
		super(160, 110, 65, 65, 110, 30, "Snorlax", "Normal");
		
		MovimientoFisico golpeCabeza   = new MovimientoFisico(70, 100, 15, "Normal", "Golpe Cabeza");
		MovimientoFisico derribo       = new MovimientoFisico(80, 100, 15, "Normal", "Derribo");
		MovimientoFisico sumision      = new MovimientoFisico(40, 100, 30, "Lucha", "Sumision");
		
		this.movimientos[0] = golpeCabeza;
		this.movimientos[1] = derribo;
		this.movimientos[2] = sumision;
		
//		try {
//			this.delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pokachuDelante"));
//			this.atras = ImageIO.read(getClass().getResourceAsStream("/Pokemon/pokachuAtras"));
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void snorlax() {
		
		System.out.println("Soy un snorlax\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		snorlax();
	}
}