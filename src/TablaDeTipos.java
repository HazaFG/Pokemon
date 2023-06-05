
public interface TablaDeTipos {
	
	static double calcularEfectividad(Movimientos ataque, Pokemon defensor) {
		double efectividad = 1;
		
		if (ataque.tipo.equals("Electrico")) {
			switch(defensor.tipo) {
			case "Agua":
			case "Volador":
				efectividad = 2;
				break;
			case "Dragon":
			case "Electrico":
			case "Planta":
				efectividad = 0.5;
				break;
			case "Tierra":
				efectividad = 0;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Fuego")) {
			switch(defensor.tipo) {
			case "Acero":
			case "Bicho":
			case "Hielo":
			case "Planta":
				efectividad = 2;
				break;
			case "Dragon":
			case "Agua":
			case "Fuego":
			case "Roca":
				efectividad = 0.5;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Normal")) {
			switch(defensor.tipo) {
			case "Acero":
			case "Roca":
				efectividad = 0.5;
				break;
			case "Fantasma":
				efectividad = 0;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Veneno")) {
			switch(defensor.tipo) {
			case "Hada":
			case "Planta":
				efectividad = 2;
				break;
			case "Fantasma":
			case "Roca":
			case "Tierra":
			case "Veneno":
				efectividad = 0.5;
				break;
			case "Acero":
				efectividad = 0;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Fantasma")) {
			switch(defensor.tipo) {
			case "Psiquico":
			case "Fantasma":
				efectividad = 2;
				break;
			case "Siniestro":
				efectividad = 0.5;
				break;
			case "Normal":
				efectividad = 0;
				System.out.println("efecticidad nula...............");
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Lucha")) {
			switch(defensor.tipo) {
			case "Normal":
			case "Acero":
			case "Siniestro":
			case "Hielo":
			case "Roca":
				efectividad = 2;
				break;
			case "Bicho":
			case "Hada":
			case "Psiquico":
			case "Veneno":
			case "Volador":
				efectividad = 0.5;
				break;
			case "Fantasma":
				efectividad = 0;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Agua")) {
			switch(defensor.tipo) {
			case "Fuego":
			case "Roca":
			case "Tierra":
				efectividad = 2;
				break;
			case "Agua":
			case "Dragon":
			case "Planta":
				efectividad = 0.5;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		if (ataque.tipo.equals("Volador")) {
			switch(defensor.tipo) {
			case "Bicho":
			case "Planta":
			case "Tierra":
			case "Lucha":
				efectividad = 2;
				break;
			case "Acero":
			case "Electrico":
			case "Roca":
				efectividad = 0.5;
				break;
			default:
				efectividad = 1;
				break;
			}
			
		}
		
		return efectividad;
	}
}
