
public class Colision {
	
	AdminitradorJuego aj;
	
	public Colision(AdminitradorJuego aj) {
		
		this.aj = aj;
		
	}
	
	public void revisarTile(Jugador jugador) {
		
		int jugadorIzquiX = jugador.MundoX + jugador.hitBox.x;
		int jugadorDereX = jugador.MundoX + jugador.hitBox.x + jugador.hitBox.width;
		
		int jugadorArribaY = jugador.MundoY + jugador.hitBox.y;
		int jugadorAbajoY = jugador.MundoY + jugador.hitBox.y + jugador.hitBox.height;
		
		int jugadorIzquiCol = jugadorIzquiX/aj.tamPantalla;
		int jugadorDereCol = jugadorDereX/aj.tamPantalla;
		int jugadorArribaFila = jugadorArribaY/aj.tamPantalla;
		int jugadorAbajoFila = jugadorAbajoY/aj.tamPantalla;
		
		int tileNum1, tileNum2;
		
		switch(jugador.direccion) {
		case "arriba":
			jugadorArribaFila = (jugadorArribaY - jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorIzquiCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorDereCol][jugadorArribaFila];
			
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada1 == true || aj.ControladorT.tile[tileNum2].colisionEntrada1 == true) {
				jugador.colisionEntrada1 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida1 == true || aj.ControladorT.tile[tileNum2].colisionSalida1 == true) {
				jugador.colisionSalida1 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada2 == true || aj.ControladorT.tile[tileNum2].colisionEntrada2 == true) {
				jugador.colisionEntrada2 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida2 == true || aj.ControladorT.tile[tileNum2].colisionSalida2 == true) {
				jugador.colisionSalida2 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada3 == true || aj.ControladorT.tile[tileNum2].colisionEntrada3 == true) {
				jugador.colisionEntrada3 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida3 == true || aj.ControladorT.tile[tileNum2].colisionSalida3 == true) {
				jugador.colisionSalida3 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada4 == true || aj.ControladorT.tile[tileNum2].colisionEntrada4 == true) {
				jugador.colisionEntrada4 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida4 == true || aj.ControladorT.tile[tileNum2].colisionSalida4 == true) {
				jugador.colisionSalida4 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada5 == true || aj.ControladorT.tile[tileNum2].colisionEntrada5 == true) {
				jugador.colisionEntrada5 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida5 == true || aj.ControladorT.tile[tileNum2].colisionSalida5 == true) {
				jugador.colisionSalida5 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada6 == true || aj.ControladorT.tile[tileNum2].colisionEntrada6 == true) {
				jugador.colisionEntrada6 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida6 == true || aj.ControladorT.tile[tileNum2].colisionSalida6 == true) {
				jugador.colisionSalida6 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada7 == true || aj.ControladorT.tile[tileNum2].colisionEntrada7 == true) {
				jugador.colisionEntrada7 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida7 == true || aj.ControladorT.tile[tileNum2].colisionSalida7 == true) {
				jugador.colisionSalida7 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada8 == true || aj.ControladorT.tile[tileNum2].colisionEntrada8 == true) {
				jugador.colisionEntrada8 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida8 == true || aj.ControladorT.tile[tileNum2].colisionSalida8 == true) {
				jugador.colisionSalida8 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada9 == true || aj.ControladorT.tile[tileNum2].colisionEntrada9 == true) {
				jugador.colisionEntrada9 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida9 == true || aj.ControladorT.tile[tileNum2].colisionSalida9 == true) {
				jugador.colisionSalida9 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada10 == true || aj.ControladorT.tile[tileNum2].colisionEntrada10 == true) {
				jugador.colisionEntrada10 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida10 == true || aj.ControladorT.tile[tileNum2].colisionSalida10 == true) {
				jugador.colisionSalida10 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada11 == true || aj.ControladorT.tile[tileNum2].colisionEntrada11 == true) {
				jugador.colisionEntrada11 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida11 == true || aj.ControladorT.tile[tileNum2].colisionSalida11 == true) {
				jugador.colisionSalida11 = true;
			}
			
			break;
			
		case "abajo":
			jugadorAbajoFila = (jugadorAbajoY + jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorIzquiCol][jugadorAbajoFila];
			tileNum2 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorDereCol][jugadorAbajoFila];
			
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada1 == true || aj.ControladorT.tile[tileNum2].colisionEntrada1 == true) {
				jugador.colisionEntrada1 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida1 == true || aj.ControladorT.tile[tileNum2].colisionSalida1 == true) {
				jugador.colisionSalida1 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada2 == true || aj.ControladorT.tile[tileNum2].colisionEntrada2 == true) {
				jugador.colisionEntrada2 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida2 == true || aj.ControladorT.tile[tileNum2].colisionSalida2 == true) {
				jugador.colisionSalida2 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada3 == true || aj.ControladorT.tile[tileNum2].colisionEntrada3 == true) {
				jugador.colisionEntrada3 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida3 == true || aj.ControladorT.tile[tileNum2].colisionSalida3 == true) {
				jugador.colisionSalida3 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada4 == true || aj.ControladorT.tile[tileNum2].colisionEntrada4 == true) {
				jugador.colisionEntrada4 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida4 == true || aj.ControladorT.tile[tileNum2].colisionSalida4 == true) {
				jugador.colisionSalida4 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada5 == true || aj.ControladorT.tile[tileNum2].colisionEntrada5 == true) {
				jugador.colisionEntrada5 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida5 == true || aj.ControladorT.tile[tileNum2].colisionSalida5 == true) {
				jugador.colisionSalida5 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada6 == true || aj.ControladorT.tile[tileNum2].colisionEntrada6 == true) {
				jugador.colisionEntrada6 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida6 == true || aj.ControladorT.tile[tileNum2].colisionSalida6 == true) {
				jugador.colisionSalida6 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada7 == true || aj.ControladorT.tile[tileNum2].colisionEntrada7 == true) {
				jugador.colisionEntrada7 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida7 == true || aj.ControladorT.tile[tileNum2].colisionSalida7 == true) {
				jugador.colisionSalida7 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada8 == true || aj.ControladorT.tile[tileNum2].colisionEntrada8 == true) {
				jugador.colisionEntrada8 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida8 == true || aj.ControladorT.tile[tileNum2].colisionSalida8 == true) {
				jugador.colisionSalida8 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada9 == true || aj.ControladorT.tile[tileNum2].colisionEntrada9 == true) {
				jugador.colisionEntrada9 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida9 == true || aj.ControladorT.tile[tileNum2].colisionSalida9 == true) {
				jugador.colisionSalida9 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada10 == true || aj.ControladorT.tile[tileNum2].colisionEntrada10 == true) {
				jugador.colisionEntrada10 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida10 == true || aj.ControladorT.tile[tileNum2].colisionSalida10 == true) {
				jugador.colisionSalida10 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada11 == true || aj.ControladorT.tile[tileNum2].colisionEntrada11 == true) {
				jugador.colisionEntrada11 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida11 == true || aj.ControladorT.tile[tileNum2].colisionSalida11 == true) {
				jugador.colisionSalida11 = true;
			}
			
			break;
		case "izquierda":
			jugadorIzquiCol = (jugadorIzquiX - jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorIzquiCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorIzquiCol][jugadorAbajoFila];
			
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada1 == true || aj.ControladorT.tile[tileNum2].colisionEntrada1 == true) {
				jugador.colisionEntrada1 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida1 == true || aj.ControladorT.tile[tileNum2].colisionSalida1 == true) {
				jugador.colisionSalida1 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada2 == true || aj.ControladorT.tile[tileNum2].colisionEntrada2 == true) {
				jugador.colisionEntrada2 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida2 == true || aj.ControladorT.tile[tileNum2].colisionSalida2 == true) {
				jugador.colisionSalida2 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada3 == true || aj.ControladorT.tile[tileNum2].colisionEntrada3 == true) {
				jugador.colisionEntrada3 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida3 == true || aj.ControladorT.tile[tileNum2].colisionSalida3 == true) {
				jugador.colisionSalida3 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada4 == true || aj.ControladorT.tile[tileNum2].colisionEntrada4 == true) {
				jugador.colisionEntrada4 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida4 == true || aj.ControladorT.tile[tileNum2].colisionSalida4 == true) {
				jugador.colisionSalida4 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada5 == true || aj.ControladorT.tile[tileNum2].colisionEntrada5 == true) {
				jugador.colisionEntrada5 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida5 == true || aj.ControladorT.tile[tileNum2].colisionSalida5 == true) {
				jugador.colisionSalida5 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada6 == true || aj.ControladorT.tile[tileNum2].colisionEntrada6 == true) {
				jugador.colisionEntrada6 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida6 == true || aj.ControladorT.tile[tileNum2].colisionSalida6 == true) {
				jugador.colisionSalida6 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada7 == true || aj.ControladorT.tile[tileNum2].colisionEntrada7 == true) {
				jugador.colisionEntrada7 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida7 == true || aj.ControladorT.tile[tileNum2].colisionSalida7 == true) {
				jugador.colisionSalida7 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada8 == true || aj.ControladorT.tile[tileNum2].colisionEntrada8 == true) {
				jugador.colisionEntrada8 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida8 == true || aj.ControladorT.tile[tileNum2].colisionSalida8 == true) {
				jugador.colisionSalida8 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada9 == true || aj.ControladorT.tile[tileNum2].colisionEntrada9 == true) {
				jugador.colisionEntrada9 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida9 == true || aj.ControladorT.tile[tileNum2].colisionSalida9 == true) {
				jugador.colisionSalida9 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada10 == true || aj.ControladorT.tile[tileNum2].colisionEntrada10 == true) {
				jugador.colisionEntrada10 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida10 == true || aj.ControladorT.tile[tileNum2].colisionSalida10 == true) {
				jugador.colisionSalida10 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada11 == true || aj.ControladorT.tile[tileNum2].colisionEntrada11 == true) {
				jugador.colisionEntrada11 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida11 == true || aj.ControladorT.tile[tileNum2].colisionSalida11 == true) {
				jugador.colisionSalida11 = true;
			}
			
			break;
		case "derecha":
			jugadorDereCol = (jugadorDereX + jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorDereCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[aj.mapaActual][jugadorDereCol][jugadorAbajoFila];
			
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada1 == true || aj.ControladorT.tile[tileNum2].colisionEntrada1 == true) {
				jugador.colisionEntrada1 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida1 == true || aj.ControladorT.tile[tileNum2].colisionSalida1 == true) {
				jugador.colisionSalida1 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada2 == true || aj.ControladorT.tile[tileNum2].colisionEntrada2 == true) {
				jugador.colisionEntrada2 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida2 == true || aj.ControladorT.tile[tileNum2].colisionSalida2 == true) {
				jugador.colisionSalida2 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada3 == true || aj.ControladorT.tile[tileNum2].colisionEntrada3 == true) {
				jugador.colisionEntrada3 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida3 == true || aj.ControladorT.tile[tileNum2].colisionSalida3 == true) {
				jugador.colisionSalida3 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada4 == true || aj.ControladorT.tile[tileNum2].colisionEntrada4 == true) {
				jugador.colisionEntrada4 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida4 == true || aj.ControladorT.tile[tileNum2].colisionSalida4 == true) {
				jugador.colisionSalida4 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada5 == true || aj.ControladorT.tile[tileNum2].colisionEntrada5 == true) {
				jugador.colisionEntrada5 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida5 == true || aj.ControladorT.tile[tileNum2].colisionSalida5 == true) {
				jugador.colisionSalida5 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada6 == true || aj.ControladorT.tile[tileNum2].colisionEntrada6 == true) {
				jugador.colisionEntrada6 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida6 == true || aj.ControladorT.tile[tileNum2].colisionSalida6 == true) {
				jugador.colisionSalida6 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada7 == true || aj.ControladorT.tile[tileNum2].colisionEntrada7 == true) {
				jugador.colisionEntrada7 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida7 == true || aj.ControladorT.tile[tileNum2].colisionSalida7 == true) {
				jugador.colisionSalida7 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada8 == true || aj.ControladorT.tile[tileNum2].colisionEntrada8 == true) {
				jugador.colisionEntrada8 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida8 == true || aj.ControladorT.tile[tileNum2].colisionSalida8 == true) {
				jugador.colisionSalida8 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada9 == true || aj.ControladorT.tile[tileNum2].colisionEntrada9 == true) {
				jugador.colisionEntrada9 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida9 == true || aj.ControladorT.tile[tileNum2].colisionSalida9 == true) {
				jugador.colisionSalida9 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada10 == true || aj.ControladorT.tile[tileNum2].colisionEntrada10 == true) {
				jugador.colisionEntrada10 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida10 == true || aj.ControladorT.tile[tileNum2].colisionSalida10 == true) {
				jugador.colisionSalida10 = true;
			}
			
			if(aj.ControladorT.tile[tileNum1].colisionEntrada11 == true || aj.ControladorT.tile[tileNum2].colisionEntrada11 == true) {
				jugador.colisionEntrada11 = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionSalida11 == true || aj.ControladorT.tile[tileNum2].colisionSalida11 == true) {
				jugador.colisionSalida11 = true;
			}
			
			break;
		}
		
	}
}
