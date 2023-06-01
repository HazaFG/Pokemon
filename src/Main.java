
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pikachu pika = new Pikachu();
		pika.setNombre("Manolo");
		pika.mostrarDatos();
		
		Poliwag poli = new Poliwag();
		poli.setNombre("Renacuao");
		poli.mostrarDatos();
		
		System.out.println("Renacuao PV: "+poli.maxPV);
		
		System.out.println("Vida de Renacuao: "+poli.recibirDaño(pika.movimientos[0].calcularDaño(pika, poli)));
		
		System.out.println("Vida de Renacuao: "+poli.recibirDaño(pika.movimientos[1].calcularDaño(pika, poli)));

		
		
	}

}
