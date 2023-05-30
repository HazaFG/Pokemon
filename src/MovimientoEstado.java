
public class MovimientoEstado extends Movimientos{

	/**
	 * los movimientos de estado no tienen potencia
	 * 
	 */
	
	public MovimientoEstado(int precision, int PP, String tipo) {
		super(0, precision, PP, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int calcularDaño(Pokemon atacante, Pokemon defensor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
