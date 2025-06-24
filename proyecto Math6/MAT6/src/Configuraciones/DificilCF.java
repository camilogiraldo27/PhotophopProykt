package Configuraciones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DificilCF extends JFrame {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	  public static JTextPane txt1;
	  public static JLabel ac1,img1,img2,img3,img4,img5,img6,img7,img8;
	  public static JTextField re1,re2,re3,re4,re5,re6,re7,re8,re9,re10,re11,re12,re13;
	  public static double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
	  static String ayc1, ayc2, ayc3, ayc4, ayc5, ayc6, ayc7, ayc8;
      JFileChooser archivo_imagen=new JFileChooser();
	  File fichero;
	  static byte[] imagen;
	  static FileInputStream entrada;
	  static FileOutputStream salida;
	  static boolean open=false;
	  static String text1;
	  
	  public static void main(String args[]) {
						DificilCF dcf = new DificilCF();
						dcf.setVisible(true);
				 }
	 
	  public byte[] Abrir_imagen(File imagen){
		  byte[]image=new byte[1024*100];
		  try{entrada=new FileInputStream(fichero);
		  }catch(Exception e){
		  }return image;
	  }
	  
	  
	  public DificilCF() {
	  	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				  JOptionPane.showMessageDialog(null, "Vuelve a la venta de configuraciones para guardar o cancelar.", "IMPORTANTE", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		setUndecorated(false);
	    setIconImage(Toolkit.getDefaultToolkit().getImage(DificilCF.class.getResource("/imagenes/2.jpg")));
	    setTitle("Nivel Avanzado Configuraciòn");
	    setSize(1102,600);
	    setLocationRelativeTo(null);
	    all();
	    setVisible(true);
	  }
	     
	  public static void Captura_de_resultados(){
	         r1 = Double.valueOf(re1.getText()); r2 = Double.valueOf(re3.getText()); r3 = Double.valueOf(re5.getText()); r4 = Double.valueOf(re7.getText()); 
	         r5 = Double.valueOf(re9.getText()); r6 = Double.valueOf(re2.getText()); r7 = Double.valueOf(re4.getText()); r8 = Double.valueOf(re6.getText()); 
	         r9 = Double.valueOf(re8.getText()); r10 = Double.valueOf(re10.getText()); r11= Double.valueOf(re11.getText()); r12= Double.valueOf(re12.getText()); 
	         r13  = Double.valueOf(re13.getText());     	
		  }
	  
  public void all() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    
    scrollpane = new JScrollPane(panel);
    
    JLabel label = new JLabel("NIVEL AVANZADO");
    label.setFont(new Font("Stencil", Font.BOLD, 30));
    
    JLabel label_1 = new JLabel("EJERCICIOS DE AREA Y PERIMETRO");
    label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
    
    JLabel lblNotaSoloPuedes = new JLabel("NOTA: SOLO PUEDES MODIFICAR LO QUE ESTA DE COLOR GRIS OSCURO Y LOS ICONOS DE AYUDA.\r\n");
    lblNotaSoloPuedes.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    img1 = new JLabel("INSERTAR IMAGEN");
    img1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img1, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img1.setBackground(Color.LIGHT_GRAY);
    img1.setForeground(Color.LIGHT_GRAY);
    img1.setToolTipText("Clic para insertar la imagen que desea para el ejercicio.");
    img1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    img2 = new JLabel("INSERTAR IMAGEN");
    img2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        	rsscalelabel.RSScaleLabel.setScaleLabel(img2, archivo_imagen.getSelectedFile().toString());
        	}}
    });
    img2.setBackground(Color.LIGHT_GRAY);
    img2.setForeground(Color.LIGHT_GRAY);
    img2.setToolTipText("Clic para insertar la imagen que desea para el ejercicio.");
    img2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    img3 = new JLabel("INSERTAR IMAGEN");
    img3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img3, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img3.setBackground(Color.LIGHT_GRAY);
    img3.setForeground(Color.LIGHT_GRAY);
    img3.setToolTipText("Clic para insertar la imagen que desea para el ejercicio.");
    img3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    img4 = new JLabel("INSERTAR IMAGEN");
    img4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img4, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img4.setBackground(Color.LIGHT_GRAY);
    img4.setForeground(Color.LIGHT_GRAY);
    img4.setToolTipText("Clic para insertar la imagen que desea para el ejercicio.");
    img4.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    img5 = new JLabel("INSERTAR IMAGEN");
    img5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img5, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img5.setBackground(Color.LIGHT_GRAY);
    img5.setForeground(Color.LIGHT_GRAY);
    img5.setToolTipText("Clic para insertar la imagen que desea para el ejercicio.");
    img5.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_10 = new JLabel("P:");
    label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re1 = new JTextField();
    re1.setToolTipText("Ingresa las respuestas en forma numerica.");
    re1.setBackground(Color.LIGHT_GRAY);
    re1.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re1.getText().contains(".")){
    			e.consume();
    	}}
    });
    re1.setColumns(10);
    
    JLabel label_11 = new JLabel("cm");
    label_11.setForeground(Color.LIGHT_GRAY);
    label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    ac1 = new JLabel("");
    ac1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		 ayc1 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac1.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac1.setToolTipText("\u00BFNecesitas ayuda?");
    ac1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_13 = new JLabel("A:");
    label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re2 = new JTextField();
    re2.setToolTipText("Ingresa las respuestas en forma numerica.");
    re2.setBackground(Color.LIGHT_GRAY);
    re2.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re2.getText().contains(".")){
    			e.consume();
    	}}
    });
    re2.setColumns(10);
    
    JLabel label_14 = new JLabel("cm^2");
    label_14.setForeground(Color.LIGHT_GRAY);
    label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_15 = new JLabel("P:");
    label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re3 = new JTextField();
    re3.setToolTipText("Ingresa las respuestas en forma numerica.");
    re3.setBackground(Color.LIGHT_GRAY);
    re3.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re3.getText().contains(".")){
    			e.consume();
    	}}
    });
    re3.setColumns(10);
    
    JLabel label_16 = new JLabel("cm");
    label_16.setForeground(Color.LIGHT_GRAY);
    label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac2 = new JLabel("");
    ac2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc2 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac2.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac2.setToolTipText("\u00BFNecesitas ayuda?");
    ac2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_18 = new JLabel("A:");
    label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re4 = new JTextField();
    re4.setToolTipText("Ingresa las respuestas en forma numerica.");
    re4.setBackground(Color.LIGHT_GRAY);
    re4.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re4.getText().contains(".")){
    			e.consume();
    	}}
    });
    re4.setColumns(10);
    
    JLabel label_19 = new JLabel("cm^2");
    label_19.setForeground(Color.LIGHT_GRAY);
    label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_20 = new JLabel("P:");
    label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re5 = new JTextField();
    re5.setToolTipText("Ingresa las respuestas en forma numerica.");
    re5.setBackground(Color.LIGHT_GRAY);
    re5.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re5.getText().contains(".")){
    			e.consume();
    	}}
    });
    re5.setColumns(10);
    
    JLabel label_21 = new JLabel("cm");
    label_21.setForeground(Color.LIGHT_GRAY);
    label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac3 = new JLabel("");
    ac3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc3 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac3.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac3.setToolTipText("\u00BFNecesitas ayuda?");
    ac3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_23 = new JLabel("A:");
    label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re6 = new JTextField();
    re6.setToolTipText("Ingresa las respuestas en forma numerica.");
    re6.setBackground(Color.LIGHT_GRAY);
    re6.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re6.getText().contains(".")){
    			e.consume();
    	}}
    });
    re6.setColumns(10);
    
    JLabel label_24 = new JLabel("cm^2");
    label_24.setForeground(Color.LIGHT_GRAY);
    label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_25 = new JLabel("P:");
    label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re7 = new JTextField();
    re7.setToolTipText("Ingresa las respuestas en forma numerica.");
    re7.setBackground(Color.LIGHT_GRAY);
    re7.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re7.getText().contains(".")){
    			e.consume();
    	}}
    });
    re7.setColumns(10);
    
    JLabel label_26 = new JLabel("cm");
    label_26.setForeground(Color.LIGHT_GRAY);
    label_26.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac4 = new JLabel("");
    ac4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc4 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac4.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac4.setToolTipText("\u00BFNecesitas ayuda?");
    ac4.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_28 = new JLabel("A:");
    label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re8 = new JTextField();
    re8.setToolTipText("Ingresa las respuestas en forma numerica.");
    re8.setBackground(Color.LIGHT_GRAY);
    re8.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re8.getText().contains(".")){
    			e.consume();
    	}}
    });
    re8.setColumns(10);
    
    JLabel label_29 = new JLabel("cm^2");
    label_29.setForeground(Color.LIGHT_GRAY);
    label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_30 = new JLabel("A:");
    label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re10 = new JTextField();
    re10.setToolTipText("Ingresa las respuestas en forma numerica.");
    re10.setBackground(Color.LIGHT_GRAY);
    re10.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re10.getText().contains(".")){
    			e.consume();
    	}}
    });
    re10.setColumns(10);
    
    JLabel label_31 = new JLabel("cm^2");
    label_31.setForeground(Color.LIGHT_GRAY);
    label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_32 = new JLabel("P:");
    label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re9 = new JTextField();
    re9.setToolTipText("Ingresa las respuestas en forma numerica.");
    re9.setBackground(Color.LIGHT_GRAY);
    re9.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re9.getText().contains(".")){
    			e.consume();
    	}}
    });
    re9.setColumns(10);
    
    JLabel label_33 = new JLabel("cm");
    label_33.setForeground(Color.LIGHT_GRAY);
    label_33.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac5 = new JLabel("");
    ac5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc5 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac5.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac5.setToolTipText("\u00BFNecesitas ayuda?");
    ac5.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel lblCopieElTitulo = new JLabel("COPIE EL TITULO");
    lblCopieElTitulo.setFocusable(true);
    lblCopieElTitulo.setForeground(Color.BLACK);
    lblCopieElTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel lblCopieElTitulo_1 = new JLabel("COPIE EL TITULO");
    lblCopieElTitulo_1.setForeground(Color.BLACK);
    lblCopieElTitulo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel lblCopieElTitulo_2 = new JLabel("COPIE EL TITULO");
    lblCopieElTitulo_2.setForeground(Color.BLACK);
    lblCopieElTitulo_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    txt1 = new JTextPane();
    txt1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		text1=(txt1.getText());
    	}
    });
    txt1.setToolTipText("Borra y escribe el es\u00A1jercicio.");
    txt1.setText("DIGITA EL EJERCICIO QUE DESEAS SOLO TIENE UN ESPACIO DETERMINADO.");
    txt1.setFont(new Font("Tahoma", Font.BOLD, 12));
    txt1.setBackground(SystemColor.controlHighlight);
    
    JTextPane txt2 = new JTextPane();
    txt2.setToolTipText("Borra y escribe el es\u00A1jercicio.");
    txt2.setText("DIGITA EL EJERCICIO QUE DESEAS SOLO TIENE UN ESPACIO DETERMINADO.");
    txt2.setFont(new Font("Tahoma", Font.BOLD, 12));
    txt2.setBackground(SystemColor.controlHighlight);
    
    JTextPane txt3 = new JTextPane();
    txt3.setToolTipText("Borra y escribe el es\u00A1jercicio.");
    txt3.setText("DIGITA EL EJERCICIO QUE DESEAS SOLO TIENE UN ESPACIO DETERMINADO.");
    txt3.setFont(new Font("Tahoma", Font.BOLD, 12));
    txt3.setBackground(SystemColor.controlHighlight);
    
    img6 = new JLabel("INSERTE IMAGEN");
    img6.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img6, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img6.setToolTipText("Clic para insertar una imagen.");
    
    img7 = new JLabel("INSERTE IMAGEN");
    img7.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img7, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img7.setToolTipText("Clic para insertar una imagen.");
    
    img8 = new JLabel("INSERTE IMAGEN");
    img8.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
        	if(archivo_imagen.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
        		rsscalelabel.RSScaleLabel.setScaleLabel(img8, archivo_imagen.getSelectedFile().toString());
        	}
    	}
    });
    img8.setToolTipText("Clic para insertar una imagen.");
    
    re11 = new JTextField();
    re11.setBackground(Color.LIGHT_GRAY);
    re11.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re11.getText().contains(".")){
    			e.consume();
    	}}
    });
    re11.setColumns(10);
    
    JLabel lblM = new JLabel("m");
    lblM.setForeground(Color.LIGHT_GRAY);
    lblM.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac6 = new JLabel("");
    ac6.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		ayc6 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac6.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac6.setToolTipText("\u00BFNecesitas ayuda?");
    ac6.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re12 = new JTextField();
    re12.setBackground(Color.LIGHT_GRAY);
    re12.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re12.getText().contains(".")){
    			e.consume();
    	}}
    });
    re12.setColumns(10);
    
    JLabel lblM_2 = new JLabel("m");
    lblM_2.setForeground(Color.LIGHT_GRAY);
    lblM_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac7 = new JLabel("");
    ac7.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc7 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac7.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac7.setToolTipText("\u00BFNecesitas ayuda?");
    ac7.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    re13 = new JTextField();
    re13.setBackground(Color.LIGHT_GRAY);
    re13.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if(!Character.isDigit(c) && re13.getText().contains(".")){
    			e.consume();
    	}}
    });
    re13.setColumns(10);
    
    JLabel lblM_1 = new JLabel("mm");
    lblM_1.setForeground(Color.LIGHT_GRAY);
    lblM_1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ac8 = new JLabel("");
    ac8.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		ayc8 = JOptionPane.showInputDialog(null, "Ingresa la yuda que deseas.");
    	}
    });
    ac8.setIcon(new ImageIcon(DificilCF.class.getResource("/imagenes/ayuda2.png")));
    ac8.setToolTipText("\u00BFNecesitas ayuda?");
    ac8.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_53 = new JLabel("EJERCICIOS DE CONVERSION DE LONGUTID");
    label_53.setFont(new Font("Tahoma", Font.BOLD, 20));
    
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
    	gl_panel.createParallelGroup(Alignment.TRAILING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap(83, Short.MAX_VALUE)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(341)
    							.addComponent(label, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(283)
    							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(92)
    							.addComponent(lblNotaSoloPuedes, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(img1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
    							.addGap(76)
    							.addComponent(img2, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    							.addGap(23)
    							.addComponent(img3, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    							.addGap(23)
    							.addComponent(img4, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    							.addGap(23)
    							.addComponent(img5, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(57)
    							.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(30)
    							.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(30)
    							.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(30)
    							.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(10)
    							.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(75)
    							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(34)
    							.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(34)
    							.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(42)
    							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(re10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
    					.addGap(54))
    				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(206)
    							.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(31)
    							.addComponent(lblCopieElTitulo, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
    							.addGap(128)
    							.addComponent(lblCopieElTitulo_1, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
    							.addGap(125)
    							.addComponent(lblCopieElTitulo_2, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(txt2, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(txt3, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(67)
    							.addComponent(img6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
    							.addGap(184)
    							.addComponent(img7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
    							.addGap(167)
    							.addComponent(img8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(39)
    							.addComponent(re11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(126)
    							.addComponent(re12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(109)
    							.addComponent(re13, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ac8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    					.addGap(134))))
    );
    gl_panel.setVerticalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    			.addGap(6)
    			.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    			.addGap(48)
    			.addComponent(lblNotaSoloPuedes, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    			.addGap(11)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(img1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img4, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img5, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
    			.addGap(18)
    			.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    			.addGap(37)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(lblCopieElTitulo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblCopieElTitulo_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblCopieElTitulo_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(txt1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txt2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txt3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(img6, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img7, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
    				.addComponent(img8, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
    			.addGap(20)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(re11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(re13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ac8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addContainerGap(85, Short.MAX_VALUE))
    );
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}
