import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{

	//private FileWriter archivo = null;
	private FileWriter escritor = null;
	private String info = new String();
	String texto ="";
	String ct1;
	String ct2;
	String name ="";
	
		public Ventana(){
			//FileWriter archivo = null;
			//PrintWriter escritor = null;
			
			this.setVisible(true);
			this.setTitle("Hola Zumaya");
			this.setSize(700, 1000);
			this.setResizable(true);
			this.setLayout(null);
			this.setLocationRelativeTo(null);
			
			this.getContentPane().setBackground(Color.decode("#318CE7"));
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JMenuBar jmb = new JMenuBar();
			jmb.setBounds(0,0,1000,20);
			
			JMenu jm1 = new JMenu ("Inicio");
			JMenu jm2 = new JMenu ("Estudiantes");
			JMenu jm3 = new JMenu ("Profesores");
			JMenu jm4 = new JMenu ("Carga");
			JMenu jm5 = new JMenu ("Ayuda");
			
			jm5.setEnabled(false);
			
			jmb.add(jm1);
			jmb.add(jm2);
			jmb.add(jm3);
			jmb.add(jm4);
			jmb.add(jm5);
			jm5.setEnabled(false);
			
			JMenuItem jmi1 = new JMenuItem ("LogIn");
			JMenuItem jmi2 = new JMenuItem ("Registro");
			
			
			jm2.add(jmi1);
			jm2.add(jmi2);
			
			this.add(jmb);
			
			JPanel jp1 = new JPanel();
			jp1.setLayout(null);
			jp1.setBounds(0,0,this.getWidth(),this.getHeight());
			jp1.setBackground(Color.orange);
			JButton jb1 = new JButton();
			
			JPanel jp2 = new JPanel();
			jp2.setLayout(null);
			jp2.setBounds(0,0,this.getWidth(),this.getHeight());
			jp2.setBackground(Color.pink);
			
			JPanel jp3 = new JPanel();
			jp3.setLayout(null);
			jp3.setBounds(0,0,this.getWidth(),this.getHeight());
			jp3.setBackground(Color.green);
			
			
			//Ventana 1 LOGIN
			JLabel username = new JLabel("Ingrese el correo electrónico",JLabel.CENTER);
			username.setBounds(180,100,260,60);
			username.setFont(new Font("Times new Roma", Font.BOLD, 16));
			username.setVisible(true);
			username.setOpaque(true);
			username.setBackground(Color.orange);
			jp1.add(username);
			
			JTextField usuario = new JTextField();
			usuario.setBounds(180,160,300,30);
			usuario.setOpaque(true);
			usuario.setBackground(Color.white);
			jp1.add(usuario);
			
			JLabel password = new JLabel("Ingrese la contraseña",JLabel.CENTER);
			password.setBounds(180,210,260,30);
			password.setFont(new Font("Times new Roma", Font.BOLD, 16));
			password.setVisible(true);
			password.setOpaque(true);
			password.setBackground(Color.orange);
			jp1.add(password);
			
			JPasswordField contrasenna = new JPasswordField();
			contrasenna.setBounds(180,250,300,30);
			contrasenna.setOpaque(true);
			contrasenna.setBackground(Color.white);
			jp1.add(contrasenna);
			
			JButton jb2 = new JButton("ACCEDER");
			jb2.setBounds(280,310,100,50);
			jb2.setVisible(true);
			jp1.add(jb2);
			
			//Ventana 2 REGISTRO
			JLabel nombre = new JLabel("Ingrese su nombre",JLabel.CENTER);
			nombre.setBounds(180,140,260,30);
			nombre.setFont(new Font("Times new Roma", Font.BOLD, 16));
			nombre.setVisible(true);
			nombre.setOpaque(true);
			nombre.setBackground(Color.pink);
			jp2.add(nombre);
			
			JTextField nombreTex = new JTextField();
			nombreTex.setBounds(180,180,300,30);
			nombreTex.setOpaque(true);
			nombreTex.setBackground(Color.white);
			jp2.add(nombreTex);

			JLabel apellido = new JLabel("Ingrese sus apellidos",JLabel.CENTER);
			apellido.setBounds(180,220,260,30);
			apellido.setFont(new Font("Times new Roma", Font.BOLD, 16));
			apellido.setVisible(true);
			apellido.setOpaque(true);
			apellido.setBackground(Color.pink);
			jp2.add(apellido);
			
			JTextField apellidoTex = new JTextField();
			apellidoTex.setBounds(180,260,300,30);
			apellidoTex.setOpaque(true);
			apellidoTex.setBackground(Color.white);
			jp2.add(apellidoTex);
			
			JLabel correo = new JLabel("correo electrónico",JLabel.CENTER);
			correo.setBounds(180,300,260,30);
			correo.setFont(new Font("Times new Roma", Font.BOLD, 16));
			correo.setVisible(true);
			correo.setOpaque(true);
			correo.setBackground(Color.pink);
			jp2.add(correo);
			
			JTextField correoTex = new JTextField();
			correoTex.setBounds(180,340,300,30);
			correoTex.setOpaque(true);
			correoTex.setBackground(Color.white);
			jp2.add(correoTex);
			
			JLabel contra1 = new JLabel("Enter password",JLabel.CENTER);
			contra1.setBounds(180,380,260,30);
			contra1.setFont(new Font("Times new Roma", Font.BOLD, 16));
			contra1.setVisible(true);
			contra1.setOpaque(true);
			contra1.setBackground(Color.pink);
			jp2.add(contra1);
			
			JPasswordField contra1Tex = new JPasswordField();
			contra1Tex.setBounds(180,420,300,30);
			contra1Tex.setOpaque(true);
			contra1Tex.setBackground(Color.white);
			jp2.add(contra1Tex);
			
			JLabel contra2 = new JLabel("Enter password",JLabel.CENTER);
			contra2.setBounds(180,460,260,30);
			contra2.setFont(new Font("Times new Roma", Font.BOLD, 16));
			contra2.setVisible(true);
			contra2.setOpaque(true);
			contra2.setBackground(Color.pink);
			jp2.add(contra2);
			
			JPasswordField contra2Tex = new JPasswordField();
			contra2Tex.setBounds(180,500,300,30);
			contra2Tex.setOpaque(true);
			contra2Tex.setBackground(Color.white);
			jp2.add(contra2Tex);
			
			JCheckBox cb1 = new JCheckBox("Acepto terminos y condiciones");
			cb1.setBounds(180,540,210,30);
			cb1.setBackground(Color.pink);
			jp2.add(cb1);
			
			JButton jb3 = new JButton("ACCEDER");
			jb3.setBounds(280,580,100,50);
			jb3.setVisible(true);
			jp2.add(jb3);
			
			File archivo = new File("Hola.txt");
			
			try {
				BufferedReader bf = new BufferedReader(new FileReader(archivo));
				String temp = "";
				String bfRead;
				while ((bfRead = bf.readLine()) != null) {
					temp += bfRead;
				}
				texto = temp;
			}catch(Exception e){
			}
			ct1 = new String(contra1Tex.getPassword());
			ct2 = new String(contra2Tex.getPassword());
			String nm1 = new String(nombreTex.getText());
			String ap1 = new String(apellidoTex.getText());
			String cr1 = new String(correoTex.getText());
			
			//REGISTRO
			jb3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						Scanner scanner = new Scanner(archivo);
						int aux=0;
						String [] split= texto.split(",");
						int i=2;
						while (scanner.hasNextLine() && aux ==0) {
							if ((split[i].equals(correoTex.getText()))) {
								JOptionPane.showMessageDialog(null,"El correo electrónico ya fue registrado \n"
																+ "favor de ingresar otro correo o iniciar sesión.","RORRE",JOptionPane.INFORMATION_MESSAGE);
								aux++;
							} else {
								if (!(ct1.equals(ct2)) || ct1.length() > 0 || nm1.length() > 0
										|| ap1.length() > 0 || cr1.length() > 0) {
									JOptionPane.showMessageDialog(null,"E R R O R","ERROR",JOptionPane.ERROR_MESSAGE);
								}else {
									JOptionPane.showMessageDialog(null,"Acceso exitoso :D","Well done",JOptionPane.INFORMATION_MESSAGE);
									try {
										String ct5 = new String(contra2Tex.getPassword());
										
										//archivo = new FileWriter ("C:\\Users\\CYBERTRON\\Desktop\\Holaaaa\\LoginRegister\\Hola.txt");
										escritor = new FileWriter(archivo,true);
										//escritor.println("HOLA siiii");
										info += "\n"+nombreTex.getText()+","+
												apellidoTex.getText()+","+
												correoTex.getText()+","+
												ct5+",";
										
										escritor.write(info);
										escritor.close();
										}catch (Exception ee){
										}
									remove(jp1);
									remove(jp2);
									remove(jp3);
									repaint();
									revalidate();
									aux++;
								}
							}
						}
						scanner.close();
					} catch (FileNotFoundException ee) {
						ee.printStackTrace();
					}	
				}
			});
			
			
			//LOGIN
			jb2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//JOptionPane.showMessageDialog(null,"Error al acceder","E R R O R",JOptionPane.ERROR_MESSAGE);
			try {
				char [] ct3 = contrasenna.getPassword();
				String ct4 = new String ();
				for (int i=0;i<ct3.length;i++) {
					ct4 += ct3[i];
				}
				Scanner scanner = new Scanner(archivo);
				int aux=0;
				String [] split= texto.split(",");
				int i=2;
				while (scanner.hasNextLine() && aux ==0) {
					if ((split[i].equals(usuario.getText()) && (ct4.equals(split[i+1])))) {
						JOptionPane.showMessageDialog(null,"Acceso exitoso :D","Well done",JOptionPane.INFORMATION_MESSAGE);
						name = split[i-2];
						
						JLabel welcome = new JLabel("Bienvenido "+name,JLabel.CENTER);
						welcome.setBounds(180,100,260,60);
						welcome.setFont(new Font("Times new Roma", Font.BOLD, 16));
						welcome.setVisible(true);
						welcome.setOpaque(true);
						welcome.setBackground(Color.green);
						jp3.add(welcome);
						
						remove(jp1);
						remove(jp2);
						remove(jp3);
						add(jp3);
						repaint();
						revalidate();
						aux++;
					} else {
						if (i+4 < split.length) {
							System.out.println(split.length);
						i +=4;
						}else {					
							aux=2;
						}
					}
				}
				i=2;
				if (aux ==0 || aux == 2)
					JOptionPane.showMessageDialog(null,"Contraseña o nombre de usuario incorrectos","ERROR",JOptionPane.ERROR_MESSAGE);

				scanner.close();
			} catch (FileNotFoundException ee) {
				ee.printStackTrace();
			}
			
				}
			});
			
			
			JButton bt3 = new JButton("Generar tabla");
			bt3.setBounds(180,200,200,100);
			bt3.setVisible(true);
			jp3.add(bt3);
			
			
			JButton bt4 = new JButton("Refrescar");
			bt4.setBounds(180,600,200,100);
			bt4.setVisible(true);
			jp3.add(bt4);
			
			bt3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try {
						
						try {
							BufferedReader bf = new BufferedReader(new FileReader(archivo));
							String temp = "";
							String bfRead;
							while ((bfRead = bf.readLine()) != null) {
								temp += bfRead;
							}
							texto = temp;
						}catch(Exception ee){
						}
						
						String [] split= texto.split(",");
						int lineas = split.length/4;
						
						Object colums[] = {"Nombre","Apellido","Correo","Contraseña"};
						Object [][] data = new Object[lineas][4];
						
						int aux=0;
						for (int i=0;i<split.length/4;i++) {
							for (int ii=0;ii<4;ii++) {
								data [i][ii] = split[aux];
								aux++;
								}
							}
						for (int i=0;i<split.length;i++) {
							System.out.println(split[i]);
						}
						
						JTable estudiantes = new JTable(data,colums);
						JScrollPane test = new JScrollPane(estudiantes);
						
						//jp3.revalidate();
						jp3.remove(test);
						test.setSize(400, 300);
						test.setLocation(100, 300);
						test.revalidate();
						jp3.add(test);
						
						//bt4.setVisible(true);
						
						test.repaint();
						test.revalidate();
						revalidate();
						repaint();
						
						}catch (Exception ee){
						}
				}
			});

			jmi1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					remove(jp1);
					remove(jp2);
					remove(jp3);
					add(jp1);
					repaint();
					revalidate();
				}	
			});
			jmi2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					remove(jp1);
					remove(jp2);
					remove(jp3);
					add(jp2);
					repaint();
					revalidate();
				}
			
				
			});
			
			this.revalidate();		
			this.repaint();
			
	}

}

