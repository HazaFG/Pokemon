import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Juego extends JFrame implements Runnable {

    private JPanel fondo; // Panel
    private Thread hilo = new Thread(); //

	public Juego() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 900, 700);
            setTitle("Pokemon Red");
            fondo = new JPanel();
            fondo.setBackground(new Color(45, 45, 45));
            fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

            setContentPane(fondo);
    }

    public void iniciar(){
        hilo = new Thread(this, "Graficos");
        hilo.start();
    }

    private void detener(){

    }

    @Override
    public void run() {
        System.out.println("Hola");
    }

}
