
public class Poliwag extends Pokemon{

	public Poliwag() {
		super(40, 50, 40, 40, 40, 90, "Poliwag", "Agua");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal");
		MovimientoEspecial burbuja     = new MovimientoEspecial(40, 100, 30, "Agua");
		MovimientoEstado gruñido       = new MovimientoEstado  (    100, 40, "Normal");
		
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
