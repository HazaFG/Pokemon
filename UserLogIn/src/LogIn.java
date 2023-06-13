import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {

	public LogIn(){
		
		this.setVisible(true);
		this.setTitle("Hola Zumaya");
		this.setSize(700, 700);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("<html><font color='white'>User LogIn</font></html>");
		title.setBounds(230,20,300,60);
		title.setFont(new Font("Times new Roma", Font.BOLD, 40));
		title.setVisible(true);
		title.setOpaque(true);
		title.setBackground(Color.decode("#318CE7"));
		this.add(title);
		
		JLabel title2 = new JLabel("<html><font color='#EABE3F'>My Account</font></html>");
		title2.setBounds(230,120,300,60);
		title2.setFont(new Font("Times new Roma", Font.BOLD, 40));
		title2.setVisible(true);
		title2.setOpaque(true);
		title2.setBackground(Color.decode("#256Edc"));
		this.add(title2);
		
		JLabel username = new JLabel("<html><font color='white'>Enter your username</font></html>");
		username.setBounds(150,200,300,60);
		username.setFont(new Font("Times new Roma", Font.BOLD, 16));
		username.setVisible(true);
		username.setOpaque(true);
		username.setBackground(Color.decode("#256Edc"));
		this.add(username);
		
		JLabel password = new JLabel("<html><font color='white'>Enter your password</font></html>");
		password.setBounds(150,300,300,60);
		password.setFont(new Font("Times new Roma", Font.BOLD, 16));
		password.setVisible(true);
		password.setOpaque(true);
		password.setBackground(Color.decode("#256Edc"));
		this.add(password);
		
		JTextField usuario = new JTextField("");
		usuario.setBounds(150,250,300,50);
		usuario.setOpaque(true);
		usuario.setBackground(Color.white);
		this.add(usuario);
		
		JPasswordField contrasenna = new JPasswordField();
		contrasenna.setBounds(150,350,300,50);
		contrasenna.setOpaque(true);
		contrasenna.setBackground(Color.white);
		this.add(contrasenna);
		
		JButton bt1 = new JButton("Login");
		bt1.setBounds(280,430,100,50);
		bt1.setBackground(Color.yellow);
		this.add(bt1);
		
		JLabel fondobt1 = new JLabel();
		fondobt1.setBounds(275,425,110,60);
		fondobt1.setFont(new Font("Times new Roma", Font.BOLD, 16));
		fondobt1.setVisible(true);
		fondobt1.setOpaque(true);
		fondobt1.setBackground(Color.white);
		this.add(fondobt1);
		
		JLabel title3 = new JLabel("<html><font color='white'>Don't have a account?</font></html>");
		title3.setBounds(250,545,200,30);
		title3.setFont(new Font("Times new Roma", Font.BOLD, 16));
		title3.setVisible(true);
		title3.setOpaque(true);
		title3.setBackground(Color.decode("#318CE7"));
		this.add(title3);
		
		JButton bt2 = new JButton("Register");
		bt2.setBounds(280,580,100,50);
		bt2.setBackground(Color.yellow);
		this.add(bt2);
		
		JLabel fondobt2 = new JLabel();
		fondobt2.setBounds(275,575,110,60);
		fondobt2.setFont(new Font("Times new Roma", Font.BOLD, 16));
		fondobt2.setVisible(true);
		fondobt2.setOpaque(true);
		fondobt2.setBackground(Color.white);
		this.add(fondobt2);
		
		
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(50,80,580,460);
		fondo1.setVisible(true);
		fondo1.setOpaque(true);
		fondo1.setBackground(Color.decode("#256Edc"));
		this.add(fondo1);
		
		JLabel fondo2 = new JLabel();
		fondo2.setBounds(0,0,700,700);
		fondo2.setVisible(true);
		fondo2.setOpaque(true);
		fondo2.setBackground(Color.decode("#318CE7"));
		this.add(fondo2);
		
		
		this.repaint();
		
	}

}
