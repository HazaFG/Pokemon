import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AdminitradorJuego extends JPanel implements Runnable{
	
	//CONFIGURACIONES DE PANTALLA
		final int escalaOriginal = 5;
		final int escala = 5;
		
		public final int tamPantalla = escalaOriginal * escala; //25x25 CUADROS
		public final int maxColPantalla = 30;
		public final int maxFilPantalla = 20;
		public int anchoPantalla = tamPantalla * maxColPantalla; // 1015 PIXELES
		public int alturaPantalla = tamPantalla * maxFilPantalla; // 540 PIXELES
	
	
	int FPS = 60;
	
	//CONFIGURACIÓN DE MUNDO
	
	public final int mundoFil = 85; //Las originales serán 83
	public final int mundoCol = 43; // y 43
	public final int maximoAnchoMundo = mundoCol * tamPantalla;
	public final int maximoAltoMundo = mundoFil * tamPantalla;
	
	public boolean estadoCombate = false;
	JButton btn = new JButton();
	
	ControladorTile ControladorT = new ControladorTile(this);
	Controles teclas = new Controles();
	Combate combate = new Combate(this);
	Thread hiloJuego;
	public Colision cColision = new Colision(this);
	Jugador jugador = new Jugador(this, teclas,combate);
	
	public AdminitradorJuego() {
		this.setSize(800, 800);
		this.setBackground(Color.LIGHT_GRAY);
		this.setDoubleBuffered(true);
		this.addKeyListener(teclas);
		this.setFocusable(true);

	}
	
	public void iniciarHiloJuego() {
		hiloJuego = new Thread(this);
		hiloJuego.start();
	}
	
	@Override
	public void run() {
		//CONTROL DE FPSSSSSSSSSSS 1
				double intervaloDibujado = 1000000000/FPS;
				double tiempoDibujado = System.nanoTime() + intervaloDibujado;
				
				while(hiloJuego !=null) {
					
					/*long currentTiempo = System.nanoTime();
					System.out.println("Tiempo: "+currentTiempo);*/
					
					//1 ACTUALIZA: ACTUALIZA LA INFORMACION COMO LA POSICION DEL PERSONAJE
					actualizar();
					
					//2 DRAW: DIBUJA EN PANTALLA LA ACTUALIZACION DE INFORMACION
					repaint();
					
				//CONTROL DE FPSSSSSSSSSS 2
				try {
					double tiempoRestante = tiempoDibujado - System.nanoTime();
					tiempoRestante = tiempoRestante/1000000;
					
					if(tiempoRestante < 0) {
						tiempoRestante = 0;
					}
					
					Thread.sleep((long) tiempoRestante);
					
					tiempoDibujado += intervaloDibujado;
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	
	public void actualizar() {
		jugador.actualizar();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		if (!estadoCombate) {
			combate.dibujar(g2);			
		}else {
			ControladorT.dibujar(g2);
			jugador.dibujar(g2);
		}
		g2.dispose();			
	}
}
