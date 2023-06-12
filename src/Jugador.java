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
	public boolean colisionHierva = false;
	public int hitBoxX,hitBoxY;
	
	Pokemon[] equipo = new Pokemon[6];
	
	public BufferedImage arr_1,arr_2,abj_1,abj_2,der_1,der_2,izq_1,izq_2;
	public int contadorSprite = 0;
	public int numeroSprite = 1;
	
	AdminitradorJuego aj;
	Controles teclas;
	SplashMenu splashM;
	Combate combate; 
	
	public Jugador(AdminitradorJuego aj, Controles teclas,Combate combate) {
		
		this.aj = aj;
		this.teclas = teclas;
		this.combate = combate;
		
		pantallaX = aj.anchoPantalla / 2;
		pantallaY = aj.alturaPantalla  / 2;
		
		hitBox = new Rectangle(0, 0, 15, 15);
		
		hitBoxX = hitBox.x;
		hitBoxY = hitBox.y;
		
		//Pikachu pika = new Pikachu();
		Snorlax snor = new Snorlax();
		equipo[0] = snor;
		
		posicionBase();
		getImagenJugador();
	}
	public void posicionBase() {
		
		MundoX = aj.tamPantalla * 30;
		MundoY = aj.tamPantalla * 40;
		velocidad = 3;
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
		if (aj.estadoCombate == false) {
			
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
			
			contadorSprite++;
			if (contadorSprite >10) {
				if (numeroSprite == 1) {
					numeroSprite =2;
				}
				else if (numeroSprite == 2) {
					numeroSprite =1;
				}
				contadorSprite = 0;
			}
			
			ColisiOn = false;
			colisionHierva = false;
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
			
			if (colisionHierva == true) {
				
				if (hiervaRand()) {	
				combate.inicializarValores();
				//combate.comenzarCombate();
				aj.estadoCombate = true;
//				if(combate.combate == true) {
//					combate.comenzarCombate();
//				}
				}
			}
		}
		}
	}
	
	public boolean hiervaRand() {
		int num = (int)Math.floor(Math.random()*100+1);
		System.out.println("Numero: "+num);
		if (num == 10) {
			return true;
		}
		return false;
	}
	
	
	public void dibujar(Graphics2D g2) {
		
		BufferedImage imagen = null;
		
		switch (direccion) {
		case "arriba":
			if (numeroSprite == 1) {
				imagen = arr_1;
			}
			if (numeroSprite == 2) {
				imagen = arr_2;
			}
			break;
		case "abajo":
			if (numeroSprite == 1) {
				imagen = abj_1;				
			}
			if (numeroSprite == 2) {
				imagen = abj_2;				
			}
			break;
		case "derecha":
			if (numeroSprite == 1) {
				imagen = der_1;
			}
			if (numeroSprite == 2) {
				imagen = der_2;
			}
			break;
		case "izquierda":
			if (numeroSprite == 1) {
				imagen = izq_1;
			}
			if (numeroSprite == 2) {
				imagen = izq_2;
			}
			break;
		}
		g2.drawImage(imagen, pantallaX-10, pantallaY-15, 32, 32, null);
	}

}