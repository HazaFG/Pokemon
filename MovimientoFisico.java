import java.util.Random;

public class MovimientoFisico extends Movimientos implements TablaDeTipos{

	public MovimientoFisico(int potencia, int precision, int PP, String tipo, String nombre) {
		super(potencia, precision, PP, tipo, nombre);

	}

	@Override
	protected int calcularDaño(Pokemon atacante, Pokemon defensor) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int daño;
		double efectividad = TablaDeTipos.calcularEfectividad(this, defensor);
		int variacion = random.nextInt(16)+85;

		daño = (int) (0.01 * efectividad * variacion * ((((0.2 * atacante.lvl + 1) * atacante.stats[1] * potencia) / (25 * defensor.stats[2])) + 2));

		return daño;
	}
	
}
