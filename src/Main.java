
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pikachu pika = new Pikachu();
		pika.setNombre("Manolo");
		pika.mostrarDatos();
		
		Poliwag poli = new Poliwag();
		poli.setNombre("Renacuao");
		poli.mostrarDatos();
		
		System.out.println("daño: "+pika.movimientos[0].calcularDañoFisico(pika, poli));
		
	}

}
