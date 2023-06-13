import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.Refreshable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 

public class Desarrollo extends JPanel implements ActionListener{
	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    private final JPanel panelBotones;
    private final JButton botones[][];
    private final JButton botonIndicaTurno, botonReset, botonGanar;
    private final JLabel fondo, victoria1, victoria2, jugador1, jugador2;

    private final String fichas[] = {"Rojo.gif","Azul.gif"};
    Lista lista = new Lista(6, 7);

    int i, j, turno;
    String nombre[] = { "PRI","PAN "};//guarda el nombre de la ficha, para el cambio de turno.
    String color = nombre[0];
	private int puntosJ1, puntosJ2;
    public Desarrollo() {
    	
        /*Crea el contenedor y lo divide en 5 zonas NORTH, SOUTH, EAST, WEST y CENTER*/
    	
    	
        setLayout(new BorderLayout());

        
        //add(botonIndicaTurno);
        /*Crear el panel para manejar el tablero de fichas*/
        panelBotones = new JPanel();
        panelBotones.setBackground(Color.black);//color de fondo
        panelBotones.setBounds(60, 60, 420, 360);;
        
        
        /*Crear la matriz de botones*/
        botones = new JButton[6][7];
        
        panelBotones.setLayout(new GridLayout(6, 7, 5, 5));

        /*Crear y agregar botones*/
        Icon imagen;//objeto para crear la imagen

        for (i = 0; i < 6; i++) {//renglon
            for (j = 0; j < 7; j++) //columna
            {
                /*selecciona el nombre de la imagen que esta en la 1er posicion del arreglo 
                 * y lo crea a Icon*/
            	imagen = createImageIcon(fichas[0]);
                /*crear el boton en la posicion i-j de la matriz*/
                botones[i][j] = new JButton();
                /*tomar las dimensiones de la imagen del icono*/
                Dimension tamanoFigura = new Dimension(imagen.getIconHeight(), imagen.getIconWidth());
                /* hacer el boton del tamaño de la imagen del icono*/
                botones[i][j].setPreferredSize(tamanoFigura);
                
                /*agregar al boton el evento del click del mouse*/
                agregarAccion(botones[i][j], i, j);
                /*agregar la matriz de botones al panel para ser visualizado en la ventana*/
                panelBotones.add(botones[i][j]);
            }
        }
        
        /*agregar el panel de la matriz de botones al panel principal.*/
        //add(panelBotones);
        add(panelBotones, BorderLayout.CENTER);;
        lista.CrearLista();//Crear lista con el dato igual a Cero.
        turno = 1;//turno ficha azul
        
        botonIndicaTurno = new JButton("Turno de: " + color);
        add(botonIndicaTurno, BorderLayout.NORTH);//Agrega el objeto dentro del panel
        botonIndicaTurno.setBackground(Color.BLUE);//color de fondo
        botonIndicaTurno.setForeground(Color.WHITE);//color del texto
        botonIndicaTurno.setBounds(10, 10, 100, 30);
        botonIndicaTurno.setFont(new Font(botonIndicaTurno.getFont().getFontName(), Font.BOLD, 18));
        
        victoria2= new JLabel();
        victoria2.setBackground(new Color(255, 204, 204));
        victoria2.setFont(new Font("Oswald", 3, 24)); // NOI18N
        victoria2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoria2.setBounds(610, 290, 90, 60);
        victoria2.setText("0");
        victoria2.setOpaque(true);
        add(victoria2);

        jugador2= new JLabel();
        jugador2.setBackground(new Color(0,0,0,0));
        jugador2.setText("PRI");
        jugador2.setFont(new Font("Goudy Stout",Font.BOLD, 12));
        jugador2.setForeground(Color.RED);
        jugador2.setOpaque(true);
        jugador2.setBounds(510, 290, 90, 60);
        add(jugador2);

        jugador1= new JLabel();
        //jugador1.setOpaque(true);
        jugador1.setBackground(new Color(0,0,0,0));
        jugador1.setText("PAN");
        jugador1.setFont(new Font("Goudy Stout",Font.BOLD, 12));
        jugador1.setForeground(Color.BLUE);
        jugador1.setBounds(510, 190, 90, 60);
        jugador1.setOpaque(true);
        add(jugador1);

        victoria1= new JLabel();
        victoria1.setBackground(new java.awt.Color(255, 204, 204));
        victoria1.setFont(new Font("Oswald", 3, 24)); // NOI18N
        victoria1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        victoria1.setBounds(610, 190, 90, 60);
        victoria1.setText("0");
        victoria1.setOpaque(true);
        add(victoria1);

        botonReset = new JButton();
        //botonReset.setBackground(new Color(0,0,0,0));
        botonReset.setText("Volver a Jugar");
        botonReset.setBounds(500, 90, 200, 30);
        add(botonReset);
        agregarAccion(botonReset);
        
        
        botonGanar = new JButton();
        //botonReset.setBackground(new Color(0,0,0,0));
        botonGanar.setText("Terminar partida");
        botonGanar.setBounds(500, 130, 200, 30);
        add(botonGanar);
        agregarAccion2(botonGanar);
        
        
        fondo= new JLabel();
        fondo.setIcon(new ImageIcon("src/img/priVSpan.jpg")); // NOI18N
        fondo.setText("fondo");
        add(fondo);
        
    }

    

