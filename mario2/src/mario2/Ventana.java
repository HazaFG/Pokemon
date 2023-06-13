package mario2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ventana extends JFrame{

public Ventana() {
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(640, 486);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().setBackground(Color.decode("#0165c1"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.repaint();
		this.revalidate();
	}
public void paint (Graphics g) {
	
	super.paint(g);
	//FONDO
	
	int x = 14;
	int y = 139;
	
	g.setColor(Color.decode("#FFFFFF"));
	g.fillRoundRect(176, 308, 160, 34,80,20);
	g.fillRoundRect(56, 340, 160, 34,80,20);
	g.fillRoundRect(176, 374, 160, 34,80,20);
	
	
	g.setColor(Color.decode("#c7e4e8"));
	g.fillOval(x,y, 100, 100);
	g.fillRect(x,y+44,100,500);
	g.setColor(Color.decode("#FFFFFF"));
	g.fillOval(x+63,y+35, 15, 25);
	g.fillOval(x+62,y+117, 15, 25);
	g.fillOval(x+22,y+138, 15, 25);
	x+=230;
	g.setColor(Color.decode("#c7e4e8"));
	g.fillOval(x,y, 100, 100);
	g.fillRect(x,y+44,100,500);
	g.setColor(Color.decode("#FFFFFF"));
	g.fillOval(x+20,y+20, 15, 25);
	g.fillOval(x+62,y+80, 15, 25);
	g.fillOval(x+22,y+138, 15, 25);
	x+=104;
	y-=70;
	g.setColor(Color.decode("#c7e4e8"));
	g.fillOval(x,y, 100, 100);
	g.fillRect(x,y+44,100,500);
	g.setColor(Color.decode("#FFFFFF"));
	g.fillOval(x+63,y+35, 15, 25);
	g.fillOval(x+20,y+50, 15, 25);
	g.fillOval(x+15,y+110, 15, 25);
	
	y+=250;
	x-=400;
	
	g.setColor(Color.decode("#77b3d8"));
	g.fillOval(x,y-32, 160, 160);
	g.fillRect(x,y+44,160,500);
	g.setColor(Color.decode("#c8e4e7"));
	g.fillOval(x+63,y+35, 18, 28);
	g.fillOval(x+62,y+117, 18, 28);
	g.fillOval(x+22,y+138, 18, 28);
	
	x+=280;
	
	g.setColor(Color.decode("#77b3d8"));
	g.fillOval(x,y-32, 160, 160);
	g.fillRect(x,y+44,160,500);
	g.setColor(Color.decode("#c8e4e7"));
	g.fillOval(x+63,y+35, 18, 28);
	g.fillOval(x+62,y+117, 18, 28);
	g.fillOval(x+22,y+138, 18, 28);
	
	
	x+=160;
	y-=90;
	g.setColor(Color.decode("#FFFFFF"));
	g.fillRoundRect(334, 271, 160, 34,80,20);
	
	g.setColor(Color.decode("#77b3d8"));
	g.fillOval(x,y-32, 160, 160);
	g.fillRect(x,y+44,160,500);
	g.setColor(Color.decode("#c8e4e7"));
	g.fillOval(x+63,y+35, 18, 28);
	g.fillOval(x+62,y+117, 18, 28);
	g.fillOval(x+22,y+138, 18, 28);
	
	//nubes
	g.setColor(Color.decode("#FFFFFF"));
	g.fillRoundRect(134, 236, 160, 34,80,20);
	
	g.fillRoundRect(-80, 203, 160, 34,80,20);
	
	g.fillRoundRect(448, 135, 120, 34,80,20);
	
	//bloquesssssss
	
	g.setColor(Color.decode("#00000"));
	g.fillRoundRect(547,374,40,40,30,20);
	g.fillRoundRect(547,334,40,40,30,20);
	g.fillRoundRect(547,294,40,40,30,20);
	g.setColor(Color.decode("#9e9ba1"));
	g.fillRoundRect(549,376,36,36,30,20);
	g.fillRoundRect(549,336,36,36,30,20);
	g.fillRoundRect(549,296,36,36,30,20);
	
	g.setColor(Color.decode("#00000"));
	g.fillRoundRect(587,294,40,40,30,20);
	g.setColor(Color.decode("#fcdc21"));
	g.fillRoundRect(589,296,36,36,30,20);
	g.setColor(Color.decode("#00000"));
	g.fillRoundRect(600,302,4,14,30,20);
	g.fillRoundRect(610,302,4,14,30,20);
	g.fillOval(602, 318, 10, 10);
	
	g.setColor(Color.decode("#00000"));
	g.fillRoundRect(587+40,294,40,40,30,20);
	g.setColor(Color.decode("#fcdc21"));
	g.fillRoundRect(589+40,296,36,36,30,20);
	g.setColor(Color.decode("#00000"));
	g.fillRoundRect(600+40,302,4,14,30,20);
	g.fillRoundRect(610+40,302,4,14,30,20);
	g.fillOval(602+40, 318, 10, 10);
	
	
	//tubooooo
	
	x= 590;
	y = 380;

		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(x,y,75,80,3,3);
		g.setColor(Color.decode("#8987ca"));
		g.fillRoundRect(x+2,y+2,71,76,3,3);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(x-3,y-33,80,40,12,12);
		g.setColor(Color.decode("#8987ca"));
		g.fillRoundRect(x-1,y-31,76,36,20,10);
		
		g.setColor(Color.decode("#6e69b5"));
		g.fillRect(x+50, y-31, 10, 36);
		g.fillRect(x+44, y+7, 20, 70);
		
		g.fillRect(x+4, y-31, 6, 36);
		g.fillRect(x+4, y+7, 12, 70);
		
		
		g.setColor(Color.decode("#4b4894"));
		g.fillRect(x+1, y-30, 4, 34);
		g.fillRect(x-1, y-29, 2, 31);
		
		g.fillRect(x+55,y-31, 3, 36);
		
		g.fillRect(x+60, y-33, 9, 36);
		g.fillRect(x+69, y-32, 2, 34);
		g.fillRect(x+71, y-31, 2, 32);
		g.fillRect(x+73, y-30, 2, 30);
		
		g.fillRect(x+2,y+5, 8, 70);
		g.fillRect(x+2,y+4, 2, 70);
		
		g.fillRect(x+56,y+5, 17, 70);
		g.fillRect(x+51,y+5, 3, 70);
		
		g.fillRect(x+71,y+5, 2, 70);
		
		g.setColor(Color.decode("#ecf6f8"));
		g.fillRect(x+14, y-32, 6, 35);
		g.fillRect(x+10, y-32, 30, 2);
		g.fillRect(x+14, y-30, 10, 1);
		
		g.fillRect(x+20,y+5, 6, 70);
		
		
		//tubooooo 2
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(310,338,75,80,3,3);
		g.setColor(Color.decode("#8987ca"));
		g.fillRoundRect(312,340,71,76,3,3);
		
		g.setColor(Color.decode("#00000"));
		g.fillRoundRect(307,305,80,40,12,12);
		g.setColor(Color.decode("#8987ca"));
		g.fillRoundRect(309,307,76,36,20,10);
		
		g.setColor(Color.decode("#6e69b5"));
		g.fillRect(360, 307, 10, 36);
		g.fillRect(354,345, 20, 70);
		
		g.fillRect(314, 307, 6, 36);
		g.fillRect(314,345, 12, 70);
		
		
		g.setColor(Color.decode("#4b4894"));
		g.fillRect(311, 308, 4, 34);
		g.fillRect(309, 309, 2, 31);
		
		g.fillRect(365, 307, 3, 36);
		
		g.fillRect(370, 307, 9, 36);
		g.fillRect(379, 308, 2, 34);
		g.fillRect(381, 309, 2, 32);
		g.fillRect(383, 310, 2, 30);
		
		g.fillRect(312,345, 8, 70);
		g.fillRect(312,344, 2, 70);
		
		g.fillRect(366,345, 17, 70);
		g.fillRect(361,345, 3, 70);
		
		g.fillRect(381,344, 2, 70);
		
		g.setColor(Color.decode("#ecf6f8"));
		g.fillRect(324, 308, 6, 35);
		g.fillRect(320, 308, 30, 2);
		g.fillRect(324, 310, 10, 1);
		
		g.fillRect(330,345, 6, 70);
	
	
	
	//PISO 
	g.setColor(Color.decode("#cf9e5e"));
	g.fillRect(0, 412, 640, 70);
	
	g.setColor(Color.decode("#030103"));
	g.fillRect(0, 475, 640, 5);
	
	g.setColor(Color.decode("#6f4c33"));
	g.fillRect(0, 474, 640, 1);
	
	g.setColor(Color.decode("#6f4c33"));
	g.fillRect(0, 473, 640, 1);
	
	int cespedx[] = {20,60,40};
	int cespedy[] = {410,410,426};
	int cespedx2[]= {20,60,40};
	int cespedy2[]= {410,410,422};
	g.setColor(Color.decode("#030d01"));
	g.fillPolygon(cespedx, cespedy, 3);
	g.setColor(Color.decode("#04c304"));
	g.fillPolygon(cespedx2, cespedy2, 3);
	
	for (int ii=0;ii<cespedx.length;ii++) {
		cespedx[ii] -= 30;
		cespedx2[ii] -=30;
	}
	
	g.setColor(Color.decode("#030d01"));
	g.fillPolygon(cespedx, cespedy, 3);
	g.setColor(Color.decode("#04c304"));
	g.fillPolygon(cespedx2, cespedy2, 3);
	int n=0;
	do {
		for (int ii=0;ii<cespedx.length;ii++) {
			cespedx[ii] += 30;
			cespedx2[ii] +=30;
		}
		g.setColor(Color.decode("#030d01"));
		g.fillPolygon(cespedx, cespedy, 3);
		g.setColor(Color.decode("#04c304"));
		g.fillPolygon(cespedx2, cespedy2, 3);
		
		n++;
	}while (n<22);
	}
	
}
