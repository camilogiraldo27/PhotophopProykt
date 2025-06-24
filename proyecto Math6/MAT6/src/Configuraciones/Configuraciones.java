package Configuraciones;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Interfaz.Informacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class Configuraciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private String item;
    private JLabel  btnmodificar;
    private JComboBox<String> comboBox;

	
	public static void main(String[] args) {
					Configuraciones con = new Configuraciones();
					con.setVisible(true);
	}
      
	
	public void nivel_a_modificar(){
		 item=comboBox.getSelectedItem().toString();
		 if(item=="SELECCIONA EL NIVEL"){
				JOptionPane.showMessageDialog(null, "SELECCIONA UN NIVEL PARA MODIFICAR.", "VERIFICACI�N",
	    	    		  JOptionPane.INFORMATION_MESSAGE);
			}else if(item=="NIVEL AVANZADO"){
				int selec = JOptionPane.showConfirmDialog(null, "EL NIVEL SELECCIONADO ES "+"("+item+").  �ES EL QUE DESEA MODIFICAR?.", "VERIFICACI�N",
	    	    		  JOptionPane.YES_NO_OPTION);
				if(selec==JOptionPane.YES_OPTION){
					DificilCF.open=true;
					DificilCF df=new DificilCF();
					df.setVisible(true);
					btnmodificar.setEnabled(false);
					
				}
			}
			else if(item=="NIVEL MEDIO"){
				int selec = JOptionPane.showConfirmDialog(null, "EL NIVEL SELECCIONADO ES "+"("+item+").  �ES EL QUE DESEA MODIFICAR?.", "VERIFICACI�N",
	    	    		  JOptionPane.YES_NO_OPTION);
				if(selec==JOptionPane.YES_OPTION){
					MedioCFG.open=true;
					MedioCFG MC=new MedioCFG();
					MC.setVisible(true);
					btnmodificar.setEnabled(false);
					
				}
			}
		 
			else if(item=="NIVEL B�SICO"){
				int selec = JOptionPane.showConfirmDialog(null, "EL NIVEL SELECCIONADO ES "+"("+item+").  �ES EL QUE DESEA MODIFICAR?.", "VERIFICACI�N",
	    	    		  JOptionPane.YES_NO_OPTION);
				if(selec==JOptionPane.YES_OPTION){
					FacilCF.open=true;
					FacilCF BS=new FacilCF();
					BS.setVisible(true);
					btnmodificar.setEnabled(false);
					
				}
			}
	}
	
		
	
	public Configuraciones() {
		setUndecorated(true);
		setResizable(false);
		setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informacion.class.getResource("/imagenes/2.jpg")));
		setTitle("Configuraciones");
		setBounds(100, 100, 681, 336);
		setSize(621,298);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/2.jpg")));
		label_1.setBounds(403, 31, 95, 122);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_2.setIcon(new ImageIcon(Informacion.class.getResource("/imagenes/cerrar.png")));
		label_2.setToolTipText("Cerrar programa");
		label_2.setBounds(563, 11, 32, 32);
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
		label_3.setBounds(521, 11, 32, 32);
		contentPane.add(label_3);
		
	    btnmodificar = new JLabel("Bot\u00F3n configurar");
		btnmodificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				nivel_a_modificar();
				
			}
		});
		btnmodificar.setIcon(new ImageIcon(Configuraciones.class.getResource("/imagenes/config.png")));
		btnmodificar.setToolTipText("Configurar nivel");
		btnmodificar.setBounds(434, 167, 141, 40);
		contentPane.add(btnmodificar);
		
		
		
		JLabel lblBotonesDeAccion = new JLabel("BOTONES DE ACCI�N");
		lblBotonesDeAccion.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		lblBotonesDeAccion.setToolTipText("Guardar configuraci�n");
		lblBotonesDeAccion.setBounds(434, 218, 133, 26);
		contentPane.add(lblBotonesDeAccion);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"SELECCIONA EL NIVEL", "NIVEL B�SICO", "NIVEL MEDIO", "NIVEL AVANZADO"}));
		comboBox.setBounds(434, 255, 161, 32);
		contentPane.add(comboBox);
		
		JLabel lblConfiguraciones = new JLabel("CONFIGURACIONES");
		lblConfiguraciones.setToolTipText("Guardar configuraci�n");
		lblConfiguraciones.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblConfiguraciones.setBounds(10, 11, 241, 32);
		contentPane.add(lblConfiguraciones);
		
		JTextPane txtpnATravesDe = new JTextPane();
		txtpnATravesDe.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtpnATravesDe.setEditable(false);
		txtpnATravesDe.setText("A trav�s de esta ventana y mediante los botones de acci�n podr�s configurar los diferente niveles con los ejercicios que desees. Para ello, debes seleccionar el nivel que deseas y dar clic el bot�n configuraci�n y se abrir� el nivel elegido; recuerda que en el nivel solo puedes modificar (imagenes, ayudas, respuestas y algunos textos). A parte en cada nivel, tienes dos botones m�s uno para guardar los cambios y otro para vaciar los campos.\r\n\r\nNOTA: Los cambios que realices se podr�n ver al abrir el nivel dando clic en la opci�n (ultima versi�n), asi como cambios posteriores se realizar�n en el mismo, no se crean m�s niveles.");
		txtpnATravesDe.setBounds(10, 48, 383, 239);
		contentPane.add(txtpnATravesDe);
	}
}