	/*METODO QUE AL HACER CLICK SOBRE ALGUN BOTON DE LA MATRIZ, VERIFICA CON LAS 
     * COORDENADAS (x,y) QUE BOTON FUE PRESIONADO Y REALIZA LAS VALIDACIONES 
	 * Y CAMBIO DE TURNO CORRESPONDIENTE*/
    void agregarAccion(final JButton boton, final int x, final int y) {
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                int x1 = lista.moverficha(turno, y);
                if (x1 > -1) {//si renglon esta disponible
                    botones[x1][y].setIcon(createImageIcon(fichas[turno - 1]));
                    lista.desplegarLista();
                    lista.ComprobarGanadorHorizontal();
                    lista.ComprobarGanadorVertical();
                    lista.ComprobarGanadorDiagonal();
                    lista.comprobarEmpate();
                    //System.out.println(lista.ganador);
                    terminarJuego();
                    if (lista.ganador == "PRI" || lista.ganador == "PAN") {
                    	lista.reiniciaLista();
    				reinicioBotones();
    				panelBotones.repaint();
    				//panelBotones.setVisible(false);
    				//panelBotones.resetKeyboardActions();
    				System.out.println("sssss");
                    }
                    if (lista.ganador == "empate") {
                    	lista.reiniciaLista();
        				reinicioBotones();
        				panelBotones.repaint();
        				//panelBotones.setVisible(false);
        				//panelBotones.resetKeyboardActions();
        				System.out.println("sssss");
                    }
                    CambiarTurno();
                    
                }
             
            }


        });
        
    }
    
    public void Ganador() {
    	if (puntosJ1 > puntosJ2) {
    		 JOptionPane.showMessageDialog(null, "","Victoria del PAN",
                     JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/VictoriaPan.jpg"));
    	}
    	if (puntosJ2 > puntosJ1) {
    		JOptionPane.showMessageDialog(null, "","Victoria del PRI",
    	            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/VictoriaPri.PNG"));
    	}
    	if (puntosJ1 == puntosJ2) {
    		JOptionPane.showMessageDialog(null, "","Victoria del PRI",
    	            JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/hola.PNG"));
    	}
    }
    
    
    
    void agregarAccion(final JButton boton) {
    	botonReset.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			if (e.getSource()==botonReset) {
    				lista.reiniciaLista();
    				reinicioBotones();
    				panelBotones.repaint();
    				//panelBotones.setVisible(false);
    				//panelBotones.resetKeyboardActions();
    				System.out.println("sssss");				
    				
    			}
    			if (e.getSource()==botonGanar) {
    				System.out.println("pene");
    				Ganador();
    			}
    		}
    	});
    }
    void agregarAccion2(final JButton boton) {
    		botonGanar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				if(a.getSource()==botonGanar) {
					System.out.println("wwwww");
					
					Ganador();
			}
				}
		});
    }
    
    private void reinicioBotones(){
    	for (int i=0;i<6;i++) {
    		for (int j=0;j<7;j++) {
    			
    			ImageIcon blanco = new ImageIcon( getClass().getResource("img/AHHHHH.png"));
    			botones[i][j].setIcon(blanco);
    			
    			//botones[i][j].setText("");
    			botones[i][j].revalidate();
    			botones[i][j].repaint();
    			
    		}
    	}
    }
    
    
    private void terminarJuego() {
        
            if(lista.ganador == "PAN"){
                puntosJ1++;
                victoria1.setText(String.valueOf(puntosJ1));
                JOptionPane.showMessageDialog(null, "","Victoria del PAN",
                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/VictoriaPan.jpg"));
                
                     
                
            }if(lista.ganador == "PRI"){
                puntosJ2++;
                victoria2.setText(String.valueOf(puntosJ2));
                //JOptionPane.showMessageDialog(null, "victoria del PRI");
                JOptionPane.showMessageDialog(null, "","Victoria del PRI",
                		JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/VictoriaPri.png"));
            }
            if(lista.ganador == "empate") {
                JOptionPane.showMessageDialog(null, "","EMPATE JAJAJA",
                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/img/AMLO.jpg"));
                }
          
       // }
    }
    void CambiarTurno(){
        if(turno == 1){
            turno = 2;
            color = nombre[1];
        }else{
            turno = 1;
            color = nombre[0];
        }
        //actualiza el texto del boton que indica el turno del jugador actual.
        botonIndicaTurno.setText("Turno de: " + color);
    }

    /*Metodo que busca una imagen segun su nombre en la ruta actual y 
     * crea un objeto de imagen*/
    protected ImageIcon createImageIcon(String nombreFigura){
        java.net.URL imgURL = getClass().getResource("img/" + nombreFigura);
        /*si encuentra en la carpeta la imagen indicada*/
        if(imgURL != null){
            return new ImageIcon(imgURL);
        }else{
            /*Devuelve por default la imagen de ficha azul*/
            return new ImageIcon(getClass().getResource("img/Azul.gif"));
        }
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
   
}//Fin Desarrollo
