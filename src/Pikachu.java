
public class Pikachu extends Pokemon{
	
	public Pikachu() {
		super(35, 55, 30, 50, 40, 90, "Pikachu", "Electrico");
		
		MovimientoFisico placaje 	   = new MovimientoFisico  (35,  95, 35, "Normal");
		MovimientoEspecial impactrueno = new MovimientoEspecial(40, 100, 30, "Electrico");
		MovimientoEstado ondaTrueno    = new MovimientoEstado  (     90, 20, "Electrico");
		
		this.movimientos[0] = placaje;
		this.movimientos[1] = impactrueno;
		this.movimientos[2] = ondaTrueno;
	}
	
	public void pikachu() {
		
		System.out.println("Soy un pikachu\n");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		pikachu();
	}
}
