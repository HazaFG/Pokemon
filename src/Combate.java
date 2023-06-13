import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Combate {
	
	AdminitradorJuego aj;
	HiloCombate hiloCombate;

	Graphics2D g2;
	
	BufferedImage imagen,imagenPokemonAliado,imagenPokemonEnemigo;
	String nombreAliado,
			nombreEnemigo;
	
	int nivelPokemonAliado = 1,nivelPokemonEnemigo = 1;
	int vidaMax;
	int vida;
	
	int seleccion = 1;
	int seleccionAtaque = 1;
	
	Pokemon aliado;
	
	String[] nombreMovimientosAliado = new String[4];
	
	int[] maxPPMovimientosAliado = new int[4];
	
	int[] PPMovimientosAliado = new int[4];
	
	Pokemon enemigo;
	
	boolean combate = false;
	
	public Combate(AdminitradorJuego aj, Pokemon enemigo) {
		this.aj = aj;
		this.enemigo = enemigo;
		this.nombreEnemigo = enemigo.nombre;
	}
	
	//Aquí se escoge que pokemon hay de aliado y de enemigo
	public void iniciarPokemon(int pokemonAliado, int pokemonEnemigo) {
		switch (pokemonAliado) {
		
		}
		switch (pokemonEnemigo) {
		
		}
	}
	
	public void inicializarValores() {
		this.nombreAliado = aj.jugador.equipo[0].nombre;
		this.vidaMax = aj.jugador.equipo[0].maxPV;
		this.vida = aj.jugador.equipo[0].stats[0];
		this.nivelPokemonAliado = aj.jugador.equipo[0].lvl;
		this.aliado = aj.jugador.equipo[0];
		
		for (int i = 0; i < 4; i++) {
			nombreMovimientosAliado[i] = aliado.movimientos[i].nombre;
			maxPPMovimientosAliado[i] = aliado.movimientos[i].PP;
			PPMovimientosAliado[i] = aliado.movimientos[i].PP;
		}

//			try {
//				imagenPokemonAliado  = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombrePokemonAliado+"_aliado.png"));
//				imagenPokemonEnemigo = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombrePokemonEnemigo+"_enemigo.png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}
	
	public void cambiarAString() {
		
	}
	
	public void comenzarCombate() {
		combate(aj.jugador.equipo[0], new Poliwag());
	}
	
	public boolean huidaRand() {
		int num = (int)Math.floor(Math.random()*6+1);
		System.out.println("Numero: "+num);
		if (num == 1) {
			return true;
		}
		return false;
	}
	

public void dibujar(Graphics2D g2) {
		inicializarValores();
		
		int fontSize = 18;
		hiloCombate = new HiloCombate(aj);
		
		try {
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Fondo.png"));
			g2.drawImage(imagen, 0, 0, 800, 800, null);
			
			
			imagenPokemonAliado  = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombreAliado+"_aliado.png"));
			imagenPokemonEnemigo = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombreEnemigo+"_enemigo.png"));
			
			g2.drawImage(imagenPokemonAliado, 100, 380, 200, 200, null);
			
			g2.drawImage(imagenPokemonEnemigo, 500, 300, 150, 150, null);
			
			switch(seleccion) {
			case 1:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque.png"));
				if (aj.teclas.abajo == true && aj.teclas.aceptar == false){
					seleccion = 3;
				}else if(aj.teclas.dere == true && aj.teclas.aceptar == false) {
					seleccion = 2;
				}
				
				if(aj.teclas.aceptar == true) {
//					comenzarCombate();
//					aj.teclas.aceptar = false;
					aj.stopCombate = true;
					
					if((aliado.stats[0] > 0 && enemigo.stats[0] > 0)) {
						
						try {
							
							switch(seleccionAtaque) {
							case 1:
								imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_1.png"));
								if (aj.teclas.abajo == true){
									seleccionAtaque = 3;
								}else if(aj.teclas.dere == true) {
									seleccionAtaque = 2;
								}
								
								if(aj.teclas.espacio) {

									ataques(aliado, enemigo, seleccionAtaque);

								}
								break;
							case 2:
								imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_2.png"));
								if (aj.teclas.abajo == true){
									seleccionAtaque = 4;
								}else if(aj.teclas.izqui == true) {
									seleccionAtaque = 1;
								}
								
								if(aj.teclas.espacio) {

									ataques(aliado, enemigo, seleccionAtaque);

								}
								break;
							case 3:
								imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_3.png"));
								if (aj.teclas.arriba == true){
									seleccionAtaque = 1;
								}else if(aj.teclas.dere == true) {
									seleccionAtaque = 4;
								}
								
								if(aj.teclas.espacio) {
									ataques(aliado, enemigo, seleccionAtaque);
								}
								break;
							case 4:
								imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_4.png"));
								if (aj.teclas.arriba == true){
									seleccionAtaque = 2;
								}else if(aj.teclas.izqui == true) {
									seleccionAtaque = 3;
								}
								
								if(aj.teclas.espacio) {

									ataques(aliado, enemigo, seleccionAtaque);

								}
								break;
							}		
							
							aj.teclas.aceptar = true;
							
							if (aj.teclas.cancelar)
								aj.teclas.cancelar = true;
								//aj.teclas.aceptar = false;
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					if(aj.teclas.cancelar) {
						aj.stopCombate = false;
						aj.teclas.aceptar = false;
					}
					
				}else {
					combate = false;
					//System.out.println(combate);
				}
				break;
			case 2:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_pokemon.png"));
				if (aj.teclas.abajo == true){
					seleccion = 4;
				}else if(aj.teclas.izqui == true) {
					seleccion = 1;
				}
				
				break;
			case 3:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_objetos.png"));
				if (aj.teclas.arriba == true){
					seleccion = 1;
				}else if(aj.teclas.dere == true) {
					seleccion = 4;
				}
				break;
			case 4:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_huida.png"));
				if (aj.teclas.arriba == true){
					seleccion = 2;
				}else if(aj.teclas.izqui == true) {
					seleccion = 3;
				}
					
				if(aj.teclas.aceptar == true && !aj.pause) {
					hiloCombate.run();
					if (huidaRand()) {
						aj.estadoCombate = false;
						System.out.println("okjajaja");
					}else {
						System.out.println("No se pudo jaja");
						ataqueEnemigo(aliado, enemigo);
					}
				}
				break;
			}			
			g2.drawImage(imagen, 0, 580, 800, 220, null);
			
			
	        Font font = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize);
	        g2.setFont(font);
	        g2.setColor(Color.DARK_GRAY);
			
			g2.drawString(""+vidaMax,760,550);
			g2.drawString(""+vida,705,550);
			g2.drawString(nombreAliado,510,530);
			
			g2.drawString(nombreEnemigo,60,255);
			
			Font font2 = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize+4);
	        g2.setFont(font2);
			g2.drawString(""+nivelPokemonAliado,570,550);
			g2.drawString(""+nivelPokemonEnemigo,125,275);
			
			if (aj.stopCombate) {
				g2.setColor(Color.BLACK);
				Font font3 = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize+2);
				g2.setFont(font3);
				
				//ATAQUES, TIPO DE ATAQUE Y PP
				
				g2.drawString(""+maxPPMovimientosAliado[seleccionAtaque-1],655,640);
				g2.drawString(""+PPMovimientosAliado[seleccionAtaque-1],715,640);
				
				g2.drawString(""+nombreMovimientosAliado[0],60,643);
				g2.drawString(""+nombreMovimientosAliado[1],335,643);
				g2.drawString(""+nombreMovimientosAliado[2],60,737);
				g2.drawString(""+nombreMovimientosAliado[3],335,737);
				
				switch (aliado.movimientos[seleccionAtaque-1].tipo) {
				case "Normal":
					g2.setColor(Color.DARK_GRAY);
					break;
				case "Electrico":
					g2.setColor(Color.YELLOW);
					break;
				case "Lucha":
					g2.setColor(Color.decode("#B35ABB"));
					break;
				case "Fuego":
					g2.setColor(Color.decode("#FF0000"));
					break;
				case "Veneno":
					g2.setColor(Color.decode("#68FF00"));
					break;
				case "Fantasma":
					g2.setColor(Color.decode("#63FFF3"));
					break;
				case "Agua":
					g2.setColor(Color.decode("#0800FF"));
					break;
				case "Volador":
					g2.setColor(Color.decode("#D2FF7C"));
					break;
				}
				g2.drawString(aliado.movimientos[seleccionAtaque-1].tipo, 640,760);
 
			}
			
			
			
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

