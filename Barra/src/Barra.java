import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Barra extends JFrame{

	private String nombre;
	private int ID=0,cantidadUsuarios=0;
	
	
	public Barra() {
		
		super ("Menú");
		
		JMenuBar barra;
		JMenu cuenta,usuarios,ayuda;
		JMenuItem crearCuenta,solicitarID,ingresarUsuarios,retirarUsuarios,solicitarUsuarios,comoCrearUsuario,comoIngresarSistema;
		
		barra = new JMenuBar();
		
		cuenta = new JMenu ("Cuenta");
		crearCuenta = new JMenuItem ("Crear cuenta");
		solicitarID = new JMenuItem ("Solicitar ID del usuario");
		
		usuarios = new JMenu ("Usuarios");
		ingresarUsuarios = new JMenuItem ("Agregar usuarios");
		retirarUsuarios = new JMenuItem ("Retirar usuarios");
		solicitarUsuarios = new JMenuItem ("Solicitar cantidad de usuarios");
		
		ayuda = new JMenu ("ayuda");
		comoCrearUsuario = new JMenuItem ("¿Cómo crear un usuario?");
		comoIngresarSistema = new JMenuItem ("¿Cómo ingresar al sistema?");
		//Agregar todo en su lugar		
		barra.add(cuenta);
		barra.add(usuarios);
		barra.add(ayuda);
		cuenta.add(crearCuenta);
		cuenta.add(solicitarID);
		usuarios.add(ingresarUsuarios);
		usuarios.add(retirarUsuarios);
		usuarios.add(solicitarUsuarios);
		ayuda.add(comoCrearUsuario);
		ayuda.add(comoIngresarSistema);
		
		this.add(barra);
		
		/*nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
		cantidadUsuarios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios"));
		*/
		ActionListener accion1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = JOptionPane.showInputDialog("Ingrese su nombre");
				ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
			}			
		};
		ActionListener accion2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Su ID es: "+ID);
			}			
		};
		ActionListener accion3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadUsuarios += Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios nuevos: "));
			}
		};
		ActionListener accion4 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cantidadUsuarios -= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de usuarios que salieron: "));
				
			}
		};
		ActionListener accion5 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"La cantidad de usuarios es: "+cantidadUsuarios);
			}
		};
		ActionListener accion6 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Para generar una cuenta usted debe de clickar en 'Cuenta'"+"\n"+ "y luego en 'Crear cuenta'");
			}
		};
		ActionListener accion7 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Para ingresar al sistema tiene que tener una cuenta y digitar"+"\n"+"sus datos en la interfaz 'Cuenta' y luego 'Iniciar Sesión' (Proximamente)");
			}
		};
		
		this.repaint();
		
		solicitarID.addActionListener(accion2);
		crearCuenta.addActionListener(accion1);
		ingresarUsuarios.addActionListener(accion3);
		retirarUsuarios.addActionListener(accion4);
		solicitarUsuarios.addActionListener(accion5);
		comoCrearUsuario.addActionListener(accion6);
		comoIngresarSistema.addActionListener(accion7);
		
		setJMenuBar(barra);
		
		this.setSize(400,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		/*JLabel users = new JLabel ("Cantidad de usuarios: "+cantidadUsuarios,SwingConstants.RIGHT);
		users.setBounds(10,10,250,100);
		users.setBackground(Color.blue);
		users.setFont(new Font("Times new Roma", Font.BOLD, 16));
		users.setOpaque(true);
		users.setVisible(true);
		this.add(users);
		*/
		JLabel fondo = new JLabel("HOLA "+ID, SwingConstants.CENTER);
		fondo.setBounds(0,0,400,500);
		fondo.setBackground(Color.blue);
		fondo.setFont(new Font("Times new Roma", Font.BOLD, 40));
		fondo.setOpaque(true);
		fondo.setVisible(true);
		this.add(fondo);
		
		this.repaint();
		
	}

}
