
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	public Ventana() {
		
		String [] tablaJV= {"Si","HOLA"};
		String [] nombresColumnas = { "Producto","Modelo","Cantidad","Precio"};
		Object [][] datosFilas = {
				{"","","",""},
				{"","","",""},
				{"","","",""},
				{"","","",""},
				{"","","",""}
		};
		
		this.setVisible(true);
		this.setTitle("Hola Zumayaaaaaa");
		this.setSize(860,400);
		this.setResizable(true);
		//this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel fondo2 = new JPanel();
		fondo2.setVisible(true);
		fondo2.setBackground(Color.LIGHT_GRAY);
		fondo2.setLayout(new BorderLayout());
		this.add(fondo2);
		
		JPanel fondo = new JPanel();
		fondo.setVisible(true);
		fondo.setBackground(Color.LIGHT_GRAY);
		fondo.setLayout(new GridLayout(2,1));
		fondo2.add(fondo);
		
		JLabel sis = new JLabel("SISTEMA DE PEDIDO",JLabel.CENTER);
		sis.setFont(new Font ("GoodDog",Font.BOLD,20));
		sis.setBackground(Color.LIGHT_GRAY);
		sis.setForeground(Color.black);
		fondo2.add(sis,BorderLayout.NORTH);
		
		JPanel fondoCentro = new JPanel();
		fondoCentro.setVisible(true);
		fondoCentro.setBackground(Color.LIGHT_GRAY);
		fondoCentro.setLayout(new GridLayout(4,4));
		fondo.add(fondoCentro);
		
		TitledBorder datosBorde = new TitledBorder("Datos cliente");
		fondoCentro.setBorder(datosBorde);
		
		JLabel nombre = new JLabel("Nombre: ",JLabel.CENTER);
		nombre.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(nombre);
		
		JTextField nombre2 = new JTextField();
		nombre2.setVisible(true);
		nombre2.setBackground(Color.white);
		fondoCentro.add(nombre2);
		
		
		
		JLabel cedula = new JLabel("Cédula: ",JLabel.CENTER);
		cedula.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(cedula);
		
		JTextField cedula2 = new JTextField();
		cedula2.setVisible(true);
		cedula2.setBackground(Color.white);
		fondoCentro.add(cedula2);
		
		
		JLabel falsoFondo1 = new JLabel();
		falsoFondo1.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo1);
		JLabel falsoFondo2 = new JLabel();
		falsoFondo2.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo2);
		JLabel falsoFondo3 = new JLabel();
		falsoFondo3.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo3);
		JLabel falsoFondo4 = new JLabel();
		falsoFondo4.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo4);
		
		JLabel direccion = new JLabel("Dirección: ",JLabel.CENTER);
		direccion.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(direccion);
		
		JTextField direccion2 = new JTextField();
		direccion2.setVisible(true);
		direccion2.setBackground(Color.white);
		fondoCentro.add(direccion2);
		
		JLabel telefono = new JLabel("Teléfono: ",JLabel.CENTER);
		telefono.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(telefono);
		
		JTextField telefono2 = new JTextField();
		telefono2.setVisible(true);
		telefono2.setBackground(Color.white);
		fondoCentro.add(telefono2);
		
		JLabel falsoFondo5 = new JLabel();
		falsoFondo5.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo5);
		JLabel falsoFondo6 = new JLabel();
		falsoFondo6.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo6);
		JLabel falsoFondo7 = new JLabel();
		falsoFondo7.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo7);
		JLabel falsoFondo8 = new JLabel();
		falsoFondo8.setBackground(Color.LIGHT_GRAY);
		fondoCentro.add(falsoFondo8);
		
		//FONDO ABAJO
		
		JPanel fondoAbajo = new JPanel();
		fondoAbajo.setVisible(true);
		fondoAbajo.setBackground(Color.LIGHT_GRAY);
		fondoAbajo.setLayout(new GridLayout(1,2));
		fondo.add(fondoAbajo);
		
		TitledBorder ListaBorde = new TitledBorder("Datos cliente");
		fondoAbajo.setBorder(ListaBorde);
		
		JPanel fondoTabla = new JPanel();
		fondoTabla.setVisible(true);
		fondoTabla.setBackground(Color.LIGHT_GRAY);
		fondoTabla.setLayout(new GridLayout(2,1));
		fondoAbajo.add(fondoTabla);
		
		JTable tabla = new JTable (datosFilas,nombresColumnas);
		tabla.setShowHorizontalLines(true);
		tabla.setShowVerticalLines(true);
		tabla.setShowGrid(true);
		tabla.setGridColor(Color.blue);
		tabla.setBackground(Color.LIGHT_GRAY);
		tabla.revalidate();
		fondoTabla.add(new JScrollPane(tabla),BorderLayout.CENTER);
	
		JPanel fondoBotonesTabla = new JPanel();
		fondoBotonesTabla.setVisible(true);
		fondoBotonesTabla.setBackground(Color.LIGHT_GRAY);
		fondoBotonesTabla.setLayout(new GridLayout(1,5));
		fondoTabla.add(fondoBotonesTabla);
		
		JLabel fondoFalso1  = new JLabel();
		fondoBotonesTabla.add(fondoFalso1);
		
		JPanel fondoGuardar = new JPanel();
		fondoGuardar.setBackground(Color.LIGHT_GRAY);
		fondoBotonesTabla.add(fondoGuardar);
		
		JButton guardar = new JButton(new ImageIcon("Guardar.png"));
		fondoBotonesTabla.add(guardar);
		
		JLabel fondoFalso2  = new JLabel();
		fondoBotonesTabla.add(fondoFalso2);
		
		JPanel fondoCancelar = new JPanel();
		fondoCancelar.setBackground(Color.LIGHT_GRAY);
		fondoBotonesTabla.add(fondoCancelar);
		
		JButton cancelar = new JButton(new ImageIcon("Cancelar.png"));
		fondoBotonesTabla.add(cancelar);
		
		JLabel fondoFalso4  = new JLabel();
		fondoBotonesTabla.add(fondoFalso4);
		
		JPanel fondoBotones2 = new JPanel();
		fondoBotones2.setLayout(new BorderLayout());
		fondoAbajo.add(fondoBotones2);
		
		JPanel fondoBotones = new JPanel();
		fondoBotones.setVisible(true);
		fondoBotones.setBackground(Color.LIGHT_GRAY);
		fondoBotones.setLayout(new GridLayout(3,1));
		fondoBotones2.add(fondoBotones,BorderLayout.CENTER);
		
		JPanel fondoAgregar = new JPanel();
		fondoAgregar.setBackground(Color.LIGHT_GRAY);
		fondoBotones.add(fondoAgregar);
		
		JButton agregar = new JButton(new ImageIcon("Agregar.png"));
		fondoAgregar.add(agregar,BorderLayout.CENTER);
		
		JPanel fondoEliminar = new JPanel();
		fondoEliminar.setBackground(Color.LIGHT_GRAY);
		fondoBotones.add(fondoEliminar);
		
		JButton eliminar = new JButton(new ImageIcon("Eliminar.png"));
		fondoEliminar.add(eliminar);
		
		JLabel fondoFalso3  = new JLabel();
		fondoBotones.add(fondoFalso3);
		
		this.repaint();
		this.revalidate();
	}
}