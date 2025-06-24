package Configuraciones;

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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FacilCF extends JFrame {

	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	
	public static JTextField txtp1a1, txtp1a2, txtp1a3, txtp1a4, txtp2b, txtp2abase, txtp2aexpo, txtp2dbase, txtp2dexpo, txtp2cbase, 
	txtp2cexpo, txtp1bbase,txtp1bexpo, txtp3a, txtp3b, txtp5c, txtp5dbase, txtp5dexpo, txtp5b, txtp5a, txtp6a, txtp6b, txtp6c, txtp6d, txtp6e;
	public static JTextPane txtpregunta5d, txtpregunta5c, txtpregunta5a, txtpregunta5b, txtpregunta5, txtpregunta6e, txtpregunta6d, txtpregunta6a, txtpregunta6b, txtpregunta6c, txtpregunta6, txtpregunta3b, txtpregunta3a, txtpregunta3, txtpregunta1b, txtpregunta1a, txtpregunta2b, txtpregunta2a, txtpregunta2c, txtpregunta2d, txt2expo, txt3expo, txt4expo;
	public static JLabel lblayuda4, lblayuda1, lblayuda2, lblayuda3, lblayuda5;
	static double  p1a1, p1a2,p1bexpo,p1a3, p1a4, p2b, p3a, p3b, p5a, p5b, p5c, p6a, p6b, p6c, p6d, p6e, p1bbase, p2abase, p2aexpo, p2cbase, p2cexpo, p2dbase, p2dexpo, p5dbase, p5dexpo;
	private static JLabel btnGuardar,btnCancelar;
	static String ayd1,	ayd2, ayd3, ayd4, ayd5, p1, p2, p3, pa3, pb3, p4, pa4, pb4, pc4, pd4, pe4, p5, pa5, pb5, pc5, p6, pa6, pb6, pc6, pd6;
	Icon configurar=new ImageIcon(getClass().getResource("/imagenes/version.png"));
	 
	Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
	static boolean open=false;

			 
		 public static void main(String args[]) {
			  EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FacilCF frame = new FacilCF();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		  }
		 
		 public FacilCF() {
			  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						  JOptionPane.showMessageDialog(null, "Vuelve a la venta de configuraciones para guardar o cancelar.", "IMPORTANTE", JOptionPane.INFORMATION_MESSAGE);
					}
				});
				setUndecorated(false);
			    setIconImage(Toolkit.getDefaultToolkit().getImage(FacilCF.class.getResource("/imagenes/2.jpg")));
			    setTitle("Nivel Basico Configuracion");
			    setSize(1102,600);
			    setLocationRelativeTo(null);
			    all();
			    setVisible(true);
			  }
			    

	  public static void captura_respuestas(){
		  
  p1a1 = Double.valueOf(txtp1a1.getText()); p1a2 = Double.valueOf(txtp1a2.getText()); p1a3 = Double.valueOf(txtp1a3.getText()); p1a4 = Double.valueOf(txtp1a4.getText());
  p2b = Double.valueOf(txtp2b.getText());   p3a = Double.valueOf(txtp3a.getText());   p3b = Double.valueOf(txtp3b.getText());   p5a = Double.valueOf(txtp5a.getText());
  p5b = Double.valueOf(txtp5b.getText());   p5c = Double.valueOf(txtp5c.getText());   p6a = Double.valueOf(txtp6a.getText());   p6b = Double.valueOf(txtp6b.getText());
  p6c = Double.valueOf(txtp6c.getText());   p6d = Double.valueOf(txtp6d.getText());   p6e = Double.valueOf(txtp6e.getText());   p1bbase = Double.valueOf(txtp1bbase.getText());	
  p2abase = Double.valueOf(txtp2abase.getText()); p2aexpo = Double.valueOf(txtp2aexpo.getText());  p2cbase = Double.valueOf(txtp2cbase.getText()); p2cexpo = Double.valueOf(txtp2cexpo.getText());
  p2dbase = Double.valueOf(txtp2dbase.getText()); p2dexpo = Double.valueOf(txtp2dexpo.getText());  p5dbase = Double.valueOf(txtp5dbase.getText()); 
  p5dexpo = Double.valueOf(txtp5dexpo.getText()); p1bexpo =  Double.valueOf(txtp1bexpo.getText());
  
	  }
	  
	  public static void  Eliminar_Datos(){
		  txtp2abase.setText(""); txtp2aexpo.setText(""); txtp2b.setText("");txtp2cbase.setText("");
		  txtp2cexpo.setText("");txtp2dbase.setText("");txtp2dexpo.setText("");txtp3a.setText("");
		  txtp3b.setText(""); txtp5a.setText(""); txtp5b.setText("");txtp5c.setText("");
		  txtp5dbase.setText("");txtp5dexpo.setText("");txtp6a.setText("");txtp6b.setText("");
		  txtp6c.setText(""); txtp6d.setText(""); txtp6e.setText(""); txtp1a1.setText(""); txtp1a2.setText(""); txtp1a3.setText("");
		  txtp1a4.setText("");txtp1bbase.setText("");txtp1bexpo.setText("");
		  txtpregunta5d.setText("");txtpregunta5c.setText(""); txtpregunta5a.setText("");txtpregunta5b.setText("");txtpregunta5.setText("");txtpregunta6e.setText("");
		  txtpregunta6d.setText("");txtpregunta6a.setText(""); txtpregunta6b.setText("");txtpregunta6c.setText("");txtpregunta6.setText("");txtpregunta3b.setText("");
		  txtpregunta3a.setText("");txtpregunta3.setText(""); txtpregunta1b.setText("");txtpregunta1a.setText("");txtpregunta2b.setText("");txtpregunta2a.setText("");
		  txtpregunta2c.setText("");txtpregunta2d.setText("");
		  p1=null;p2=null;p3=null;pa3=null;pb3=null;p4=null;pa4=null;pb4=null;pc4=null;pd4=null;pe4=null;p5=null; pa5=null;pb5=null;pc5=null;p6=null;pa6=null;pb6=null;pc6=null;pd6=null;
		    ayd1=null;ayd2=null;ayd3=null;ayd4=null;ayd5=null;
				
		}
	  
	  private void cerrar_ventana(){
	    	 String botones[]= {"ACEPTAR","CANCELAR"};
			  int eleccion =JOptionPane.showOptionDialog(null, "Desea guardar todos los cambios.", "Configurar", 0, JOptionPane.INFORMATION_MESSAGE,configurar,botones,"");		
			  if(eleccion==JOptionPane.YES_OPTION) {
				  captura_respuestas();
				  dispose();
				   
				  } 
			   if(eleccion==JOptionPane.NO_OPTION) {
				   			
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
    txtpregunta1a.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p1=(txtpregunta1a.getText());
		}
    	
    });
    txtpregunta1a.setBackground(Color.LIGHT_GRAY);
    txtpregunta1a.setForeground(Color.BLACK);
    txtpregunta1a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp1a1 = new JTextField();
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
    txtpregunta1b.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p2=( txtpregunta1b.getText());
		}
    	
    });
    txtpregunta1b.setBackground(Color.LIGHT_GRAY);
    txtpregunta1b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta2a = new JTextPane();
    txtpregunta2a.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p5=(txtpregunta2a.getText());
		}
    	
    });
    txtpregunta2a.setForeground(Color.BLACK);
    txtpregunta2a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta2a.setBackground(Color.LIGHT_GRAY);
    
    txtpregunta2b = new JTextPane();
    txtpregunta2b.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pa5=(txtpregunta2b.getText());
		}
    	
    });
    txtpregunta2b.setBackground(Color.LIGHT_GRAY);
    txtpregunta2b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2b = new JTextField();
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
    txtpregunta2c.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pb5=(txtpregunta2c.getText());
		}
    	
    });
    txtpregunta2c.setBackground(Color.LIGHT_GRAY);
    txtpregunta2c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta2d = new JTextPane();
    txtpregunta2d.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pc5=(txtpregunta2d.getText());
		}
    	
    });
    txtpregunta2d.setBackground(Color.LIGHT_GRAY);
    txtpregunta2d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2abase = new JTextField();
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
    		ayd4 = JOptionPane.showInputDialog(null, "Ingresa la ayuda que deseas.");
    	}
    });
    lblayuda2.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtp1bbase = new JTextField();
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
    		ayd1 = JOptionPane.showInputDialog(null, "Ingresa la ayuda que deseas.");
    	}
    });
    lblayuda1.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtpregunta3 = new JTextPane();
    txtpregunta3.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p3=(txtpregunta3.getText());
		}
    	
    });
    txtpregunta3.setForeground(Color.BLACK);
    txtpregunta3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta3.setBackground(Color.LIGHT_GRAY);
    
    txtpregunta3a = new JTextPane();
    txtpregunta3a.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pa3=(txtpregunta3a.getText());
		}
    	
    });
    txtpregunta3a.setBackground(Color.LIGHT_GRAY);
    txtpregunta3a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3a = new JTextField();
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
    txtpregunta3b.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pb3=(txtpregunta3b.getText());
		}
    	
    });
    txtpregunta3b.setBackground(Color.LIGHT_GRAY);
    txtpregunta3b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3b = new JTextField();
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
    txtpregunta5c.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pc6=(txtpregunta5c.getText());
		}
    	
    });
    txtpregunta5c.setBackground(Color.LIGHT_GRAY);
    txtpregunta5c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5c = new JTextField();
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
    txtpregunta5d.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pd6=(txtpregunta5d.getText());
		}
    	
    });
    txtpregunta5d.setBackground(Color.LIGHT_GRAY);
    txtpregunta5d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5dbase = new JTextField();
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
    txtpregunta5b.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pb6=(txtpregunta5b.getText());
		}
    	
    });
    txtpregunta5b.setBackground(Color.LIGHT_GRAY);
    txtpregunta5b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta5a = new JTextPane();
    txtpregunta5a.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pa6=(txtpregunta5a.getText());
		}
    	
    });
    txtpregunta5a.setBackground(Color.LIGHT_GRAY);
    txtpregunta5a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5a = new JTextField();
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
    txtpregunta5.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p6=(txtpregunta5.getText());
		}
    	
    });
    txtpregunta5.setForeground(Color.BLACK);
    txtpregunta5.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta5.setBackground(Color.LIGHT_GRAY);
    
    lblayuda3 = new JLabel("");
    lblayuda3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		ayd2 = JOptionPane.showInputDialog(null, "Ingresa la ayuda que deseas.");
    	}
    });
    lblayuda3.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    lblayuda5 = new JLabel("");
    lblayuda5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayd5 = JOptionPane.showInputDialog(null, "Ingresa la ayuda que deseas.");
    	}
    });
    lblayuda5.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    txtpregunta6 = new JTextPane();
    txtpregunta6.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			p4=(txtpregunta6.getText());
		}
    	
    });
    txtpregunta6.setLocation(3000, 642);
    txtpregunta6.setForeground(Color.BLACK);
    txtpregunta6.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta6.setBackground(Color.LIGHT_GRAY);
    
    txtp6a = new JTextField();
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
    txtpregunta6a.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pa4=(txtpregunta6a.getText());
		}
    	
    });
    txtpregunta6a.setBackground(Color.LIGHT_GRAY);
    txtpregunta6a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6b = new JTextPane();
    txtpregunta6b.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pb4=(txtpregunta6b.getText());
		}
    	
    });
    txtpregunta6b.setBackground(Color.LIGHT_GRAY);
    txtpregunta6b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6c = new JTextPane();
    txtpregunta6c.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pc4=(txtpregunta6c.getText());
		}
    	
    });
    txtpregunta6c.setBackground(Color.LIGHT_GRAY);
    txtpregunta6c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp6b = new JTextField();
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
    txtpregunta6d.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pd4=(txtpregunta6d.getText());
		}
    	
    });
    txtpregunta6d.setBackground(Color.LIGHT_GRAY);
    txtpregunta6d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta6e = new JTextPane();
    txtpregunta6e.getDocument().addDocumentListener(new DocumentListener(){
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			warn();	
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			warn();	
		}
		
		public void warn(){
			pe4=(txtpregunta6e.getText());
		}
    	
    });
    txtpregunta6e.setBackground(Color.LIGHT_GRAY);
    txtpregunta6e.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    lblayuda4 = new JLabel("");
    lblayuda4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayd3 = JOptionPane.showInputDialog(null, "Ingresa la ayuda que deseas.");
    	}
    });
    lblayuda4.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/ayuda2.png")));
    
    btnGuardar = new JLabel("");
    btnGuardar.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		cerrar_ventana();
    	}
    });
    
    btnGuardar.setToolTipText("Presione para guardar la información.");
    btnGuardar.setIcon(new ImageIcon(FacilCF.class.getResource("/imagenes/archivo.png")));
    
    btnCancelar = new JLabel("");
    btnCancelar.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		Eliminar_Datos();
    	}
    });
    btnCancelar.setToolTipText("Presione para vaciar o eliminar la información del nivel que est\u00E1 configurando.");
    btnCancelar.setIcon(new ImageIcon(MedioCFG.class.getResource("/imagenes/vacio.png")));
    
    JTextPane txtnota = new JTextPane();
    txtnota.setFont(new Font("Tahoma", Font.BOLD, 13));
    txtnota.setForeground(Color.RED);
    txtnota.setText("NOTA: Recuerda llenar todo el nivel para poder guradar toda la informaci\u00F3n.\r\nLos cajones grises ejercicios y en los cajones blancos las respuestas.");
   
    
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
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addPreferredGap(ComponentPlacement.RELATED)
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
    										.addGap(98)
    										.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
    										.addGap(34)
    										.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
    										.addContainerGap()))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(6)
    									.addComponent(txtnota, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
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
    						.addComponent(txtpregunta6a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtpregunta6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
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
    				.addGroup(gl_panel.createSequentialGroup()
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
    						.addComponent(txtp6e, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    				.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    					.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addComponent(txtnota, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
    			.addGap(139))
    );
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}