import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;


public class Sound {

	Clip clip;
	
	URL soundURL[] = new URL[30];
	
	public Sound () {
		
		soundURL[0] = getClass().getResource("/sound/background.wav");
		soundURL[1] = getClass().getResource("/sound/dinerito.wav");
		soundURL[2] = getClass().getResource("/sound/speak.wav");
		soundURL[3] = getClass().getResource("/sound/pasos.wav");
		soundURL[4] = getClass().getResource("/sound/abrirPuerta.wav");
		soundURL[5] = getClass().getResource("/sound/interiorTienda.wav");
		soundURL[6] = getClass().getResource("/sound/gym.wav");
		soundURL[7] = getClass().getResource("/sound/oak.wav");
		soundURL[8] = getClass().getResource("/sound/pc.wav");
		soundURL[9] = getClass().getResource("/sound/tema.wav");
		soundURL[10] = getClass().getResource("/sound/casitaHumilde.wav");
	}
	
	public void setFile(int i) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
			
		}catch(Exception e) {
			
		}
	}
	
	public void play() {
		
		clip.start();
	}
	
	public void loop() {
		
		clip.loop(clip.LOOP_CONTINUOUSLY);
	}
	
	public void stop() {
		
		clip.stop();
	}
}
