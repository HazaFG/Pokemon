import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	JFrame zumaya = new JFrame();
	JComboBox ambitoEmpresa;
	
	
	public Ventana() {
		
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(700, 500);
		this.setResizable(true);
		this.setLayout( new BorderLayout());
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		this.add(jp1,BorderLayout.NORTH);
		
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.black);
		jp2.setLayout(null);
		this.add(jp2,BorderLayout.CENTER);
		
		JLabel nmb = new JLabel("Nombre");
		nmb.setBounds(30,100,80,30);
		nmb.setForeground(Color.white);
		jp2.add(nmb);
		
		JTextField Nombre = new JTextField("Nombre");
		Nombre.setBounds(100,100,150,30);
		jp2.add(Nombre);
		
		JLabel apell = new JLabel("Apellidos");
		apell.setBounds(30,150,80,30);
		apell.setForeground(Color.white);
		jp2.add(apell);
		
		JTextField Apellido = new JTextField("Apellido");
		Apellido.setBounds(100,150,150,30);
		jp2.add(Apellido);
		
		JLabel empr = new JLabel("Empresa");
		empr.setBounds(30,200,80,30);
		empr.setForeground(Color.white);
		jp2.add(empr);
		
		JTextField Empresa = new JTextField("Empresa");
		Empresa.setBounds(100,200,150,30);
		jp2.add(Empresa);
		
		JLabel ambito = new JLabel("Ambito de");
		ambito.setBounds(30,250,80,12);
		ambito.setForeground(Color.white);
		jp2.add(ambito);
		JLabel ambito2 = new JLabel("la empresa");
		ambito2.setBounds(30,260,80,12);
		ambito2.setForeground(Color.white);
		jp2.add(ambito2);
		
		File fw2 = new File ("datosAmbitoEmpresa.txt");
		if (!fw2.exists()) {
            try {
            	
            	fw2.createNewFile(); // Crear el archivo
            }catch(Exception e) {
            	
            }
		try {
		FileWriter	fw3 = new FileWriter("datosAmbitoEmpresa.txt",true);
		BufferedWriter writer2 = new BufferedWriter(fw3);
		writer2.write("Educación infantil\r\n"
				+ "Educación primaria\r\n"
				+ "Educación secundaria\r\n"
				+ "Educación superior\r\n"
				+ "Educación online\r\n"
				+ "Educación especial\r\n"
				+ "Educación en idiomas\r\n"
				+ "Educación técnica\r\n"
				+ "Educación en artes");
		writer2.close();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		}
		
		ambitoEmpresa = new JComboBox();
		ambitoEmpresa.setBounds(100,250,150,30);
		rellenarDeTxt();
		jp2.add(ambitoEmpresa);

		JLabel carg = new JLabel("Cargo");
		carg.setBounds(30,300,80,30);
		carg.setForeground(Color.white);
		jp2.add(carg);
		
		JTextField Cargo = new JTextField("Cargo");
		Cargo.setBounds(100,300,150,30);
		jp2.add(Cargo);
		
		
		JLabel usr = new JLabel("Username");
		usr.setBounds(300,100,80,30);
		usr.setForeground(Color.white);
		jp2.add(usr);
		
		JTextField Username = new JTextField("Username");
		Username.setBounds(370,100,150,30);
		jp2.add(Username);
		
		JLabel contr = new JLabel("Contraseña");
		contr.setBounds(300,150,80,30);
		contr.setForeground(Color.white);
		jp2.add(contr);
		
		JTextField Contrasenna = new JTextField("Contrasenna");
		Contrasenna.setBounds(370,150,150,30);
		jp2.add(Contrasenna);
		
		
		JLabel contr2 = new JLabel("Confirmar");
		contr2.setBounds(300,200,80,15);
		contr2.setForeground(Color.white);
		jp2.add(contr2);
		JLabel contr3 = new JLabel("contraseña");
		contr3.setBounds(300,212,80,30);
		contr3.setForeground(Color.white);
		jp2.add(contr3);
		
		JTextField Contrasenna2 = new JTextField("Contrasenna2");
		Contrasenna2.setBounds(370,200,150,30);
		jp2.add(Contrasenna2);
		
		JLabel corr = new JLabel("Correo");
		corr.setBounds(300,250,80,30);
		corr.setForeground(Color.white);
		jp2.add(corr);
		
		JTextField Correo = new JTextField("Correo");
		Correo.setBounds(370,250,150,30);
		jp2.add(Correo);
		
		
		JCheckBox jcb = new JCheckBox("He leído y acepto los términos y condiciones");
		jcb.setBounds(150,360,300,20);
		jp2.add(jcb);
		
		JButton jb1 = new JButton("Guardar");
		jb1.setBounds(260,400,100,30);
		jp2.add(jb1);
		
		String str = "asd";
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				fileExist(str);
				
				String invalid[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","!", "#", "$", "%", "&", "*", "+", "-", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~"};
				String invalidNum[] = {"!", "#", "$", "%", "&", "*", "+", "-", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "`", "{", "|", "}", "~"};
				String invalidEmail[] = {"fakemail.com","000000pay.com","zzz.com","zxo.us"," "};
				try {
						for (int i=0;i<invalid.length;i++) {
							if (Nombre.getText().contains(invalid[i])){
								JOptionPane.showMessageDialog(null, "Nombre invalido","E R R O R", JOptionPane.ERROR_MESSAGE);
								throw new EceptionEspaciosYLetras("Nombre");
							}
						}
					
					for (int i=0;i<invalid.length;i++) {
						if (Apellido.getText().contains(invalid[i])){
							JOptionPane.showMessageDialog(null, "Apellido invalido","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspaciosYLetras("Apellido");
						}
					}
					for (int i=0;i<invalidNum.length;i++) {
						if (Empresa.getText().contains(invalidNum[i])){
							JOptionPane.showMessageDialog(null, "Empresa invalida","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspaciosLetrasYNumeros("Empresa");
						}
					}
					
					for (int i=0;i<invalid.length;i++) {
						if (Cargo.getText().contains(invalid[i])){
							JOptionPane.showMessageDialog(null, "Cargo invalido","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspaciosYLetras("Cargo");
						}
					}
					for (int i=0;i<invalid.length;i++) {
						if (Username.getText().contains(invalid[i])){
							JOptionPane.showMessageDialog(null, "Username invalido","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspaciosYLetras("Username");
						}
					}
						if (Contrasenna.getText().contains(" ")){
							JOptionPane.showMessageDialog(null, "Contraseña invalida","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspacios("Contraseña");
						}
						if (Contrasenna2.getText().contains(" ")){
							JOptionPane.showMessageDialog(null, "Confirmación de contraseña invalida","E R R O R", JOptionPane.ERROR_MESSAGE);
							throw new EceptionEspacios("Confirmar contraseña");
						}
						for (int i=0;i<invalidEmail.length;i++) {
							if (Correo.getText().contains(invalidEmail[i])){
								JOptionPane.showMessageDialog(null, "Email invalido","E R R O R", JOptionPane.ERROR_MESSAGE);
								throw new EceptionInvalidEmail("Email");
							}
							}
					
						
					String formulario = ambitoEmpresa.getSelectedItem().toString() +", " +Nombre.getText()+", "+Apellido.getText()+", "+Empresa.getText()+", "+Cargo.getText()+", "+Username.getText()+", "+Contrasenna.getText()+", "+Contrasenna2.getText()+", "+Correo.getText();
					FileWriter fw;
					fw = new FileWriter("demo.txt",true);
					BufferedWriter writer = new BufferedWriter(fw);
					writer.newLine();
					writer.write(formulario);
					writer.close();
					}  catch(EceptionEspaciosYLetras e3) {
						
					}catch (EceptionEspaciosLetrasYNumeros e4) {
						
					}catch (EceptionInvalidEmail e5)  {
						
					}catch (EceptionEspacios e6) {
						
					}
					 catch (Exception e1) {
						
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}}
			
		});
		
		repaint();
		revalidate();
	}
	
	public void rellenarDeTxt() {
		String filePath = "datosAmbitoEmpresa.txt";
		File file  = new File (filePath);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader (file));
			Object[] lines = br.lines().toArray();
			
			for (int i=0; i< lines.length; i++) {
				String line = lines[i].toString();
				ambitoEmpresa.addItem(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public boolean fileExist (String frame) {
		try {
			FileWriter fileWriter = new FileWriter(frame);
			return true;
		}catch (IOException e) {
			return false;
		}
	}


	public static void main(String[] args){
		// TODO Auto-generated method stub

		Ventana v1 = new Ventana();

	}

	public class EceptionEspaciosYLetras extends RuntimeException{

	public EceptionEspaciosYLetras() {

		super("contiene elementos invalidos");
	}
	
	public EceptionEspaciosYLetras(String cadena) {

		super(cadena+" contiene elementos invalidos");
	}

}
	

public class EceptionEspaciosLetrasYNumeros extends RuntimeException{

	public EceptionEspaciosLetrasYNumeros() {

		super("contiene elementos invalidos");
	}
	
	public EceptionEspaciosLetrasYNumeros(String cadena) {

		super(cadena+" contiene elementos invalidos");
	}

}


public class EceptionInvalidEmail extends RuntimeException{

	public EceptionInvalidEmail() {

		super("contiene elementos invalidos");
	}
	
	public EceptionInvalidEmail(String cadena) {

		super(cadena+" contiene elementos invalidos");
	}

}

public class EceptionEspacios extends RuntimeException{

	public EceptionEspacios() {

		super("contiene elementos invalidos");
	}
	
	public EceptionEspacios(String cadena) {

		super(cadena+" contiene elementos invalidos");
	}

}



}
