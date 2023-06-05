
abstract class Movimientos {

	String nombre;
	String tipo;
	int potencia;
	int precision;
	int PP;
	
	public Movimientos(int potencia, int precision, int PP, String tipo, String nombre) {
		this.nombre    = nombre;
		this.tipo      = tipo;
		this.potencia  = potencia;
		this.precision = precision;
		this.PP        = PP;
	}

	protected abstract int calcularDaño(Pokemon atacante, Pokemon defensor);

}
