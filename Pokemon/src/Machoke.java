import java.io.IOException;
import javax.imageio.ImageIO;

public class Machoke extends Pokemon{
	
	//delante = ImageIO.read(getClass().getResourceAsStream("/Pokemon/machokeDelante"));
	//atras   = ImageIO.read(getClass().getResourceAsStream("/Pokemon/machokeAtras"));
	
	public Machoke() {
		super(80, 100, 70, 50, 60, 45, "Machoke", "Lucha");
		
		MovimientoFisico patadaBaja    = new MovimientoFisico(70, 100, 20, "Lucha", "Golpe Cabeza");
		MovimientoFisico golpeKarate   = new MovimientoFisico(50, 100, 25, "Lucha", "Derribo");
		MovimientoFisico sumision      = new MovimientoFisico(40, 100, 30, "Lucha", "Sumision");
		MovimientoFisico cabezazoZen   = new MovimientoFisico(80,  90, 15, "Psiquico", "Cabezazo Zen");
		
		this.movimientos[0] = patadaBaja;
		this.movimientos[1] = golpeKarate;
		this.movimientos[2] = sumision;
		this.movimientos[3] = cabezazoZen;
		
	}
	
	public void machoke() {
		
		System.out.println("Soy un machoke\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		machoke();
	}
}