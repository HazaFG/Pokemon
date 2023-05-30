import java.util.Random;

abstract class Movimientos {

	String tipo;
	int potencia;
	int precision;
	int PP;
	
	public Movimientos(int potencia, int precision, int PP, String tipo) {
		this.tipo      = tipo;
		this.potencia  = potencia;
		this.precision = precision;
		this.PP        = PP;
	}
	
	public double calcularDañoFisico(Pokemon atacante, Pokemon defensor) {
		Random random = new Random();
		
		double daño;
		double efectividad = TablaDeTipos.calcularEfectividad(this, defensor);
		int variacion = random.nextInt(16)+85;
		
		daño = 0.01 * efectividad * variacion * (((0.2 * atacante.lvl + 1) * atacante.stats[1] * potencia) / (25 * defensor.stats[2])) + 2;
//		daño = 0.01 * 1.5 * 0.5 * 85 * (((0.2 * 100 + 1) * 410 * 150) / (25 * 450)) + 2;
//		daño = 0.01 * 1.5 * 0.5 * 85;
//		daño = 0.2 * 100 + 1;
//		daño = 410 * 150;
//		daño = 25 * 450;
//		daño = ((0.2 * 100 + 1) * 410 * 150) / /(25 * 450;
//		daño = (0.2 * 100 + 1) * 410 * 150;
//		daño = ((0.2 * 100 + 1) * 410 * 150)/11250;

		return daño;
	}
}
