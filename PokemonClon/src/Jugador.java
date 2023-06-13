import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jugador {
	
	public int MundoX , MundoY;
	public final int pantallaX;
	public final int pantallaY;

	public int velocidad;
	public String direccion;
	public Rectangle hitBox;
	public boolean ColisiOn = false;
	public int hitBoxX,hitBoxY;
	
	public BufferedImage arr_1,arr_2,abj_1,abj_2,der_1,der_2,izq_1,izq_2;
	
	AdminitradorJuego aj;
	Controles teclas;
	
	public Jugador(AdminitradorJuego aj, Controles teclas) {
		
		this.aj = aj;
		this.teclas = teclas;
		
		pantallaX = aj.anchoPantalla / 2;
		pantallaY = aj.alturaPantalla  / 2;
		
		hitBox = new Rectangle(0, 0, 15, 15);
		
		hitBoxX = hitBox.x;
		hitBoxY = hitBox.y;
		
		posicionBase();
		getImagenJugador();
	}
	public void posicionBase() {
		
		MundoX = aj.tamPantalla * 26;
		MundoY = aj.tamPantalla * 192;
		velocidad = 4;
		direccion = "abajo";
		
	}
	
	public void getImagenJugador() {
		try {
			arr_1 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Arriba_1.png"));
			arr_2 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Arriba_2.png"));
			abj_1 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Abajo_1.png"));
			abj_2 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Abajo_2.png"));
			der_1 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Derecha_1.png"));
			der_1 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Derecha_2.png"));
			izq_1 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Izquierda_1.png"));
			izq_2 = ImageIO.read(getClass().getResourceAsStream("/Jugador/Izquierda_2.png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void actualizar() {
		
		if(teclas.arriba == true || teclas.abajo == true ||
				teclas.izqui == true || teclas.dere == true) {
			
			if(teclas.arriba == true) {
				direccion = "arriba";
			}
			else if(teclas.abajo == true) {
				direccion = "abajo";
			}
			else if(teclas.izqui == true) {
				direccion = "izquierda";
			}
			else if(teclas.dere == true) {
				direccion = "derecha";
			}
			
			ColisiOn = false;
			aj.cColision.revisarTile(this);
			
			if(ColisiOn == false) {
				
				switch(direccion) {
				case "arriba":
					MundoY -= velocidad;
					break;
				case "abajo":
					MundoY += velocidad;
					break;
				case "izquierda":
					MundoX -= velocidad;
					break;
				case "derecha":
					MundoX += velocidad;
					break;
				}
			}
			
		}
	}
	
	public void dibujar(Graphics2D g2) {
		
		BufferedImage imagen = null;
		
		switch (direccion) {
		case "arriba":
			imagen = arr_1;
			break;
		case "abajo":
			imagen = abj_1;
			break;
		case "derecha":
			imagen = der_1;
			break;
		case "izquierda":
			imagen = izq_1;
			break;
		}
		g2.drawImage(imagen, pantallaX-10, pantallaY-15, 50, 50, null);
	}

}