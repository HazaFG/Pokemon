import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pikachu pika = new Pikachu();
		pika.setNombre("Manolo");
		pika.mostrarDatos();	
		
//		Poliwag poli = new Poliwag();
//		poli.setNombre("Renacuao");
//		poli.mostrarDatos();
		
		Snorlax snor = new Snorlax();
		snor.mostrarDatos();
		
		combate(pika, snor);
		
		
	}
	
	public static void combate(Pokemon aliado, Pokemon enemigo) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println(enemigo.nombre+" PV: "+enemigo.maxPV);
		System.out.println(aliado.nombre+" PV: "+aliado.maxPV);
		
		while(aliado.stats[0] > 0 && enemigo.stats[0] > 0) {
			
			for (int i = 0; i < aliado.movimientos.length; i++) {
				System.out.println((i+1)+": "+aliado.movimientos[i].nombre);				
			}
			
			System.out.println("\nSeleccione un ataque: ");
			
			int seleccion = lector.nextInt();
			
			System.out.println("ataque seleccionado: "+aliado.movimientos[seleccion-1].nombre);
			
			ataques(aliado, enemigo, seleccion);
			
		}
	}
	
	public static void ataques(Pokemon aliado, Pokemon enemigo, int seleccion) {
		
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
				System.out.println("Vida de "+enemigo.nombre+": "+enemigo.recibirDaño(aliado.movimientos[seleccion-1].calcularDaño(aliado, enemigo)));
				
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
