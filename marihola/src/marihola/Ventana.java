package marihola;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(640, 360);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().setBackground(Color.decode("#b3eefe"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.repaint();
		this.revalidate();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		//EL ARBUSTO JAJAJAJAJWDAIBEKFHVCB
		int xpoll[] = {24,24,20,20,22,24,24,27,27,29,29,31,31,35,36,47,47,50,51,55,58,58,60,60,62,62,60,59};
		int ypoll[] = {322,319,319,307,307,308,301,301,291,291,288,288,284,284,282,282,284,284,287,293,293,300,302,306,307,319,320,322};
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(xpoll, ypoll, 28);
		
		int xpoll2[] = {28,25,25,28,28,31,31,32,32,36,36,46,46,49,52,52,55,55,57,57,59,59,57};
		int ypoll2[] = {321,317,309,309,301,301,298,298,289,289,285,285,288,288,293,295,295,300,302,306,308,319,321};
		g.setColor(Color.decode("#43d06f"));
		g.fillPolygon(xpoll2, ypoll2, 23);
		g.setColor(Color.decode("#00000"));
		g.drawPolygon(xpoll2,ypoll2,23);
		
		//TUBO TUBO TUBO
		g.setColor(Color.decode("#00000"));
		g.fillRect(425,242,75,80);
		g.fillRect(421,201,82,41);
		g.setColor(Color.decode("#188813"));
		g.fillRect(428,243,68,76);
		g.fillRect(425,205,74,31);
		
		g.setColor(Color.decode("#5ce168"));
		g.fillRect(431,243,3,76);
		g.fillRect(437,243,7,76);
		g.fillRect(450,243,2,76);
		g.fillRect(468,243,3,76);
		g.setColor(Color.decode("#001c00"));
		g.fillRect(471,243,9,76);
		g.fillRect(483,243,14,76);
		g.setColor(Color.decode("#335237"));
		g.fillRect(480,243,2,76);
		g.fillRect(474,243,3,76);
		g.fillRect(491,243,2,76);
		
		g.setColor(Color.decode("#5ce168"));
		g.fillRect(429,205,3,31);
		g.fillRect(435,205,7,31);
		g.fillRect(448,205,2,31);
		g.fillRect(470,205,3,31);
		g.setColor(Color.decode("#001c00"));
		g.fillRect(473,205,9,31);
		g.fillRect(485,205,14,31);
		g.setColor(Color.decode("#335237"));
		g.fillRect(478,205,2,31);
		g.fillRect(474,205,2,31);
		g.fillRect(495,205,2,31);
		
		//PLANTA
		g.setColor(Color.decode("#213123"));
		g.fillRect(456,168,10,33);
		g.fillArc(438,167,20,18,120,200);
		g.fillArc(438,182,20,18,120,200);
		g.fillArc(458,167,20,18,240,200);
		g.fillArc(458,182,20,18,240,200);
		g.setColor(Color.decode("#d54225"));
		g.fillArc(440,131,38,38,230,300);
		int plantx[] = {442,444,444,451,451,469,469,471,471,473,473,454,449,449,448,448,451,459,458,454,444,442};
		int planty[] = {143,143,140,140,138,138,140,140,142,144,150,163,163,161,161,158,154,149,146,149,149,146};
		int plantx2[] = {444,448,448,445,445,466,466,471,471,469,469,466,466,464,464,462,462,458,458,454,454,450,450,452,452,457,457,459,459,460,460,465,465,466,466,454,454,444};
		int planty2[] = {145,145,144,144,140,140,143,143,150,150,151,151,153,153,156,156,157,157,159,159,161,161,159,159,155,155,154,154,152,152,151,151,147,147,145,145,147,147};
		for (int ii=0;ii<planty.length;ii++) {
			plantx[ii] -= 6;
			planty[ii] += 2;
		}
		for (int ii=0;ii<planty2.length;ii++) {
			plantx2[ii] -= 7;
			planty2[ii] += 3;
		}
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(plantx, planty, 22);
		g.setColor(Color.decode("#f3e5e8"));
		g.fillPolygon(plantx2, planty2, 38);
		//fuego
		int fuegox[]= {379,387,387,389,389,392,392,389,389,387,387,379,379,378,378,375,375,374,374,373,373,374,374,378,378,381,381,378,378,375,375,374,374,375,375,379};
		int fuegoy[]= {207,207,209,209,212,212,222,222,224,224,227,227,229,229,228,228,227,227,223,223,222,222,224,224,222,222,220,220,216,216,215,215,210,210,209,209};
		g.setColor(Color.decode("#ce4d4c"));
		g.fillPolygon(fuegox,fuegoy, 36);
		int fuegox2[]= {380,386,386,389,389,387,387,386,386,382,382,379,379,378,378,379,379,380};
		int fuegoy2[]= {209,209,213,213,219,219,221,221,219,219,216,216,215,215,213,213,212,212};
		g.setColor(Color.decode("#FFFFFF"));
		g.fillPolygon(fuegox2,fuegoy2, 18);
		//BLOQUES
		
		int xb = 20, yb = 161;
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb,yb,42,40, 2, 2);
						
		g.setColor(Color.decode("#ff8f5f"));
		g.fillRoundRect(xb+4,yb+4,36,34, 2, 2);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+6,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+6,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+31,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+31,3,5,20,20);
		
		xb = 101;
		yb = 44;
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb,yb,42,40, 2, 2);
						
		g.setColor(Color.decode("#ff8f5f"));
		g.fillRoundRect(xb+4,yb+2,36,34, 2, 2);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+4,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+4,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+29,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+29,3,5,20,20);
	
		xb = 141;
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb,yb,42,40, 2, 2);
						
		g.setColor(Color.decode("#ff8f5f"));
		g.fillRoundRect(xb+4,yb+2,36,34, 2, 2);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+4,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+4,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+6,yb+29,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+34,yb+29,3,5,20,20);
		
		xb = 581;
		yb = 82;
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb,yb,42,40, 2, 2);
						
		g.setColor(Color.decode("#ff8f5f"));
		g.fillRoundRect(xb+3,yb+3,36,34, 2, 2);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+5,yb+5,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+33,yb+5,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+5,yb+30,3,5,20,20);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(xb+33,yb+30,3,5,20,20);
		
		int bloquex[] = {114,116,116,114,114,109,109,107,107,112,112,113,113,114};
		int bloquey[] = {54,54,62,62,65,65,67,67,62,62,61,61,60,60,};
		int bloquex2[] = {107,110,110,113,113,112,112,111,111,107};
		int bloquey2[] = {52,52,53,53,60,60,61,61,62,62};
		for (int ii=0;ii<bloquex.length;ii++) {
			bloquex[ii] -= 3;
		}
		for (int ii=0;ii<bloquex2.length;ii++) {
			bloquex2[ii] -= 3;
		}
		
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(bloquex,bloquey, 14);
		g.setColor(Color.decode("#f2ccc6"));
		g.fillPolygon(bloquex2,bloquey2, 10);
		
		int bloquex3[] = {138,138,130,130,131,131,137,137,138};
		int bloquey3[] = {54,60,60,59,59,58,58,55,55};
		int bloquex4[] = {132,138,138,137,137,136,136,130,130,129,129,130,130,131,131,132};
		int bloquey4[] = {51,51,53,53,54,54,57,57,58,58,54,54,53,53,52,52};
		for (int ii=0;ii<bloquex3.length;ii++) {
			bloquex3[ii] += 3;
		}
		for (int ii=0;ii<bloquex4.length;ii++) {
			bloquex4[ii] += 3;
		}
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(bloquex3,bloquey3, 9);
		g.setColor(Color.decode("#f2ccc6"));
		g.fillPolygon(bloquex4,bloquey4, 16);
		
		for (int ii=0;ii<bloquex.length;ii++) {
			bloquex[ii] += 479;
			bloquey[ii] += 40;
		}
		for (int ii=0;ii<bloquex2.length;ii++) {
			bloquex2[ii] += 479;
			bloquey2[ii] += 40;
		}
		for (int ii=0;ii<bloquex3.length;ii++) {
			bloquex3[ii] += 479;
			bloquey3[ii] += 40;
		}
		for (int ii=0;ii<bloquex4.length;ii++) {
			bloquex4[ii] += 479;
			bloquey4[ii] += 40;
		}
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(bloquex,bloquey, 14);
		g.setColor(Color.decode("#f2ccc6"));
		g.fillPolygon(bloquex2,bloquey2, 10);
		g.setColor(Color.decode("#00000"));
		g.fillPolygon(bloquex3,bloquey3, 9);
		g.setColor(Color.decode("#f2ccc6"));
		g.fillPolygon(bloquex4,bloquey4, 16);
		
		//sombra azul   
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(330,143,32,180, 20, 20);
		
		//cuadro azul
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(221,122,122,200, 20, 20);
		
		g.setColor(Color.decode("#84c0ff"));
		g.fillRoundRect(223,124,118,196, 20, 20);
		
		g.setColor(Color.decode("#1e91df"));
		g.fillRect(334,126,4,192);
		g.fillRect(338,128,2,186);
		g.fillRect(340,130,1,184);
		
		g.setColor(Color.decode("#2c6ba9"));
		g.fillRect(282,316,55,3);
		g.fillRect(282,319,53,2);
		
		//El Mario?
		
		//fondocuerpo
		int marx[] = {340,349,349,351,351,356,356,358,358,355,355,351,351,356,356,358,358,356,356,353,353,351,351,349,349,351,351,353,353,355,355,353,353,351,351,346,346,348,348,349,349,332,332,329,329,327,327,329,329,331,331,329,329,327,327,329,329,331,331,334,334,336,336,340};
		int mary[] = {260,260,262,262,267,267,270,270,271,271,273,273,277,277,279,279,282,282,284,284,287,287,289,289,292,292,294,294,299,299,307,307,312,312,314,314,317,317,318,318,322,322,312,312,303,303,292,292,288,288,285,285,282,282,274,274,270,270,267,267,265,265,263,263};
		g.setColor(Color.decode("#040301"));
		g.fillPolygon(marx, mary, 64);
		//ropa
		int marx2[] = {341,349,349,342,342,338,338,337,337,335,335,331,331,333,333,334,334,336,336,337,337,340,340,341};
		int mary2[] = {262,262,266,266,268,268,269,269,271,271,273,273,270,270,268,268,267,267,265,265,264,264,263,263};
		g.setColor(Color.decode("#c63d22"));
		g.fillPolygon(marx2, mary2,24);
		int marx4[] = {331,335,335,337,337,339,339,334,334,333,333,331,331,329,329,330,330,330};
		int mary4[] = {290,290,292,292,299,299,303,303,302,302,300,300,298,298,293,293,292,292};
		g.fillPolygon(marx4, mary4,18);
		int marx5[] = {333,345,345,346,346,347,347,333};
		int mary5[] = {315,315,317,317,318,318,320,320};
		g.fillPolygon(marx5, mary5, 8);
		
		g.setColor(Color.decode("#FFFFFF"));
		g.fillRect(343,304,4,2);
		g.fillRect(352,301,2,4);
		
		//piel
		int marx3[] = {340,349,349,355,355,353,353,348,348,345,345,342,342,340,340,345,345,349,349,348,348,338,338,336,336,331,331,329,329,332,332,333,333,335,335,338,338,340,340,338,338,340};
		int mary3[] = {272,272,279,279,282,282,284,284,282,282,280,280,282,282,285,285,287,287,288,288,289,289,287,287,284,284,282,282,276,276,277,277,281,281,283,283,281,281,278,278,274,274};
		g.setColor(Color.decode("#f8c5c0"));
		g.fillPolygon(marx3, mary3,42);
		g.fillOval(340,293,12,9);
		
		g.setColor(Color.decode("#00000"));
		g.fillRect(345,274,3,5);
		//Sombra 1
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(240,222,43,104, 20, 20);
		
		//cuadro verde JAJAJAJA

		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(542,202,122,122, 20, 20);
				
		g.setColor(Color.decode("#51d96b"));
		g.fillRoundRect(544,204,118,118, 20, 20);
			
		g.setColor(Color.decode("#2a5e28"));
		g.fillRect(546,317,114,1);
		g.fillRect(547,317,114,3);
		g.fillRect(549,320,114,1);
		g.fillRect(550,321,114,1);
		
		//cuadro 1

		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(140,202,122,122, 20, 20);
		
		g.setColor(Color.decode("#ffc3b8"));
		g.fillRoundRect(142,204,118,118, 20, 20);
		
		g.setColor(Color.decode("#e8906c"));
		g.fillRect(253,206,3,114);
		g.fillRect(255,207,2,112);
		g.fillRect(257,208,2,110);
		g.fillRect(259,209,1,108);
		g.fillRect(259,209,1,108);
		
		g.setColor(Color.decode("#dca286"));
		g.fillRect(144,316,114,3);
		g.fillRect(146,319,110,2);
		g.fillRect(148,321,106,1);
		
		//tuercas cuadro verde

		int x3=547,y3=207;
		g.setColor(Color.decode("#00000"));
		g.fillOval(x3,y3,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x3+2,y3+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x3+3,y3+10,x3+11,y3+2);
		g.drawLine(x3+3,y3+9,x3+11,y3+3);
				
		y3+= 95;
				
		g.setColor(Color.decode("#00000"));
		g.fillOval(x3,y3,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x3+2,y3+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x3+3,y3+10,x3+11,y3+2);
		g.drawLine(x3+3,y3+9,x3+11,y3+3);

		//tuercas cuadro azul
				int x2=227,y2=128;
		g.setColor(Color.decode("#00000"));
		g.fillOval(x2,y2,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x2+2,y2+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x2+3,y2+10,x2+11,y2+2);
		g.drawLine(x2+3,y2+9,x2+11,y2+3);
				
		x2+= 95;
				
		g.setColor(Color.decode("#00000"));
		g.fillOval(x2,y2,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x2+2,y2+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x2+3,y2+10,x2+11,y2+2);
		g.drawLine(x2+3,y2+9,x2+11,y2+3);
			
		y2+=175;
				
		g.setColor(Color.decode("#00000"));
		g.fillOval(x2,y2,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x2+2,y2+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x2+3,y2+10,x2+11,y2+2);
		g.drawLine(x2+3,y2+9,x2+11,y2+3);
		
		//tuerca cuadro 1
		int x=147,y=207;
		g.setColor(Color.decode("#00000"));
		g.fillOval(x,y,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x+2,y+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x+3,y+10,x+11,y+2);
		g.drawLine(x+3,y+9,x+11,y+3);
		
		x+= 95;
		
		g.setColor(Color.decode("#00000"));
		g.fillOval(x,y,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x+2,y+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x+3,y+10,x+11,y+2);
		g.drawLine(x+3,y+9,x+11,y+3);
		
		y+=95;
		
		g.setColor(Color.decode("#00000"));
		g.fillOval(x,y,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x+2,y+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x+3,y+10,x+11,y+2);
		g.drawLine(x+3,y+9,x+11,y+3);
		
		x-=95;
		
		g.setColor(Color.decode("#00000"));
		g.fillOval(x,y,14,14);
		g.setColor(Color.decode("#c0cbcd"));
		g.fillOval(x+2,y+2,10,10);
		g.setColor(Color.decode("#00000"));
		g.drawLine(x+3,y+10,x+11,y+2);
		g.drawLine(x+3,y+9,x+11,y+3);
		
		
		
		//piso JAJJAJA
		
		g.setColor(Color.decode("#f39c70"));
		g.fillRect(0, 338, 640, 22);
		
		g.setColor(Color.decode("#582b1c"));
		g.fillRect(0, 334, 640, 4);
		
		g.setColor(Color.decode("#f9cbbf"));
		g.fillRect(0, 325, 640, 9);
		
		g.setColor(Color.decode("#312a1f"));
		g.fillRect(0, 322, 640, 3);
		
		int pisox [] = {5,13,13,16,16,22,22,26,26,29,29,31,32,32,33,33,34,34,39,30,30,27,27,25,25,22,22,17,17,13,13,7,7,5};
		int pisoy [] = {342,342,344,344,346,346,350,350,352,352,354,354,357,357,358,358,359,359,359,357,357,354,354,353,353,351,351,349,349,346,346,344,344};
		for (int ii=0;ii<pisoy.length;ii++) {
			pisoy[ii] -= 5;
		}
		g.setColor(Color.decode("#350906"));
		for (int i=0;i<=31;i++) {
			g.fillPolygon(pisox, pisoy, 33);
			for (int ii=0;ii<pisoy.length;ii++) {
				pisox[ii] += 20;
			}
		}
	}
	/*public void bloques(Graphics g,int x,int y) {
		super.paint(g);
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(x,y,42,40, 2, 2);
						
		g.setColor(Color.decode("#ff8f5f"));
		g.fillRoundRect(x+4,y+4,36,34, 2, 2);
		}*/
}