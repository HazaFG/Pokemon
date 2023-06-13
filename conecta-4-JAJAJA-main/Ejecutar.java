import javax.swing.JFrame;

public class Ejecutar extends JFrame{
	//public static void main(String[] args) {
		//Desarrollo aplicacion = new Desarrollo();
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ejecutar(){
	
	Ventana ap = new Ventana();
	//aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*Al presionar X, cierra la ventana y el programa.*/
		//aplicacion.pack();/*redimensiona automáticamente el tamaño de la ventana al espacio ocupado por los botones.*/
		ap.setBounds(0, 0, 800, 500);
		ap.setVisible(true); /*Hace visible el Frame o la ventana.*/
		ap.setLocationRelativeTo(null);/*Coloca la ventana al centro del monitor*/
	
	}	
		
		
		
		//}

}
