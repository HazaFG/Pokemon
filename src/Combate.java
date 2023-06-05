import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Combate {

	Graphics2D g2;
	
	public Combate() {
		
	}
	
	public void comenzarCombate() {
		
	}

public void dibujar(Graphics2D g2) {
		BufferedImage imagen;
		try {
			imagen  = ImageIO.read(getClass().getResourceAsStream("/Jugador/Arriba_1.png"));
			g2.drawImage(imagen, 0, 0, 128, 128, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

}
}
