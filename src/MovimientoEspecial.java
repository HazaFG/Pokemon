import java.util.Random;

public class MovimientoEspecial extends Movimientos{

	public MovimientoEspecial(int potencia, int precision, int PP, String tipo) {
		super(potencia, precision, PP, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int calcularDaño(Pokemon atacante, Pokemon defensor) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int daño;
		double efectividad = TablaDeTipos.calcularEfectividad(this, defensor);
		int variacion = random.nextInt(16)+85;

		daño = (int) (0.01 * efectividad * variacion * (((0.2 * atacante.lvl + 1) * atacante.stats[3] * potencia) / (25 * defensor.stats[4])) + 2);

		return daño;
	}

}
