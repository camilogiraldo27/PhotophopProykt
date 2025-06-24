package Configuraciones;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import Interfaz.Cronometro;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.applet.AudioClip;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;




public class MedioM extends JFrame {
	
	private static final long serialVersionUID = 1L;
	JScrollPane scrollPane;
	public static JPanel contentPane;
	public static JTextField txtrespuesta1,txtrespuesta2,txtrespuesta3,txtrespuesta4,txtrespuesta5,txtrespuesta6,txtrespuesta7,txtrespuesta8;
	public static JTextPane textPane_5,textPane_pr, textPane_3,textPane_2,textPane_1,textPane; 
	public static JLabel lblayuda1,lblayuda2,lblayuda3,lblayuda4,lblayuda5,lblayuda6,lblayuda7,lblayuda8;
     static JLabel lblimg8,lblimg7,lblimg6,lblimg5,lblimg4,lblimg3,lblimg2,lblimg1;
	public static double p1,p2,p3,p4,p5,p6,p7,p8;
	public static JButton btnvalidarrespuestas,btnpararmusica,btncronometro,btnenviarrespuestas;
	JFileChooser archivo_imagen=new JFileChooser();
	File fichero;
	  static byte[] imagen;
	  static FileInputStream entrada;
	  static FileOutputStream salida;
	  static boolean open=false;
	  Cronometro cr=new Cronometro();
	  Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
	  public static AudioClip music;
	 


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedioM frame = new MedioM();
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
	public MedioM() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				alcerrar();
			}
		});
		
	  	setResizable(false);
	  	setAutoRequestFocus(false);
	  	setIconImage(Toolkit.getDefaultToolkit().getImage(MedioM.class.getResource("/imagenes/2.jpg")));
	    setTitle("Nivel Medio modificación");
	    setSize(1102,600);
	    setLocationRelativeTo(null);
	    getContentPane().setLayout(new BorderLayout(0, 0));
	    all();
	    setVisible(true);
	    
	}
	public void alcerrar() {
		  String botones[]= {"Aceptar","Cancelar"};
		  int eleccion =JOptionPane.showOptionDialog(null, "¿Deseas salir del nivel?", "Exit", 0, JOptionPane.INFORMATION_MESSAGE,fail,botones,"");
		  if(eleccion==JOptionPane.YES_OPTION) {
			  dispose();
			  cr.dispose();
			  Cronometro.inicio=false;
			  Cronometro.m=0; Cronometro.s=0;
			  music.stop();
			  }}
	
	 
			public static void habilitarrespuesta() {
				txtrespuesta1.setEnabled(true); txtrespuesta2.setEnabled(true); txtrespuesta3.setEnabled(true); txtrespuesta4.setEnabled(true); 
				txtrespuesta5.setEnabled(true);txtrespuesta6.setEnabled(true); txtrespuesta7.setEnabled(true); txtrespuesta8.setEnabled(true); 
			}

				public static void desabilitarrespuestas() {
					txtrespuesta1.setEnabled(false); txtrespuesta2.setEnabled(false); txtrespuesta3.setEnabled(false); txtrespuesta4.setEnabled(false);
					txtrespuesta5.setEnabled(false);txtrespuesta6.setEnabled(false); txtrespuesta7.setEnabled(false); txtrespuesta8.setEnabled(false); 
				}
	
	
	 public static void respuestas(){
			p1 = Double.valueOf(txtrespuesta1.getText());
	  		p2 = Double.valueOf(txtrespuesta2.getText());
	  		p3 = Double.valueOf(txtrespuesta3.getText());
	  		p4 = Double.valueOf(txtrespuesta4.getText());
	  		p5 = Double.valueOf(txtrespuesta5.getText());
	  		p6 = Double.valueOf(txtrespuesta6.getText());
	  		p7 = Double.valueOf(txtrespuesta7.getText());
	  		p8 = Double.valueOf(txtrespuesta8.getText());
	  		
	  		
	    		 if(p1==MedioCFG.pc1 && p2==MedioCFG.pc2 && p3==MedioCFG.pc3 && p4==MedioCFG.pc4 && p5==MedioCFG.pc5 &&  p6==MedioCFG.pc6 && p7==MedioCFG.pc7 && p8==MedioCFG.pc8 ){
	                  	JOptionPane.showMessageDialog(null, "Sus respuestas son correctas", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);
	                  	btnenviarrespuestas.setEnabled(true);
	                  	desabilitarrespuestas();
	                  	Cronometro.inicio=false;
	                  	Cronometro.m=0; Cronometro.s=0;
						 
	                  	
	             }else{
	            	 JOptionPane.showMessageDialog(null, "Incorrecto. Revise que las respuestas sean las adecuadas", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);
	           	          
	             }
	    		 
		  }
	 
	 public static void campos_no_vacios(){
         if(txtrespuesta1.getText().isEmpty()==true || txtrespuesta2.getText().isEmpty()==true || txtrespuesta3.getText().isEmpty()==true || txtrespuesta4.getText().isEmpty()==true ||
        	txtrespuesta5.getText().isEmpty()==true || txtrespuesta6.getText().isEmpty()==true || txtrespuesta7.getText().isEmpty()==true || txtrespuesta8.getText().isEmpty()==true ){
        	 JOptionPane.showMessageDialog(null, "Revise que ningún campo este vacío.", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);  
		  } 
			 
	  }
		  
	
	 public void all() {
	    scrollPane = new JScrollPane();
	    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	    scrollPane.setViewportView(panel);
	    
	    JLabel label = new JLabel("NIVEL MEDIO");
	    label.setFont(new Font("Snap ITC", Font.BOLD, 30));
	    
	    JLabel label_1 = new JLabel("Realice el siguiente ejercicio");
	    label_1.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    
	    lblimg1 = new JLabel("                        IMAGEN");
	    lblimg1.setIcon(MedioCFG.imagen1);
	    lblimg1.setToolTipText("");
	    lblimg1.setForeground(Color.LIGHT_GRAY);
	    lblimg1.setFont(new Font("Tahoma", Font.BOLD, 15));
	    
	    JLabel label_3 = new JLabel("1)");
	    label_3.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    
	    JLabel label_4 = new JLabel("R//");
	    label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    txtrespuesta1 = new JTextField();
	    txtrespuesta1.setEnabled(false);
	    txtrespuesta1.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta1.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta1.setColumns(10);
	    txtrespuesta1.setBackground(SystemColor.control);
	    
	    JLabel label_6 = new JLabel("2)");
	    label_6.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    
	    JLabel label_7 = new JLabel("Realice el siguiente ejercicio");
	    label_7.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    
	    lblimg3 = new JLabel("                        IMAGEN");
	    lblimg3.setIcon(MedioCFG.imagen3);
	    lblimg3.setToolTipText("");
	    lblimg3.setForeground(Color.LIGHT_GRAY);
	    lblimg3.setFont(new Font("Tahoma", Font.BOLD, 15));
	    
	    JLabel label_9 = new JLabel("R//");
	    label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    txtrespuesta2 = new JTextField();
	    txtrespuesta2.setEnabled(false);
	    txtrespuesta2.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta2.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta2.setColumns(10);
	    txtrespuesta2.setBackground(SystemColor.control);
	    
	    lblayuda2 = new JLabel("");
	    lblayuda2.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc2);
	    	}
	    });
	    lblayuda2.setToolTipText("Clic para ver ayuda!");
	    lblayuda2.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setLayout(null);
	    panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
	    panel_1.setBackground(Color.WHITE);
	    
	    JLabel lblRealiceEl = new JLabel("Realice el siguiente ejercicio");
	    lblRealiceEl.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    lblRealiceEl.setBounds(40, 16, 290, 17);
	    panel_1.add(lblRealiceEl);
	    
	    textPane = new JTextPane();
	    textPane.setEditable(false);
	    textPane.setText(MedioCFG.txtpane);
	    textPane.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
	    textPane.setBackground(Color.WHITE);
	    textPane.setBounds(20, 65, 323, 69);
	    panel_1.add(textPane);
	    
	    lblimg4 = new JLabel("                        IMAGEN");
	    lblimg4.setIcon(MedioCFG.imagen4);
	    lblimg4.setToolTipText("");
	    lblimg4.setForeground(Color.LIGHT_GRAY);
	    lblimg4.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblimg4.setBackground(Color.LIGHT_GRAY);
	    lblimg4.setBounds(38, 140, 181, 188);
	    panel_1.add(lblimg4);
	    
	    JLabel label_19 = new JLabel("R//");
	    label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_19.setBounds(40, 339, 28, 17);
	    panel_1.add(label_19);
	    
	    txtrespuesta4 = new JTextField();
	    txtrespuesta4.setEnabled(false);
	    txtrespuesta4.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta4.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta4.setColumns(10);
	    txtrespuesta4.setBackground(SystemColor.control);
	    txtrespuesta4.setBounds(78, 339, 92, 20);
	    panel_1.add(txtrespuesta4);
	    
	    lblayuda4 = new JLabel("");
	    lblayuda4.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc4);
	    	}
	    });
	    lblayuda4.setToolTipText("Clic para ver ayuda!");
	    lblayuda4.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda4.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblayuda4.setBounds(188, 339, 24, 24);
	    panel_1.add(lblayuda4);
	    
	    JLabel label_21 = new JLabel("5)");
	    label_21.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    label_21.setBounds(493, 16, 14, 14);
	    panel_1.add(label_21);
	    
	    JLabel label_22 = new JLabel("Realice el siguiente ejercicio");
	    label_22.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    label_22.setBounds(525, 11, 346, 17);
	    panel_1.add(label_22);
	    
	    textPane_1 = new JTextPane();
	    textPane_1.setEditable(false);
	    textPane_1.setToolTipText("");
	    textPane_1.setText(MedioCFG.txtpane1);
	    textPane_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
	    textPane_1.setBackground(Color.WHITE);
	    textPane_1.setBounds(525, 60, 395, 69);
	    panel_1.add(textPane_1);
	    
	    JLabel label_23 = new JLabel("R//");
	    label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_23.setBounds(544, 330, 28, 17);
	    panel_1.add(label_23);
	    
	    txtrespuesta5 = new JTextField();
	    txtrespuesta5.setEnabled(false);
	    txtrespuesta5.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta5.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta5.setColumns(10);
	    txtrespuesta5.setBackground(SystemColor.control);
	    txtrespuesta5.setBounds(582, 330, 118, 20);
	    panel_1.add(txtrespuesta5);
	    
	    lblayuda5 = new JLabel("");
	    lblayuda5.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc5);
	    	}
	    });
	    lblayuda5.setToolTipText("Clic para ver ayuda!");
	    lblayuda5.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda5.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblayuda5.setBounds(710, 330, 24, 24);
	    panel_1.add(lblayuda5);
	    
	    lblimg5 = new JLabel("                        IMAGEN");
	    lblimg5.setIcon(MedioCFG.imagen5); 
	    lblimg5.setToolTipText("");
	    lblimg5.setForeground(Color.LIGHT_GRAY);
	    lblimg5.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblimg5.setBackground(Color.LIGHT_GRAY);
	    lblimg5.setBounds(535, 139, 300, 158);
	    panel_1.add(lblimg5);
	    
	    JLabel label_26 = new JLabel("3)");
	    label_26.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    
	    JLabel label_27 = new JLabel("Realice el siguiente ejercicio");
	    label_27.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    
	    lblimg2 = new JLabel("                        IMAGEN");
	    lblimg2.setIcon(MedioCFG.imagen2);
	    lblimg2.setToolTipText("");
	    lblimg2.setForeground(Color.LIGHT_GRAY);
	    lblimg2.setFont(new Font("Tahoma", Font.BOLD, 15));
	    
	    JLabel label_29 = new JLabel("R//");
	    label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    txtrespuesta3 = new JTextField();
	    txtrespuesta3.setEnabled(false);
	    txtrespuesta3.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta3.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta3.setColumns(10);
	    txtrespuesta3.setBackground(SystemColor.control);
	    
	    lblayuda3 = new JLabel("");
	    lblayuda3.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc3);
	    	}
	    });
	    lblayuda3.setToolTipText("Clic para ver ayuda!");
	    lblayuda3.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda3.setFont(new Font("Tahoma", Font.BOLD, 14));
	    
	    JLabel label_5 = new JLabel("RESULVA LOS SIGUIENTES EJERCICIOS ");
	    label_5.setFont(new Font("Segoe Print", Font.BOLD, 16));
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setLayout(null);
	    panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
	    panel_2.setBackground(Color.WHITE);
	    
	    JLabel label_10 = new JLabel("6)");
	    label_10.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    label_10.setBounds(88, 65, 25, 14);
	    panel_2.add(label_10);
	    
	    JLabel label_30 = new JLabel("Resuelva \r\n");
	    label_30.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    label_30.setBounds(119, 60, 235, 17);
	    panel_2.add(label_30);
	    
	    textPane_2 = new JTextPane();
	    textPane_2.setEditable(false);
	    textPane_2.setToolTipText("");
	    textPane_2.setText(MedioCFG.txtpane2);
	    textPane_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
	    textPane_2.setBackground(Color.WHITE);
	    textPane_2.setBounds(78, 90, 235, 144);
	    panel_2.add(textPane_2);
	    
	    JLabel label_31 = new JLabel("7)");
	    label_31.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    label_31.setBounds(382, 65, 19, 14);
	    panel_2.add(label_31);
	    
	    JLabel label_32 = new JLabel("Resuelva \r\n");
	    label_32.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    label_32.setBounds(418, 60, 235, 17);
	    panel_2.add(label_32);
	    
	    lblimg6 = new JLabel("                 IMAGEN");
	    lblimg6.setIcon(MedioCFG.imagen6);
	    lblimg6.setToolTipText("");
	    lblimg6.setForeground(Color.LIGHT_GRAY);
	    lblimg6.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblimg6.setBackground(Color.LIGHT_GRAY);
	    lblimg6.setBounds(79, 243, 225, 111);
	    panel_2.add(lblimg6);
	    
	    textPane_3 = new JTextPane();
	    textPane_3.setEditable(false);
	    textPane_3.setToolTipText("");
	    textPane_3.setText(MedioCFG.txtpane3);
	    textPane_3.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
	    textPane_3.setBackground(Color.WHITE);
	    textPane_3.setBounds(378, 88, 255, 144);
	    panel_2.add(textPane_3);
	    
	    lblimg7 = new JLabel("                 IMAGEN");	
	    lblimg7.setIcon(MedioCFG.imagen7);
	    lblimg7.setToolTipText("");
	    lblimg7.setForeground(Color.LIGHT_GRAY);
	    lblimg7.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblimg7.setBackground(Color.LIGHT_GRAY);
	    lblimg7.setBounds(391, 243, 198, 111);
	    panel_2.add(lblimg7);
	    
	    JLabel label_35 = new JLabel("8)");
	    label_35.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    label_35.setBounds(713, 65, 25, 14);
	    panel_2.add(label_35);
	    
	    JLabel label_36 = new JLabel("Resuelva \r\n");
	    label_36.setFont(new Font("Segoe Print", Font.BOLD, 20));
	    label_36.setBounds(748, 60, 235, 17);
	    panel_2.add(label_36);
	    
	    textPane_pr = new JTextPane();
	    textPane_pr.setEditable(false);
	    textPane_pr.setToolTipText("");
	    textPane_pr.setText(MedioCFG.txtpane4);
	    textPane_pr.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
	    textPane_pr.setBackground(Color.WHITE);
	    textPane_pr.setBounds(713, 90, 255, 144);
	    panel_2.add(textPane_pr);
	    
	    JLabel label_37 = new JLabel("R//");
	    label_37.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_37.setBounds(87, 396, 28, 17);
	    panel_2.add(label_37);
	    
	    txtrespuesta6 = new JTextField();
	    txtrespuesta6.setEnabled(false);
	    txtrespuesta6.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta6.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta6.setColumns(10);
	    txtrespuesta6.setBackground(SystemColor.control);
	    txtrespuesta6.setBounds(125, 393, 92, 20);
	    panel_2.add(txtrespuesta6);
	    
	    lblayuda6 = new JLabel("");
	    lblayuda6.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc6);
	    	}
	    });
	    lblayuda6.setToolTipText("Clic para ver ayuda!");
	    lblayuda6.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda6.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblayuda6.setBounds(227, 389, 24, 24);
	    panel_2.add(lblayuda6);
	    
	    JLabel label_39 = new JLabel("R//");
	    label_39.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_39.setBounds(391, 392, 28, 17);
	    panel_2.add(label_39);
	    
	    txtrespuesta7 = new JTextField();
	    txtrespuesta7.setEnabled(false);
	    txtrespuesta7.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    });
	    txtrespuesta7.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta7.setColumns(10);
	    txtrespuesta7.setBackground(SystemColor.control);
	    txtrespuesta7.setBounds(429, 393, 92, 20);
	    panel_2.add(txtrespuesta7);
	    
	    lblayuda7 = new JLabel("");
	    lblayuda7.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc7);
	    	}
	    });
	    lblayuda7.setToolTipText("Clic para ver ayuda!");
	    lblayuda7.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda7.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblayuda7.setBounds(531, 389, 24, 24);
	    panel_2.add(lblayuda7);
	    
	    JLabel label_41 = new JLabel("R//");
	    label_41.setFont(new Font("Tahoma", Font.BOLD, 14));
	    label_41.setBounds(713, 396, 28, 17);
	    panel_2.add(label_41);
	    
	    txtrespuesta8 = new JTextField();
	    txtrespuesta8.setEnabled(false);
	    txtrespuesta8.addKeyListener(new KeyAdapter() {
	    	@Override
	    	public void keyTyped(KeyEvent evt) {
	    		char c=evt.getKeyChar(); 	 
	    		if(Character.isLetter(c)) {
	    			getToolkit().beep();
	       			evt.consume();
	    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
	    		}
	    	}
	    	}
	    );
	    txtrespuesta8.setToolTipText("Ingresa las respuestas en forma num\u00E9rica.");
	    txtrespuesta8.setColumns(10);
	    txtrespuesta8.setBackground(SystemColor.control);
	    txtrespuesta8.setBounds(750, 393, 118, 20);
	    panel_2.add(txtrespuesta8);
	    
	    lblayuda8 = new JLabel("");
	    lblayuda8.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc8);
	    	}
	    });
	    lblayuda8.setToolTipText("Clic para ver ayuda!");
	    lblayuda8.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda8.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblayuda8.setBounds(878, 389, 24, 24);
	    panel_2.add(lblayuda8);
	    
	    lblimg8 = new JLabel("                 IMAGEN");
	    lblimg8.setIcon(MedioCFG.imagen8);
	    lblimg8.setToolTipText("");
	    lblimg8.setForeground(Color.LIGHT_GRAY);
	    lblimg8.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblimg8.setBackground(Color.LIGHT_GRAY);
	    lblimg8.setBounds(721, 243, 198, 105);
	    panel_2.add(lblimg8);
	    
	    textPane_5 = new JTextPane();
	    textPane_5.setEditable(false);
	    textPane_5.setText(MedioCFG.txtpane5);
	    textPane_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
	    textPane_5.setBackground(Color.WHITE);
	    textPane_5.setBounds(0, 602, 552, 52);
	    panel_2.add(textPane_5);
	    
	    JLabel label_44 = new JLabel("");
	    label_44.setBounds(580, 520, 82, 123);
	    panel_2.add(label_44);
	    
	    JLabel label_45 = new JLabel("");
	    label_45.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/syslac.JPG")));
	    label_45.setBounds(694, 509, 208, 94);
	    panel_2.add(label_45);
	    
	    lblayuda1 = new JLabel("");
	    lblayuda1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		JOptionPane.showMessageDialog(null,MedioCFG.ayc1);
	    	}
	    });
	    lblayuda1.setToolTipText("Clic para ver ayuda!");
	    lblayuda1.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/ayuda2.png")));
	    lblayuda1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    GroupLayout gl_panel = new GroupLayout(panel);
	    gl_panel.setHorizontalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(387)
	    					.addComponent(label, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(360)
	    					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(627)
	    					.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10)
	    					.addComponent(txtrespuesta3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
	    					.addGap(10)
	    					.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(91)
	    					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 976, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(39)
	    					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1014, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(107)
	    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addComponent(label_3)
	    							.addGap(6)
	    							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addGap(20)
	    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    								.addComponent(lblimg1, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
	    								.addGroup(gl_panel.createSequentialGroup()
	    									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
	    									.addGap(10)
	    									.addComponent(txtrespuesta1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
	    									.addPreferredGap(ComponentPlacement.UNRELATED)
	    									.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))))
	    					.addGap(158)
	    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addComponent(label_6)
	    							.addGap(18)
	    							.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addComponent(label_26)
	    							.addGap(18)
	    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    								.addComponent(lblimg3, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
	    								.addGroup(gl_panel.createSequentialGroup()
	    									.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
	    									.addGap(10)
	    									.addComponent(txtrespuesta2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
	    									.addGap(10)
	    									.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
	    								.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(lblimg2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))))))
	    			.addGap(1618))
	    );
	    gl_panel.setVerticalGroup(
	    	gl_panel.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_panel.createSequentialGroup()
	    			.addGap(11)
	    			.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
	    			.addGap(6)
	    			.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
	    			.addGap(18)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(16)
	    					.addComponent(label_6))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(11)
	    					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(5)
	    					.addComponent(label_3))
	    				.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addGap(158)
	    							.addComponent(label_26))
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addComponent(lblimg3, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
	    							.addGap(6)
	    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    								.addGroup(gl_panel.createSequentialGroup()
	    									.addGap(4)
	    									.addComponent(label_9))
	    								.addGroup(gl_panel.createSequentialGroup()
	    									.addGap(4)
	    									.addComponent(txtrespuesta2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    								.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
	    							.addGap(24)
	    							.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
	    							.addGap(20)
	    							.addComponent(lblimg2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
	    					.addGap(18)
	    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addGap(4)
	    							.addComponent(label_29))
	    						.addGroup(gl_panel.createSequentialGroup()
	    							.addGap(4)
	    							.addComponent(txtrespuesta3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addComponent(lblimg1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
	    					.addGap(30)
	    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    						.addComponent(label_4)
	    						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
	    							.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    							.addComponent(txtrespuesta1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
	    			.addGap(27)
	    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
	    				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
	    				.addGroup(gl_panel.createSequentialGroup()
	    					.addGap(342)
	    					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)))
	    			.addContainerGap())
	    );
	    
	    JLabel label_8 = new JLabel("4)");
	    label_8.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
	    label_8.setBounds(20, 21, 14, 14);
	    panel_1.add(label_8);
	    
	    btnvalidarrespuestas = new JButton("");
	    btnvalidarrespuestas.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		campos_no_vacios();
	    		respuestas();
	    	}
	    });
	    btnvalidarrespuestas.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/check.png")));
	    btnvalidarrespuestas.setToolTipText("Validación de sus respuestas");
	    btnvalidarrespuestas.setEnabled(false);
	    btnvalidarrespuestas.setBounds(352, 509, 61, 41);
	    panel_2.add(btnvalidarrespuestas);
	    
	    btnenviarrespuestas = new JButton("");
	    btnenviarrespuestas.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/enviar.png")));
	    btnenviarrespuestas.setToolTipText("Envía las repuestas al EV3\r\n");
	    btnenviarrespuestas.setEnabled(false);
	    btnenviarrespuestas.setBounds(419, 509, 61, 41);
	    panel_2.add(btnenviarrespuestas);
	    
	    btncronometro = new JButton("");
	    btncronometro.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/cronometro.png")));
	    btncronometro.setToolTipText("Cronómetro del juego\r\n");
	    btncronometro.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		music= java.applet.Applet.newAudioClip(getClass().getResource("/Musica/ww.wav"));
	    		music.loop();
		        cr.setVisible(true);
		        btnvalidarrespuestas.setEnabled(true);
		        btncronometro.setEnabled(false);
	    		
	    	}
	    });
	    btncronometro.setBounds(486, 509, 61, 41);
	    panel_2.add(btncronometro);
	    
	    btnpararmusica = new JButton("");
	    btnpararmusica.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				music.stop();
	    	}
	    });
	    btnpararmusica.setIcon(new ImageIcon(MedioM.class.getResource("/imagenes/stop.png")));
	    btnpararmusica.setToolTipText("Detener música\r\n");
	    btnpararmusica.setBounds(553, 509, 61, 41);
	    panel_2.add(btnpararmusica);
	    
	    JLabel label_2 = new JLabel("");
	    label_2.setBounds(812, 464, 82, 123);
	    panel_2.add(label_2);
	    gl_panel.setAutoCreateGaps(true);
	    gl_panel.setAutoCreateContainerGaps(true);
	    panel.setLayout(gl_panel);
	    getContentPane().add(scrollPane);
	    setVisible(true);
	}
}
