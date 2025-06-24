package Configuraciones;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import Interfaz.Cronometro;
import Interfaz.Nivel_Basico;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class FacilM extends JFrame {

	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	
	public static JTextField txtp1a1, txtp1a2, txtp1a3, txtp1a4, txtp2b, txtp2abase, txtp2aexpo, txtp2dbase, txtp2dexpo, txtp2cbase, 
	txtp2cexpo, txtp1bbase,txtp1bexpo, txtp3a, txtp3b, txtp5c, txtp5dbase, txtp5dexpo, txtp5b, txtp5a, txtp6a, txtp6b, txtp6c, txtp6d, txtp6e;
	public static JTextPane txtpregunta5d, txtpregunta5c, txtpregunta5a, txtpregunta5b, txtpregunta5, txtpregunta6e, txtpregunta6d, txtpregunta6a, txtpregunta6b, txtpregunta6c, txtpregunta6, txtpregunta3b, txtpregunta3a, txtpregunta3, txtpregunta1b, txtpregunta1a, txtpregunta2b, txtpregunta2a, txtpregunta2c, txtpregunta2d, txt2expo, txt3expo, txt4expo;
	public static JLabel lblayuda4, lblayuda1, lblayuda2, lblayuda3, lblayuda5;
	public static double  p1a1, p1a2, p1a3, p1a4,p1bexpo, p2b, p3a, p3b, p5a, p5b, p5c, p6a, p6b, p6c, p6d, p6e, p1bbase, p2abase, p2aexpo, p2cbase, p2cexpo, p2dbase,p2dexpo, p5dbase, p5dexpo;
	static String ayd1,	ayd2, ayd3, ayd4, ayd5, p1, p2, p3, pa3, pb3, p4, pa4, pb4, pc4, pd4, pe4, p5, pa5, pb5, pc5, p6, pa6, pb6, pc6, pd6;
	public static JButton btncronometro, btnrespuestas, btnpararmusica, btnenviarrespuestas;
	Icon configurar=new ImageIcon(getClass().getResource("/imagenes/version.png"));
	
	public static AudioClip music;
	 
	Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
	Cronometro cr=new Cronometro();
	static boolean open=false;

			 
		 public static void main(String args[]) {
			  EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FacilM frame = new FacilM();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		  }
		 
		 public FacilM() {
			  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						 alcerrar();
					}
				});
				setUndecorated(false);
			    setIconImage(Toolkit.getDefaultToolkit().getImage(FacilM.class.getResource("/imagenes/2.jpg")));
			    setTitle("Nivel Basico Modificación");
			    setSize(1102,600);
			    setLocationRelativeTo(null);
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
		 
		 public static void habilitarrespuestas(){
			  txtp1a1.setEnabled(true); txtp1a2.setEnabled(true); txtp1a3.setEnabled(true); txtp1a4.setEnabled(true); txtp2b.setEnabled(true); txtp3a.setEnabled(true);txtp3b.setEnabled(true); txtp5a.setEnabled(true); txtp5b.setEnabled(true); txtp5c.setEnabled(true); txtp6a.setEnabled(true); txtp6b.setEnabled(true); txtp6c.setEnabled(true); txtp6d.setEnabled(true); txtp6e.setEnabled(true); 
			  txtp1bbase.setEnabled(true); txtp1bexpo.setEnabled(true); txtp2abase.setEnabled(true); txtp2aexpo.setEnabled(true); txtp2cbase.setEnabled(true); txtp2cexpo.setEnabled(true); txtp2dbase.setEnabled(true); txtp2dexpo.setEnabled(true); txtp5dbase.setEnabled(true); txtp5dexpo.setEnabled(true);
		  }
		  
		  public static void desabilitarrespuestas() {
			  txtp1a1.setEnabled(false); txtp1a2.setEnabled(false); txtp1a3.setEnabled(false); txtp1a4.setEnabled(false); txtp2b.setEnabled(false); txtp3a.setEnabled(false);txtp3b.setEnabled(false); txtp5a.setEnabled(false); txtp5b.setEnabled(false); txtp5c.setEnabled(false); txtp6a.setEnabled(false); txtp6b.setEnabled(false); txtp6c.setEnabled(false); txtp6d.setEnabled(false); txtp6e.setEnabled(false); 
			  txtp1bbase.setEnabled(false); txtp1bexpo.setEnabled(false); txtp2abase.setEnabled(false); txtp2aexpo.setEnabled(false); txtp2cbase.setEnabled(false); txtp2cexpo.setEnabled(false); txtp2dbase.setEnabled(false); txtp2dexpo.setEnabled(false); txtp5dbase.setEnabled(false); txtp5dexpo.setEnabled(false);
		  }

		  
		  public static void validar_respuestas(){
			  p1a1 = Double.valueOf(txtp1a1.getText());
			  p1a2 = Double.valueOf(txtp1a2.getText());
			  p1a3 = Double.valueOf(txtp1a3.getText());
			  p1a4 = Double.valueOf(txtp1a4.getText());
			  p2b = Double.valueOf(txtp2b.getText());
			  p3a = Double.valueOf(txtp3a.getText());
			  p3b = Double.valueOf(txtp3b.getText());
			  p5a = Double.valueOf(txtp5a.getText());
			  
			  p5b = Double.valueOf(txtp5b.getText());
			  p5c = Double.valueOf(txtp5c.getText());
			  p6a = Double.valueOf(txtp6a.getText());
			  p6b = Double.valueOf(txtp6b.getText());
			  p6c = Double.valueOf(txtp6c.getText());
			  p6d = Double.valueOf(txtp6d.getText());
			  p6e = Double.valueOf(txtp6e.getText());
			  p1bbase = Double.valueOf(txtp1bbase.getText());
			  p2abase= Double.valueOf(txtp2abase.getText());
			  p2aexpo = Double.valueOf(txtp2aexpo.getText());
			  p2cbase = Double.valueOf(txtp2cbase.getText());
			  p2cexpo = Double.valueOf(txtp2cexpo.getText());
			  p2dbase = Double.valueOf(txtp2dbase.getText());
			  
			  p2dexpo = Double.valueOf(txtp2dexpo.getText());
			  p5dbase = Double.valueOf(txtp5dbase.getText());
			  p5dexpo = Double.valueOf(txtp5dexpo.getText());
			  p1bexpo = Double.valueOf(txtp1bexpo.getText());
			  
		  		 if(p1a1==FacilCF.p1a1 && p1a2==FacilCF.p1a2 && p1a3==FacilCF.p1a3 && p1a4==FacilCF.p1a4 && p2b==FacilCF.p2b && p3a==FacilCF.p3a && 
		  		   p3b==FacilCF.p3b && p5a==FacilCF.p5a && p5b==FacilCF.p5b && p5c==FacilCF.p5c && p6a==FacilCF.p6a && p6b==FacilCF.p6b && p6c==FacilCF.p6c &&
		  		   p6d==FacilCF.p6d && p6e==FacilCF.p6e && p1bbase==FacilCF.p1bbase && p1bexpo==FacilCF.p1bexpo && p2abase==FacilCF.p2abase && p2aexpo==FacilCF.p2aexpo 
		  		   && p2cbase==FacilCF.p2cbase && p2cexpo==FacilCF.p2cexpo && p2dbase==FacilCF.p2dbase && p2dexpo==FacilCF.p2dexpo && p5dbase==FacilCF.p5dbase && 
		  		   p5dexpo==FacilCF.p5dexpo){
		  			 
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
		         if(txtp1a1.getText().isEmpty()==true | txtp1a2.getText().isEmpty()==true | txtp1a3.getText().isEmpty()==true | txtp1a4.getText().isEmpty()==true | txtp2b.getText().isEmpty()==true | txtp3a.getText().isEmpty()==true | txtp3b.getText().isEmpty()==true | txtp5a.getText().isEmpty()==true | 
		        	txtp5b.getText().isEmpty()==true | txtp5c.getText().isEmpty()==true | txtp6a.getText().isEmpty()==true | txtp6b.getText().isEmpty()==true | txtp6c.getText().isEmpty()==true | txtp6d.getText().isEmpty()==true | txtp6e.getText().isEmpty()==true | 
		        	 txtp1bbase.getText().isEmpty()==true | txtp1bexpo.getText().isEmpty()==true | txtp2abase.getText().isEmpty()==true | txtp2aexpo.getText().isEmpty()==true | txtp2cbase.getText().isEmpty()==true | txtp2cexpo.getText().isEmpty()==true | txtp2dbase.getText().isEmpty()==true |
		        	txtp2dexpo.getText().isEmpty()==true |  txtp5dbase.getText().isEmpty()==true | txtp5dexpo.getText().isEmpty()==true){
		        	 JOptionPane.showMessageDialog(null, "Revise que ningun campo este vacio.", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);  
				  } 
		  }
					
			    
	 
  public void all() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    
    scrollpane = new JScrollPane(panel);
    
    JLabel lblNivelMedio = new JLabel("NIVEL B\u00C1SICO");
    lblNivelMedio.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 30));
    
    txtpregunta1a = new JTextPane();
    txtpregunta1a.setEditable(false);
    txtpregunta1a.setText(FacilCF.p1);
    txtpregunta1a.setBackground(Color.WHITE);
    txtpregunta1a.setForeground(Color.BLACK);
    txtpregunta1a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp1a1 = new JTextField();
    txtp1a1.setEnabled(false);
    txtp1a1.setBackground(SystemColor.control);
    txtp1a1.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    
    txtp1a1.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a1.setColumns(10);
    
    txtp1a2 = new JTextField();
    txtp1a2.setEnabled(false);
    txtp1a2.setBackground(SystemColor.control);
    txtp1a2.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp1a2.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a2.setColumns(10);
    
    txtp1a3 = new JTextField();
    txtp1a3.setEnabled(false);
    txtp1a3.setBackground(SystemColor.control);
    txtp1a3.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp1a3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a3.setColumns(10);
    
    txtp1a4 = new JTextField();
    txtp1a4.setEnabled(false);
    txtp1a4.setBackground(SystemColor.control);
    txtp1a4.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp1a4.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a4.setColumns(10);
    
    txtpregunta1b = new JTextPane();
    txtpregunta1b.setEditable(false);
    txtpregunta1b.setText(FacilCF.p2);
    txtpregunta1b.setBackground(Color.WHITE);
    txtpregunta1b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta2a = new JTextPane();
    txtpregunta2a.setEditable(false);
    txtpregunta2a.setText(FacilCF.p5);
    txtpregunta2a.setForeground(Color.BLACK);
    txtpregunta2a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta2a.setBackground(Color.WHITE);
    
    txtpregunta2b = new JTextPane();
    txtpregunta2b.setEditable(false);
    txtpregunta2b.setText(FacilCF.pa5);
    txtpregunta2b.setBackground(Color.WHITE);
    txtpregunta2b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2b = new JTextField();
    txtp2b.setEnabled(false);
    txtp2b.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2b.setColumns(10);
    
    txtpregunta2c = new JTextPane();
    txtpregunta2c.setEditable(false);
    txtpregunta2c.setText(FacilCF.pb5);
    txtpregunta2c.setBackground(Color.WHITE);
    txtpregunta2c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta2d = new JTextPane();
    txtpregunta2d.setEditable(false);
    txtpregunta2d.setText(FacilCF.pc5);
    txtpregunta2d.setBackground(Color.WHITE);
    txtpregunta2d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2abase = new JTextField();
    txtp2abase.setEnabled(false);
    txtp2abase.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2abase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2abase.setColumns(10);
    
    txt2expo = new JTextPane();
    txt2expo.setEditable(false);
    txt2expo.setText("* 10^");
    txt2expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2aexpo = new JTextField();
    txtp2aexpo.setEnabled(false);
    txtp2aexpo.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2aexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2aexpo.setColumns(10);
    
    txtp2dbase = new JTextField();
    txtp2dbase.setEnabled(false);
    txtp2dbase.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2dbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2dbase.setColumns(10);
    
    txt3expo = new JTextPane();
    txt3expo.setEditable(false);
    txt3expo.setText("* 10^");
    txt3expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2dexpo = new JTextField();
    txtp2dexpo.setEnabled(false);
    txtp2dexpo.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2dexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2dexpo.setColumns(10);
    
    txtp2cbase = new JTextField();
    txtp2cbase.setEnabled(false);
    txtp2cbase.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2cbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2cbase.setColumns(10);
    
    txt4expo = new JTextPane();
    txt4expo.setEditable(false);
    txt4expo.setText("* 10^");
    txt4expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2cexpo = new JTextField();
    txtp2cexpo.setEnabled(false);
    txtp2cexpo.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp2cexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2cexpo.setColumns(10);
    
    lblayuda2 = new JLabel("");
    lblayuda2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		JOptionPane.showMessageDialog(null, FacilCF.ayd4);
    	}
    });
    lblayuda2.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtp1bbase = new JTextField();
    txtp1bbase.setEnabled(false);
    txtp1bbase.setBackground(SystemColor.control);
    txtp1bbase.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp1bbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1bbase.setColumns(10);
    
    JTextPane txt1expo = new JTextPane();
    txt1expo.setEditable(false);
    txt1expo.setText("^");
    txt1expo.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
    
    txtp1bexpo = new JTextField();
    txtp1bexpo.setEnabled(false);
    txtp1bexpo.setBackground(SystemColor.control);
    txtp1bexpo.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp1bexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1bexpo.setColumns(10);
    
    lblayuda1 = new JLabel("");
    lblayuda1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null,FacilCF.ayd1);
    	}
    });
    lblayuda1.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtpregunta3 = new JTextPane();
    txtpregunta3.setEditable(false);
    txtpregunta3.setText(FacilCF.p3);
    txtpregunta3.setForeground(Color.BLACK);
    txtpregunta3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta3.setBackground(Color.WHITE);
    
    txtpregunta3a = new JTextPane();
    txtpregunta3a.setForeground(Color.BLACK);
    txtpregunta3a.setEditable(false);
    txtpregunta3a.setText(FacilCF.pa3);
    txtpregunta3a.setBackground(Color.WHITE);
    txtpregunta3a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3a = new JTextField();
    txtp3a.setEnabled(false);
    txtp3a.setBackground(SystemColor.control);
    txtp3a.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp3a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp3a.setColumns(10);
    
    txtpregunta3b = new JTextPane();
    txtpregunta3b.setForeground(Color.BLACK);
    txtpregunta3b.setEditable(false);
    txtpregunta3b.setText(FacilCF.pb3);
    txtpregunta3b.setBackground(Color.WHITE);
    txtpregunta3b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3b = new JTextField();
    txtp3b.setEnabled(false);
    txtp3b.setBackground(SystemColor.control);
    txtp3b.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp3b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp3b.setColumns(10);
    
    txtpregunta5c = new JTextPane();
    txtpregunta5c.setEditable(false);
    txtpregunta5c.setText(FacilCF.pc6);
    txtpregunta5c.setBackground(Color.WHITE);
    txtpregunta5c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5c = new JTextField();
    txtp5c.setEnabled(false);
    txtp5c.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp5c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5c.setColumns(10);
    
    txtpregunta5d = new JTextPane();
    txtpregunta5d.setEditable(false);
    txtpregunta5d.setText(FacilCF.pd6);
    txtpregunta5d.setBackground(Color.WHITE);
    txtpregunta5d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5dbase = new JTextField();
    txtp5dbase.setEnabled(false);
    txtp5dbase.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp5dbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5dbase.setColumns(10);
    
    JTextPane txt6expo = new JTextPane();
    txt6expo.setEditable(false);
    txt6expo.setText("^");
    txt6expo.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
    
    txtp5dexpo = new JTextField();
    txtp5dexpo.setEnabled(false);
    txtp5dexpo.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp5dexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5dexpo.setColumns(10);
    
    txtp5b = new JTextField();
    txtp5b.setEnabled(false);
    txtp5b.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp5b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5b.setColumns(10);
    
    txtpregunta5b = new JTextPane();
    txtpregunta5b.setEditable(false);
    txtpregunta5b.setText(FacilCF.pb6);
    txtpregunta5b.setBackground(Color.WHITE);
    txtpregunta5b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta5a = new JTextPane();
    txtpregunta5a.setEditable(false);
    txtpregunta5a.setText(FacilCF.pa6);
    txtpregunta5a.setBackground(Color.WHITE);
    txtpregunta5a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5a = new JTextField();
    txtp5a.setEnabled(false);
    txtp5a.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    
    txtp5a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5a.setColumns(10);
    
    txtpregunta5 = new JTextPane();
    txtpregunta5.setEditable(false);
    txtpregunta5.setText(FacilCF.p6);
    txtpregunta5.setForeground(Color.BLACK);
    txtpregunta5.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta5.setBackground(Color.WHITE);
    
    lblayuda3 = new JLabel("");
    lblayuda3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		JOptionPane.showMessageDialog(null, FacilCF.ayd2);
    	}
    });
    lblayuda3.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    lblayuda5 = new JLabel("");
    lblayuda5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, FacilCF.ayd5);
    	}
    });
    lblayuda5.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtpregunta6 = new JTextPane();
    txtpregunta6.setEditable(false);
    txtpregunta6.setText(FacilCF.p4);
    txtpregunta6.setLocation(3000, 642);
    txtpregunta6.setForeground(Color.BLACK);
    txtpregunta6.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta6.setBackground(Color.WHITE);
    
    txtp6a = new JTextField();
    txtp6a.setEnabled(false);
    txtp6a.setBackground(SystemColor.control);
    txtp6a.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp6a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6a.setColumns(10);
    
    txtpregunta6a = new JTextPane();
    txtpregunta6a.setForeground(Color.BLACK);
    txtpregunta6a.setEditable(false);
    txtpregunta6a.setText(FacilCF.pa4);
    txtpregunta6a.setBackground(Color.WHITE);
    txtpregunta6a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6b = new JTextPane();
    txtpregunta6b.setForeground(Color.BLACK);
    txtpregunta6b.setEditable(false);
    txtpregunta6b.setText(FacilCF.pb4);
    txtpregunta6b.setBackground(Color.WHITE);
    txtpregunta6b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6c = new JTextPane();
    txtpregunta6c.setForeground(Color.BLACK);
    txtpregunta6c.setEditable(false);
    txtpregunta6c.setText(FacilCF.pc4);
    txtpregunta6c.setBackground(Color.WHITE);
    txtpregunta6c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp6b = new JTextField();
    txtp6b.setEnabled(false);
    txtp6b.setBackground(SystemColor.control);
    txtp6b.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp6b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6b.setColumns(10);
    
    txtp6c = new JTextField();
    txtp6c.setEnabled(false);
    txtp6c.setBackground(SystemColor.control);
    txtp6c.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp6c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6c.setColumns(10);
    
    txtp6d = new JTextField();
    txtp6d.setEnabled(false);
    txtp6d.setBackground(SystemColor.control);
    txtp6d.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp6d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6d.setColumns(10);
    
    txtp6e = new JTextField();
    txtp6e.setEnabled(false);
    txtp6e.setBackground(SystemColor.control);
    txtp6e.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o decimales(.)");
    		}
    	}
    });
    txtp6e.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6e.setColumns(10);
    
    txtpregunta6d = new JTextPane();
    txtpregunta6d.setForeground(Color.BLACK);
    txtpregunta6d.setEditable(false);
    txtpregunta6d.setText(FacilCF.pd4);
    txtpregunta6d.setBackground(Color.WHITE);
    txtpregunta6d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6e = new JTextPane();
    txtpregunta6e.setForeground(Color.BLACK);
    txtpregunta6e.setEditable(false);
    txtpregunta6e.setText(FacilCF.pe4);
    txtpregunta6e.setBackground(Color.WHITE);
    txtpregunta6e.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    lblayuda4 = new JLabel("");
    lblayuda4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null,FacilCF.ayd3);
    	}
    });
    lblayuda4.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    btnrespuestas = new JButton("");
    btnrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		campos_no_vacios();
    		validar_respuestas();
    	}
    });
    btnrespuestas.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/check.png")));
    btnrespuestas.setToolTipText("Validacion de sus respuestas");
    btnrespuestas.setEnabled(false);
    
    btnenviarrespuestas = new JButton("");
    btnenviarrespuestas.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/enviar.png")));
    btnenviarrespuestas.setToolTipText("Envia las repuestas al EV3\r\n");
    btnenviarrespuestas.setEnabled(false);
    
    btncronometro = new JButton("");
    btncronometro.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/cronometro.png")));
    btncronometro.setToolTipText("Cronometro del juego\r\n");
    btncronometro.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		music= java.applet.Applet.newAudioClip(getClass().getResource("/Musica/ww.wav"));
    		music.loop();
	        cr.setVisible(true);
	        btnrespuestas.setEnabled(true);
	        btncronometro.setEnabled(false);
    		
    	}
    });
    
    btnpararmusica = new JButton("");
    btnpararmusica.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			music.stop();
    	}
    });
    btnpararmusica.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/stop.png")));
    btnpararmusica.setToolTipText("Detener musica\r\n");
    
    JLabel lblimgmat6 = new JLabel("");
    lblimgmat6.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/2.jpg")));
   
    
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addGap(3038)
    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(lblNivelMedio, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    					.addGap(349))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtp1a1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.UNRELATED)
    					.addComponent(txtp1a2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.UNRELATED)
    					.addComponent(txtp1a3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.UNRELATED)
    					.addComponent(txtp1a4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    					.addGap(600))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(220)
    									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    										.addGroup(gl_panel.createSequentialGroup()
    											.addGap(73)
    											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
    												.addComponent(txtpregunta3b, 0, 0, Short.MAX_VALUE)
    												.addComponent(txtpregunta3a, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
    											.addGap(26)
    											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    												.addComponent(txtp3a, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    												.addComponent(txtp3b, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    												.addComponent(lblayuda3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    											.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addGap(151)
    											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    												.addGroup(gl_panel.createSequentialGroup()
    													.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    														.addComponent(txtpregunta6c, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
    														.addComponent(txtpregunta6b, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
    														.addComponent(txtpregunta6a, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
    													.addPreferredGap(ComponentPlacement.RELATED)
    													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    														.addComponent(txtp6a, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    														.addComponent(txtp6b, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    														.addComponent(txtp6c, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
    												.addGroup(gl_panel.createSequentialGroup()
    													.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    														.addComponent(txtpregunta6e, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
    														.addComponent(txtpregunta6d, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
    													.addPreferredGap(ComponentPlacement.RELATED)
    													.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    														.addComponent(txtp6d, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    														.addComponent(txtp6e, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))))
    											.addGap(75))))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
    									.addGap(66)))
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    									.addGroup(gl_panel.createSequentialGroup()
    										.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
    										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    											.addGroup(gl_panel.createSequentialGroup()
    												.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    												.addGap(112))
    											.addGroup(gl_panel.createSequentialGroup()
    												.addComponent(txtpregunta5, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    												.addContainerGap())
    											.addGroup(gl_panel.createSequentialGroup()
    												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    													.addGroup(gl_panel.createSequentialGroup()
    														.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
    															.addComponent(txtpregunta5b, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
    															.addComponent(txtpregunta5a, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
    															.addComponent(txtpregunta5c, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
    														.addGap(7)
    														.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    															.addComponent(txtp5c, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    															.addComponent(txtp5b, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    															.addComponent(txtp5a, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
    													.addGroup(gl_panel.createSequentialGroup()
    														.addComponent(txtpregunta5d, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
    														.addPreferredGap(ComponentPlacement.RELATED)
    														.addComponent(txtp5dbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    														.addGap(10)
    														.addComponent(txt6expo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
    														.addGap(7)
    														.addComponent(txtp5dexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
    												.addGap(74))
    											.addGroup(gl_panel.createSequentialGroup()
    												.addComponent(lblayuda5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    												.addGap(68))))
    									.addGroup(gl_panel.createSequentialGroup()
    										.addGap(85)
    										.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    										.addGap(7)
    										.addComponent(btnenviarrespuestas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    										.addGap(7)
    										.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    										.addGap(7)
    										.addComponent(btnpararmusica, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    										.addGap(45)
    										.addComponent(lblimgmat6, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
    										.addGap(23)))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addPreferredGap(ComponentPlacement.RELATED)
    									.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    									.addContainerGap())))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
    									.addGroup(gl_panel.createSequentialGroup()
    										.addComponent(txtp1bbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    										.addGap(12)
    										.addComponent(txt1expo, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
    										.addGap(12)
    										.addComponent(txtp1bexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    										.addGap(128)
    										.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    									.addComponent(txtpregunta1a, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
    								.addComponent(txtpregunta3, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtpregunta1b, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE))
    							.addGap(46)
    							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtp2dbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    									.addGap(10)
    									.addComponent(txt3expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    									.addGap(10)
    									.addComponent(txtp2dexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    									.addGap(133))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addGroup(gl_panel.createSequentialGroup()
    											.addGap(160)
    											.addComponent(txtp2b, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addGap(120)
    											.addComponent(txtp2abase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    											.addPreferredGap(ComponentPlacement.UNRELATED)
    											.addComponent(txt2expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    											.addGap(10)
    											.addComponent(txtp2aexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addGap(128)
    											.addComponent(txtp2cbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    											.addGap(10)
    											.addComponent(txt4expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    											.addGap(10)
    											.addComponent(txtp2cexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addPreferredGap(ComponentPlacement.RELATED)
    											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    												.addComponent(txtpregunta2a, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    												.addComponent(txtpregunta2d, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    												.addComponent(txtpregunta2b, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    												.addComponent(txtpregunta2c, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))))
    									.addContainerGap())))))))
    );
    gl_panel.setVerticalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(lblNivelMedio, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    			.addPreferredGap(ComponentPlacement.UNRELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtpregunta2a, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2aexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2abase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt2expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2b, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtp2b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2c, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtpregunta1a, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(txtp1a4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp1a3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp1a2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp1a1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta1b, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp1bbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt1expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp1bexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2cbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt4expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2cexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2d, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    				.addComponent(txtpregunta3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2dbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt3expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2dexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    					.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(11)
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addComponent(txtpregunta3a, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp3a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
    			.addGap(18)
    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtpregunta3b, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp3b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addGap(18)
    					.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    				.addComponent(txtpregunta5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(23)
    					.addComponent(txtpregunta6, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
    					.addGap(22)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp6a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtpregunta6a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(7)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtpregunta5a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp5a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addComponent(txtpregunta5b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp5b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addComponent(txtp5c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtpregunta5c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtp5dbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txt6expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp5dexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(24)
    							.addComponent(lblayuda5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(txtpregunta5d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtp6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtpregunta6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp6c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtpregunta6c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp6d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtpregunta6d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtpregunta6e, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    							.addComponent(txtp6e, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addComponent(lblimgmat6, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(29)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnenviarrespuestas, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnpararmusica, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
    			.addGap(90))
    );
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}