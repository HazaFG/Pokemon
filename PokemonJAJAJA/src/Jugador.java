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
	
	public boolean colisionEntrada1 = false;
	public boolean colisionSalida1 = false;
	
	public boolean colisionEntrada2 = false;
	public boolean colisionSalida2 = false;
	
	public boolean colisionEntrada3 = false;
	public boolean colisionSalida3 = false;
	
	public boolean colisionEntrada4 = false;
	public boolean colisionSalida4 = false;
	
	public boolean colisionEntrada5 = false;
	public boolean colisionSalida5 = false;
	
	public boolean colisionEntrada6 = false;
	public boolean colisionSalida6 = false;
	
	public boolean colisionEntrada7 = false;
	public boolean colisionSalida7 = false;
	
	public boolean colisionEntrada8 = false;
	public boolean colisionSalida8 = false;
	
	public boolean colisionEntrada9 = false;
	public boolean colisionSalida9 = false;
	
	public boolean colisionEntrada10 = false;
	public boolean colisionSalida10 = false;
	
	public boolean colisionEntrada11 = false;
	public boolean colisionSalida11 = false;
	
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
		
		Snorlax snor = new Snorlax();
		Machoke zumaya = new Machoke();
		Koffing kof = new Koffing();
		Rattata rat = new Rattata();
		Pidgey pid = new Pidgey();
		Pikachu pika = new Pikachu();
		equipo[0] = snor;
		equipo[1] = zumaya;
		equipo[2] = kof;
		equipo[3] = rat;
		equipo[4] = pid;
		equipo[5] = pika;
		
		
		posicionBase();
		getImagenJugador();
	}
	public void posicionBase() {
		
		MundoX = aj.tamPantalla * 27;
		MundoY = aj.tamPantalla * 162;
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
			
			colisionEntrada1 = false;
			colisionSalida1 = false;
			
			colisionEntrada2 = false;
			colisionSalida2 = false;
			
			colisionEntrada3 = false;
			colisionSalida3 = false;
			
			colisionEntrada4 = false;
			colisionSalida4 = false;
			
			colisionEntrada5 = false;
			colisionSalida5 = false;
			
			colisionEntrada6 = false;
			colisionSalida6 = false;
			
			colisionEntrada7 = false;
			colisionSalida7 = false;
			
			colisionEntrada8 = false;
			colisionSalida8 = false;
			
			colisionEntrada9 = false;
			colisionSalida9 = false;
			
			colisionEntrada10 = false;
			colisionSalida10 = false;
			
			colisionEntrada11 = false;
			colisionSalida11 = false;
			
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
				combate.setEnemigo(new Poliwag());
				//combate.comenzarCombate();
				aj.estadoCombate = true;
//				if(combate.combate == true) {
//					combate.comenzarCombate();
//				}
				}
			}
			
			//LABORATRIO
			if (colisionEntrada1 == true) {
				aj.mapaActual = 1;
				MundoX = aj.tamPantalla * 10;
				MundoY = aj.tamPantalla * 10;
			} 
			if(colisionSalida1 == true) {
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 120;
				aj.mapaActual = 0;
				
			}
			//CASA RIVAL
			if (colisionEntrada2 == true) {
				aj.mapaActual = 2;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 120;
			}
			if(colisionSalida2 == true) {
				MundoX = aj.tamPantalla * 30;
				MundoY = aj.tamPantalla * 110;
				aj.mapaActual = 0;
			}
			//CASA JUGADOR
			if (colisionEntrada3 == true) {
				aj.mapaActual = 3;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			}
			if(colisionSalida3 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 50;
				MundoY = aj.tamPantalla * 100;
			}
			//CENTRO POKEMON 1
			if (colisionEntrada4 == true) {
				aj.mapaActual = 4;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 
			if(colisionSalida4 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 20;
				MundoY = aj.tamPantalla * 90;
			}
			//TIENDA 1
			if (colisionEntrada5 == true) {
				aj.mapaActual = 5;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 
			if(colisionSalida5 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 40;
				MundoY = aj.tamPantalla * 80;
			}
			//ESCUELA 1
			if (colisionEntrada6 == true) {
				aj.mapaActual = 6;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 	
			if(colisionSalida6 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 70;
				MundoY = aj.tamPantalla * 70;
			}
			//GIMNASIO 1
			if (colisionEntrada7 == true) {
				aj.mapaActual = 7;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 	
			if(colisionSalida7 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 60;
			}
			//CENTRO POKEMON 2
			if (colisionEntrada8 == true) {
				aj.mapaActual = 8;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			}
			if(colisionSalida8 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 50;
			}
			//TIENDA 2
			if (colisionEntrada9 == true) {
				aj.mapaActual = 9;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			}
			if (colisionSalida9 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 40;
			}
			//GIMNASIO 2
			if (colisionEntrada10 == true) {
				aj.mapaActual = 10;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 	
			if(colisionSalida10 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 30;
			}
			//MUSEO
			if (colisionEntrada11 == true) {
				aj.mapaActual = 11;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			} 	
			if(colisionSalida11 == true) {
				aj.mapaActual = 0;
				MundoX = aj.tamPantalla * 27;
				MundoY = aj.tamPantalla * 20;
			}
			
		}
		
		}
	}
	
	public boolean hiervaRand() {
//		int num = (int)Math.floor(Math.random()*100+1);
		int num = (int)Math.floor(Math.random()*2+1);
		System.out.println("Numero: "+num);
		if (num == 1) {
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
		g2.drawImage(imagen, pantallaX-10, pantallaY-15, 50, 50, null);
	}

}