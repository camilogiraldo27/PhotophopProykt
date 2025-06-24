package Interfaz;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Ev3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ev3 frame = new Ev3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ev3() {
		setUndecorated(true);
		setResizable(false);
		setAlwaysOnTop(true);
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informacion.class.getResource("/imagenes/2.jpg")));
		setTitle("Ev3 Informacion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 336);
		setSize(714,272);
	    setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Ev3.class.getResource("/imagenes/minestord.gif")));
		label_1.setBounds(247, 19, 407, 60);
		contentPane.add(label_1);
		
		JLabel logolego = new JLabel("");
		logolego.setIcon(new ImageIcon(Ev3.class.getResource("/imagenes/ev.jpg")));
		logolego.setBounds(10, 29, 227, 251);
		contentPane.add(logolego);
		
		JTextPane txtinfo = new JTextPane();
		txtinfo.setText("Lego Mindstorms EV3 es la tercera generaci\u00F3n de sets de rob\u00F3tica perteneciente a la l\u00EDnea de LEGO: Mindstorms, y sucesor del kit: NXT.\r\n\r\nLas siglas \"EV\" hacen referencia a las siglas en ingl\u00E9s de \"evolution\", lo cual en espa\u00F1ol significa evoluci\u00F3n; y el n\u00FAmero \"3\", representa la generaci\u00F3n del set. La primera generaci\u00F3n fue \"RCX\" y la segunda \"NXT\".");
		txtinfo.setForeground(Color.BLACK);
		txtinfo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 17));
		txtinfo.setEditable(false);
		txtinfo.setBackground(Color.WHITE);
		txtinfo.setBounds(257, 90, 381, 174);
		contentPane.add(txtinfo);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label.setIcon(new ImageIcon(Ev3.class.getResource("/imagenes/cerrar.png")));
		label.setToolTipText("Cerrar ventana");
		label.setBounds(666, 19, 32, 32);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		label_2.setIcon(new ImageIcon(Ev3.class.getResource("/imagenes/mini.png")));
		label_2.setToolTipText("Minimizar ventana");
		label_2.setBounds(666, 61, 32, 32);
		contentPane.add(label_2);
	}
}
