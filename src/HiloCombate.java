public class HiloCombate implements Runnable {

	int aux = 0;
	AdminitradorJuego aj;
	
	public HiloCombate (AdminitradorJuego aj) {
	this.aj = aj;
	}
	
	public void run() {
		try {
			Thread.sleep(500);
			aj.stopCombate = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aj.stopCombate = false;
	}

}