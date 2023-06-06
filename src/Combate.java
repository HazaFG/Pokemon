import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Combate {
	
	AdminitradorJuego aj;

	Graphics2D g2;
	
	BufferedImage imagen,imagenPokemonAliado,imagenPokemonEnemigo;
	String nombrePokemonAliado = "Poliwag", nombrePokemonEnemigo = "Poliwag";
	int nivelPokemonAliado = 1,nivelPokemonEnemigo = 1;
	int vidaMax = 10;
	int vida = 100;
	
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
	
	public void inicializarValores(String nombrePokemonAliado,String nombrePokemonEnemigo, int vidaMax, int vida) {
		this.nombrePokemonAliado = nombrePokemonAliado;
		this.vidaMax = vidaMax;
		this.vida = vida;

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
		
	}

public void dibujar(Graphics2D g2) {
		
		
		int fontSize = 18;
		try {
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Fondo.png"));
			g2.drawImage(imagen, 0, 0, 800, 800, null);
			
			
			imagenPokemonAliado  = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombrePokemonAliado+"_aliado.png"));
			imagenPokemonEnemigo = ImageIO.read(getClass().getResourceAsStream("/Batalla/"+nombrePokemonEnemigo+"_enemigo.png"));
			
			g2.drawImage(imagenPokemonAliado, 100, 380, 200, 200, null);
			
			g2.drawImage(imagenPokemonEnemigo, 500, 300, 150, 150, null);
			
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Menu_ataque.png"));
			g2.drawImage(imagen, 0, 580, 800, 220, null);
			
			
	        Font font = new Font("Copperplate Gothic Bold", Font.BOLD, fontSize);
	        g2.setFont(font);
	        g2.setColor(Color.DARK_GRAY);
			
			g2.drawString(""+vidaMax,760,550);
			g2.drawString(""+vida,705,550);
			g2.drawString(nombrePokemonAliado,510,530);
			
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

}