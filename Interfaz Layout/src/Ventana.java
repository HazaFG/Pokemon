
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	public Ventana() {
		
		String pais[] = {"Perú","Mexico","Hola","Si","A veces" };
		
		this.setVisible(true);
		this.setTitle("Hola Zumayaaaaaa");
		this.setSize(640,640);
		this.setResizable(true);
		//this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel fondo2 = new JPanel();
		fondo2.setBounds(640,640,0,0);
		fondo2.setVisible(true);
		fondo2.setBackground(Color.decode("#00ff00"));
		fondo2.setLayout(new BorderLayout());
		this.add(fondo2);
		
		JPanel fondo = new JPanel();
		fondo.setBounds(640,640,0,0);
		fondo.setVisible(true);
		fondo.setBackground(Color.decode("#00ff00"));
		fondo.setLayout(new GridLayout(2,2));
		fondo2.add(fondo,BorderLayout.CENTER);
		
		JLabel registro = new JLabel("Registro de usuario JAJJAAJAJA");
		registro.setFont(new Font ("GoodDog",Font.BOLD,16));
		registro.setOpaque(true);
		registro.setBackground(Color.green);
		registro.setForeground(Color.red);
		fondo2.add(registro,BorderLayout.NORTH);
		
		//ARRIBA IZQUIERDA
		JPanel arribaIzq = new JPanel();
		arribaIzq.setBackground(Color.decode("#66ffcc"));
		arribaIzq.setLayout(new BorderLayout());
		fondo.add(arribaIzq);
		
		TitledBorder BAI = new TitledBorder("Datos generales");
		BAI.setTitleJustification(TitledBorder.LEFT);
		BAI.setTitlePosition(TitledBorder.TOP);
		arribaIzq.setBorder(BAI);

		JPanel AIFondo = new JPanel();
		AIFondo.setBackground(Color.decode("#66ffcc"));
		AIFondo.setLayout(new GridLayout(7,2));
		arribaIzq.add(AIFondo,BorderLayout.CENTER);
		
		JLabel ai1 = new JLabel("Nombres: "); 
		ai1.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai1);
		
		JTextField ai2 = new JTextField("JuanCarlos",JTextField.CENTER); 
		ai2.setBackground(Color.decode("#FFFFFF"));
		AIFondo.add(ai2);
		
		JLabel ai3 = new JLabel("Apellido paterno: "); 
		ai3.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai3);
		
		JTextField ai4 = new JTextField("Arcilla JAJAJAJA",JTextField.CENTER); 
		ai4.setBackground(Color.decode("#FFFFFF"));
		AIFondo.add(ai4);
		
		JLabel ai5 = new JLabel("Apellido materno: "); 
		ai5.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai5);
		
		JTextField ai6 = new JTextField("NOCHES JAJAJAJA",JTextField.CENTER); 
		ai6.setBackground(Color.decode("#FFFFFF"));
		AIFondo.add(ai6);
		
		JLabel ai7 = new JLabel("Fecha de nacimiento: "); 
		ai7.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai7);
		
		JTextField ai8 = new JTextField("07/01/1990",JTextField.CENTER); 
		ai8.setBackground(Color.decode("#FFFFFF"));
		AIFondo.add(ai8);
		
		JLabel ai9 = new JLabel("Fecha de nacimiento: "); 
		ai9.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai9);
		
		JRadioButton ai10 = new JRadioButton("Masculino");
		ai10.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai10);
		
		
		JLabel ai11 = new JLabel(""); 
		ai11.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai11);
		
		JRadioButton ai12 = new JRadioButton("Femenino");
		ai12.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai12);
		
		JLabel ai13 = new JLabel("Nacionalidad: "); 
		ai13.setBackground(Color.decode("#66ffcc"));
		AIFondo.add(ai13);
		
		JComboBox ai14 = new JComboBox(pais);
		ai14.setBackground(Color.decode("#FFFFFF"));
		AIFondo.add(ai14);
		
		
		
		//ARRIBA DERECHA
		JPanel arribaDer = new JPanel();
		arribaDer.setBackground(Color.decode("#ff9999"));
		arribaDer.setLayout(new BorderLayout());
		fondo.add(arribaDer);
		
		TitledBorder BAD = new TitledBorder("Perfil del usuario");
		BAD.setTitleJustification(TitledBorder.LEFT);
		BAD.setTitlePosition(TitledBorder.TOP);
		arribaDer.setBorder(BAD);
		
		JPanel ADFondo = new JPanel();
		ADFondo .setBackground(Color.decode("#ff9999"));
		ADFondo .setLayout(new GridLayout(3,1));
		arribaDer.add(ADFondo ,BorderLayout.SOUTH);
		
		JPanel FondoImagen = new JPanel();
		FondoImagen .setBackground(Color.decode("#ff9999"));
		FondoImagen .setLayout(new BorderLayout());
		arribaDer.add(FondoImagen ,BorderLayout.CENTER);
				
		JLabel ad1 = new JLabel(new ImageIcon("FOTO.png"));
		ad1.setBackground(Color.decode("#FFFFFF"));
		FondoImagen.add(ad1);
		
		JCheckBox ad2 = new JCheckBox("Mostrar foto de perfil");
		ad2.setBackground(Color.decode("#ff9999"));
		ADFondo.add(ad2);
		
		JCheckBox ad3 = new JCheckBox("Mostrar fecha nacimiento");
		ad3.setBackground(Color.decode("#ff9999"));
		ADFondo.add(ad3);
		
		
		//ABAJO IZQ
		
		JPanel abajoIzq = new JPanel();
		abajoIzq.setBackground(Color.decode("#ff6666"));
		abajoIzq.setLayout(new BorderLayout());
		fondo.add(abajoIzq);
		
		TitledBorder BABI = new TitledBorder("Datos opcionales");
		BABI.setTitleJustification(TitledBorder.LEFT);
		BABI.setTitlePosition(TitledBorder.TOP);
		abajoIzq.setBorder(BABI);
		
		JPanel ABIFondo = new JPanel();
		ABIFondo .setBackground(Color.decode("#ff6666"));
		ABIFondo .setLayout(new GridLayout(3,2));
		abajoIzq.add(ABIFondo ,BorderLayout.CENTER);
		
		JLabel abi1 = new JLabel("Descripción");
		abi1.setBackground(Color.decode("#ff6666"));
		ABIFondo.add(abi1);
		
		JLabel abi2 = new JLabel("Descripción");
		abi2.setBackground(Color.decode("#ff6666"));
		ABIFondo.add(abi2);
		
		
		JTextArea abi3 = new JTextArea("Hola amigos de youtube "+"\n"
									 + "JAJAJA no es cierto yo"+"\n"
									 + "no tengo amigos");
		abi3.setBackground(Color.decode("#FFFFFF"));
		JScrollPane scrollBar = new JScrollPane(abi3,
	            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		ABIFondo.add(scrollBar,BorderLayout.CENTER);
		String info[] = {"Cantar","Escuchar música","Leer","Ok","Ta bien","Te Me Cuidas","Otros","Tae Kwon Do"};
		JList abi4 = new JList(info);
		abi4.setBackground(Color.decode("#FFFFFF"));
		JScrollPane scrollBar2 = new JScrollPane(abi4,
	            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
	            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ABIFondo.add(scrollBar2);
		//ABAJO DER
		
		JPanel abajoDer = new JPanel();
		abajoDer.setBackground(Color.decode("#66ffcc"));
		abajoDer.setLayout(new BorderLayout());
		fondo.add(abajoDer);
		
		JPanel ABDFondo = new JPanel();
		ABDFondo .setBackground(Color.decode("#66ffcc"));
		ABDFondo .setLayout(new GridLayout(5,1));
		abajoDer.add(ABDFondo ,BorderLayout.CENTER);
		
		JLabel fondoFalso1  = new JLabel();
		ABDFondo.add(fondoFalso1);
		
		JPanel abd1Fondo = new JPanel();
		abd1Fondo.setBackground(Color.decode("#66ffcc"));
		ABDFondo.add(abd1Fondo);
		
		JButton abd1 = new JButton("Nuevo");
		abd1.setForeground(Color.white);
		abd1.setBackground(Color.decode("#00000"));
		abd1Fondo.add(abd1,BorderLayout.SOUTH);
		
		JPanel abd2Fondo = new JPanel();
		abd2Fondo.setBackground(Color.decode("#66ffcc"));
		ABDFondo.add(abd2Fondo);
		
		JButton abd2 = new JButton("Guardar");
		abd2.setForeground(Color.white);
		abd2.setBackground(Color.decode("#00000"));
		abd2Fondo.add(abd2,BorderLayout.EAST);
		
		JPanel abd3Fondo = new JPanel();
		abd3Fondo.setBackground(Color.decode("#66ffcc"));
		ABDFondo.add(abd3Fondo);
		
		JButton abd3 = new JButton("Salir");
		abd3.setForeground(Color.white);
		abd3.setBackground(Color.decode("#00000"));
		abd3Fondo.add(abd3,BorderLayout.SOUTH);
		
		
		this.repaint();
		this.revalidate();
		
		
		
		
	}
}
