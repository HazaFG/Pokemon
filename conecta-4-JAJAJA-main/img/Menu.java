import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	private JButton botonS,botonJ;
	private JLabel titulo;
	public Menu() {
		setLayout(null);
		
		titulo = new JLabel();
		add(titulo,BorderLayout.NORTH);
		titulo.setBackground(new Color(0,0,0,0));
		titulo.setText("CONECTA 4");
		titulo.setFont(new Font("Goudy Stout",Font.BOLD, 20));
		titulo.setForeground(Color.RED);
		titulo.setOpaque(true);
		titulo.setBounds(300, 10, 250, 60);
		
		
    	 botonJ=new JButton("JUGAR");
         botonJ.setBounds(315,100,175,60);
         add(botonJ);
         botonJ.addActionListener(this);
    	
        botonS=new JButton("SALIR");
        botonS.setBounds(315,280,175,60);
        add(botonS);
        botonS.addActionListener(this);
        
        JLabel ventanaMenu = new JLabel();
    	ventanaMenu.setBounds(0,0,800,500);
    	ventanaMenu.setIcon(new ImageIcon("src/img/PriVSPan.jpg"));
    	add(ventanaMenu);
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource()==botonS) {
            System.exit(0);
            
        }
        if (e.getSource()==botonJ) {
        	//Desarrollo aplicacion = new Desarrollo();
    		Ventana aplicacion = new Ventana();
    		
    		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    		
    		aplicacion.setBounds(0, 0, 800, 500);
    		aplicacion.setVisible(true);/*Hace visible el Frame o la ventana.*/
    		aplicacion.setLocationRelativeTo(null);/*Coloca la ventana al centro del monitor*/
    		this.setVisible(false);
        }
    }
	
public static void main(String[] args) {
		
		
    	Menu Boton=new Menu();
        Boton.setBounds(0,0,800,500);
        Boton.setVisible(true);
        Boton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Boton.setLocationRelativeTo(null);
        
	}
}