import java.awt.image.BufferedImage;
import java.util.Random;

abstract class Pokemon {

	String nombre;
	
	String tipo;
	
	BufferedImage delante, atras;
	
	int lvl = 5;
	
	int maxPV;
	
	int[] IV = new int[6]; //genes
	int[] EV = new int[6]; //puntos de esfuerzo
	
	int[] statsBase = new int[6];

	int[] stats = new int[6];
	
	Movimientos[] movimientos = new Movimientos[4];
	
	public Pokemon(int puntos_salud,
				   int ataque,
				   int defensa,
				   int ataque_especial,
				   int defensa_especial,
				   int velocidad,
				   String nombre,
				   String tipo) {
		
		this.nombre = nombre;
		this.tipo   = tipo;
		
		statsBase[0] = puntos_salud;
		statsBase[1] = ataque;
		statsBase[2] = defensa;
		statsBase[3] = ataque_especial;
		statsBase[4] = defensa_especial;
		statsBase[5] = velocidad;
		
		calcularIV();
		//calcularEV();
		calcularStats();
		
		maxPV = stats[0];
		
	}
	
	public void pokemon(){
		System.out.println("Soy un pokemon");
		System.out.println("Con el nombre: "+nombre);
		System.out.println("Con las estadiscas Base");
		for (int i = 0; i < statsBase.length; i++) {
			System.out.println(statsBase[i]);
		}
		
		System.out.println("Con las estadiscas");
		for (int i = 0; i < stats.length; i++) {
			System.out.println(stats[i]);
		}
	}
	
	
	//estadisticas base
	/**
	 * Las estadísticas base son el parámetro principal para determinar el valor de una estadística para un Pokémon a determinado nivel, esto se calcula según la siguiente ecuación:
	 *
	 * PS: 10 + { Nivel / 100 x [ (Stat Base x 2) + IV + PE ] } + Nivel
	 *
	 * Resto de las estadísticas: ( 5 + { Nivel / 100 x [ (Stat Base x 2) + IV + PE ] } ) x Naturaleza
	 * 
	 * la naturaleza se omite para el calculo de las estadisticas
	 */
	
	public void calcularStats() {
		stats[0] = (10 + ( lvl / 100 * (statsBase[0] * 2) + IV[0] + EV[0])) + lvl;
		
		for (int i = 1; i < statsBase.length; i++) {
			stats[i] = (5 + ( lvl / 100 * (statsBase[i] * 2) + IV[i] + EV[i]));
		}

	}
	
	public void calcularIV() {
		Random random = new Random();	
		
		for (int i = 0; i < IV.length; i++) {
			IV[i] = random.nextInt(32);
		}
	}
	
	public void calcularEV() {
		Random random = new Random();	
		
		int EV_totales = 0;
		
		for (int i = 0; i < EV.length; i++) {
			
			if (EV_totales < 510) {
				EV[i] = random.nextInt(253);
				EV_totales += EV[i];
				
				if (EV_totales >510) {
					EV_totales -= EV[i];
					int aux = 510 - EV_totales;
					EV[i] = random.nextInt(aux);
					EV_totales += EV[i];
				}
			}
		}
	}
	
	public int recibirDaño(int daño) {
		stats[0] = stats[0] - daño;
		return stats[0];
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