public void combate(Pokemon aliado, Pokemon enemigo) {
//	Scanner lector = new Scanner(System.in);
//
//	System.out.println(enemigo.nombre+" PV: "+enemigo.maxPV);
//	System.out.println(aliado.nombre+" PV: "+aliado.maxPV);
	if((aliado.stats[0] > 0 && enemigo.stats[0] > 0) && !aj.teclas.cancelar) {
		int seleccionAtaque = 1;

		try {
			switch(seleccionAtaque) {
			case 1:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_1.png"));
				if (aj.teclas.abajo == true){
					seleccionAtaque = 3;
				}else if(aj.teclas.dere == true) {
					seleccionAtaque = 2;
				}
				
				if(aj.teclas.aceptar == true) {
					ataques(aliado, enemigo, seleccionAtaque);
				}
				break;
			case 2:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_1.png"));
				if (aj.teclas.abajo == true){
					seleccionAtaque = 4;
				}else if(aj.teclas.izqui == true) {
					seleccionAtaque = 1;
				}
				
				if(aj.teclas.aceptar == true) {
					ataques(aliado, enemigo, seleccionAtaque);
				}
				break;
			case 3:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_1.png"));
				if (aj.teclas.arriba == true){
					seleccionAtaque = 1;
				}else if(aj.teclas.dere == true) {
					seleccionAtaque = 4;
				}
				
				if(aj.teclas.aceptar == true) {
					ataques(aliado, enemigo, seleccionAtaque);
				}
				break;
			case 4:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque_1.png"));
				if (aj.teclas.arriba == true){
					seleccionAtaque = 2;
				}else if(aj.teclas.izqui == true) {
					seleccionAtaque = 3;
				}
				
				if(aj.teclas.aceptar == true) {
					ataques(aliado, enemigo, seleccionAtaque);
				}
				break;
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for (int i = 0; i < aliado.movimientos.length; i++) {
//			System.out.println((i+1)+": "+aliado.movimientos[i].nombre);				
//		}

		//System.out.println("\nSeleccione un ataque: ");

		//int seleccion = lector.nextInt();

		//System.out.println("ataque seleccionado: "+aliado.movimientos[seleccion-1].nombre);

		//ataques(aliado, enemigo, seleccionAtaque);

	}
}

public void ataques(Pokemon aliado, Pokemon enemigo, int seleccion) {

	if(aliado.stats[5] > enemigo.stats[5]) {
		System.out.println("Aliado ataca primero");

		System.out.println("Vida de "+enemigo.nombre+": "+enemigo.recibirDaño(aliado.movimientos[seleccion-1].calcularDaño(aliado, enemigo)));
		if(enemigo.stats[0] <= 0) {
			System.out.println("El combate acaba, gana: "+aliado.nombre);
		}else {
			ataqueEnemigo(aliado, enemigo);

			if(aliado.stats[0] <= 0) {
				System.out.println("El combate acaba, gana: "+enemigo.nombre);
			}
		}
	}else {
		System.out.println("Enemigo ataca primero");

		ataqueEnemigo(aliado, enemigo);
		if(aliado.stats[0] <= 0) {
			System.out.println("El combate acaba, gana: "+enemigo.nombre);
		}else {
			System.out.println("Vida de "+enemigo.nombre+": "+enemigo.recibirDaño(aliado.movimientos[seleccion-1].calcularDaño(aliado, enemigo)));

			if(enemigo.stats[0] <= 0) {
				System.out.println("El combate acaba, gana: "+aliado.nombre);
			}
		}
	}

}

public void ataqueEnemigo(Pokemon aliado, Pokemon enemigo) {
	Random random = new Random();

	int ataque = random.nextInt(2);
	System.out.println("Vida de "+aliado.nombre+": "+aliado.recibirDaño(enemigo.movimientos[ataque].calcularDaño(enemigo, aliado)));


}

}