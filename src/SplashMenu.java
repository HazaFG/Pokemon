import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashMenu extends JDialog {

    private JProgressBar barra;
    private JLabel l2;
    public JFrame ventana = new JFrame();

	AdminitradorJuego aj = new AdminitradorJuego();

    //PROPIEDADES DIALOOGO
    public SplashMenu() {
        inicio();
        setSize(800,800);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setUndecorated(true);

        inicioHilo();
    }

    //PROPIEDADES ELEMENTOS
    private void inicio() {

        //Imagen de fondo
        ImageIcon imagen = new ImageIcon("img/Splash.png");
        //Crea el objeto JLabel
        JLabel etiqueta = new JLabel(imagen);

        //Agrega la etiqueta al panel
        etiqueta.setSize(800, 800);
        etiqueta.setLocation(0, 0);

        barra = new JProgressBar();
        barra.setBounds(210,426,402,36);
        barra.setOpaque(true);
        barra.setForeground(Color.decode("#1D2C5E"));
        getContentPane().add(barra);

        l2 = new JLabel();
        l2.setFont(new Font("Tahoma", Font.PLAIN,18));
        l2.setBounds(507,485,90,30);
        l2.setForeground(Color.decode("#FFFFFF"));
        getContentPane().add(l2);

        getContentPane().add(etiqueta);
    }

    public class BotonInvisible extends JButton {

        public BotonInvisible(String text) {
            super(text);
            setOpaque(false);
            setContentAreaFilled(false);

            setFocusPainted(false);

            addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    System.out.println("Botón presionado!");
                }
            });

        }
    }

    public class InstruccionesVentana extends JFrame {

        public InstruccionesVentana() {
            super("Controls"); // título de la ventana
            setSize(800, 800); // tamaño de la ventana

            setLocationRelativeTo(null);
            getContentPane().setLayout(null);
            setUndecorated(true);

            ImageIcon imagen = new ImageIcon("img/Instrucciones.png");

            JLabel etiqueta = new JLabel(imagen);

            etiqueta.setSize(800, 800);
            etiqueta.setLocation(0, 0);

            getContentPane().add(etiqueta);

            JButton atras = new JButton(" ");
            atras.setOpaque(false);
            atras.setContentAreaFilled(false);
            atras.setBorderPainted(true);
            atras.setFont(new Font("Tahoma", Font.PLAIN, 18));
            atras.setBounds(199, 671, 403, 36);

            atras.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose(); //cerrar la ventana actual
                }
            });

            add(atras);
        }
    }
    
    //CAMBIAR DE PANTALLA
    public void cambioPantalla (int pantalla){
    	if (pantalla == 1) {
    		ventana.setVisible(false);    		
    	}
    	if (pantalla == 2) {
    		ventana.setVisible(true);    		
    	}
    	
    }

    private void inicioHilo() {
        Thread hilo = new Thread(new Runnable() {
            int x = 0;
            String texto = " ";

            public void run() {
                try {

                    while (x <= 100) {
                        barra.setValue(x);
                        x++;
                        Thread.sleep(100);
                        /*
                        if (x == 5) {
                            texto = "Cargando...";
                            l2.setText(texto);
                        } else if (x == 80) {
                            texto = "Iniciando...";
                            l2.setText(texto);
                        }
                        */
                    }

                    ImageIcon imagen = new ImageIcon("img/Menu.png");
                    //Crea el objeto JLabel
                    JLabel etiqueta = new JLabel(imagen);

                    etiqueta.setSize(800, 800);
                    etiqueta.setLocation(0, 0);

                    BotonInvisible play = new BotonInvisible(" ");
                    play.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    play.setBounds(199, 547, 403, 36);

                    BotonInvisible instrucciones = new BotonInvisible(" ");
                    instrucciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    instrucciones.setBounds(199, 609, 403, 36);

                    BotonInvisible salir = new BotonInvisible(" ");
                    salir.setFont(new Font("Tahoma", Font.PLAIN, 18));
                    salir.setBounds(199, 671, 403, 36);

                    getContentPane().removeAll();
                    getContentPane().add(play);
                    getContentPane().add(instrucciones);
                    getContentPane().add(salir);

                    getContentPane().add(etiqueta);

                    revalidate();
                    repaint();

                    play.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	
                    		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    		ventana.setTitle("HOLA ZUMAYA");
                    		
                        	AdminitradorJuego aJ = new AdminitradorJuego();
                    		ventana.setSize(800, 800);
                    		ventana.add(aJ);
                    		ventana.setLocationRelativeTo(null);
                    		ventana.getContentPane().setLayout(null);
                    		ventana.setUndecorated(true);
                    		
                    		aJ.iniciarHiloJuego();
                    		
                    		ventana.setLocationRelativeTo(null);
                    		ventana.setVisible(true);
                    		
                            dispose();
                        }
                    });

                    instrucciones.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            InstruccionesVentana v1 = new InstruccionesVentana();
                            v1.setVisible(true);
                            v1.requestFocus();
                        }
                    });

                    salir.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            dispose();
                            System.exit(0);
                        }
                    });

                } catch (Exception e) {
                    System.out.println("Excepcion: " + e.getMessage());
                }
            }
        });
        hilo.start();
    }
    
    public void setVentana(JFrame ventana) {
		this.ventana = ventana;
	}

}