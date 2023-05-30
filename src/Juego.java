import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

// public class Juego extends Canvas implements Runnable {
public class Juego extends JPanel implements Runnable {

    //CONFIGURACIONES DE PANTALLA
    final int escalaOriginal = 5;
    final int escala = 5;

    public final int tamPantalla = escalaOriginal * escala; //25x25 CUADROS
    public final int maxColPantalla = 30;
    public final int maxFilPantalla = 20;
    public int anchoPantalla = tamPantalla * maxColPantalla; // 1015 PIXELES
    public int alturaPantalla = tamPantalla * maxFilPantalla; // 540 PIXELES

    //CONFIGURACIÓN DE MUNDO

    public final int mundoFil = 85; //Las originales serán 83
    public final int mundoCol = 43; // y 43
    public final int maximoAnchoMundo = mundoCol * tamPantalla;
    public final int maximoAltoMundo = mundoFil * tamPantalla;

    private static volatile boolean juegoCorriendo = false;
    private static int aps = 0;
    private static int fps = 0;

    private JPanel fondo; // Panel
    private Thread hilo = new Thread(); //

    ControladorTile ControladorT = new ControladorTile(this);
    Controles teclas = new Controles();
    Thread hiloJuego;
    public Colision cColision = new Colision(this);
    Jugador jugador = new Jugador(this, teclas);

    private int[][] mapa = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
    };

    public Juego() {

        this.setSize(800, 800);
        this.setBackground(Color.LIGHT_GRAY);
        this.setDoubleBuffered(true);
        this.addKeyListener(teclas);
        this.setFocusable(true);

        /*
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 800);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        setTitle("Pokemon Red");
        fondo = new JPanel();
        fondo.setBackground(new Color(45, 45, 45));
        fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(fondo);
        */

        repaint();
        revalidate();
    }

    public synchronized void iniciar(){
        juegoCorriendo = true;
        hilo = new Thread(this, "Graficos");
        hilo.start();
    }

    public synchronized void detener(){
        juegoCorriendo = false;

        try {
            hilo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void actualizar(){
        aps++;
    }

    private void mostrar() {
        fps++;
    }


    //Metodo creado automaticamente al hacer del juego un Hilo
    @Override
    public void run() {
        final int NS_POR_SEGUNDO = 1000000000; // ESCRIBIMOS LA EQUIVALENCIA, IGUAL QUE ESCRIBIR CUANTOS CM TIENE UN METRO
        final byte APS_OBJETIVO = 60; // NUMERO DE ACTUZALIZACIONES POR SEGUNDO
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO; // CUANTOS NANO SEGUNDOS POR ACTUALIZACION (ES IGUAL QUE DIVIDIR 1 SEGUNDO ENTRE LAS VECES QUE QIEREMOS QUE SE EJECUTE )

        long referenciaActualizacion = System.nanoTime(); // CUANDO SE EJECUTE SE LE ATRIUUIRA IUNA CANTIDAD DE TIEMPO EN NANOSEGUNDOS
        long referenciaContador = System.nanoTime();

        double tiempoTranscurrido; // TIEMPO QUE TRANSUCRRE HASTA QUE SE REALIZA UNA ACTUALIZACION
        double delta = 0; // ES LA CANTIDAD DER TIEMPO QUE TRANSCURRE HASTA QUE OCURRE UNA ACTUALIZACION

        while (juegoCorriendo = true){
            final long inicioBucle = System.nanoTime(); // ESTA VARIABLE TOMA EL VALOR EN NANOSEGUNDOS, PERO NO ES LA MISMA QUE LA DE ARRIBA (referencia), es igual que iniciar el cronometro

            tiempoTranscurrido = inicioBucle - referenciaActualizacion; // Almacenamos cuanto tiempo ha pasado la primera vez que se ejecuta
            referenciaActualizacion = inicioBucle;

            delta += tiempoTranscurrido / NS_POR_ACTUALIZACION; //Dividimos la cantidad de nanosegundos que ocurre por actualizacion y lo almacenamos en delta

            while (delta >= 1){
                actualizar();
                delta--;
            }

            mostrar();

            if(System.nanoTime() - referenciaContador > NS_POR_SEGUNDO){
                //setTitle("Pokemon Red || " + "APS: " +aps + "  FPS: " + fps);
                aps = 0;
                fps = 0;
                referenciaContador = System.nanoTime();
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        ControladorT.dibujar(g2);
        jugador.dibujar(g2);
        g2.dispose();
    }
}