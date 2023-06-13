import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tabla extends JFrame{

	private String [] tablaJV= {"Si","HOLA"};
	private String [] nombresColumnas = { "Autor","Pais de Origen","Libro","Genero"};
	private Object [][] datosFilas = {
			{"Charles Dickens","UK","Cuento de navidad","Novela"},
			{"J. R. R. Tolkien","Sud Africa","El Silmarillion","Novela"},
			{"","","El hobbit",""},
			{"Julio Verne","Francia","La isla misteriosa","Novela"},
			{"","","La jangada",""},
			{"","","Doctor ox",""},
			{"H. G. Wells","UK","",""}
	};
	
	public Tabla() {
		JTable tabla = new JTable (datosFilas,nombresColumnas);
		tabla.setShowHorizontalLines(true);
		tabla.setShowVerticalLines(true);
		tabla.setShowGrid(true);
		tabla.setGridColor(Color.blue);
		tabla.revalidate();
		setTitle("Holaaaaaa");
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new JScrollPane(tabla),BorderLayout.CENTER);
	
		this.revalidate();
		
	}
	

}
