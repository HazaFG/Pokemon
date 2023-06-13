import javax.swing.JFrame;


public class Ventana extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana() 
	{
		setTitle("Conecta 4");//Titulo en la ventana 
		Desarrollo tablero = new Desarrollo();
		add(tablero);//Agrega el objeto dentro de la ventana 
	}
}
