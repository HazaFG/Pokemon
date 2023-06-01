
public interface TablaDeTipos {
	
	static double calcularEfectividad(Movimientos ataque, Pokemon defensor) {
		double efectividad = 1;
		
		if (ataque.tipo.equals("Electrico")) {
			switch(defensor.tipo) {
			case "Agua":
				efectividad = 2;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}else {
			//System.out.println("Efectividad neutra");
		}
		
//		System.out.println("Efectividad: "+efectividad);
		
//		if(ataque.tipo.equals("Electrico") && defensor.tipo.equals("Agua")) {
//			efectividad = 2;
//		}else {
//			efectividad = 1;
//		}
		
		return efectividad;
	}
}
