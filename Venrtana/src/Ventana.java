import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(310, 340);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Barra 
		
		JButton bt21 = new JButton("100 + 20");
		bt21.setSize(270,34);
		bt21.setLocation(10,4);
		bt21.setOpaque(true);
		bt21.setBackground(Color.WHITE);
		this.add(bt21);
		
		//Primera fila
		
		JButton bt1 = new JButton("CE");
		bt1.setSize(60,40);
		bt1.setLocation(10,40);
		//bt1.setOpaque(true);
		//bt1.setBackground(Color.GREEN);
		this.add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.setSize(60,40);
		bt2.setLocation(80,40);
		this.add(bt2);
		
		JButton bt3 = new JButton("");
		bt3.setSize(60,40);
		bt3.setLocation(150,40);
		this.add(bt3);
		
		JButton bt4 = new JButton("");
		bt4.setSize(60,40);
		bt4.setLocation(220,40);
		this.add(bt4);
		
		//Segunda fila
		
		JButton bt5 = new JButton("7");
		bt5.setSize(60,40);
		bt5.setLocation(10,90);
		this.add(bt5);
		
		JButton bt6 = new JButton("8");
		bt6.setSize(60,40);
		bt6.setLocation(80,90);
		this.add(bt6);
		
		JButton bt7 = new JButton("9");
		bt7.setSize(60,40);
		bt7.setLocation(150,90);
		this.add(bt7);
		
		JButton bt8 = new JButton("/");
		bt8.setSize(60,40);
		bt8.setLocation(220,90);
		this.add(bt8);
		
		//Tercera fila
		
		JButton bt9 = new JButton("4");
		bt9.setSize(60,40);
		bt9.setLocation(10,140);
		this.add(bt9);
		
		JButton bt10 = new JButton("5");
		bt10.setSize(60,40);
		bt10.setLocation(80,140);
		this.add(bt10);
		
		JButton bt11 = new JButton("6");
		bt11.setSize(60,40);
		bt11.setLocation(150,140);
		this.add(bt11);
		
		JButton bt12 = new JButton("*");
		bt12.setSize(60,40);
		bt12.setLocation(220,140);
		this.add(bt12);
		
		//Cuarta fila
		
		JButton bt13 = new JButton("1");
		bt13.setSize(60,40);
		bt13.setLocation(10,190);
		this.add(bt13);
		
		JButton bt14 = new JButton("2");
		bt14.setSize(60,40);
		bt14.setLocation(80,190);
		this.add(bt14);
		
		JButton bt15 = new JButton("3");
		bt15.setSize(60,40);
		bt15.setLocation(150,190);
		this.add(bt15);
		
		JButton bt16 = new JButton("-");
		bt16.setSize(60,40);
		bt16.setLocation(220,190);
		this.add(bt16);
		
		//Quinta fila
		
		JButton bt17 = new JButton("0");
		bt17.setSize(60,40);
		bt17.setLocation(10,240);
		this.add(bt17);
		
		JButton bt18 = new JButton(".");
		bt18.setSize(60,40);
		bt18.setLocation(80,240);
		this.add(bt18);
		
		JButton bt19 = new JButton("=");
		bt19.setSize(60,40);
		bt19.setLocation(150,240);
		this.add(bt19);
		
		JButton bt20 = new JButton("+");
		bt20.setSize(60,40);
		bt20.setLocation(220,240);
		this.add(bt20);
		
		this.repaint();
		
	}
}
