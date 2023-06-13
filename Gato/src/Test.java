import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class Test {
	//0 = X /// 1 = O //
	public int turno=0;
	public int turnoCont=0;
	public int puntosX = 0,puntosO = 0;

	private JFrame frmHolaZumaya;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frmHolaZumaya.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaZumaya = new JFrame();
		frmHolaZumaya.setTitle("HOLA ZUMAYA");
		frmHolaZumaya.setBounds(100, 100, 448, 499);
		frmHolaZumaya.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaZumaya.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmHolaZumaya.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 3, 0));
		
		JButton btnNewButton_1 = new JButton();
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton();
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton();
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton();
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton();
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton();
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton();
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton();
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton();
		panel.add(btnNewButton_9);
		//Se reinician todos los botones por seguridad (realmente es por un bug pero queda mejor decir que es angosto el codigo)
		activarBotones(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
				btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(220, 52, 170));
		panel_1.setForeground(new Color(255, 255, 255));
		frmHolaZumaya.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 2, 1, 0));
		
		JLabel lblNewLabel = new JLabel("X: "+puntosX);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O: "+puntosO);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 0));
		frmHolaZumaya.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_10 = new JButton("Reiniciar");
		panel_2.add(btnNewButton_10);
		
		//ACTION LISTENERS
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_1);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_2);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_3);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_4);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_5);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_6);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_7);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_8);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ponerValor(btnNewButton_9);
				comprobarGanador(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9,lblNewLabel,lblNewLabel_1);
			}
		});
		
		
		btnNewButton_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				activarBotones(btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4,btnNewButton_5,
						btnNewButton_6,btnNewButton_7,btnNewButton_8,btnNewButton_9);
			}
		});
		
		
	}

	public void ponerValor(JButton btn) {
		if (btn.getIcon() == null) {
			if (turno == 0) {
				ImageIcon imagen = new ImageIcon("tortuGreen.png");
				btn.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(btn.getWidth()+10,btn.getHeight(),Image.SCALE_SMOOTH)));
				btn.setText("X");
				btn.setOpaque(false);
				btn.setBackground(Color.green);	
				cambioTurno(turno);
				turnoCont++;
			}else {
				ImageIcon imagen = new ImageIcon("tortuRed.jpg");
				btn.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(btn.getWidth()+10,btn.getHeight(),Image.SCALE_SMOOTH)));
				btn.setText("O");
				btn.setBackground(Color.red);
				cambioTurno(turno);
				turnoCont++;
			}
		}
	}
	
	//Comprobacion
	public void comprobarGanador (JButton btn1,JButton btn2,JButton btn3,JButton btn4,JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9,JLabel jl1,JLabel jl2) {
		//Comprobación X
		if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X" ||
			btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X" ||
			btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X" ||
			btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X" ||
			btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X" ||
			btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X" ||
			btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X" ||
			btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X") {
			JOptionPane.showMessageDialog(null,"GANA X.");
			activarBotones( btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			puntosX ++;	
			jl1.setText("X: "+puntosX);
			frmHolaZumaya.repaint();
			frmHolaZumaya.revalidate();
		}
		//Comprobación O
				if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O" ||
					btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O" ||
					btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O" ||
					btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O" ||
					btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O" ||
					btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O" ||
					btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O" ||
					btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O") {
					JOptionPane.showMessageDialog(null,"GANA O.");
					activarBotones( btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
					puntosO ++;	
					jl2.setText("O: "+puntosO);
					frmHolaZumaya.repaint();
					frmHolaZumaya.revalidate();
				}
		//Comprobacion empateeeee AHHHHHHHHH JAJAJJAJAJAJAJAJA
				if (btn1.getText() != null &&
					btn2.getText() != null &&
					btn3.getText() != null &&
					btn4.getText() != null &&
					btn5.getText() != null &&
					btn6.getText() != null &&
					btn7.getText() != null &&
					btn8.getText() != null &&
					btn9.getText() != null) {
						JOptionPane.showMessageDialog(null,"GANA EL OXXO JAJAJAJAJAJA");
						activarBotones( btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
						frmHolaZumaya.repaint();
						frmHolaZumaya.revalidate();
					}
		
	}
	
	private void activarBotones(JButton btn1,JButton btn2,JButton btn3,JButton btn4,JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9) {
		// TODO Auto-generated method stub
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn1.setBackground(null);
		btn2.setBackground(null);
		btn3.setBackground(null);
		btn4.setBackground(null);
		btn5.setBackground(null);
		btn6.setBackground(null);
		btn7.setBackground(null);
		btn8.setBackground(null);
		btn9.setBackground(null);
		btn1.setText(null);
		btn2.setText(null);
		btn3.setText(null);
		btn4.setText(null);
		btn5.setText(null);
		btn6.setText(null);
		btn7.setText(null);
		btn8.setText(null);
		btn9.setText(null);
		btn1.setIcon(null);
		btn2.setIcon(null);
		btn3.setIcon(null);
		btn4.setIcon(null);
		btn5.setIcon(null);
		btn6.setIcon(null);
		btn7.setIcon(null);
		btn8.setIcon(null);
		btn9.setIcon(null);
	}

	public void cambioTurno (int trn) {
		if (trn == 0) {
			turno = 1;
		}else {
			turno = 0;
		}
	}
}
