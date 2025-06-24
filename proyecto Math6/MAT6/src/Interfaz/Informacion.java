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

public class Informacion extends JFrame {

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
	public Informacion() {
		setUndecorated(true);
		setResizable(false);
		setAlwaysOnTop(true);
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informacion.class.getResource("/imagenes/2.jpg")));
		setTitle("Quiénes somos ?");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 336);
		setSize(680,296);
	    setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/syslac.JPG")));
		label.setBounds(320, 11, 208, 89);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/2.jpg")));
		label_1.setBounds(569, 168, 95, 122);
		contentPane.add(label_1);
		
		JTextPane txtpnSomosUnGrupo = new JTextPane();
		txtpnSomosUnGrupo.setText("Somos un grupo de estudiantes de Ingeniería de sistemas que durante nuestro proceso educativo, con apoyo del departamento de ciencias básicas desarrollamos este software con la intención de aportar una herramienta que facilite tanto a estudiantes como docentes el aprendizaje y ense\u00F1anza respectivamente de las matematicas; mediante el apoyo y uso de la tecnología.");
		txtpnSomosUnGrupo.setForeground(Color.BLACK);
		txtpnSomosUnGrupo.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		txtpnSomosUnGrupo.setEditable(false);
		txtpnSomosUnGrupo.setBackground(Color.WHITE);
		txtpnSomosUnGrupo.setBounds(299, 90, 246, 200);
		contentPane.add(txtpnSomosUnGrupo);
		
		JLabel logolego = new JLabel("");
		logolego.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/lego-ev3.jpg")));
		logolego.setBounds(0, 0, 279, 301);
		contentPane.add(logolego);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_2.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/cerrar.png")));
		label_2.setToolTipText("Cerrar programa");
		label_2.setBounds(638, 11, 32, 32);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setExtendedState(ICONIFIED);
			}
		});
		label_3.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/mini.png")));
		label_3.setToolTipText("Minimizar ventana");
		label_3.setBounds(596, 11, 32, 32);
		contentPane.add(label_3);
	}
}
