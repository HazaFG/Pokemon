
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	public Ventana() {
		
		String[] botones1 = {"MC"+"M+"+"HOLA"+"*"};
		
		this.setVisible(true);
		this.setTitle("Hola Zumayaaaaaa");
		this.setSize(640,480);
		this.setResizable(true);
		//this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel fondo = new JPanel();
		fondo.setBounds(640,480,0,0);
		fondo.setVisible(true);
		fondo.setBackground(Color.white);
		fondo.setLayout(new BorderLayout());
		this.add(fondo);
		
		JLabel intere = new JLabel("Interés");
		intere.setFont(new Font ("GoodDog",Font.BOLD,40));
		intere.setOpaque(true);
		intere.setBackground(Color.white);
		intere.setForeground(Color.red);
		fondo.add(intere,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.white);
		centro.setLayout(new GridLayout(3,1));
		fondo.add(centro,BorderLayout.CENTER);
		
		JPanel verde = new JPanel();
		verde.setBackground(Color.green);
		verde.setLayout(new BorderLayout());
		centro.add(verde,BorderLayout.CENTER);
		
		JPanel verde2 = new JPanel();
		verde2.setLayout(new GridLayout(5,2));
		verde2.setBackground(Color.green);
		verde.add(verde2,BorderLayout.CENTER);
		
		
		JLabel verdeTitle = new JLabel("Calcula interés");
		verdeTitle.setBackground(Color.green);
		verdeTitle.setOpaque(true);
		verdeTitle.setFont(new Font("GoodDog",Font.BOLD,20));
		verde2.add(verdeTitle);
		
		JLabel verdeEspacio = new JLabel(" ");
		verdeEspacio.setBackground(Color.green);
		verdeEspacio.setOpaque(true);
		verde2.add(verdeEspacio);
		
		
		JLabel jl1 = new JLabel("Capital: ");
		jl1.setOpaque(true);
		jl1.setBackground(Color.green);
		jl1.setFont(new Font("GoodDog",Font.BOLD,20));
		
		JLabel jl2 = new JLabel("1500");
		jl2.setBackground(Color.white);
		jl2.setOpaque(true);
		jl2.setFont(new Font("GoodDog",Font.BOLD,20));
		
	    JLabel jl3 = new JLabel("Tiempo");
	    jl3.setOpaque(true);
	    jl3.setBackground(Color.green);
	    jl3.setFont(new Font("GoodDog",Font.BOLD,20));
	    
	    JLabel jl4 = new JLabel("2");
	    jl4.setOpaque(true);
	    jl4.setBackground(Color.white);
	    jl4.setFont(new Font("GoodDog",Font.BOLD,20));
	    
	    JLabel jl5 = new JLabel("Tasa Interés");
	    jl5.setOpaque(true);
	    jl5.setBackground(Color.green);
	    jl5.setFont(new Font("GoodDog",Font.BOLD,20));
	    
	    JLabel jl6 = new JLabel("0.1");
	    jl6.setOpaque(true);
	    jl6.setBackground(Color.white);
	    jl6.setFont(new Font("GoodDog",Font.BOLD,20));
	    
	    JButton calcular = new JButton("Calcular");
	    calcular.setOpaque(true);
	    calcular.setBackground(Color.BLACK);
	    calcular.setForeground(Color.WHITE);

	    JButton cancelar = new JButton("cancelar");
	    cancelar.setOpaque(true);
	    cancelar.setBackground(Color.BLACK);
	    cancelar.setForeground(Color.WHITE);
	    
	    verde2.add(jl1);
	    verde2.add(jl2);
	    verde2.add(jl3);
	    verde2.add(jl4);
	    verde2.add(jl5);
	    verde2.add(jl6);
	    verde2.add(calcular);
	    verde2.add(cancelar);
	    
		
	    JLabel espacio = new JLabel(" ");
	    espacio.setBackground(Color.white);
	    //centro.add(espacio);
	    
		JPanel rojo = new JPanel();
		rojo.setBackground(Color.red);
		centro.add(rojo,BorderLayout.SOUTH);
		
		JPanel rojo2 = new JPanel();
		rojo2.setLayout(new GridLayout(2,2));
		rojo2.setBackground(Color.red);
		rojo.add(rojo2,BorderLayout.CENTER);
		
		JLabel jl7 = new JLabel("Interés: ");
		jl7.setOpaque(true);
		jl7.setBackground(Color.red);
		jl7.setFont(new Font("GoodDog",Font.BOLD,20));
		
		JLabel jl8 = new JLabel("315.000000000000002");
		jl8.setBackground(Color.white);
		jl8.setOpaque(true);
		jl8.setFont(new Font("GoodDog",Font.BOLD,20));
		
		JLabel jl9 = new JLabel("Monto: ");
		jl9.setOpaque(true);
		jl9.setBackground(Color.red);
		jl9.setFont(new Font("GoodDog",Font.BOLD,20));
		
		JLabel jl10 = new JLabel("1815.00000000000002");
		jl10.setBackground(Color.white);
		jl10.setOpaque(true);
		jl10.setFont(new Font("GoodDog",Font.BOLD,20));
		
		rojo2.add(jl7);
		rojo2.add(jl8);
		rojo2.add(jl9);
		rojo2.add(jl10);
		
		JLabel izq = new JLabel ("              ");
		izq.setBackground(Color.white);
		izq.setOpaque(true);
		fondo.add(izq,BorderLayout.WEST);
		
		JLabel der = new JLabel ("              ");
		der.setBackground(Color.white);
		der.setOpaque(true);
		fondo.add(der,BorderLayout.EAST);
		
		
		
		
		this.repaint();
		this.revalidate();
		
		
		
		
	}
}
