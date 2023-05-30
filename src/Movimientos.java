
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

	protected abstract int calcularDaño(Pokemon atacante, Pokemon defensor);

}
