import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner lector = new Scanner(System.in);
		
		int seleccion = 0;
		
		Pikachu pika = new Pikachu();
		pika.setNombre("Manolo");
		pika.mostrarDatos();	
		
//		Poliwag poli = new Poliwag();
//		poli.setNombre("Renacuao");
//		poli.mostrarDatos();
		
		Snorlax snor = new Snorlax();
		snor.mostrarDatos();
		
		while(snor.stats[0] > 0 && pika.stats[0] > 0) {
			System.out.println("Seleccione un ataque: ");
			
			seleccion = lector.nextInt();
			
			System.out.println("ataque seleccionado: "+pika.movimientos[seleccion-1].nombre);
			
			combate(pika, snor, seleccion);
			
			System.out.println(snor.nombre+" PV: "+snor.maxPV);
			System.out.println(pika.nombre+" PV: "+pika.maxPV);
			
		}
		
//		
//		System.out.println("Renacuao PV: "+poli.maxPV);
//		
//		System.out.println("Vida de Renacuao: "+poli.recibirDaño(pika.movimientos[0].calcularDaño(pika, poli)));
//		
//		System.out.println("Vida de Renacuao: "+poli.recibirDaño(pika.movimientos[1].calcularDaño(pika, poli)));

		
		
	}
	
	public static void combate(Pokemon aliado, Pokemon enemigo, int seleccion) {
		
		if(aliado.stats[5] > enemigo.stats[5]) {
			System.out.println("Aliado ataca primero");
			
			System.out.println("Vida de "+enemigo.nombre+": "+enemigo.recibirDaño(aliado.movimientos[seleccion-1].calcularDaño(aliado, enemigo)));
			if(enemigo.stats[0] <= 0) {
				System.out.println("El combate acaba, gana: "+aliado.nombre);
			}else {
				ataqueEnemigo(aliado, enemigo);
				
				if(aliado.stats[0] <= 0) {
					System.out.println("El combate acaba, gana: "+enemigo.nombre);
				}
			}
		}else {
			System.out.println("Enemigo ataca primero");
			
			ataqueEnemigo(aliado, enemigo);
			if(aliado.stats[0] <= 0) {
				System.out.println("El combate acaba, gana: "+enemigo.nombre);
			}else {
				System.out.println("Vida de "+enemigo.nombre+": "+enemigo.recibirDaño(aliado.movimientos[seleccion].calcularDaño(aliado, enemigo)));
				
				if(enemigo.stats[0] <= 0) {
					System.out.println("El combate acaba, gana: "+aliado.nombre);
				}
			}
		}
		
	}
	
	public static void ataqueEnemigo(Pokemon aliado, Pokemon enemigo) {
		Random random = new Random();
		
		int ataque = random.nextInt(2);
		System.out.println("Vida de "+aliado.nombre+": "+aliado.recibirDaño(enemigo.movimientos[ataque].calcularDaño(enemigo, aliado)));

		
	}

}
