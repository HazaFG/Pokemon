import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Combate {

	Graphics2D g2;
	
	String nombrePokemonAliado = "Growlithe", nombrePokemonEnemigo = "Growlithe";
	int nivelPokemonAliado = 1,nivelPokemonEnemigo = 1;
	int vidaMax = 10;
	int vida = 100;
	
	public Combate() {
		
	}
	
	public void inicializarValores(String nombrePokemonAliado, int vidaMax, int vida) {
		this.nombrePokemonAliado = nombrePokemonAliado;
		this.vidaMax = vidaMax;
		this.vida = vida;
	}
	
	public void cambiarAString() {
		
	}
	
	public void comenzarCombate() {
		
	}

public void dibujar(Graphics2D g2) {
		BufferedImage imagen;
		int fontSize = 18;
		try {
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Batalla/Fondo.png"));
			g2.drawImage(imagen, 0, 0, 800, 800, null);
			
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
