package Interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class Instrucciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucciones frame = new Instrucciones();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Instrucciones(){
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Instrucciones.class.getResource("/imagenes/2.jpg")));
		setTitle("Instrucciones");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1025, 577);
		setSize(1020,540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		
		JTextPane text = new JTextPane();
		text.setEditable(false);
		text.setText("Para comenzar a jugar debes crear un grupo de cuatro amigos, se deben\r\nnumerar del 1 al 4 y tener en donde apuntar una vez completado esto, debes abrir el nivel que desees y dar clic en el bot\u00F3n del cronómetro y aparecer\u00E1 \r\nuna ventana con este, tendr\u00E1s que dar clic en play para lanzar el dado una vez esto, saldrá el número que corresponder\u00E1 a uno de los jugadores despu\u00E9s, deben iniciar el tiempo y la persona tendr\u00E1 (2m) para ir respondiendo una vez acabe el tiempo se\r\n volverá a lanzar el dado y la persona que le corresponda deberá\r\ncontinuar\u00E1 desde el punto donde quedo el jugador anterior, cuando hayan terminado de responder deben dar clic en el bot\u00F3n de verificar respuestas y si estas son correctas se activar\u00E1 el bot\u00F3n para enviar respuestas al Ev3 y asi dar paso para que el dispositivo realice el dibujo.");
		text.setFont(new Font("Constantia", Font.PLAIN, 15));
		text.setBackground(UIManager.getColor("Button.background"));
		text.setBounds(255, 117, 561, 234);
		contentPane.add(text);
		
		JLabel lblModoDeJuego_1 = new JLabel("MODO DE JUEGO PARA LO NIVELES");
		lblModoDeJuego_1.setFont(new Font("Constantia", Font.PLAIN, 17));
		lblModoDeJuego_1.setBounds(379, 83, 291, 32);
		contentPane.add(lblModoDeJuego_1);
		label_3.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/mini.png")));
		label_3.setFont(new Font("Stencil", Font.ITALIC, 20));
		label_3.setBounds(939, 11, 38, 32);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		label_2.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/cerrar.png")));
		label_2.setFont(new Font("Stencil", Font.ITALIC, 20));
		label_2.setBounds(985, 11, 38, 32);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/2.jpg")));
		label_1.setBounds(35, 74, 95, 121);
		contentPane.add(label_1);
		
		JLabel ins = new JLabel("");
		ins.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/instru.png")));
		ins.setBounds(962, 71, 38, 447);
		contentPane.add(ins);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/dado.png")));
		label.setBounds(58, 228, 72, 91);
		contentPane.add(label);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Instrucciones.class.getResource("/imagenes/instrucciones.jpg")));
		fondo.setBounds(0, 0, 1023, 548);
		contentPane.add(fondo);
	}
}
