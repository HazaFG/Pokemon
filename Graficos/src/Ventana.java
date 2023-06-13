import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(650, 650);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().setBackground(Color.decode("#318CE7"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.repaint();
		this.revalidate();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		
		g.setColor(Color.decode("#FF61EE"));
		//g.drawRect(0, 0, 700, 1000);
		g.fillRect(0,0,650,650);
		
		g.setColor(Color.decode("#634c16"));
		g.fillRect(0, 570, 650, 80);
		
		g.setColor(Color.decode("#d1b868"));
		g.fillRect(0, 538, 650, 32);
		
		g.setColor(Color.decode("#72952d"));
		g.fillRect(0, 500, 650, 38);
		
		g.setColor(Color.decode("#394d10"));
		g.fillRect(0, 485, 650, 15);
		//vallas
		g.setColor(Color.decode("#d49736"));
		g.fillRect(0, 348, 650, 100);
		
		g.setColor(Color.decode("#feb951"));
		g.fillRect(2, 315, 45, 170);
		int [] vx1= {2,25,47};
		int [] vy1= {315,282,315};
		g.fillPolygon(vx1, vy1, 3);
		
		g.fillRect(58, 315, 45, 170);
		int [] vx2= {58,81,103};
		int [] vy2= {315,282,315};
		g.fillPolygon(vx2, vy2, 3);
		
		g.fillRect(113, 315, 45, 170);
		int [] vx3= {113,136,158};
		int [] vy3= {315,282,315};
		g.fillPolygon(vx3, vy3, 3);
		
		g.fillRect(491, 315, 45, 170);
		int [] vx8= {491,513,536};
		int [] vy8= {315,282,315};
		g.fillPolygon(vx8, vy8, 3);
		
		g.fillRect(547, 315, 45, 170);
		int [] vx9= {547,569,591};
		int [] vy9= {315,282,315};
		g.fillPolygon(vx9, vy9, 3);
		
		g.fillRect(602, 315, 45, 170);
		int [] vx10= {602,624,647};
		int [] vy10= {315,282,315};
		g.fillPolygon(vx10, vy10, 3);
		
		g.setColor(Color.decode("#666666"));
		g.fillRect(133,454,383, 31);
		
		g.setColor(Color.decode("#ffd774"));
		g.fillRect(158,254,333,199);
		
		g.setColor(Color.decode("#b99131"));
		int [] vx4= {371,471,491,491};
		int [] vy4= {374,361,364,397};
		g.fillPolygon(vx4, vy4, 4);
		
		int [] vx5= {159,491,491};
		int [] vy5= {254,254,316};
		g.fillPolygon(vx5, vy5, 3);
		
		g.setColor(Color.decode("#604000"));
		g.fillRect(158,452,333,2);
		g.fillRect(158,423,333,3);
		g.fillRect(158,393,333,3);
		g.fillRect(158,363,333,3);
		g.fillRect(158,334,333,3);
		g.fillRect(158,304,333,3);
		g.fillRect(158,274,333,3);
		//puerta
		g.setColor(Color.decode("#644a06"));
		g.fillRect(184,268,95,185);
		
		g.setColor(Color.decode("#98700e"));
		g.fillRect(191,275,81,175);
		
		g.setColor(Color.decode("#f6fdf5"));
		g.fillOval(256,356,10,10);
		//ventana
		
		g.setColor(Color.decode("#4e4d49"));
		g.fillRect(364,360,106,14);
		
		g.setColor(Color.decode("#aa2320"));
		g.fillRect(370,268,95,92);
		
		g.setColor(Color.decode("#fefefe"));
		g.fillRect(377,275,36,39);
		g.fillRect(422,275,36,39);
		g.fillRect(377,318,36,39);
		g.fillRect(422,318,36,39);
	
		//techo
		g.setColor(Color.decode("#7b8380"));
		g.fillRect(406,140,63,60);
		
		g.setColor(Color.decode("#4d4d4d"));
		int [] vx6= {408,469,469};
		int [] vy6= {140,165,140};
		g.fillPolygon(vx6, vy6, 3);
		
		g.setColor(Color.decode("#666666"));
		g.fillRect(396,107,82,33);
		
		g.setColor(Color.decode("#a22425"));
		int [] vx7= {100,245,545};
		int [] vy7= {254,41,254};
		g.fillPolygon(vx7, vy7, 3);
		
		
	}
}
