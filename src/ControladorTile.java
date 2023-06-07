import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class ControladorTile {
	
	AdminitradorJuego aj;
	public Tile[] tile;
	public int numTileMap[][];

	
	
	public ControladorTile(AdminitradorJuego aj) {
		
		this.aj = aj;
		
		tile = new Tile[200];
		numTileMap = new int[aj.mundoCol][aj.mundoFil];
		
		cargarTile();
		cargarMapa("/mapas/mapa1.txt");
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
			tile[38].colision = true;
			
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
			tile[94].colision = true;
			
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
			tile[147].colision = true;
			
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
			
				
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void cargarMapa(String rutaArchivo) {
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
					
					numTileMap[col][fil] = num;
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
			
			int numTile = numTileMap[MundoCol][MundoFil];
			
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
