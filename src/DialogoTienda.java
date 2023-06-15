
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogoTienda extends JDialog{
	
	AdminitradorJuego aj;
	
	public DialogoTienda(){
		this.setSize(800,400);
		this.setLocation(200,200);
		this.setLayout(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
        // Crear un ImageIcon para obtener las dimensiones originales del GIF
        ImageIcon gifIcon = new ImageIcon("img/tienda.png");
        int gifWidth = gifIcon.getIconWidth();
        int gifHeight = gifIcon.getIconHeight();

        // Crear un JLabel para mostrar el GIF
        JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(0, 0, gifWidth, gifHeight);

        JLabel quitar = new JLabel("Presiona ESC para salir");
        quitar.setForeground(Color.BLACK);
        quitar.setBounds(150, gifHeight + 20, 300, 30);

        Font font = new Font(quitar.getFont().getName(), Font.BOLD, 20);
        quitar.setFont(font);

        // Agregar el JLabel al JDialog
        this.add(gifLabel);
        this.add(quitar);
        
        JButton button1 = new JButton("Si");
        button1.setBounds(455, 111, 108, 31);
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);

        JButton button2 = new JButton("No");
        button2.setBounds(100, 70, 100, 30);
 

        // Agregar los botones al JDialog
        this.add(button1);
        this.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción del botón 1
            	System.out.println("Hola");
            	if(aj.monedas>=2) {
            		aj.monedas-=2;
            		aj.pokeballs+=1;
            	}else {
            		System.out.println("No hay monedas papu");
            	}
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción del botón 2
            }
        });
		
	    this.addKeyListener(new KeyListener() {
	          @Override
	          public void keyTyped(KeyEvent e) {
	          }

	          @Override
	          public void keyPressed(KeyEvent e) {
	              int keyCode = e.getKeyCode();
	              if (keyCode == KeyEvent.VK_ESCAPE) { 
	                    dispose(); 
	              }
	          }

	          @Override
	          public void keyReleased(KeyEvent e) {
	        	  
	          }
	        });

	        this.setFocusable(true); 
	}

}
