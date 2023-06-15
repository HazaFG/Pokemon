
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogoNpc4 extends JDialog{
	public DialogoNpc4(){
		this.setSize(800,400);
		this.setLocation(200,200);
		this.setLayout(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
        // Crear un ImageIcon para obtener las dimensiones originales del GIF
        ImageIcon gifIcon = new ImageIcon("img/interaccion4.gif");
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
