
public class Pikachu extends Pokemon implements Electrico{
	
	public Pikachu() {
		super(35, 55, 30, 50, 40, 90, "Pikachu", "electrico");
	}
	
	public void pikachu() {
		
		System.out.println("Soy un pikachu");
		
	}
	
	public void mostrarDatos() {
		pokemon();
		Electrico.electrico();
		pikachu();
	}
}
