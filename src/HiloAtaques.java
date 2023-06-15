public class HiloAtaques implements Runnable {

	int aux = 0;
	AdminitradorJuego aj;
	
	public HiloAtaques (AdminitradorJuego aj) {
	this.aj = aj;
	}
	
	public void run() {
		try {
			for (int i= 0;i<10;i++) {
				aj.pokemonAliadoX +=1;
				aj.pokemonAliadoY +=1;
			}
			for (int i= 0;i<10;i++) {
				aj.pokemonAliadoX -=1;
				aj.pokemonAliadoY -=1;
			}
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

