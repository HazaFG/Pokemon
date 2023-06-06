
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
			tileNum1 = aj.ControladorT.numTileMap[jugadorIzquiCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[jugadorDereCol][jugadorArribaFila];
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			break;
		case "abajo":
			jugadorAbajoFila = (jugadorAbajoY + jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[jugadorIzquiCol][jugadorAbajoFila];
			tileNum2 = aj.ControladorT.numTileMap[jugadorDereCol][jugadorAbajoFila];
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			break;
		case "izquierda":
			jugadorIzquiCol = (jugadorIzquiX - jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[jugadorIzquiCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[jugadorIzquiCol][jugadorAbajoFila];
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			break;
		case "derecha":
			jugadorDereCol = (jugadorDereX + jugador.velocidad)/aj.tamPantalla;
			tileNum1 = aj.ControladorT.numTileMap[jugadorDereCol][jugadorArribaFila];
			tileNum2 = aj.ControladorT.numTileMap[jugadorDereCol][jugadorAbajoFila];
			if(aj.ControladorT.tile[tileNum1].colision == true || aj.ControladorT.tile[tileNum2].colision == true) {
				jugador.ColisiOn = true;
			}
			if(aj.ControladorT.tile[tileNum1].colisionHierva == true || aj.ControladorT.tile[tileNum2].colisionHierva == true) {
				jugador.colisionHierva = true;
			}
			break;
		}
		
	}
}
