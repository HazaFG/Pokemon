import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class ControladorTile {
	
	AdminitradorJuego aj;
	public Tile[] tile;
	public int numTileMap[][][];

	public ControladorTile(AdminitradorJuego aj) {
		
		this.aj = aj;
		
		tile = new Tile[1500];
		numTileMap = new int[aj.maximoMapa][aj.mundoCol][aj.mundoFil];
		
		cargarTile();
		cargarMapa("/mapas/mapa1.txt", 0);
		cargarMapa("/mapas/laboratorio.txt", 1);
		cargarMapa("/mapas/casaRival.txt", 2);
		cargarMapa("/mapas/casaJugador.txt", 3);
		cargarMapa("/mapas/centroPokemon1.txt", 4);
		cargarMapa("/mapas/tienda1.txt", 5);
		cargarMapa("/mapas/escuela1.txt", 6);
		cargarMapa("/mapas/gimnasio1.txt", 7);
		cargarMapa("/mapas/centroPokemon2.txt", 8);
		cargarMapa("/mapas/tienda2.txt", 9);
		cargarMapa("/mapas/gimnasio2.txt", 10);
		cargarMapa("/mapas/museo.txt", 11);
		cargarMapa("/mapas/casaJugador2piso.txt", 12);
	}
	
	public void cargarTile() {
		
		try {
			
			tile[0] = new Tile();
			tile[0].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/0.png"));
			
			tile[1] = new Tile();
			tile[1].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1.png"));
			tile[1].colision = true;
			
			tile[2] = new Tile();
			tile[2].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/2.png"));
			tile[2].colision = true;
			
			tile[3] = new Tile();
			tile[3].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/3.png"));
			tile[3].colision = true;
			
			tile[4] = new Tile();
			tile[4].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/4.png"));
			tile[4].colision = true;
			
			tile[5] = new Tile();
			tile[5].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/5.png"));
			tile[5].colision = true;
			
			tile[6] = new Tile();
			tile[6].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/6.png"));
			tile[6].colision = true;
			
			tile[7] = new Tile();
			tile[7].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/7.png"));
			tile[7].colision = true;
			
			tile[8] = new Tile();
			tile[8].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/8.png"));
			tile[8].colision = true;
			
			tile[9] = new Tile();
			tile[9].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/9.png"));
			tile[9].colision = true;
			
			tile[10] = new Tile();
			tile[10].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/10.png"));
			tile[10].colision = true;
			
			tile[11] = new Tile();
			tile[11].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/11.png"));
			tile[11].colision = true;
			
			tile[12] = new Tile();
			tile[12].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/12.png"));
			tile[12].colision = true;
			
			tile[13] = new Tile();
			tile[13].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/13.png"));
			tile[13].colision = true;
			
			tile[14] = new Tile();
			tile[14].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/14.png"));
			tile[14].colision = true;
			
			tile[15] = new Tile();
			tile[15].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/15.png"));
			tile[15].colision = true;
			
			tile[16] = new Tile();
			tile[16].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/16.png"));
			tile[16].colision = true;
			
			tile[17] = new Tile();
			tile[17].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/17.png"));
			tile[17].colision = true;
			
			tile[18] = new Tile();
			tile[18].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/18.png"));
			tile[18].colision = true;
			
			tile[19] = new Tile();
			tile[19].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/19.png"));
			tile[19].colision = true;
			
			tile[20] = new Tile();
			tile[20].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/20.png"));
			tile[20].colision = true;
			
			tile[21] = new Tile();
			tile[21].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/21.png"));
			tile[21].colision = true;
			
			tile[22] = new Tile();
			tile[22].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/22.png"));
			tile[22].colision = true;
			
			tile[23] = new Tile();
			tile[23].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/23.png"));
			tile[23].colision = true;
			
			tile[24] = new Tile();
			tile[24].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/24.png"));
			tile[24].colision = true;
			
			tile[25] = new Tile();
			tile[25].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/25.png"));
			tile[25].colision = true;
			
			tile[26] = new Tile();
			tile[26].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/26.png"));
			tile[26].colision = true;
			
			tile[27] = new Tile();
			tile[27].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/27.png"));
			tile[27].colision = true;
			
			tile[28] = new Tile();
			tile[28].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/28.png"));
			tile[28].colision = true;
			
			tile[29] = new Tile();
			tile[29].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/29.png"));
			tile[29].colision = true;
			
			tile[30] = new Tile();
			tile[30].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/30.png"));
			tile[30].colision = true;
			
			tile[31] = new Tile();
			tile[31].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/31.png"));
			tile[31].colision = true;
			
			tile[32] = new Tile();
			tile[32].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/32.png"));
			tile[32].colision = true;
			
			tile[33] = new Tile();
			tile[33].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/33.png"));
			tile[33].colision = true;
			
			tile[34] = new Tile();
			tile[34].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/34.png"));
			tile[34].colision = true;
			
			tile[35] = new Tile();
			tile[35].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/35.png"));
			tile[35].colision = true;
			
			tile[36] = new Tile();
			tile[36].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/36.png"));
			tile[36].colision = true;
			
			tile[37] = new Tile();
			tile[37].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/37.png"));
			tile[37].colision = true;
			
			tile[38] = new Tile();
			tile[38].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/38.png"));
			tile[38].colisionEntrada11 = true;
			
			tile[39] = new Tile();
			tile[39].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/39.png"));
			tile[39].colision = true;
			
			tile[40] = new Tile();
			tile[40].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/40.png"));
			tile[40].colision = true;
			
			tile[41] = new Tile();
			tile[41].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/41.png"));
			tile[41].colision = true;
			
			tile[42] = new Tile();
			tile[42].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/42.png"));
			tile[42].colision = true;
			
			tile[43] = new Tile();
			tile[43].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/43.png"));
			tile[43].colision = true;
			
			tile[44] = new Tile();
			tile[44].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/44.png"));
			tile[44].colision = true;
			
			tile[45] = new Tile();
			tile[45].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/45.png"));
			tile[45].colision = true;
			
			tile[46] = new Tile();
			tile[46].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/46.png"));
			tile[46].colision = true;
			
			tile[47] = new Tile();
			tile[47].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/47.png"));
			tile[47].colision = true;
			
			tile[48] = new Tile();
			tile[48].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/48.png"));
			tile[48].colision = true;
			
			tile[49] = new Tile();
			tile[49].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/49.png"));
			tile[49].colision = true;
			
			tile[50] = new Tile();
			tile[50].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/50.png"));
			tile[50].colision = true;
			
			tile[51] = new Tile();
			tile[51].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/51.png"));
			tile[51].colision = true;
			
			tile[52] = new Tile();
			tile[52].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/52.png"));
			tile[52].colision = true;
			
			tile[53] = new Tile();
			tile[53].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/53.png"));
			tile[53].colision = true;
			
			tile[54] = new Tile();
			tile[54].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/54.png"));
			tile[54].colision = true;
			
			tile[55] = new Tile();
			tile[55].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/55.png"));
			tile[55].colision = true;
			
			tile[56] = new Tile();
			tile[56].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/56.png"));
			tile[56].colision = true;
			
			tile[57] = new Tile();
			tile[57].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/57.png"));
			tile[57].colision = true;
			
			tile[58] = new Tile();
			tile[58].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/58.png"));
			tile[58].colision = true;
			
			tile[59] = new Tile();
			tile[59].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/59.png"));
			tile[59].colision = true;
			
			tile[60] = new Tile();
			tile[60].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/60.png"));
			tile[60].colision = true;
			
			tile[61] = new Tile();
			tile[61].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/61.png"));
			tile[61].colision = true;
			
			tile[62] = new Tile();
			tile[62].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/62.png"));
			
			tile[63] = new Tile();
			tile[63].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/63.png"));
			
			tile[64] = new Tile();
			tile[64].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/64.png"));
			
			tile[65] = new Tile();
			tile[65].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/65.png"));
			
			tile[66] = new Tile();
			tile[66].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/66.png"));
			
			tile[67] = new Tile();
			tile[67].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/67.png"));
			
			tile[68] = new Tile();
			tile[68].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/68.png"));

			tile[69] = new Tile();
			tile[69].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/69.png"));
			
			tile[70] = new Tile();
			tile[70].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/70.png"));
			
			tile[71] = new Tile();
			tile[71].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/71.png"));
	
			tile[72] = new Tile();
			tile[72].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/72.png"));
			
			tile[73] = new Tile();
			tile[73].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/73.png"));
			tile[73].colision = true;
		
			tile[74] = new Tile();
			tile[74].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/74.png"));
			tile[74].colision = true;
			
			tile[75] = new Tile();
			tile[75].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/75.png"));
			tile[75].colision = true;
			
			tile[76] = new Tile();
			tile[76].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/76.png"));
			tile[76].colision = true;
			
			tile[77] = new Tile();
			tile[77].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/77.png"));
			tile[77].colision = true;
			
			tile[78] = new Tile();
			tile[78].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/78.png"));
			
			tile[79] = new Tile();
			tile[79].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/79.png"));
			
			tile[80] = new Tile();
			tile[80].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/80.png"));
			
			tile[81] = new Tile();
			tile[81].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/81.png"));
			tile[81].colision = true;
			
			tile[82] = new Tile();
			tile[82].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/82.png"));
			tile[82].colision = true;
			
			tile[83] = new Tile();
			tile[83].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/83.png"));
			tile[83].colision = true;
			
			tile[84] = new Tile();
			tile[84].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/84.png"));
			tile[84].colision = true;
			
			tile[85] = new Tile();
			tile[85].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/85.png"));
			tile[85].colision = true;
			
			tile[86] = new Tile();
			tile[86].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/86.png"));
			tile[86].colision = true;
			
			tile[87] = new Tile();
			tile[87].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/87.png"));
			tile[87].colision = true;

			tile[88] = new Tile();
			tile[88].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/88.png"));
			tile[88].colision = true;
			
			tile[89] = new Tile();
			tile[89].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/89.png"));
			tile[89].colision = true;

			tile[90] = new Tile();
			tile[90].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/90.png"));
			tile[90].colision = true;
			
			tile[91] = new Tile();
			tile[91].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/91.png"));
			tile[91].colision = true;
			
			tile[92] = new Tile();
			tile[92].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/92.png"));
			tile[92].colision = true;
			
			tile[93] = new Tile();
			tile[93].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/93.png"));
			tile[93].colision = true;
			
			tile[94] = new Tile();
			tile[94].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/94.png"));
			tile[94].colisionEntrada10 = true;
			
			tile[95] = new Tile();
			tile[95].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/95.png"));
			tile[95].colision = true;
			
			tile[96] = new Tile();
			tile[96].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/96.png"));
			tile[96].colision = true;
			
			tile[97] = new Tile();
			tile[97].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/97.png"));
			tile[97].colision = true;
			
			tile[98] = new Tile();
			tile[98].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/98.png"));
			tile[98].colision = true;
			
			tile[99] = new Tile();
			tile[99].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/99.png"));
			tile[99].colision = true;
			
			tile[100] = new Tile();
			tile[100].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/100.png"));
			tile[100].colision = true;
			
			tile[101] = new Tile();
			tile[101].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/101.png"));
			tile[101].colision = true;
			
			tile[102] = new Tile();
			tile[102].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/102.png"));
			tile[102].colision = true;
			
			tile[103] = new Tile();
			tile[103].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/103.png"));
			tile[103].colision = true;
			
			tile[104] = new Tile();
			tile[104].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/104.png"));
			tile[104].colision = true;
			
			tile[105] = new Tile();
			tile[105].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/105.png"));
			tile[105].colision = true;
			
			tile[106] = new Tile();
			tile[106].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/106.png"));
			tile[106].colision = true;
			
			tile[107] = new Tile();
			tile[107].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/107.png"));
			tile[107].colision = true;
			
			tile[108] = new Tile();
			tile[108].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/108.png"));
			tile[108].colision = true;
			
			tile[109] = new Tile();
			tile[109].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/109.png"));
			tile[109].colision = true;
			
			tile[110] = new Tile();
			tile[110].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/110.png"));
			
			tile[111] = new Tile();
			tile[111].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/111.png"));
			
			tile[112] = new Tile();
			tile[112].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/112.png"));
			
			tile[113] = new Tile();
			tile[113].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/113.png"));
			
			tile[114] = new Tile();
			tile[114].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/114.png"));
			tile[114].colision = true;
			
			tile[115] = new Tile();
			tile[115].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/115.png"));
			tile[115].colision = true;
			
			tile[116] = new Tile();
			tile[116].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/116.png"));
			tile[116].colision = true;
			
			tile[117] = new Tile();
			tile[117].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/117.png"));
			tile[117].colision = true;
			
			tile[118] = new Tile();
			tile[118].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/118.png"));
			tile[118].colision = true;
			
			tile[119] = new Tile();
			tile[119].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/119.png"));
			tile[119].colision = true;
			
			tile[120] = new Tile();
			tile[120].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/120.png"));
			tile[120].colision = true;
			
			tile[121] = new Tile();
			tile[121].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/121.png"));
			tile[121].colision = true;
			
			tile[122] = new Tile();
			tile[122].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/122.png"));
			tile[122].colision = true;
			
			tile[123] = new Tile();
			tile[123].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/123.png"));
			tile[123].colision = true;
			
			tile[124] = new Tile();
			tile[124].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/124.png"));
			tile[124].colision = true;
			
			tile[125] = new Tile();
			tile[125].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/125.png"));
			tile[125].colision = true;
			
			tile[126] = new Tile();
			tile[126].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/126.png"));
			tile[126].colision = true;
			
			tile[127] = new Tile();
			tile[127].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/127.png"));
			tile[127].colision = true;
			
			tile[128] = new Tile();
			tile[128].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/128.png"));
			tile[128].colision = true;
			
			tile[129] = new Tile();
			tile[129].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/129.png"));
			tile[129].colision = true;
			
			tile[130] = new Tile();
			tile[130].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/130.png"));
			tile[130].colision = true;
			
			tile[131] = new Tile();
			tile[131].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/131.png"));
			tile[131].colision = true;
			
			tile[132] = new Tile();
			tile[132].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/132.png"));
			tile[132].colision = true;
			
			tile[133] = new Tile();
			tile[133].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/133.png"));
			tile[133].colision = true;
			
			tile[134] = new Tile();
			tile[134].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/134.png"));
			tile[134].colision = true;
			
			tile[135] = new Tile();
			tile[135].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/135.png"));
			tile[135].colision = true;
			
			tile[136] = new Tile();
			tile[136].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/136.png"));
			tile[136].colision = true;
			
			tile[137] = new Tile();
			tile[137].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/137.png"));
			tile[137].colision = true;
			
			tile[138] = new Tile();
			tile[138].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/138.png"));
			tile[138].colision = true;
			
			tile[139] = new Tile();
			tile[139].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/139.png"));
			tile[139].colision = true;
			
			tile[140] = new Tile();
			tile[140].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/140.png"));
			tile[140].colision = true;
			
			tile[141] = new Tile();
			tile[141].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/141.png"));
			tile[141].colision = true;
			
			tile[142] = new Tile();
			tile[142].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/142.png"));
			tile[142].colision = true;
			
			tile[143] = new Tile();
			tile[143].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/143.png"));
			tile[143].colision = true;
			
			tile[144] = new Tile();
			tile[144].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/144.png"));
			tile[144].colision = true;
			
			tile[145] = new Tile();
			tile[145].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/145.png"));
			tile[145].colision = true;
			
			tile[146] = new Tile();
			tile[146].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/146.png"));
			tile[146].colision = true;
			
			tile[147] = new Tile();
			tile[147].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/147.png"));
			tile[147].colisionEntrada9 = true;
			
			tile[148] = new Tile();
			tile[148].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/148.png"));
			tile[148].colision = true;
			
			tile[149] = new Tile();
			tile[149].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/149.png"));
			tile[149].colision = true;
			
			tile[150] = new Tile();
			tile[150].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/150.png"));
			tile[150].colision = true;
			
			tile[151] = new Tile();
			tile[151].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/151.png"));
			tile[151].colision = true;
			
			tile[152] = new Tile();
			tile[152].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/152.png"));
			tile[152].colision = true;
			
			tile[153] = new Tile();
			tile[153].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/153.png"));
			tile[153].colision = true;
			
			tile[154] = new Tile();
			tile[154].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/154.png"));
			tile[154].colision = true;
			
			tile[155] = new Tile();
			tile[155].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/155.png"));
			tile[155].colision = true;
			
			tile[156] = new Tile();
			tile[156].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/156.png"));
			tile[156].colision = true;
			
			tile[157] = new Tile();
			tile[157].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/157.png"));
			tile[157].colision = true;
			
			tile[158] = new Tile();
			tile[158].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/158.png"));
			tile[158].colision = true;
			
			tile[159] = new Tile();
			tile[159].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/159.png"));
			tile[159].colision = true;
			
			tile[160] = new Tile();
			tile[160].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/160.png"));
			tile[160].colision = true;
			
			tile[161] = new Tile();
			tile[161].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/161.png"));
			tile[161].colision = true;
			
			tile[162] = new Tile();
			tile[162].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/162.png"));
			tile[162].colision = true;
			
			tile[163] = new Tile();
			tile[163].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/163.png"));
			tile[163].colision = true;
			
			tile[164] = new Tile();
			tile[164].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/164.png"));
			tile[164].colision = true;
			
			tile[165] = new Tile();
			tile[165].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/165.png"));
			tile[165].colision = true;
			
			tile[166] = new Tile();
			tile[166].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/166.png"));
			tile[166].colision = true;
			
			tile[167] = new Tile();
			tile[167].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/167.png"));
			tile[167].colision = true;
			
			tile[168] = new Tile();
			tile[168].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/168.png"));
			tile[168].colision = true;
			
			tile[169] = new Tile();
			tile[169].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/169.png"));
			tile[169].colision = true;
			
			tile[170] = new Tile();
			tile[170].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/170.png"));
			tile[170].colision = true;
			
			tile[171] = new Tile();
			tile[171].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/171.png"));
			tile[171].colision = true;
			
			tile[172] = new Tile();
			tile[172].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/172.png"));
			tile[172].colision = true;
			
			tile[173] = new Tile();
			tile[173].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/173.png"));
			tile[173].colision = true;
			
			tile[174] = new Tile();
			tile[174].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/174.png"));
			tile[174].colision = true;
			
			tile[175] = new Tile();
			tile[175].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/175.png"));
			tile[175].colision = true;
			
			tile[176] = new Tile();
			tile[176].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/176.png"));
			tile[176].colision = true;
			
			tile[177] = new Tile();
			tile[177].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/177.png"));
			tile[177].colision = true;
			
			tile[178] = new Tile();
			tile[178].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/178.png"));
			tile[178].colision = true;
			
			tile[179] = new Tile();
			tile[179].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/179.png"));
			tile[179].colision = true;
			
			tile[180] = new Tile();
			tile[180].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/180.png"));
			tile[180].colision = true;
			
			tile[181] = new Tile();
			tile[181].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/181.png"));
			tile[181].colision = true;
			
			tile[182] = new Tile();
			tile[182].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/182.png"));
			tile[182].colision = true;
			
			tile[183] = new Tile();
			tile[183].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/183.png"));
			tile[183].colision = true;
			
			tile[184] = new Tile();
			tile[184].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/184.png"));
			tile[184].colision = true;
			
			tile[185] = new Tile();
			tile[185].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/185.png"));
			tile[185].colision = true;
			
			tile[186] = new Tile();
			tile[186].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/186.png"));
			tile[186].colision = true;
			
			tile[187] = new Tile();
			tile[187].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/187.png"));
			tile[187].colision = true;
			
			tile[188] = new Tile();
			tile[188].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/188.png"));
			tile[188].colision = true;
			
			tile[189] = new Tile();
			tile[189].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/189.png"));
			tile[189].colision = true;
			
			tile[190] = new Tile();
			tile[190].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/190.png"));
			tile[190].colision = true;
			
			tile[191] = new Tile();
			tile[191].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/191.png"));
			tile[191].colision = true;
			
			tile[192] = new Tile();
			tile[192].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/192.png"));
			tile[192].colision = true;
			
			tile[193] = new Tile();
			tile[193].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/193.png"));
			tile[193].colision = true;
			
			tile[194] = new Tile();
			tile[194].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/194.png"));
			tile[194].colision = true;
			
			tile[195] = new Tile();
			tile[195].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/195.png"));
			tile[195].colision = true;
			
			tile[196] = new Tile();
			tile[196].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/196.png"));
			
			tile[197] = new Tile();
			tile[197].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/197.png"));
			
			tile[198] = new Tile();
			tile[198].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/198.png"));
			
			tile[199] = new Tile();
			tile[199].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/199.png"));
			
			tile[200] = new Tile();
			tile[200].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/200.png"));
			tile[200].colision = true;
			
			tile[201] = new Tile();
			tile[201].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/201.png"));
			tile[201].colision = true;
			
			tile[202] = new Tile();
			tile[202].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/202.png"));
			tile[202].colision = true;
			
			tile[203] = new Tile();
			tile[203].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/203.png"));
			//stile[203].colision = true;
			
			tile[204] = new Tile();
			tile[204].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/204.png"));
			//tile[204].colision = true;
			
			tile[205] = new Tile();
			tile[205].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/205.png"));
			
			
			tile[206] = new Tile();
			tile[206].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/206.png"));
			tile[206].colision = true;
			
			tile[207] = new Tile();
			tile[207].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/207.png"));
			tile[207].colision = true;
			
			tile[208] = new Tile();
			tile[208].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/208.png"));
			//tile[208].colision = true;
			tile[208].colisionHierva = true;
			
			tile[209] = new Tile();
			tile[209].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/209.png"));
			//tile[209].colision = true;
			
			tile[210] = new Tile();
			tile[210].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/210.png"));
			//tile[210].colision = true;
			
			tile[211] = new Tile();
			tile[211].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/211.png"));
			tile[211].colision = true;
			
			tile[212] = new Tile();
			tile[212].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/212.png"));
			tile[212].colision = true;
			
			tile[213] = new Tile();
			tile[213].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/213.png"));
			//tile[213].colision = true;
			
			tile[214] = new Tile();
			tile[214].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/214.png"));
			tile[214].colision = true;
			
			tile[215] = new Tile();
			tile[215].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/215.png"));
			tile[215].colision = true;
			
			tile[216] = new Tile();
			tile[216].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/216.png"));
			tile[216].colision = true;
			
			tile[217] = new Tile();
			tile[217].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/217.png"));
			//tile[217].colision = true;
			
			tile[218] = new Tile();
			tile[218].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/218.png"));
			//tile[218].colision = true;
			
			tile[219] = new Tile();
			tile[219].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/219.png"));
			//tile[219].colision = true;
			
			tile[220] = new Tile();
			tile[220].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/220.png"));
			tile[220].colision = true;
			
			tile[221] = new Tile();
			tile[221].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/221.png"));
			//tile[221].colision = true;
			
			tile[222] = new Tile();
			tile[222].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/222.png"));
			//tile[222].colision = true;
			
			tile[223] = new Tile();
			tile[223].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/223.png"));
			//tile[223].colision = true;
			
			tile[224] = new Tile();
			tile[224].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/224.png"));
			//tile[224].colision = true;
			
			tile[225] = new Tile();
			tile[225].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/225.png"));
			//tile[225].colision = true;
			
			tile[226] = new Tile();
			tile[226].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/226.png"));
			//tile[226].colision = true;
			
			tile[227] = new Tile();
			tile[227].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/227.png"));
			//tile[227].colision = true;
			
			tile[228] = new Tile();
			tile[228].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/228.png"));
			//tile[228].colision = true;
			
			tile[229] = new Tile();
			tile[229].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/229.png"));
			//tile[229].colision = true;
			
			tile[230] = new Tile();
			tile[230].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/230.png"));
			//tile[230].colision = true;
			
			tile[231] = new Tile();
			tile[231].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/231.png"));
			//tile[231].colision = true;
			
			tile[232] = new Tile();
			tile[232].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/232.png"));
			tile[232].colision = true;
			
			tile[233] = new Tile();
			tile[233].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/233.png"));
			tile[233].colision = true;
			
			tile[234] = new Tile();
			tile[234].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/234.png"));
			tile[234].colision = true;
			
			tile[235] = new Tile();
			tile[235].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/235.png"));
			tile[235].colision = true;
			
			tile[236] = new Tile();
			tile[236].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/236.png"));
			tile[236].colision = true;
			
			tile[237] = new Tile();
			tile[237].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/237.png"));
			tile[237].colision = true;
			
			tile[238] = new Tile();
			tile[238].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/238.png"));
			tile[238].colision = true;
			
			tile[239] = new Tile();
			tile[239].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/239.png"));
			tile[239].colision = true;
			
			tile[240] = new Tile();
			tile[240].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/240.png"));
			tile[240].colision = true;
			
			tile[241] = new Tile();
			tile[241].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/241.png"));
			tile[241].colision = true;
			
			tile[242] = new Tile();
			tile[242].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/242.png"));
			tile[242].colision = true;
			
			tile[243] = new Tile();
			tile[243].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/243.png"));
			tile[243].colision = true;
			
			tile[244] = new Tile();
			tile[244].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/244.png"));
			tile[244].colision = true;
			
			tile[245] = new Tile();
			tile[245].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/245.png"));
			tile[245].colision = true;
			
			tile[246] = new Tile();
			tile[246].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/246.png"));
			tile[246].colision = true;
			
			tile[247] = new Tile();
			tile[247].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/247.png"));
			tile[247].colision = true;
			
			tile[248] = new Tile();
			tile[248].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/248.png"));
			tile[248].colision = true;
			
			tile[249] = new Tile();
			tile[249].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/249.png"));
			tile[249].colision = true;
			
			tile[250] = new Tile();
			tile[250].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/250.png"));
			tile[250].colision = true;
			
			tile[251] = new Tile();
			tile[251].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/251.png"));
			tile[251].colision = true;
			
			tile[252] = new Tile();
			tile[252].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/252.png"));
			tile[252].colision = true;
			
			tile[253] = new Tile();
			tile[253].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/253.png"));
			tile[253].colision = true;
			
			tile[254] = new Tile();
			tile[254].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/254.png"));
			tile[254].colision = true;
			
			tile[255] = new Tile();
			tile[255].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/255.png"));
			tile[255].colision = true;
			
			tile[256] = new Tile();
			tile[256].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/256.png"));
			tile[256].colision = true;
			
			tile[257] = new Tile();
			tile[257].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/257.png"));
			tile[257].colision = true;
			
			tile[258] = new Tile();
			tile[258].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/258.png"));
			tile[258].colision = true;
			
			tile[259] = new Tile();
			tile[259].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/259.png"));
			tile[259].colision = true;
			
			tile[260] = new Tile();
			tile[260].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/260.png"));
			tile[260].colision = true;
			
			tile[261] = new Tile();
			tile[261].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/261.png"));
			tile[261].colision = true;
			
			tile[262] = new Tile();
			tile[262].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/262.png"));
			tile[262].colision = true;
			
			tile[263] = new Tile();
			tile[263].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/263.png"));
			tile[263].colision = true;
			
			tile[264] = new Tile();
			tile[264].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/264.png"));
			tile[264].colision = true;
			
			tile[265] = new Tile();
			tile[265].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/265.png"));
			tile[265].colision = true;
			
			tile[266] = new Tile();
			tile[266].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/266.png"));
			tile[266].colision = true;
			
			tile[267] = new Tile();
			tile[267].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/267.png"));
			tile[267].colision = true;
			
			tile[268] = new Tile();
			tile[268].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/268.png"));
			tile[268].colision = true;
			
			tile[269] = new Tile();
			tile[269].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/269.png"));
			tile[269].colision = true;
			
			tile[270] = new Tile();
			tile[270].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/270.png"));
			tile[270].colision = true;
			
			tile[271] = new Tile();
			tile[271].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/271.png"));
			//tile[271].colision = true;
			
			tile[272] = new Tile();
			tile[272].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/272.png"));
			tile[272].colision = true;
			
			tile[273] = new Tile();
			tile[273].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/273.png"));
			tile[273].colision = true;
			
			tile[274] = new Tile();
			tile[274].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/274.png"));
			tile[274].colision = true;
			
			tile[275] = new Tile();
			tile[275].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/275.png"));
			tile[275].colision = true;
			
			tile[276] = new Tile();
			tile[276].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/276.png"));
			tile[276].colision = true;
			
			tile[277] = new Tile();
			tile[277].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/277.png"));
			tile[277].colision = true;
			
			tile[278] = new Tile();
			tile[278].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/278.png"));
			tile[278].colision = true;
			
			tile[279] = new Tile();
			tile[279].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/279.png"));
			tile[279].colision = true;
			
			tile[280] = new Tile();
			tile[280].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/280.png"));
			//tile[280].colision = true;
			
			tile[281] = new Tile();
			tile[281].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/281.png"));
			//tile[281].colision = true;
			
			tile[282] = new Tile();
			tile[282].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/282.png"));
			//tile[282].colision = true;
			
			tile[283] = new Tile();
			tile[283].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/283.png"));
			//tile[283].colision = true;
			
			tile[284] = new Tile();
			tile[284].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/284.png"));
			tile[284].colision = true;
			
			tile[285] = new Tile();
			tile[285].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/285.png"));
			//tile[285].colision = true;
			
			tile[286] = new Tile();
			tile[286].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/286.png"));
			//tile[286].colision = true;
			
			tile[287] = new Tile();
			tile[287].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/287.png"));
			//tile[287].colision = true;
			
			tile[288] = new Tile();
			tile[288].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/288.png"));
			tile[288].colision = true;
			
			tile[289] = new Tile();
			tile[289].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/289.png"));
			tile[289].colision = true;
			
			tile[290] = new Tile();
			tile[290].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/290.png"));
			tile[290].colision = true;
			
			tile[291] = new Tile();
			tile[291].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/291.png"));
			tile[291].colision = true;
			
			tile[292] = new Tile();
			tile[292].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/292.png"));
			tile[292].colision = true;
			
			tile[293] = new Tile();
			tile[293].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/293.png"));
			tile[293].colision = true;
			
			tile[294] = new Tile();
			tile[294].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/294.png"));
			tile[294].colision = true;
			
			tile[295] = new Tile();
			tile[295].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/295.png"));
			//tile[295].colision = true;
			tile[295].colisionHierva = true;
			
			tile[296] = new Tile();
			tile[296].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/296.png"));
			//tile[296].colision = true;
			tile[296].colisionHierva = true;
			
			tile[297] = new Tile();
			tile[297].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/297.png"));
			//[297].colision = true;
			tile[297].colisionHierva = true;
			
			tile[298] = new Tile();
			tile[298].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/298.png"));
			//tile[298].colision = true;
			tile[298].colisionHierva = true;
			
			tile[299] = new Tile();
			tile[299].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/299.png"));
			//tile[299].colision = true;
			tile[299].colisionHierva = true;
			
			tile[300] = new Tile();
			tile[300].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/300.png"));
			tile[300].colision = true;
			
			tile[301] = new Tile();
			tile[301].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/301.png"));
			tile[301].colision = true;
			
			tile[302] = new Tile();
			tile[302].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/302.png"));
			tile[302].colision = true;
			
			tile[303] = new Tile();
			tile[303].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/303.png"));
			tile[303].colision = true;
			
			tile[304] = new Tile();
			tile[304].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/304.png"));
			tile[304].colision = true;
			
			tile[305] = new Tile();
			tile[305].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/305.png"));
			tile[305].colision = true;
			
			tile[306] = new Tile();
			tile[306].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/306.png"));
			tile[306].colision = true;
			
			tile[307] = new Tile();
			tile[307].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/307.png"));
			tile[307].colision = true;
			
			tile[308] = new Tile();
			tile[308].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/308.png"));
			tile[308].colision = true;
			
			tile[309] = new Tile();
			tile[309].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/309.png"));
			tile[309].colision = true;
			
			tile[310] = new Tile();
			tile[310].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/310.png"));
			tile[310].colision = true;
			
			tile[311] = new Tile();
			tile[311].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/311.png"));
			tile[311].colision = true;
			
			tile[312] = new Tile();
			tile[312].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/312.png"));
			tile[312].colision = true;
			
			tile[313] = new Tile();
			tile[313].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/313.png"));
			tile[313].colision = true;
			
			tile[314] = new Tile();
			tile[314].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/314.png"));
			tile[314].colision = true;
			
			tile[315] = new Tile();
			tile[315].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/315.png"));
			tile[315].colision = true;
			
			tile[316] = new Tile();
			tile[316].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/316.png"));
			tile[316].colision = true;
			
			tile[317] = new Tile();
			tile[317].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/317.png"));
			tile[317].colision = true;
			
			tile[318] = new Tile();
			tile[318].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/318.png"));
			tile[318].colision = true;
			
			tile[319] = new Tile();
			tile[319].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/319.png"));
			tile[319].colision = true;
			
			tile[320] = new Tile();
			tile[320].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/320.png"));
			tile[320].colisionEntrada8 = true;
			
			tile[321] = new Tile();
			tile[321].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/321.png"));
			tile[321].colision = true;
			
			tile[322] = new Tile();
			tile[322].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/322.png"));
			tile[322].colision = true;
			
			tile[323] = new Tile();
			tile[323].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/323.png"));
			tile[323].colision = true;
			
			tile[324] = new Tile();
			tile[324].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/324.png"));
			tile[324].colision = true;
			
			tile[325] = new Tile();
			tile[325].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/325.png"));
			tile[325].colision = true;
			
			tile[326] = new Tile();
			tile[326].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/326.png"));
			tile[326].colision = true;
			
			tile[327] = new Tile();
			tile[327].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/327.png"));
			tile[327].colision = true;
			
			tile[328] = new Tile();
			tile[328].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/328.png"));
			tile[328].colision = true;
			
			tile[329] = new Tile();
			tile[329].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/329.png"));
			tile[329].colision = true;
			
			tile[330] = new Tile();
			tile[330].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/330.png"));
			tile[330].colision = true;
			
			tile[331] = new Tile();
			tile[331].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/331.png"));
			tile[331].colision = true;
			
			tile[332] = new Tile();
			tile[332].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/332.png"));
			tile[332].colision = true;
			
			tile[333] = new Tile();
			tile[333].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/333.png"));
			tile[333].colision = true;
			
			tile[334] = new Tile();
			tile[334].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/334.png"));
			tile[334].colision = true;
			
			tile[335] = new Tile();
			tile[335].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/335.png"));
			tile[335].colision = true;
			
			tile[336] = new Tile();
			tile[336].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/336.png"));
			tile[336].colision = true;
			
			tile[337] = new Tile();
			tile[337].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/337.png"));
			tile[337].colision = true;
			
			tile[338] = new Tile();
			tile[338].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/338.png"));
			tile[338].colision = true;
			
			tile[339] = new Tile();
			tile[339].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/339.png"));
			tile[339].colision = true;
			
			tile[340] = new Tile();
			tile[340].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/340.png"));
			tile[340].colision = true;
			
			tile[341] = new Tile();
			tile[341].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/341.png"));
			tile[341].colision = true;
			
			tile[342] = new Tile();
			tile[342].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/342.png"));
			tile[342].colision = true;
			
			tile[343] = new Tile();
			tile[343].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/343.png"));
			tile[343].colision = true;
			
			tile[344] = new Tile();
			tile[344].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/344.png"));
			tile[344].colision = true;
			
			tile[345] = new Tile();
			tile[345].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/345.png"));
			tile[345].colision = true;
			
			tile[346] = new Tile();
			tile[346].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/346.png"));
			tile[346].colision = true;
			
			tile[347] = new Tile();
			tile[347].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/347.png"));
			tile[347].colision = true;
			
			tile[348] = new Tile();
			tile[348].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/348.png"));
			tile[348].colision = true;
			
			tile[349] = new Tile();
			tile[349].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/349.png"));
			tile[349].colision = true;
			
			tile[350] = new Tile();
			tile[350].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/350.png"));
			tile[350].colision = true;
			
			tile[351] = new Tile();
			tile[351].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/351.png"));
			tile[351].colision = true;
			
			tile[352] = new Tile();
			tile[352].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/352.png"));
			tile[352].colision = true;
			
			tile[354] = new Tile();
			tile[354].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/354.png"));
			tile[354].colision = true;
			
			tile[355] = new Tile();
			tile[355].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/355.png"));
			tile[355].colision = true;
			
			tile[356] = new Tile();
			tile[356].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/356.png"));
			tile[356].colision = true;
			
			tile[357] = new Tile();
			tile[357].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/357.png"));
			tile[357].colision = true;
			
			tile[358] = new Tile();
			tile[358].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/358.png"));
			tile[358].colision = true;
			
			tile[359] = new Tile();
			tile[359].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/359.png"));
			tile[359].colision = true;
			
			tile[360] = new Tile();
			tile[360].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/360.png"));
			tile[360].colision = true;
			
			tile[361] = new Tile();
			tile[361].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/361.png"));
			tile[361].colisionEntrada5 = true;
			
			tile[362] = new Tile();
			tile[362].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/362.png"));
			tile[362].colision = true;
			
			tile[363] = new Tile();
			tile[363].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/363.png"));
			tile[363].colision = true;
			
			tile[364] = new Tile();
			tile[364].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/364.png"));
			tile[364].colision = true;
			
			tile[365] = new Tile();
			tile[365].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/365.png"));
			tile[365].colision = true;
			
			tile[366] = new Tile();
			tile[366].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/366.png"));
			tile[366].colision = true;
			
			tile[367] = new Tile();
			tile[367].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/367.png"));
			tile[367].colision = true;
			
			tile[368] = new Tile();
			tile[368].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/368.png"));
			tile[368].colision = true;
			
			tile[369] = new Tile();
			tile[369].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/369.png"));
			tile[369].colision = true;
			
			tile[370] = new Tile();
			tile[370].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/370.png"));
			tile[370].colision = true;

			tile[371] = new Tile();
			tile[371].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/371.png"));
			tile[371].colision = true;

			tile[372] = new Tile();
			tile[372].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/372.png"));
			tile[372].colision = true;

			tile[373] = new Tile();
			tile[373].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/373.png"));
			tile[373].colision = true;

			tile[374] = new Tile();
			tile[374].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/374.png"));
			tile[374].colision = true;

			tile[375] = new Tile();
			tile[375].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/375.png"));
			tile[375].colision = true;

			tile[376] = new Tile();
			tile[376].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/376.png"));
			tile[376].colision = true;
			
			tile[377] = new Tile();
			tile[377].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/377.png"));
			tile[377].colision = true;

			tile[378] = new Tile();
			tile[378].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/378.png"));
			tile[378].colision = true;

			tile[379] = new Tile();
			tile[379].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/379.png"));
			tile[379].colision = true;

			tile[380] = new Tile();
			tile[380].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/380.png"));
			tile[380].colision = true;

			tile[381] = new Tile();
			tile[381].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/381.png"));
			tile[381].colisionEntrada7 = true;

			tile[382] = new Tile();
			tile[382].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/382.png"));
			tile[382].colision = true;

			tile[383] = new Tile();
			tile[383].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/383.png"));
			tile[383].colision = true;

			tile[384] = new Tile();
			tile[384].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/384.png"));
			
			tile[385] = new Tile();
			tile[385].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/385.png"));
			
			tile[386] = new Tile();
			tile[386].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/386.png"));
			
			tile[387] = new Tile();
			tile[387].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/387.png"));
			
			tile[388] = new Tile();
			tile[388].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/388.png"));
			
			tile[389] = new Tile();
			tile[389].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/389.png"));
			
			tile[390] = new Tile();
			tile[390].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/390.png"));
			
			tile[391] = new Tile();
			tile[391].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/391.png"));
			tile[391].colision = true;
			
			tile[392] = new Tile();
			tile[392].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/392.png"));
			tile[392].colision = true;
			
			tile[393] = new Tile();
			tile[393].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/393.png"));
			tile[393].colision = true;
			
			tile[394] = new Tile();
			tile[394].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/394.png"));
			tile[394].colision = true;
			
			tile[395] = new Tile();
			tile[395].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/395.png"));
			
			tile[396] = new Tile();
			tile[396].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/396.png"));
			tile[396].colision = true;
			
			tile[397] = new Tile();
			tile[397].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/397.png"));
			tile[397].colision = true;
			
			tile[398] = new Tile();
			tile[398].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/398.png"));
			tile[398].colision = true;
			
			tile[399] = new Tile();
			tile[399].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/399.png"));
			tile[399].colision = true;
			
			tile[400] = new Tile();
			tile[400].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/400.png"));
			//tile[400].colision = true;
			tile[400].colisionHierva = true;
			
			tile[401] = new Tile();
			tile[401].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/401.png"));
			//tile[401].colision = true;
			tile[401].colisionHierva = true;
			
			tile[402] = new Tile();
			tile[402].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/402.png"));
			//tile[402].colision = true;
			tile[402].colisionHierva = true;
			
			tile[403] = new Tile();
			tile[403].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/403.png"));
			//tile[403].colision = true;
			tile[403].colisionHierva = true;
			
			tile[404] = new Tile();
			tile[404].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/404.png"));
			tile[404].colision = true;
			
			tile[405] = new Tile();
			tile[405].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/405.png"));
			tile[405].colision = true;
			
			tile[406] = new Tile();
			tile[406].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/406.png"));
			//tile[406].colision = true;
			tile[406].colisionHierva = true;
			
			tile[407] = new Tile();
			tile[407].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/407.png"));
			tile[407].colision = true;
			
			tile[408] = new Tile();
			tile[408].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/408.png"));
			//tile[408].colision = true;
			
			tile[409] = new Tile();
			tile[409].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/409.png"));
			//tile[409].colision = true;
			
			tile[410] = new Tile();
			tile[410].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/410.png"));
			//tile[410].colision = true;
			
			tile[411] = new Tile();
			tile[411].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/411.png"));
			tile[411].colision = true;
			
			tile[412] = new Tile();
			tile[412].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/412.png"));
			tile[412].colision = true;
			
			tile[413] = new Tile();
			tile[413].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/413.png"));
			//tile[413].colision = true;
			
			tile[414] = new Tile();
			tile[414].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/414.png"));
			//tile[414].colision = true;
			
			tile[415] = new Tile();
			tile[415].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/415.png"));
			tile[415].colision = true;
			
			tile[416] = new Tile();
			tile[416].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/416.png"));
			tile[416].colision = true;
			
			tile[417] = new Tile();
			tile[417].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/417.png"));
			tile[417].colision = true;
			
			tile[418] = new Tile();
			tile[418].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/418.png"));
			tile[418].colision = true;
			
			tile[419] = new Tile();
			tile[419].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/419.png"));
			tile[419].colision = true;
			
			tile[420] = new Tile();
			tile[420].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/420.png"));
			tile[420].colision = true;
			
			tile[421] = new Tile();
			tile[421].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/421.png"));
			tile[421].colision = true;
			
			tile[422] = new Tile();
			tile[422].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/422.png"));
			//tile[422].colision = true;
			
			tile[423] = new Tile();
			tile[423].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/423.png"));
			tile[423].colision = true;
			
			tile[424] = new Tile();
			tile[424].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/424.png"));
			tile[424].colision = true;
			
			tile[425] = new Tile();
			tile[425].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/425.png"));
			tile[425].colision = true;
			
			tile[426] = new Tile();
			tile[426].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/426.png"));
			tile[426].colision = true;
			
			tile[427] = new Tile();
			tile[427].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/427.png"));
			tile[427].colision = true;
			
			tile[428] = new Tile();
			tile[428].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/428.png"));
			tile[428].colision = true;
			
			tile[429] = new Tile();
			tile[429].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/429.png"));
			//tile[429].colision = true;
			tile[429].colisionHierva = true;
			
			tile[430] = new Tile();
			tile[430].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/430.png"));
			//tile[430].colision = true;
			tile[430].colisionHierva = true;
			
			tile[431] = new Tile();
			tile[431].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/431.png"));
			//tile[431].colision = true;
			tile[431].colisionHierva = true;
			
			tile[432] = new Tile();
			tile[432].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/432.png"));
			//tile[432].colision = true;
			tile[432].colisionHierva = true;
			
			tile[433] = new Tile();
			tile[433].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/433.png"));
			//tile[433].colision = true;
			
			tile[434] = new Tile();
			tile[434].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/434.png"));
			tile[434].colision = true;
			
			tile[435] = new Tile();
			tile[435].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/435.png"));
			tile[435].colision = true;
			
			tile[436] = new Tile();
			tile[436].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/436.png"));
			//tile[436].colision = true;
			tile[436].colisionHierva = true;
			
			tile[437] = new Tile();
			tile[437].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/437.png"));
			//tile[437].colision = true;
			tile[437].colisionHierva = true;
			
			tile[438] = new Tile();
			tile[438].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/438.png"));
			tile[438].colision = true;
			
			tile[439] = new Tile();
			tile[439].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/439.png"));
			tile[439].colision = true;
			
			tile[440] = new Tile();
			tile[440].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/440.png"));
			tile[440].colision = true;
			
			tile[441] = new Tile();
			tile[441].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/441.png"));
			tile[441].colision = true;
			
			tile[442] = new Tile();
			tile[442].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/442.png"));
			tile[442].colision = true;
			
			tile[443] = new Tile();
			tile[443].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/443.png"));
			tile[443].colision = true;
			
			tile[444] = new Tile();
			tile[444].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/444.png"));
			tile[444].colision = true;
			
			tile[445] = new Tile();
			tile[445].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/445.png"));
			tile[445].colision = true;
			
			tile[446] = new Tile();
			tile[446].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/446.png"));
			tile[446].colision = true;

			tile[447] = new Tile();
			tile[447].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/447.png"));
			tile[447].colision = true;

			tile[448] = new Tile();
			tile[448].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/448.png"));
			tile[448].colision = true;

			tile[449] = new Tile();
			tile[449].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/449.png"));
			//tile[449].colision = true;

			tile[450] = new Tile();
			tile[450].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/450.png"));
			//tile[450].colision = true;

			tile[451] = new Tile();
			tile[451].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/451.png"));
			//tile[451].colision = true;

			tile[452] = new Tile();
			tile[452].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/452.png"));
			//tile[452].colision = true;

			tile[453] = new Tile();
			tile[453].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/453.png"));
			//tile[453].colision = true;

			tile[454] = new Tile();
			tile[454].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/454.png"));
			//tile[454].colision = true;

			tile[455] = new Tile();
			tile[455].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/455.png"));
			//tile[455].colision = true;

			tile[456] = new Tile();
			tile[456].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/456.png"));
			tile[456].colision = true;

			tile[457] = new Tile();
			tile[457].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/457.png"));
			tile[457].colision = true;

			tile[458] = new Tile();
			tile[458].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/458.png"));
			tile[458].colision = true;

			tile[459] = new Tile();
			tile[459].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/459.png"));
			tile[459].colision = true;

			tile[460] = new Tile();
			tile[460].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/460.png"));
			tile[460].colision = true;

			tile[461] = new Tile();
			tile[461].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/461.png"));
			tile[461].colision = true;

			tile[462] = new Tile();
			tile[462].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/462.png"));
			tile[462].colision = true;

			tile[463] = new Tile();
			tile[463].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/463.png"));
			tile[463].colision = true;

			tile[464] = new Tile();
			tile[464].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/464.png"));
			tile[464].colision = true;

			tile[465] = new Tile();
			tile[465].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/465.png"));
			tile[465].colision = true;

			tile[466] = new Tile();
			tile[466].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/466.png"));
			tile[466].colision = true;

			tile[467] = new Tile();
			tile[467].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/467.png"));
			tile[467].colision = true;

			tile[468] = new Tile();
			tile[468].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/468.png"));
			tile[468].colision = true;

			tile[469] = new Tile();
			tile[469].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/469.png"));
			tile[469].colision = true;

			tile[470] = new Tile();
			tile[470].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/470.png"));
			tile[470].colision = true;

			tile[471] = new Tile();
			tile[471].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/471.png"));
			tile[471].colision = true;

			tile[472] = new Tile();
			tile[472].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/472.png"));
			tile[472].colision = true;

			tile[473] = new Tile();
			tile[473].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/473.png"));
			tile[473].colision = true;

			tile[474] = new Tile();
			tile[474].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/474.png"));
			tile[474].colisionEntrada3 = true;

			tile[475] = new Tile();
			tile[475].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/475.png"));
			tile[475].colision = true;

			tile[476] = new Tile();
			tile[476].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/476.png"));
			//tile[476].colision = true;

			tile[477] = new Tile();
			tile[477].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/477.png"));
			tile[477].colision = true;

			tile[478] = new Tile();
			tile[478].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/478.png"));
			tile[478].colision = true;

			tile[479] = new Tile();
			tile[479].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/479.png"));
			tile[479].colision = true;

			tile[480] = new Tile();
			tile[480].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/480.png"));
			tile[480].colision = true;

			tile[481] = new Tile();
			tile[481].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/481.png"));
			tile[481].colision = true;

			tile[482] = new Tile();
			tile[482].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/482.png"));
			tile[482].colision = true;

			tile[483] = new Tile();
			tile[483].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/483.png"));
			tile[483].colision = true;

			tile[484] = new Tile();
			tile[484].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/484.png"));
			tile[484].colision = true;

			tile[485] = new Tile();
			tile[485].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/485.png"));
			tile[485].colision = true;

			tile[486] = new Tile();
			tile[486].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/486.png"));
			tile[486].colision = true;

			tile[487] = new Tile();
			tile[487].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/487.png"));
			tile[487].colision = true;

			tile[488] = new Tile();
			tile[488].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/488.png"));
			tile[488].colision = true;

			tile[489] = new Tile();
			tile[489].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/489.png"));
			tile[489].colision = true;

			tile[490] = new Tile();
			tile[490].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/490.png"));
			tile[490].colision = true;

			tile[491] = new Tile();
			tile[491].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/491.png"));
			tile[491].colision = true;

			tile[492] = new Tile();
			tile[492].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/492.png"));
			tile[492].colision = true;

			tile[493] = new Tile();
			tile[493].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/493.png"));
			tile[493].colision = true;

			tile[494] = new Tile();
			tile[494].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/494.png"));
			tile[494].colisionEntrada2 = true;

			tile[495] = new Tile();
			tile[495].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/495.png"));
			tile[495].colision = true;

			tile[496] = new Tile();
			tile[496].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/496.png"));
			tile[496].colision = true;

			tile[497] = new Tile();
			tile[497].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/497.png"));
			tile[497].colision = true;
			
			tile[498] = new Tile();
			tile[498].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/498.png"));
			tile[498].colision = true;
			
			tile[499] = new Tile();
			tile[499].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/499.png"));
			tile[499].colision = true;
			
			tile[500] = new Tile();
			tile[500].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/500.png"));
			tile[500].colision = true;
			
			tile[501] = new Tile();
			tile[501].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/501.png"));
			tile[501].colision = true;
			
			tile[503] = new Tile();
			tile[503].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/503.png"));
			tile[503].colision = true;
			
			tile[504] = new Tile();
			tile[504].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/504.png"));
			tile[504].colision = true;
			
			tile[505] = new Tile();
			tile[505].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/505.png"));
			tile[505].colision = true;
			
			tile[506] = new Tile();
			tile[506].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/506.png"));
			tile[506].colision = true;
			
			tile[507] = new Tile();
			tile[507].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/507.png"));
			tile[507].colision = true;
			
			tile[508] = new Tile();
			tile[508].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/508.png"));
			tile[508].colision = true;
			
			tile[509] = new Tile();
			tile[509].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/509.png"));
			tile[509].colision = true;
			
			tile[510] = new Tile();
			tile[510].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/510.png"));
			tile[510].colision = true;
			
			tile[511] = new Tile();
			tile[511].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/511.png"));
			
			tile[512] = new Tile();
			tile[512].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/512.png"));
			tile[512].colision = true;

			tile[513] = new Tile();
			tile[513].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/513.png"));
			tile[513].colision = true;

			tile[514] = new Tile();
			tile[514].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/514.png"));
			tile[514].colision = true;

			tile[515] = new Tile();
			tile[515].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/515.png"));
			tile[515].colision = true;
			
			tile[516] = new Tile();
			tile[516].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/516.png"));
			tile[516].colision = true;

			tile[517] = new Tile();
			tile[517].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/517.png"));
			tile[517].colision = true;
			
			tile[518] = new Tile();
			tile[518].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/518.png"));
			tile[518].colision = true;

			tile[519] = new Tile();
			tile[519].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/519.png"));
			tile[519].colision = true;

			tile[520] = new Tile();
			tile[520].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/520.png"));
			tile[520].colision = true;
			
			tile[521] = new Tile();
			tile[521].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/521.png"));
			tile[521].colision = true;
			
			tile[522] = new Tile();
			tile[522].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/522.png"));
			tile[522].colision = true;
			
			tile[523] = new Tile();
			tile[523].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/523.png"));
			tile[523].colision = true;
			
			tile[524] = new Tile();
			tile[524].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/524.png"));
			tile[524].colision = true;
			
			tile[525] = new Tile();
			tile[525].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/525.png"));
			tile[525].colision = true;
			
			tile[526] = new Tile();
			tile[526].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/526.png"));
			tile[526].colision = true;
			
			tile[527] = new Tile();
			tile[527].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/527.png"));
			tile[527].colision = true;
			
			tile[528] = new Tile();
			tile[528].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/528.png"));
			tile[528].colision = true;
			
			tile[529] = new Tile();
			tile[529].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/529.png"));
			tile[529].colision = true;
			
			tile[530] = new Tile();
			tile[530].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/530.png"));
			tile[530].colision = true;
			
			tile[531] = new Tile();
			tile[531].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/531.png"));
			tile[531].colision = true;
			
			tile[532] = new Tile();
			tile[532].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/532.png"));
			tile[532].colision = true;
			
			tile[533] = new Tile();
			tile[533].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/533.png"));
			tile[533].colisionEntrada6 = true;
			
			tile[534] = new Tile();
			tile[534].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/534.png"));
			tile[534].colision = true;
			
			tile[535] = new Tile();
			tile[535].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/535.png"));
			tile[535].colision = true;
			
			tile[536] = new Tile();
			tile[536].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/536.png"));
			tile[536].colision = true;
			
			tile[537] = new Tile();
			tile[537].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/537.png"));
			tile[537].colision = true;
			
			tile[538] = new Tile();
			tile[538].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/538.png"));
			tile[538].colision = true;
			
			tile[539] = new Tile();
			tile[539].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/539.png"));
			tile[539].colision = true;
			
			tile[540] = new Tile();
			tile[540].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/540.png"));
			tile[540].colision = true;
			
			tile[541] = new Tile();
			tile[541].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/541.png"));
			tile[541].colision = true;
		
			tile[542] = new Tile();
			tile[542].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/542.png"));
			tile[542].colisionEntrada5 = true;
			
			tile[543] = new Tile();
			tile[543].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/543.png"));
			tile[543].colision = true;
			
			tile[544] = new Tile();
			tile[544].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/544.png"));
			tile[544].colision = true;
			
			tile[545] = new Tile();
			tile[545].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/545.png"));
			tile[545].colision = true;
			
			tile[546] = new Tile();
			tile[546].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/546.png"));
			tile[546].colision = true;
			
			tile[547] = new Tile();
			tile[547].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/547.png"));
			tile[547].colision = true;
			
			tile[548] = new Tile();
			tile[548].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/548.png"));
			tile[548].colision = true;
			
			tile[549] = new Tile();
			tile[549].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/549.png"));
			tile[549].colision = true;
			
			tile[550] = new Tile();
			tile[550].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/550.png"));
			tile[550].colision = true;
			
			tile[551] = new Tile();
			tile[551].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/551.png"));
			tile[551].colision = true;
			
			tile[552] = new Tile();
			tile[552].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/552.png"));
			tile[552].colision = true;
			
			tile[553] = new Tile();
			tile[553].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/553.png"));
			tile[553].colision = true;
			
			tile[554] = new Tile();
			tile[554].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/554.png"));
			tile[554].colision = true;
			
			tile[555] = new Tile();
			tile[555].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/555.png"));
			tile[555].colision = true;
			
			tile[556] = new Tile();
			tile[556].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/556.png"));
			tile[556].colision = true;
			
			tile[557] = new Tile();
			tile[557].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/557.png"));
			tile[557].colision = true;
			
			tile[558] = new Tile();
			tile[558].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/558.png"));
			tile[558].colision = true;
			
			tile[559] = new Tile();
			tile[559].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/559.png"));
			tile[559].colision = true;
			
			tile[560] = new Tile();
			tile[560].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/560.png"));
			tile[560].colision = true;
			
			tile[561] = new Tile();
			tile[561].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/561.png"));
			tile[561].colision = true;
			
			tile[562] = new Tile();
			tile[562].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/562.png"));
			tile[562].colision = true;
			
			tile[563] = new Tile();
			tile[563].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/563.png"));
			tile[563].colision = true;
			
			tile[564] = new Tile();
			tile[564].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/564.png"));
			tile[564].colision = true;
			
			tile[565] = new Tile();
			tile[565].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/565.png"));
			tile[565].colision = true;
			
			tile[566] = new Tile();
			tile[566].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/566.png"));
			tile[566].colisionEntrada4 = true;
			
			tile[567] = new Tile();
			tile[567].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/567.png"));
			tile[567].colision = true;
			
			tile[568] = new Tile();
			tile[568].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/568.png"));
			tile[568].colision = true;
			
			tile[569] = new Tile();
			tile[569].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/569.png"));
			tile[569].colision = true;
			
			tile[570] = new Tile();
			tile[570].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/570.png"));
			tile[570].colision = true;
			
			tile[571] = new Tile();
			tile[571].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/571.png"));
			tile[571].colision = true;
			
			tile[572] = new Tile();
			tile[572].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/572.png"));
			tile[572].colision = true;
			
			tile[573] = new Tile();
			tile[573].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/573.png"));
			tile[573].colision = true;
			
			tile[600] = new Tile();
			tile[600].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/600.png"));
			tile[600].colision = true;

			tile[601] = new Tile();
			tile[601].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/601.png"));
			tile[601].colision = true;

			tile[602] = new Tile();
			tile[602].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/602.png"));
			tile[602].colision = true;

			tile[603] = new Tile();
			tile[603].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/603.png"));
			tile[603].colision = true;

			tile[604] = new Tile();
			tile[604].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/604.png"));
			tile[604].colision = true;

			tile[605] = new Tile();
			tile[605].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/605.png"));
			tile[605].colision = true;

			tile[606] = new Tile();
			tile[606].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/606.png"));
			tile[606].colision = true;

			tile[607] = new Tile();
			tile[607].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/607.png"));
			tile[607].colision = true;

			tile[608] = new Tile();
			tile[608].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/608.png"));
			tile[608].colision = true;

			tile[609] = new Tile();
			tile[609].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/609.png"));
			tile[609].colision = true;

			tile[610] = new Tile();
			tile[610].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/610.png"));
			tile[610].colision = true;

			tile[611] = new Tile();
			tile[611].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/611.png"));
			tile[611].colision = true;

			tile[612] = new Tile();
			tile[612].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/612.png"));
			tile[612].colision = true;

			tile[613] = new Tile();
			tile[613].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/613.png"));
			tile[613].colision = true;

			tile[614] = new Tile();
			tile[614].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/614.png"));
			tile[614].colision = true;

			tile[615] = new Tile();
			tile[615].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/615.png"));
			tile[615].colision = true;

			tile[616] = new Tile();
			tile[616].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/616.png"));
			tile[616].colision = true;

			tile[617] = new Tile();
			tile[617].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/617.png"));
			tile[617].colision = true;

			tile[618] = new Tile();
			tile[618].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/618.png"));
			tile[618].colision = true;

			tile[619] = new Tile();
			tile[619].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/619.png"));
			tile[619].colision = true;

			tile[620] = new Tile();
			tile[620].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/620.png"));
			tile[620].colision = true;

			tile[621] = new Tile();
			tile[621].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/621.png"));
			tile[621].colision = true;

			tile[622] = new Tile();
			tile[622].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/622.png"));
			tile[622].colision = true;

			tile[623] = new Tile();
			tile[623].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/623.png"));
			tile[623].colision = true;

			tile[624] = new Tile();
			tile[624].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/624.png"));
			tile[624].colision = true;

			tile[625] = new Tile();
			tile[625].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/625.png"));
			tile[625].colision = true;

			tile[626] = new Tile();
			tile[626].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/626.png"));
			tile[626].colision = true;

			tile[627] = new Tile();
			tile[627].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/627.png"));
			tile[627].colision = true;

			tile[628] = new Tile();
			tile[628].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/628.png"));
			tile[628].colision = true;

			tile[629] = new Tile();
			tile[629].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/629.png"));
			tile[629].colision = true;

			tile[630] = new Tile();
			tile[630].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/630.png"));
			tile[630].colision = true;

			tile[631] = new Tile();
			tile[631].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/631.png"));
			tile[631].colision = true;

			tile[632] = new Tile();
			tile[632].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/632.png"));
			tile[632].colision = true;

			tile[633] = new Tile();
			tile[633].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/633.png"));
			tile[633].colision = true;

			tile[634] = new Tile();
			tile[634].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/634.png"));
			tile[634].colision = true;

			tile[635] = new Tile();
			tile[635].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/635.png"));
			tile[635].colision = true;

			tile[636] = new Tile();
			tile[636].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/636.png"));
			tile[636].colision = true;

			tile[637] = new Tile();
			tile[637].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/637.png"));
			tile[637].colision = true;

			tile[638] = new Tile();
			tile[638].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/638.png"));
			tile[638].colision = true;

			tile[639] = new Tile();
			tile[639].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/639.png"));
			tile[639].colision = true;

			tile[640] = new Tile();
			tile[640].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/640.png"));
			tile[640].colision = true;

			tile[641] = new Tile();
			tile[641].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/641.png"));
			tile[641].colision = true;

			tile[642] = new Tile();
			tile[642].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/642.png"));
			tile[642].colision = true;

			tile[643] = new Tile();
			tile[643].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/643.png"));
			//tile[643].colision = true;
			tile[643].colisionEntrada1 = true;
					
			tile[644] = new Tile();
			tile[644].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/644.png"));
			tile[644].colision = true;

			tile[645] = new Tile();
			tile[645].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/645.png"));
			tile[645].colision = true;

			tile[646] = new Tile();
			tile[646].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/646.png"));
			tile[646].colision = true;

			tile[647] = new Tile();
			tile[647].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/647.png"));
			tile[647].colision = true;

			tile[648] = new Tile();
			tile[648].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/648.png"));
			tile[648].colision = true;

			tile[649] = new Tile();
			tile[649].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/649.png"));
			tile[649].colision = true;

			tile[650] = new Tile();
			tile[650].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/650.png"));
			tile[650].colision = true;

			tile[651] = new Tile();
			tile[651].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/651.png"));
			//tile[651].colision = true;

			tile[652] = new Tile();
			tile[652].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/652.png"));
			tile[652].colision = true;

			tile[653] = new Tile();
			tile[653].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/653.png"));
			tile[653].colision = true;

			tile[654] = new Tile();
			tile[654].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/654.png"));
			tile[654].colision = true;

			tile[655] = new Tile();
			tile[655].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/655.png"));
			tile[655].colision = true;

			tile[656] = new Tile();
			tile[656].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/656.png"));
			//tile[656].colision = true;

			tile[657] = new Tile();
			tile[657].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/657.png"));
			tile[657].colision = true;

			tile[658] = new Tile();
			tile[658].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/658.png"));
			tile[658].colision = true;

			tile[659] = new Tile();
			tile[659].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/659.png"));
			tile[659].colision = true;

			tile[660] = new Tile();
			tile[660].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/660.png"));
			tile[660].colision = true;

			tile[661] = new Tile();
			tile[661].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/661.png"));
			//tile[661].colision = true;

			tile[662] = new Tile();
			tile[662].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/662.png"));
			tile[662].colision = true;

			tile[663] = new Tile();
			tile[663].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/663.png"));
			tile[663].colision = true;
			
			tile[664] = new Tile();
			tile[664].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/664.png"));
			tile[664].colision = true;

			tile[665] = new Tile();
			tile[665].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/665.png"));
			tile[665].colision = true;

			tile[666] = new Tile();
			tile[666].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/666.png"));
			tile[666].colision = true;

			tile[667] = new Tile();
			tile[667].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/667.png"));
			tile[667].colision = true;

			tile[668] = new Tile();
			tile[668].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/668.png"));
			tile[668].colision = true;

			tile[669] = new Tile();
			tile[669].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/669.png"));
			tile[669].colision = true;

			tile[670] = new Tile();
			tile[670].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/670.png"));
			tile[670].colision = true;

			tile[671] = new Tile();
			tile[671].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/671.png"));
			tile[671].colision = true;

			tile[672] = new Tile();
			tile[672].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/672.png"));
			tile[672].colision = true;

			tile[673] = new Tile();
			tile[673].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/673.png"));
			tile[673].colision = true;

			tile[674] = new Tile();
			tile[674].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/674.png"));
			tile[674].colisionEntrada3 = true;
			
			tile[675] = new Tile();
			tile[675].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/675.png"));
			tile[675].colision = true;

			tile[676] = new Tile();
			tile[676].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/676.png"));
			tile[676].colision = true;

			tile[677] = new Tile();
			tile[677].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/677.png"));
			tile[677].colision = true;

			tile[678] = new Tile();
			tile[678].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/678.png"));
			tile[678].colision = true;
			
			tile[679] = new Tile();
			tile[679].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/679.png"));
			tile[679].colision = true;
			tile[679].colisionSalida1 = true;
			tile[679].colisionSalida2 = true;
			tile[679].colisionSalida3 = true;
			tile[679].colisionSalida4 = true;
			tile[679].colisionSalida5 = true;
			tile[679].colisionSalida6 = true;
			tile[679].colisionSalida7 = true;
			tile[679].colisionSalida8 = true;
			tile[679].colisionSalida9 = true;
			tile[679].colisionSalida10 = true;
			tile[679].colisionSalida11 = true;
			
			tile[680] = new Tile();
			tile[680].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/680.png"));
			
			tile[681] = new Tile();
			tile[681].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/681.png"));
			tile[681].colision = true;
			
			tile[682] = new Tile();
			tile[682].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/682.png"));
			tile[682].colision = true;
			
			tile[683] = new Tile();
			tile[683].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/683.png"));
			tile[683].colision = true;
			
			tile[684] = new Tile();
			tile[684].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/684.png"));
			tile[684].colision = true;
			
			tile[685] = new Tile();
			tile[685].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/685.png"));
			tile[685].colision = true;
			
			tile[686] = new Tile();
			tile[686].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/686.png"));
			tile[686].colision = true;
			
			tile[687] = new Tile();
			tile[687].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/687.png"));
			tile[687].colision = true;
			
			tile[688] = new Tile();
			tile[688].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/688.png"));
			tile[688].colision = true;
			
			
			tile[689] = new Tile();
			tile[689].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/689.png"));
			tile[689].colision = true;
			
			tile[690] = new Tile();
			tile[690].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/690.png"));
			tile[690].colision = true;
			
			tile[691] = new Tile();
			tile[691].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/691.png"));
			tile[691].colision = true;
			
			tile[692] = new Tile();
			tile[692].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/692.png"));
			tile[692].colision = true;
			
			tile[693] = new Tile();
			tile[693].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/693.png"));
			tile[693].colision = true;
			
			tile[694] = new Tile();
			tile[694].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/694.png"));
			
			tile[695] = new Tile();
			tile[695].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/695.png"));
			
			tile[696] = new Tile();
			tile[696].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/696.png"));
			tile[696].colision = true;
			
			tile[697] = new Tile();
			tile[697].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/697.png"));
			tile[697].colision = true;
			
			tile[698] = new Tile();
			tile[698].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/698.png"));
			
			tile[699] = new Tile();
			tile[699].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/699.png"));
			
			tile[700] = new Tile();
			tile[700].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/700.png"));
			
			tile[701] = new Tile();
			tile[701].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/701.png"));
			tile[701].colision = true;
			
			tile[702] = new Tile();
			tile[702].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/702.png"));
			tile[702].colision = true;
			
			tile[703] = new Tile();
			tile[703].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/703.png"));
			tile[703].colision = true;
			
			tile[704] = new Tile();
			tile[704].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/704.png"));
			tile[704].colision = true;
			
			tile[705] = new Tile();
			tile[705].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/705.png"));
			tile[705].colision = true;
			
			tile[706] = new Tile();
			tile[706].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/706.png"));
			tile[706].colision = true;
			
			tile[707] = new Tile();
			tile[707].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/707.png"));
			tile[707].colision = true;
			
			tile[708] = new Tile();
			tile[708].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/708.png"));
			tile[708].colision = true;
			
			tile[709] = new Tile();
			tile[709].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/709.png"));
			tile[709].colision = true;
			
			tile[710] = new Tile();
			tile[710].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/710.png"));
			tile[710].colision = true;
			
			tile[711] = new Tile();
			tile[711].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/711.png"));
			tile[711].colision = true;
			
			tile[712] = new Tile();
			tile[712].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/712.png"));
			tile[712].colision = true;
			
			
			tile[713] = new Tile();
			tile[713].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/713.png"));
			tile[713].colision = true;
			
			tile[714] = new Tile();
			tile[714].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/714.png"));
			tile[714].colision = true;

			tile[715] = new Tile();
			tile[715].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/715.png"));
			tile[715].colision = true;

			tile[716] = new Tile();
			tile[716].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/716.png"));
			tile[716].colision = true;

			tile[717] = new Tile();
			tile[717].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/717.png"));
			tile[717].colision = true;

			tile[718] = new Tile();
			tile[718].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/718.png"));
			tile[718].colision = true;

			tile[719] = new Tile();
			tile[719].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/719.png"));
			tile[719].colision = true;

			tile[720] = new Tile();
			tile[720].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/720.png"));
			tile[720].colision = true;

			tile[721] = new Tile();
			tile[721].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/721.png"));
			tile[721].colision = true;

			tile[722] = new Tile();
			tile[722].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/722.png"));
			tile[722].colision = true;

			tile[723] = new Tile();
			tile[723].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/723.png"));
			tile[723].colision = true;

			tile[724] = new Tile();
			tile[724].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/724.png"));
			tile[724].colision = true;

			tile[725] = new Tile();
			tile[725].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/725.png"));
			tile[725].colision = true;

			tile[726] = new Tile();
			tile[726].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/726.png"));
			tile[726].colision = true;

			tile[727] = new Tile();
			tile[727].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/727.png"));
			tile[727].colision = true;

			tile[728] = new Tile();
			tile[728].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/728.png"));
			tile[728].colision = true;

			tile[729] = new Tile();
			tile[729].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/729.png"));
			tile[729].colision = true;
			
			tile[730] = new Tile();
			tile[730].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/730.png"));
			tile[730].colision = true;
			tile[730].colisionEntradaPiso = true;

			tile[731] = new Tile();
			tile[731].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/731.png"));
			tile[731].colision = true;

			tile[732] = new Tile();
			tile[732].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/732.png"));
			tile[732].colision = true;

			tile[733] = new Tile();
			tile[733].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/733.png"));
			tile[733].colision = true;

			tile[734] = new Tile();
			tile[734].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/734.png"));
			tile[734].colision = true;

			tile[735] = new Tile();
			tile[735].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/735.png"));
			tile[735].colision = true;

			tile[736] = new Tile();
			tile[736].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/736.png"));
			tile[736].colision = true;


			tile[738] = new Tile();
			tile[738].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/738.png"));
			tile[738].colision = true;

			tile[739] = new Tile();
			tile[739].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/739.png"));

			tile[740] = new Tile();
			tile[740].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/740.png"));

			tile[741] = new Tile();
			tile[741].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/741.png"));

			tile[742] = new Tile();
			tile[742].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/742.png"));
			tile[742].colision = true;

			tile[743] = new Tile();
			tile[743].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/743.png"));
			tile[743].colision = true;
			
			tile[744] = new Tile();
			tile[744].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/744.png"));
			
			tile[744] = new Tile();
			tile[744].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/744.png"));
			
			tile[745] = new Tile();
			tile[745].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/745.png"));
			
			tile[746] = new Tile();
			tile[746].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/746.png"));
			tile[746].colision = true;

			tile[747] = new Tile();
			tile[747].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/747.png"));
			tile[747].colision = true;

			tile[748] = new Tile();
			tile[748].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/748.png"));
			tile[748].colision = true;

			tile[749] = new Tile();
			tile[749].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/749.png"));
			tile[749].colision = true;

			tile[750] = new Tile();
			tile[750].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/750.png"));
			tile[750].colision = true;

			tile[751] = new Tile();
			tile[751].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/751.png"));
			tile[751].colision = true;

			tile[752] = new Tile();
			tile[752].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/752.png"));
			tile[752].colision = true;

			tile[753] = new Tile();
			tile[753].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/753.png"));
			tile[753].colision = true;

			tile[754] = new Tile();
			tile[754].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/754.png"));
			tile[754].colision = true;

			tile[755] = new Tile();
			tile[755].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/755.png"));
			tile[755].colision = true;

			tile[756] = new Tile();
			tile[756].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/756.png"));
			tile[756].colision = true;

			tile[757] = new Tile();
			tile[757].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/757.png"));
			tile[757].colision = true;

			tile[758] = new Tile();
			tile[758].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/758.png"));
			tile[758].colision = true;

			tile[759] = new Tile();
			tile[759].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/759.png"));
			tile[759].colision = true;

			tile[760] = new Tile();
			tile[760].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/760.png"));
			tile[760].colision = true;

			tile[761] = new Tile();
			tile[761].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/761.png"));
			tile[761].colision = true;

			tile[762] = new Tile();
			tile[762].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/762.png"));
			tile[762].colision = false;
			tile[762].colisionSalidaPiso = true;

			tile[763] = new Tile();
			tile[763].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/763.png"));

			tile[764] = new Tile();
			tile[764].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/764.png"));
			tile[764].colision = true;

			tile[765] = new Tile();
			tile[765].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/765.png"));
			tile[765].colision = true;

			tile[766] = new Tile();
			tile[766].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/766.png"));
			tile[766].colision = true;

			tile[767] = new Tile();
			tile[767].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/767.png"));
			tile[767].colision = true;

			tile[768] = new Tile();
			tile[768].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/768.png"));
			tile[768].colision = true;

			tile[769] = new Tile();
			tile[769].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/769.png"));
			tile[769].colision = true;

			tile[770] = new Tile();
			tile[770].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/770.png"));
			tile[770].colision = true;

			tile[771] = new Tile();
			tile[771].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/771.png"));
			tile[771].colision = true;

			tile[772] = new Tile();
			tile[772].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/772.png"));
			tile[772].colision = true;

			tile[773] = new Tile();
			tile[773].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/773.png"));
			tile[773].colision = true;

			tile[774] = new Tile();
			tile[774].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/774.png"));
			tile[774].colision = true;

			tile[775] = new Tile();
			tile[775].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/775.png"));
			tile[775].colision = true;

			tile[776] = new Tile();
			tile[776].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/776.png"));
			tile[776].colision = true;

			tile[777] = new Tile();
			tile[777].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/777.png"));
			tile[777].colision = true;
			
			tile[778] = new Tile();
			tile[778].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/778.png"));
			tile[778].colision = true;

			tile[779] = new Tile();
			tile[779].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/779.png"));
			tile[779].colision = true;

			tile[780] = new Tile();
			tile[780].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/780.png"));
			tile[780].colision = true;

			tile[781] = new Tile();
			tile[781].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/781.png"));
			tile[781].colision = true;

			tile[782] = new Tile();
			tile[782].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/782.png"));
			tile[782].colision = true;

			tile[783] = new Tile();
			tile[783].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/783.png"));
			tile[783].colision = true;

			tile[784] = new Tile();
			tile[784].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/784.png"));
			tile[784].colision = true;

			tile[785] = new Tile();
			tile[785].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/785.png"));
			tile[785].colision = true;

			tile[786] = new Tile();
			tile[786].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/786.png"));
			tile[786].colision = true;

			tile[787] = new Tile();
			tile[787].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/787.png"));
			tile[787].colision = true;

			tile[788] = new Tile();
			tile[788].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/788.png"));
			tile[788].colision = true;

			tile[789] = new Tile();
			tile[789].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/789.png"));
			tile[789].colision = true;

			tile[790] = new Tile();
			tile[790].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/790.png"));
			tile[790].colision = true;

			tile[791] = new Tile();
			tile[791].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/791.png"));
			tile[791].colision = true;

			tile[792] = new Tile();
			tile[792].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/792.png"));
			tile[792].colision = true;

			tile[795] = new Tile();
			tile[795].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/795.png"));
			tile[795].colision = true;

			tile[796] = new Tile();
			tile[796].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/796.png"));
			tile[796].colision = true;

			/*
			tile[797] = new Tile();
			tile[797].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/797.png"));
			tile[797].colision = true;
			*/

			tile[798] = new Tile();
			tile[798].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/798.png"));
			tile[798].colision = true;

			tile[799] = new Tile();
			tile[799].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/799.png"));
			tile[799].colision = true;
			
			
			
			
			tile[900] = new Tile();
			tile[900].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/900.png"));
			tile[900].colision = true;

			tile[901] = new Tile();
			tile[901].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/901.png"));
			tile[901].colision = true;

			tile[902] = new Tile();
			tile[902].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/902.png"));
			tile[902].colision = true;

			tile[903] = new Tile();
			tile[903].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/903.png"));
			tile[903].colision = true;

			tile[904] = new Tile();
			tile[904].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/904.png"));
			tile[904].colision = true;

			tile[905] = new Tile();
			tile[905].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/905.png"));
			tile[905].colision = true;

			tile[906] = new Tile();
			tile[906].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/906.png"));
			tile[906].colision = true;

			tile[907] = new Tile();
			tile[907].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/907.png"));
			tile[907].colision = true;

			tile[908] = new Tile();
			tile[908].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/908.png"));
			tile[908].colision = true;

			tile[909] = new Tile();
			tile[909].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/909.png"));
			tile[909].colision = true;

			tile[910] = new Tile();
			tile[910].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/910.png"));
			tile[910].colision = true;

			tile[911] = new Tile();
			tile[911].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/911.png"));
			tile[911].colision = true;

			tile[912] = new Tile();
			tile[912].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/912.png"));
			tile[912].colision = true;

			tile[913] = new Tile();
			tile[913].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/913.png"));

			tile[914] = new Tile();
			tile[914].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/914.png"));
			tile[914].colision = true;

			tile[915] = new Tile();
			tile[915].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/915.png"));
			tile[915].colision = true;

			tile[916] = new Tile();
			tile[916].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/916.png"));
			tile[916].colision = true;
			tile[916].colisionSalida3 = true;
			
			tile[917] = new Tile();
			tile[917].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/917.png"));
			tile[917].colision = true;
			tile[917].colisionSalida3 = true;

			tile[918] = new Tile();
			tile[918].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/918.png"));
			tile[918].colision = true;

			tile[919] = new Tile();
			tile[919].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/919.png"));
			tile[919].colision = true;

			tile[920] = new Tile();
			tile[920].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/920.png"));
			tile[920].colision = true;

			tile[921] = new Tile();
			tile[921].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/921.png"));
			tile[921].colision = true;

			tile[922] = new Tile();
			tile[922].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/922.png"));
			tile[922].colision = true;

			tile[923] = new Tile();
			tile[923].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/923.png"));
			tile[923].colision = true;
			tile[923].colisionSalida3 = true;

			tile[924] = new Tile();
			tile[924].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/924.png"));
			tile[924].colision = true;
			tile[924].colisionSalida3 = true;

			tile[925] = new Tile();
			tile[925].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/925.png"));
			tile[925].colision = true;

			tile[926] = new Tile();
			tile[926].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/926.png"));
			tile[926].colision = true;
			
			tile[927] = new Tile();
			tile[927].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/927.png"));

			tile[928] = new Tile();
			tile[928].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/928.png"));
			tile[928].colision = true;

			tile[929] = new Tile();
			tile[929].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/929.png"));
			tile[929].colision = true;

			tile[930] = new Tile();
			tile[930].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/930.png"));
			tile[930].colision = true;

			tile[931] = new Tile();
			tile[931].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/931.png"));
			tile[931].colision = true;

			tile[932] = new Tile();
			tile[932].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/932.png"));
			tile[932].colision = true;

			tile[933] = new Tile();
			tile[933].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/933.png"));
			tile[933].colision = true;

			tile[934] = new Tile();
			tile[934].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/934.png"));
			tile[934].colision = true;

			tile[935] = new Tile();
			tile[935].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/935.png"));
			tile[935].colision = true;

			tile[936] = new Tile();
			tile[936].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/936.png"));
			tile[936].colision = true;

			tile[937] = new Tile();
			tile[937].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/937.png"));
			tile[937].colision = true;

			tile[938] = new Tile();
			tile[938].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/938.png"));
			tile[938].colision = true;

			tile[939] = new Tile();
			tile[939].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/939.png"));
			tile[939].colision = true;

			tile[940] = new Tile();
			tile[940].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/940.png"));
			tile[940].colision = true;

			tile[941] = new Tile();
			tile[941].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/941.png"));
			tile[941].colision = true;

			tile[942] = new Tile();
			tile[942].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/942.png"));
			tile[942].colision = true;

			tile[943] = new Tile();
			tile[943].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/943.png"));
			tile[943].colision = true;

			tile[944] = new Tile();
			tile[944].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/944.png"));
			tile[944].colision = true;

			tile[945] = new Tile();
			tile[945].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/945.png"));
			tile[945].colision = true;

			tile[946] = new Tile();
			tile[946].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/946.png"));
			tile[946].colision = true;

			tile[947] = new Tile();
			tile[947].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/947.png"));
			tile[947].colision = true;

			tile[948] = new Tile();
			tile[948].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/948.png"));
			tile[948].colision = true;

			tile[949] = new Tile();
			tile[949].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/949.png"));
			tile[949].colision = true;

			tile[950] = new Tile();
			tile[950].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/950.png"));
			tile[950].colision = true;

			tile[951] = new Tile();
			tile[951].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/951.png"));
			tile[951].colision = true;

			tile[952] = new Tile();
			tile[952].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/952.png"));
			tile[952].colision = true;

			tile[953] = new Tile();
			tile[953].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/953.png"));
			tile[953].colision = true;

			tile[954] = new Tile();
			tile[954].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/954.png"));
			tile[954].colision = true;

			tile[955] = new Tile();
			tile[955].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/955.png"));
			tile[955].colision = true;

			tile[956] = new Tile();
			tile[956].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/956.png"));
			tile[956].colision = true;

			tile[957] = new Tile();
			tile[957].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/957.png"));
			tile[957].colision = true;

			tile[958] = new Tile();
			tile[958].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/958.png"));

			tile[959] = new Tile();
			tile[959].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/959.png"));
			tile[959].colision = true;

			tile[960] = new Tile();
			tile[960].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/960.png"));
			tile[960].colision = true;

			tile[961] = new Tile();
			tile[961].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/961.png"));
			tile[961].colision = true;

			tile[962] = new Tile();
			tile[962].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/962.png"));
			tile[962].colision = true;

			tile[963] = new Tile();
			tile[963].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/963.png"));
			tile[963].colision = true;

			tile[964] = new Tile();
			tile[964].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/964.png"));
			tile[964].colision = true;

			tile[965] = new Tile();
			tile[965].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/965.png"));
			tile[965].colision = true;

			tile[966] = new Tile();
			tile[966].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/966.png"));
			tile[966].colision = true;

			tile[967] = new Tile();
			tile[967].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/967.png"));
			tile[967].colision = true;

			tile[968] = new Tile();
			tile[968].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/968.png"));
			tile[968].colision = true;

			tile[969] = new Tile();
			tile[969].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/969.png"));

			tile[970] = new Tile();
			tile[970].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/970.png"));

			tile[971] = new Tile();
			tile[971].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/971.png"));
			tile[971].colision = true;

			tile[972] = new Tile();
			tile[972].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/972.png"));
			tile[972].colision = true;

			tile[973] = new Tile();
			tile[973].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/973.png"));
			tile[973].colision = true;

			tile[974] = new Tile();
			tile[974].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/974.png"));
			tile[974].colision = true;

			tile[975] = new Tile();
			tile[975].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/975.png"));
			tile[975].colision = true;

			tile[976] = new Tile();
			tile[976].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/976.png"));
			tile[976].colision = true;

			tile[977] = new Tile();
			tile[977].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/977.png"));
			tile[977].colision = true;

			tile[978] = new Tile();
			tile[978].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/978.png"));
			tile[978].colision = true;

			tile[979] = new Tile();
			tile[979].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/979.png"));
			tile[979].colision = true;

			tile[980] = new Tile();
			tile[980].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/980.png"));
			tile[980].colision = true;

			tile[981] = new Tile();
			tile[981].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/981.png"));
			tile[981].colision = true;

			tile[982] = new Tile();
			tile[982].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/982.png"));
			tile[982].colision = true;

			tile[983] = new Tile();
			tile[983].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/983.png"));
			tile[983].colision = true;

			tile[984] = new Tile();
			tile[984].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/984.png"));
			tile[984].colision = true;

			tile[985] = new Tile();
			tile[985].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/985.png"));
			tile[985].colision = true;

			tile[986] = new Tile();
			tile[986].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/986.png"));
			tile[986].colision = true;

			tile[987] = new Tile();
			tile[987].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/987.png"));
			tile[987].colision = true;

			tile[988] = new Tile();
			tile[988].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/988.png"));
			tile[988].colision = true;
			tile[988].colisionSalida4 = true;

			tile[989] = new Tile();
			tile[989].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/989.png"));
			tile[989].colision = true;
			tile[989].colisionSalida4 = true;

			tile[990] = new Tile();
			tile[990].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/990.png"));
			tile[990].colision = true;

			tile[991] = new Tile();
			tile[991].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/991.png"));
			tile[991].colision = true;

			tile[992] = new Tile();
			tile[992].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/992.png"));
			tile[992].colision = true;

			tile[993] = new Tile();
			tile[993].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/993.png"));
			tile[993].colision = true;
			
			tile[994] = new Tile();
			tile[994].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/994.png"));
			
			tile[995] = new Tile();
			tile[995].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/995.png"));
			tile[995].colision = true;
			
			// BARRERA DE LOS 1000 -------------------------------------------------------------------
			
			tile[1000] = new Tile();
			tile[1000].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1000.png"));
			tile[1000].colision = true;

			tile[1001] = new Tile();
			tile[1001].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1001.png"));
			tile[1001].colision = true;

			tile[1002] = new Tile();
			tile[1002].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1002.png"));
			tile[1002].colision = true;

			tile[1003] = new Tile();
			tile[1003].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1003.png"));
			tile[1003].colision = true;

			tile[1004] = new Tile();
			tile[1004].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1004.png"));
			tile[1004].colision = true;

			tile[1005] = new Tile();
			tile[1005].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1005.png"));
			tile[1005].colision = true;

			tile[1006] = new Tile();
			tile[1006].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1006.png"));
			tile[1006].colision = true;

			tile[1007] = new Tile();
			tile[1007].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1007.png"));
			tile[1007].colision = true;

			tile[1008] = new Tile();
			tile[1008].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1008.png"));
			tile[1008].colision = true;

			tile[1009] = new Tile();
			tile[1009].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1009.png"));
			tile[1009].colision = true;

			tile[1010] = new Tile();
			tile[1010].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1010.png"));
			tile[1010].colision = true;
			
			tile[1011] = new Tile();
			tile[1011].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1011.png"));
			tile[1011].colision = true;

			tile[1013] = new Tile();
			tile[1013].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1013.png"));
			tile[1013].colision = true;

			tile[1014] = new Tile();
			tile[1014].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1014.png"));
			tile[1014].colision = true;

			tile[1015] = new Tile();
			tile[1015].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1015.png"));
			tile[1015].colision = true;

			tile[1016] = new Tile();
			tile[1016].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1016.png"));
			tile[1016].colision = true;

			tile[1017] = new Tile();
			tile[1017].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1017.png"));
			tile[1017].colision = true;

			tile[1018] = new Tile();
			tile[1018].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1018.png"));
			tile[1018].colision = true;

			tile[1019] = new Tile();
			tile[1019].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1019.png"));
			tile[1019].colision = true;

			tile[1020] = new Tile();
			tile[1020].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1020.png"));
			tile[1020].colision = true;

			tile[1021] = new Tile();
			tile[1021].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1021.png"));
			tile[1021].colision = true;

			tile[1022] = new Tile();
			tile[1022].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1022.png"));
			tile[1022].colision = true;
			
			tile[1023] = new Tile();
			tile[1023].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1023.png"));
			tile[1023].colision = true;

			tile[1024] = new Tile();
			tile[1024].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1024.png"));
			tile[1024].colision = true;

			tile[1025] = new Tile();
			tile[1025].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1025.png"));
			tile[1025].colision = true;

			tile[1026] = new Tile();
			tile[1026].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1026.png"));
			tile[1026].colision = true;

			tile[1027] = new Tile();
			tile[1027].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1027.png"));
			tile[1027].colision = true;

			tile[1028] = new Tile();
			tile[1028].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1028.png"));
			tile[1028].colision = true;

			tile[1029] = new Tile();
			tile[1029].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1029.png"));
			tile[1029].colision = true;

			tile[1030] = new Tile();
			tile[1030].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1030.png"));
			tile[1030].colision = true;

			tile[1031] = new Tile();
			tile[1031].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1031.png"));
			tile[1031].colision = true;

			tile[1032] = new Tile();
			tile[1032].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1032.png"));
			tile[1032].colision = true;

			tile[1033] = new Tile();
			tile[1033].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1033.png"));
			tile[1033].colision = true;

			tile[1034] = new Tile();
			tile[1034].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1034.png"));
			tile[1034].colision = true;

			tile[1035] = new Tile();
			tile[1035].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1035.png"));
			tile[1035].colision = true;

			tile[1036] = new Tile();
			tile[1036].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1036.png"));
			tile[1036].colision = true;

			tile[1037] = new Tile();
			tile[1037].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1037.png"));
			tile[1037].colision = true;

			tile[1038] = new Tile();
			tile[1038].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1038.png"));
			tile[1038].colision = true;

			tile[1039] = new Tile();
			tile[1039].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1039.png"));
			tile[1039].colision = true;

			tile[1040] = new Tile();
			tile[1040].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1040.png"));

			tile[1041] = new Tile();
			tile[1041].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1041.png"));

			tile[1042] = new Tile();
			tile[1042].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1042.png"));

			tile[1043] = new Tile();
			tile[1043].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1043.png"));

			tile[1044] = new Tile();
			tile[1044].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1044.png"));

			tile[1045] = new Tile();
			tile[1045].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1045.png"));

			tile[1046] = new Tile();
			tile[1046].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1046.png"));

			tile[1047] = new Tile();
			tile[1047].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1047.png"));

			tile[1048] = new Tile();
			tile[1048].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1048.png"));
			tile[1048].colision = true;

			tile[1049] = new Tile();
			tile[1049].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1049.png"));
			tile[1049].colision = true;

			tile[1050] = new Tile();
			tile[1050].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1050.png"));
			tile[1050].colision = true;

			tile[1051] = new Tile();
			tile[1051].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1051.png"));
			tile[1051].colision = true;

			tile[1052] = new Tile();
			tile[1052].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1052.png"));

			tile[1053] = new Tile();
			tile[1053].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1053.png"));

			tile[1054] = new Tile();
			tile[1054].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1054.png"));

			tile[1055] = new Tile();
			tile[1055].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1055.png"));

			tile[1056] = new Tile();
			tile[1056].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1056.png"));

			tile[1057] = new Tile();
			tile[1057].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1057.png"));

			tile[1058] = new Tile();
			tile[1058].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1058.png"));
			tile[1058].colision = true;

			tile[1059] = new Tile();
			tile[1059].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1059.png"));
			tile[1059].colision = true;

			tile[1060] = new Tile();
			tile[1060].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1060.png"));

			tile[1061] = new Tile();
			tile[1061].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1061.png"));

			tile[1062] = new Tile();
			tile[1062].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1062.png"));

			tile[1063] = new Tile();
			tile[1063].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1063.png"));

			tile[1064] = new Tile();
			tile[1064].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1064.png"));

			tile[1065] = new Tile();
			tile[1065].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1065.png"));

			tile[1066] = new Tile();
			tile[1066].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1066.png"));
			tile[1066].colision = true;

			tile[1067] = new Tile();
			tile[1067].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1067.png"));
			tile[1067].colision = true;

			tile[1068] = new Tile();
			tile[1068].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1068.png"));
			tile[1068].colision = true;

			tile[1069] = new Tile();
			tile[1069].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1069.png"));

			tile[1070] = new Tile();
			tile[1070].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1070.png"));
			tile[1070].colision = true;

			tile[1071] = new Tile();
			tile[1071].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1071.png"));
			tile[1071].colision = true;

			tile[1072] = new Tile();
			tile[1072].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1072.png"));

			tile[1073] = new Tile();
			tile[1073].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1073.png"));
			tile[1073].colision = true;

			tile[1074] = new Tile();
			tile[1074].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1074.png"));
			tile[1074].colision = true;

			tile[1075] = new Tile();
			tile[1075].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1075.png"));

			tile[1076] = new Tile();
			tile[1076].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1076.png"));
			tile[1076].colision = true;

			tile[1077] = new Tile();
			tile[1077].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1077.png"));
			tile[1077].colision = true;

			tile[1078] = new Tile();
			tile[1078].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1078.png"));

			tile[1079] = new Tile();
			tile[1079].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1079.png"));
			tile[1079].colision = true;

			tile[1080] = new Tile();
			tile[1080].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1080.png"));
			tile[1080].colision = true;

			tile[1081] = new Tile();
			tile[1081].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1081.png"));

			tile[1082] = new Tile();
			tile[1082].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1082.png"));
			tile[1082].colision = true;

			tile[1083] = new Tile();
			tile[1083].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1083.png"));
			tile[1083].colision = true;

			tile[1084] = new Tile();
			tile[1084].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1084.png"));
			tile[1084].colision = true;

			tile[1085] = new Tile();
			tile[1085].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1085.png"));

			tile[1086] = new Tile();
			tile[1086].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1086.png"));

			tile[1087] = new Tile();
			tile[1087].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1087.png"));
			tile[1087].colision = true;

			tile[1088] = new Tile();
			tile[1088].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1088.png"));
			tile[1088].colision = true;

			tile[1089] = new Tile();
			tile[1089].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1089.png"));
			tile[1089].colision = true;

			tile[1090] = new Tile();
			tile[1090].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1090.png"));

			tile[1091] = new Tile();
			tile[1091].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1091.png"));
			tile[1091].colision = true;

			tile[1092] = new Tile();
			tile[1092].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1092.png"));
			tile[1092].colision = true;

			tile[1093] = new Tile();
			tile[1093].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1093.png"));

			tile[1094] = new Tile();
			tile[1094].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1094.png"));
			tile[1094].colision = true;

			tile[1095] = new Tile();
			tile[1095].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1095.png"));
			tile[1095].colision = true;
			
			tile[1096] = new Tile();
			tile[1096].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1096.png"));
			
			tile[1097] = new Tile();
			tile[1097].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1097.png"));

			tile[1098] = new Tile();
			tile[1098].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1098.png"));

			tile[1099] = new Tile();
			tile[1099].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1099.png"));

			tile[1100] = new Tile();
			tile[1100].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1100.png"));

			tile[1101] = new Tile();
			tile[1101].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1101.png"));

			tile[1102] = new Tile();
			tile[1102].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1102.png"));

			tile[1103] = new Tile();
			tile[1103].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1103.png"));
			tile[1103].colision = true;

			tile[1104] = new Tile();
			tile[1104].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1104.png"));
			tile[1104].colision = true;

			tile[1105] = new Tile();
			tile[1105].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1105.png"));

			tile[1106] = new Tile();
			tile[1106].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1106.png"));
			tile[1106].colision = true;

			tile[1107] = new Tile();
			tile[1107].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1107.png"));
			tile[1107].colision = true;

			tile[1108] = new Tile();
			tile[1108].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1108.png"));

			tile[1109] = new Tile();
			tile[1109].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1109.png"));
			tile[1109].colision = true;
			tile[1109].colisionSalida5 = true;

			tile[1110] = new Tile();
			tile[1110].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1110.png"));
			tile[1110].colision = true;
			tile[1110].colisionSalida5 = true;

			tile[1111] = new Tile();
			tile[1111].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1111.png"));

			tile[1112] = new Tile();
			tile[1112].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1112.png"));

			tile[1113] = new Tile();
			tile[1113].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1113.png"));

			tile[1114] = new Tile();
			tile[1114].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1114.png"));

			tile[1115] = new Tile();
			tile[1115].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1115.png"));

			tile[1116] = new Tile();
			tile[1116].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1116.png"));

			tile[1117] = new Tile();
			tile[1117].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1117.png"));

			tile[1118] = new Tile();
			tile[1118].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1118.png"));
			
			tile[1119] = new Tile();
			tile[1119].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1119.png"));
			
			tile[1120] = new Tile();
			tile[1120].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1120.png"));
			tile[1120].colision = true;
			
			tile[1121] = new Tile();
			tile[1121].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1121.png"));
			tile[1121].colision = true;
			
			tile[1122] = new Tile();
			tile[1122].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1122.png"));
			tile[1122].colision = true;

			tile[1123] = new Tile();
			tile[1123].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1123.png"));
			tile[1123].colision = true;

			tile[1124] = new Tile();
			tile[1124].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1124.png"));
			tile[1124].colision = true;

			tile[1125] = new Tile();
			tile[1125].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1125.png"));
			tile[1125].colision = true;

			tile[1126] = new Tile();
			tile[1126].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1126.png"));
			tile[1126].colision = true;

			tile[1127] = new Tile();
			tile[1127].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1127.png"));
			tile[1127].colision = true;

			tile[1128] = new Tile();
			tile[1128].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1128.png"));
			tile[1128].colision = true;

			tile[1129] = new Tile();
			tile[1129].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1129.png"));
			tile[1129].colision = true;

			tile[1130] = new Tile();
			tile[1130].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1130.png"));
			tile[1130].colision = true;

			tile[1131] = new Tile();
			tile[1131].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1131.png"));
			tile[1131].colision = true;

			tile[1132] = new Tile();
			tile[1132].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1132.png"));
			tile[1132].colision = true;

			tile[1133] = new Tile();
			tile[1133].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1133.png"));
			tile[1133].colision = true;

			tile[1134] = new Tile();
			tile[1134].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1134.png"));
			tile[1134].colision = true;

			tile[1135] = new Tile();
			tile[1135].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1135.png"));
			tile[1135].colision = true;

			tile[1136] = new Tile();
			tile[1136].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1136.png"));
			tile[1136].colision = true;

			tile[1137] = new Tile();
			tile[1137].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1137.png"));
			tile[1137].colision = true;

			tile[1138] = new Tile();
			tile[1138].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1138.png"));
			tile[1138].colision = true;

			tile[1139] = new Tile();
			tile[1139].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1139.png"));

			tile[1140] = new Tile();
			tile[1140].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1140.png"));
			tile[1140].colision = true;

			tile[1141] = new Tile();
			tile[1141].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1141.png"));
			tile[1141].colision = true;

			tile[1142] = new Tile();
			tile[1142].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1142.png"));
			tile[1142].colision = true;

			tile[1143] = new Tile();
			tile[1143].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1143.png"));
			tile[1143].colision = true;

			tile[1144] = new Tile();
			tile[1144].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1144.png"));
			tile[1144].colision = true;

			tile[1145] = new Tile();
			tile[1145].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1145.png"));
			tile[1145].colision = true;

			tile[1146] = new Tile();
			tile[1146].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1146.png"));
			tile[1146].colision = true;

			tile[1147] = new Tile();
			tile[1147].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1147.png"));
			tile[1147].colision = true;

			tile[1148] = new Tile();
			tile[1148].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1148.png"));
			tile[1148].colision = true;

			tile[1149] = new Tile();
			tile[1149].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1149.png"));
			tile[1149].colision = true;
			
			tile[1148] = new Tile();
			tile[1148].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1148.png"));
			tile[1148].colisionSalida6 = true;
			
			tile[1149] = new Tile();
			tile[1149].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1149.png"));
			tile[1149].colisionSalida6 = true;
			
			tile[1150] = new Tile();
			tile[1150].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1150.png"));
			tile[1150].colision = true;
			
			tile[1151] = new Tile();
			tile[1151].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1151.png"));
			
			tile[1152] = new Tile();
			tile[1152].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1152.png"));
			tile[1152].colision = true;
			
			tile[1153] = new Tile();
			tile[1153].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1153.png"));
			tile[1153].colision = true;
			
			tile[1154] = new Tile();
			tile[1154].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1154.png"));
			tile[1154].colision = true;
			
			tile[1155] = new Tile();
			tile[1155].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1155.png"));
			tile[1155].colision = true;
			
			tile[1156] = new Tile();
			tile[1156].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1156.png"));
			tile[1156].colision = true;
			
			tile[1157] = new Tile();
			tile[1157].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1157.png"));
			tile[1157].colision = true;
			
			tile[1158] = new Tile();
			tile[1158].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1158.png"));
			tile[1158].colision = true;
			
			tile[1159] = new Tile();
			tile[1159].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1159.png"));
			tile[1159].colision = true;

			tile[1160] = new Tile();
			tile[1160].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1160.png"));
			tile[1160].colision = true;

			tile[1161] = new Tile();
			tile[1161].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1161.png"));
			tile[1161].colision = true;

			tile[1162] = new Tile();
			tile[1162].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1162.png"));
			tile[1162].colision = true;

			tile[1163] = new Tile();
			tile[1163].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1163.png"));
			tile[1163].colision = true;

			tile[1164] = new Tile();
			tile[1164].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1164.png"));
			tile[1164].colision = true;

			tile[1165] = new Tile();
			tile[1165].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1165.png"));
			tile[1165].colision = true;

			tile[1166] = new Tile();
			tile[1166].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1166.png"));
			tile[1166].colision = true;

			tile[1167] = new Tile();
			tile[1167].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1167.png"));
			tile[1167].colision = true;

			tile[1168] = new Tile();
			tile[1168].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1168.png"));
			tile[1168].colision = true;

			tile[1169] = new Tile();
			tile[1169].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1169.png"));
			tile[1169].colision = true;

			tile[1170] = new Tile();
			tile[1170].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1170.png"));
			tile[1170].colision = true;

			tile[1171] = new Tile();
			tile[1171].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1171.png"));
			tile[1171].colision = true;

			tile[1172] = new Tile();
			tile[1172].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1172.png"));
			tile[1172].colision = true;

			tile[1173] = new Tile();
			tile[1173].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1173.png"));
			tile[1173].colision = true;

			tile[1174] = new Tile();
			tile[1174].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1174.png"));
			tile[1174].colision = true;

			tile[1175] = new Tile();
			tile[1175].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1175.png"));
			tile[1175].colision = true;

			tile[1176] = new Tile();
			tile[1176].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1176.png"));
			tile[1176].colision = true;

			tile[1178] = new Tile();
			tile[1178].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1178.png"));
			tile[1178].colision = true;

			tile[1179] = new Tile();
			tile[1179].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1179.png"));
			tile[1179].colision = true;

			tile[1180] = new Tile();
			tile[1180].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1180.png"));
			tile[1180].colision = true;

			tile[1181] = new Tile();
			tile[1181].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1181.png"));
			tile[1181].colision = true;

			tile[1182] = new Tile();
			tile[1182].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1182.png"));
			tile[1182].colision = true;

			tile[1183] = new Tile();
			tile[1183].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1183.png"));
			tile[1183].colision = true;

			tile[1184] = new Tile();
			tile[1184].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1184.png"));
			tile[1184].colision = true;

			tile[1185] = new Tile();
			tile[1185].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1185.png"));
			tile[1185].colision = true;

			tile[1186] = new Tile();
			tile[1186].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1186.png"));
			tile[1186].colision = true;

			tile[1187] = new Tile();
			tile[1187].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1187.png"));
			tile[1187].colision = true;

			tile[1188] = new Tile();
			tile[1188].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1188.png"));

			tile[1189] = new Tile();
			tile[1189].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1189.png"));
			tile[1189].colision = true;

			tile[1190] = new Tile();
			tile[1190].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1190.png"));
			tile[1190].colision = true;

			tile[1191] = new Tile();
			tile[1191].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1191.png"));
			tile[1191].colision = true;

			tile[1192] = new Tile();
			tile[1192].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1192.png"));
			tile[1192].colision = true;

			tile[1193] = new Tile();
			tile[1193].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1193.png"));
			tile[1193].colision = true;

			tile[1194] = new Tile();
			tile[1194].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1194.png"));
			tile[1194].colision = true;

			tile[1195] = new Tile();
			tile[1195].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1195.png"));
			tile[1195].colision = true;

			tile[1196] = new Tile();
			tile[1196].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1196.png"));
			tile[1196].colision = true;

			tile[1197] = new Tile();
			tile[1197].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1197.png"));

			tile[1198] = new Tile();
			tile[1198].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1198.png"));

			tile[1199] = new Tile();
			tile[1199].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1199.png"));
			tile[1199].colision = true;

			tile[1200] = new Tile();
			tile[1200].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1200.png"));
			tile[1200].colision = true;

			tile[1201] = new Tile();
			tile[1201].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1201.png"));

			tile[1202] = new Tile();
			tile[1202].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1202.png"));
			tile[1202].colision = true;

			tile[1203] = new Tile();
			tile[1203].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1203.png"));

			tile[1204] = new Tile();
			tile[1204].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1204.png"));

			tile[1205] = new Tile();
			tile[1205].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1205.png"));
			tile[1205].colision = true;

			tile[1206] = new Tile();
			tile[1206].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1206.png"));
			tile[1206].colision = true;

			tile[1207] = new Tile();
			tile[1207].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1207.png"));
			tile[1207].colision = true;

			tile[1208] = new Tile();
			tile[1208].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1208.png"));
			tile[1208].colision = true;

			tile[1209] = new Tile();
			tile[1209].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1209.png"));
			tile[1209].colision = true;

			tile[1210] = new Tile();
			tile[1210].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1210.png"));
			tile[1210].colision = true;

			tile[1211] = new Tile();
			tile[1211].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1211.png"));
			tile[1211].colision = true;

			tile[1212] = new Tile();
			tile[1212].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1212.png"));
			tile[1212].colision = true;

			tile[1213] = new Tile();
			tile[1213].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1213.png"));
			tile[1213].colision = true;

			tile[1214] = new Tile();
			tile[1214].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1214.png"));
			tile[1214].colision = true;

			tile[1215] = new Tile();
			tile[1215].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1215.png"));
			tile[1215].colision = true;

			tile[1216] = new Tile();
			tile[1216].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1216.png"));
			tile[1216].colision = true;

			tile[1217] = new Tile();
			tile[1217].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1217.png"));
			tile[1217].colisionSalida8 = true;

			tile[1218] = new Tile();
			tile[1218].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1218.png"));
			tile[1218].colisionSalida8 = true;

			tile[1219] = new Tile();
			tile[1219].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1219.png"));
			tile[1219].colision = true;
			
			tile[1220] = new Tile();
			tile[1220].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1220.png"));
			tile[1220].colision = true;
			tile[1220].colisionEntrada10 = true;
			
			tile[1221] = new Tile();
			tile[1221].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1221.png"));
			tile[1221].colision = true;

			tile[1222] = new Tile();
			tile[1222].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1222.png"));
			tile[1222].colision = true;

			tile[1223] = new Tile();
			tile[1223].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1223.png"));
			tile[1223].colision = true;

			tile[1224] = new Tile();
			tile[1224].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1224.png"));
			tile[1224].colision = true;

			tile[1225] = new Tile();
			tile[1225].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1225.png"));
			tile[1225].colision = true;

			tile[1226] = new Tile();
			tile[1226].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1226.png"));
			tile[1226].colision = true;

			tile[1227] = new Tile();
			tile[1227].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1227.png"));
			tile[1227].colision = true;

			tile[1228] = new Tile();
			tile[1228].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1228.png"));
			tile[1228].colision = true;

			tile[1229] = new Tile();
			tile[1229].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1229.png"));
			tile[1229].colision = true;

			tile[1230] = new Tile();
			tile[1230].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1230.png"));
			tile[1230].colision = true;

			tile[1231] = new Tile();
			tile[1231].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1231.png"));
			tile[1231].colision = true;

			tile[1232] = new Tile();
			tile[1232].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1232.png"));
			tile[1232].colision = true;

			tile[1233] = new Tile();
			tile[1233].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1233.png"));
			tile[1233].colision = true;

			tile[1234] = new Tile();
			tile[1234].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1234.png"));
			tile[1234].colision = true;

			tile[1235] = new Tile();
			tile[1235].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1235.png"));
			tile[1235].colision = true;

			tile[1236] = new Tile();
			tile[1236].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1236.png"));
			tile[1236].colision = true;

			tile[1237] = new Tile();
			tile[1237].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1237.png"));

			tile[1238] = new Tile();
			tile[1238].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1238.png"));
			tile[1238].colision = true;

			tile[1239] = new Tile();
			tile[1239].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1239.png"));
			tile[1239].colision = true;

			tile[1240] = new Tile();
			tile[1240].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1240.png"));

			tile[1241] = new Tile();
			tile[1241].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1241.png"));
			tile[1241].colision = true;

			tile[1242] = new Tile();
			tile[1242].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1242.png"));
			tile[1242].colision = true;

			tile[1243] = new Tile();
			tile[1243].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1243.png"));
			tile[1243].colision = true;

			tile[1244] = new Tile();
			tile[1244].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1244.png"));
			tile[1244].colision = true;

			tile[1245] = new Tile();
			tile[1245].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1245.png"));
			tile[1245].colision = true;

			tile[1246] = new Tile();
			tile[1246].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1246.png"));
			tile[1246].colision = true;

			tile[1247] = new Tile();
			tile[1247].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1247.png"));
			tile[1247].colision = true;

			tile[1248] = new Tile();
			tile[1248].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1248.png"));
			tile[1248].colision = true;

			tile[1249] = new Tile();
			tile[1249].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1249.png"));
			tile[1249].colision = true;
			
			tile[1250] = new Tile();
			tile[1250].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1250.png"));
			tile[1250].colision = true;
			
			tile[1251] = new Tile();
			tile[1251].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1251.png"));
			tile[1251].colisionNpc2 = true;
			
			tile[1252] = new Tile();
			tile[1252].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1252.png"));
			tile[1252].colision = true;
			tile[1252].colisionNpc1 = true;
			
			tile[1253] = new Tile();
			tile[1253].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1253.png"));
			tile[1253].colision = true;
			
			tile[1254] = new Tile();
			tile[1254].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1254.png"));
			tile[1254].colision = true;
			
			tile[1255] = new Tile();
			tile[1255].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1255.png"));
			tile[1255].colision = true;
			
			tile[1256] = new Tile();
			tile[1256].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1256.png"));
			tile[1256].colision = true;
			tile[1256].colisionNpc3 = true;
			
			tile[1257] = new Tile();
			tile[1257].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1257.png"));
			tile[1257].colision = true;
			
			tile[1258] = new Tile();
			tile[1258].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1258.png"));
			tile[1258].colision = true;
			
			tile[1259] = new Tile();
			tile[1259].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1259.png"));
			tile[1259].colision = true;
			
			tile[1260] = new Tile();
			tile[1260].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1260.png"));
			tile[1260].colision = true;
			tile[1260].colisionNpc4 = true;
			
			tile[1261] = new Tile();
			tile[1261].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1261.png"));
			tile[1261].colision = true;
			
			tile[1262] = new Tile();
			tile[1262].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1262.png"));
			tile[1262].colision = true;
			
			tile[1263] = new Tile();
			tile[1263].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1263.png"));
			tile[1263].colision = true;
			
			tile[1264] = new Tile();
			tile[1264].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1264.png"));
			tile[1264].colision = true;
			tile[1264].colisionNpc5 = true;
			
			tile[1265] = new Tile();
			tile[1265].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1265.png"));
			tile[1265].colision = true;
			tile[1265].colisionNpc5 = true;
			
			tile[1266] = new Tile();
			tile[1266].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1266.png"));
			tile[1266].colision = true;
			tile[1266].colisionNpc6 = true;
			
			tile[1267] = new Tile();
			tile[1267].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1267.png"));
			tile[1267].colision = true;
			tile[1267].colisionNpc6 = true;
			
			tile[1268] = new Tile();
			tile[1268].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1268.png"));
			tile[1268].colision = true;
			tile[1268].colisionNpc6 = true;
			
			tile[1269] = new Tile();
			tile[1269].imagen = ImageIO.read(getClass().getResourceAsStream("/tiles/1269.png"));
			tile[1269].colision = true;
			tile[1266].colisionNpc6 = true;
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void cargarMapa(String rutaArchivo, int mapa) {
		try {
			//EXPORTA EL MAPA
			InputStream mapa1 = getClass().getResourceAsStream(rutaArchivo);
			//LEE EL MAPA
			BufferedReader br = new BufferedReader(new InputStreamReader(mapa1));
			
			int col = 0;
			int fil = 0;
			
			while(col < aj.mundoCol && fil < aj.mundoFil) {
				
				String linea = br.readLine();
				
				while(col < aj.mundoCol) {
					
					String numeros[] = linea.split(" ");
					
					int num = Integer.parseInt(numeros[col]);
					
					numTileMap[mapa][col][fil] = num;
					col++;
				}
				if(col == aj.mundoCol) {
					col = 0;
					fil++;
				}
			}
			br.close();
		}
		catch(Exception e) {
			
		}
	}
	
	public void dibujar(Graphics2D g2) {
		
		int MundoCol = 0;
		int MundoFil = 0;
		
		while(MundoCol < aj.mundoCol && MundoFil < aj.mundoFil) {
			
			int numTile = numTileMap[aj.mapaActual][MundoCol][MundoFil];
			
			int mundoX = MundoCol * aj.tamPantalla;
			int mundoY = MundoFil * aj.tamPantalla;
			int pantallaX = mundoX - aj.jugador.MundoX + aj.jugador.pantallaX;
			int pantallaY = mundoY - aj.jugador.MundoY + aj.jugador.pantallaY;
			
			g2.drawImage(tile[numTile].imagen, pantallaX, pantallaY, aj.tamPantalla, aj.tamPantalla, null);
			/*g2.setColor(Color.blue);
			g2.fillRect(x, y, 25, 25);*/
			
			MundoCol++;
			
			if(MundoCol == aj.mundoCol) {
				MundoCol = 0;
				MundoFil++;
			}
		}
		
	}
}