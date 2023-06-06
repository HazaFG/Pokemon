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

	Graphics2D g2;
	
	BufferedImage imagen,imagenPokemonAliado,imagenPokemonEnemigo;
	String nombreAliado,
			nombrePokemonEnemigo = "Poliwag";
	
	int nivelPokemonAliado = 1,nivelPokemonEnemigo = 1;
	int vidaMax;
	int vida;
	
	int seleccion = 1;
	
	Pokemon aliado;
	Pokemon enemigo;
	
	public Combate(AdminitradorJuego aj) {
		this.aj = aj;
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
		
		Poliwag poli = new Poliwag();
		this.enemigo = poli;
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
		//combate(aj.jugador.equipo[0], new Poliwag(), aj, imagen, g2);
	}

public void dibujar(Graphics2D g2) {
		inicializarValores();
		
		int fontSize = 18;
		try {
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Fondo.png"));
			g2.drawImage(imagen, 0, 0, 800, 800, null);
			
			
			imagenPokemonAliado  = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombreAliado+"_aliado.png"));
			imagenPokemonEnemigo = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombrePokemonEnemigo+"_enemigo.png"));
			
			g2.drawImage(imagenPokemonAliado, 100, 380, 200, 200, null);
			
			g2.drawImage(imagenPokemonEnemigo, 500, 300, 150, 150, null);
			
			switch(seleccion) {
			case 1:
				imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque.png"));
				if (aj.teclas.abajo == true){
					seleccion = 3;
				}else if(aj.teclas.dere == true) {
					seleccion = 2;
				}
				
				if(aj.teclas.aceptar == true) {
					
					while((aliado.stats[0] > 0 && enemigo.stats[0] > 0) && aj.teclas.cancelar != true) {

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
						
//						for (int i = 0; i < aliado.movimientos.length; i++) {
//							System.out.println((i+1)+": "+aliado.movimientos[i].nombre);				
//						}

						//System.out.println("\nSeleccione un ataque: ");

						//int seleccion = lector.nextInt();

						//System.out.println("ataque seleccionado: "+aliado.movimientos[seleccion-1].nombre);

						ataques(aliado, enemigo, seleccionAtaque);

					}
					
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
				break;
			}			
			g2.drawImage(imagen, 0, 580, 800, 220, null);
			
			
	        Font font = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize);
	        g2.setFont(font);
	        g2.setColor(Color.DARK_GRAY);
			
			g2.drawString(""+vidaMax,760,550);
			g2.drawString(""+vida,705,550);
			g2.drawString(nombreAliado,510,530);
			
			g2.drawString(nombrePokemonEnemigo,60,255);
			
			Font font2 = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize+4);
	        g2.setFont(font2);
			g2.drawString(""+nivelPokemonAliado,570,550);
			g2.drawString(""+nivelPokemonEnemigo,125,275);
			
			
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

public void combate(Pokemon aliado, Pokemon enemigo, AdminitradorJuego aj, BufferedImage imagen, Graphics2D g2) {

//	Scanner lector = new Scanner(System.in);
//
//	System.out.println(enemigo.nombre+" PV: "+enemigo.maxPV);
//	System.out.println(aliado.nombre+" PV: "+aliado.maxPV);
	
	while((aliado.stats[0] > 0 && enemigo.stats[0] > 0) && !aj.teclas.cancelar) {

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

		ataques(aliado, enemigo, seleccionAtaque);

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
