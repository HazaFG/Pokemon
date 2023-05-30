import java.util.Random;

public class MovimientoFisico extends Movimientos implements TablaDeTipos{

	public MovimientoFisico(int potencia, int precision, int PP, String tipo) {
		super(potencia, precision, PP, tipo);

	}

//	public double ataqueFisico(Pokemon atacante, Pokemon defensor) {
//		Random random = new Random();
//		
//		double daño;
//		double efectividad = TablaDeTipos.calcularEfectividad(this, defensor);
//		int variacion = random.nextInt(16)+85;
//		
//		daño = 0.01 * efectividad * variacion * (((0.2 * atacante.lvl + 1) * atacante.stats[1] * potencia) / 25 * defensor.stats[2]) + 2;
//		
//		return daño;
//	}

	@Override
	protected int calcularDaño(Pokemon atacante, Pokemon defensor) {
		// TODO Auto-generated method stub
		
		Random random = new Random();

		int daño;
		double efectividad = TablaDeTipos.calcularEfectividad(this, defensor);
		int variacion = random.nextInt(16)+85;

		daño = (int) (0.01 * efectividad * variacion * (((0.2 * atacante.lvl + 1) * atacante.stats[1] * potencia) / (25 * defensor.stats[2])) + 2);

		return daño;
	}
	
}
