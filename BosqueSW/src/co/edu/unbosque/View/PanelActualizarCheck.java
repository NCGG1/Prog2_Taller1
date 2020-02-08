package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelActualizarCheck extends JPanel {

	private String ruta;
	private Image fondo;
	private JCheckBox nombreCheck, apellidoCheck, telefonoCheck, correoCheck, direccionCheck, generoCheck, añoCheck;
	private JButton volverCheck, continuarCheck;
	private Icon volverIcon;
	public static final String VOLVER_CHECK = "VOLVER CHECK";
	public static final String CONTINUAR_CHECK = "CONTINUAR CHECK";

	public PanelActualizarCheck() {
		// TODO Auto-generated constructor stub
		TitledBorder border = new TitledBorder("Datos actualizar");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);

		ruta = "src/co/edu/unbosque/Util/fondo.jpg";

		nombreCheck = new JCheckBox("Nombre");
		apellidoCheck = new JCheckBox("Apellido");
		telefonoCheck = new JCheckBox("Telefono");
		correoCheck = new JCheckBox("Correo");
		direccionCheck = new JCheckBox("Direccion");
		generoCheck = new JCheckBox("Genero");
		añoCheck = new JCheckBox("Año");

		Font Fuente_Boton2 = new Font("New Times Roman",Font.PLAIN,16);
		
		nombreCheck.setFont(Fuente_Boton2);
		nombreCheck.setForeground(Color.BLACK);
		
		apellidoCheck.setFont(Fuente_Boton2);
		apellidoCheck.setForeground(Color.BLACK);
		
		telefonoCheck.setFont(Fuente_Boton2);
		telefonoCheck.setForeground(Color.BLACK);
		
		correoCheck.setFont(Fuente_Boton2);
		correoCheck.setForeground(Color.BLACK);
		
		direccionCheck.setFont(Fuente_Boton2);
		direccionCheck.setForeground(Color.BLACK);
		
		generoCheck.setFont(Fuente_Boton2);
		generoCheck.setForeground(Color.BLACK);
		
		añoCheck.setFont(Fuente_Boton2);
		añoCheck.setForeground(Color.BLACK);
		
		nombreCheck.setOpaque(false);
		nombreCheck.setContentAreaFilled(false);
		nombreCheck.setBorderPainted(false);
		
		apellidoCheck.setOpaque(false);
		apellidoCheck.setContentAreaFilled(false);
		apellidoCheck.setBorderPainted(false);
		
		telefonoCheck.setOpaque(false);
		telefonoCheck.setContentAreaFilled(false);
		telefonoCheck.setBorderPainted(false);
		
		correoCheck.setOpaque(false);
		correoCheck.setContentAreaFilled(false);
		correoCheck.setBorderPainted(false);
		
		direccionCheck.setOpaque(false);
		direccionCheck.setContentAreaFilled(false);
		direccionCheck.setBorderPainted(false);
		
		generoCheck.setOpaque(false);
		generoCheck.setContentAreaFilled(false);
		generoCheck.setBorderPainted(false);
		
		añoCheck.setOpaque(false);
		añoCheck.setContentAreaFilled(false);
		añoCheck.setBorderPainted(false);
			
		volverIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON
		volverCheck = new JButton(volverIcon);
		volverCheck.setActionCommand(VOLVER_CHECK);
		volverCheck.setOpaque(false);
		volverCheck.setContentAreaFilled(false);
		volverCheck.setBorderPainted(false);

		continuarCheck = new JButton("Continuar");
		continuarCheck.setActionCommand(CONTINUAR_CHECK);
		continuarCheck.setOpaque(false);
		continuarCheck.setContentAreaFilled(false);
		continuarCheck.setBorderPainted(false);
		
		Font Fuente_Boton = new Font("ARIAL",Font.BOLD,16);
		
		continuarCheck.setFont(Fuente_Boton);
		continuarCheck.setForeground(Color.BLACK);

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		continuarCheck.setCursor(cursor);
		volverCheck.setCursor(cursor);
		nombreCheck.setCursor(cursor);
		apellidoCheck.setCursor(cursor);
		telefonoCheck.setCursor(cursor);
		correoCheck.setCursor(cursor);
		direccionCheck.setCursor(cursor);
		generoCheck.setCursor(cursor);
		añoCheck.setCursor(cursor);
		nombreCheck.setBounds(10, 60, 82, 22);
		apellidoCheck.setBounds(110, 60, 100, 22);
		telefonoCheck.setBounds(10, 88, 100, 22);
		correoCheck.setBounds(110, 88, 100, 22);
		generoCheck.setBounds(10, 114, 100, 22);
		añoCheck.setBounds(110, 114, 100, 22);
		direccionCheck.setBounds(50, 142, 100, 22);
		continuarCheck.setBounds(26, 170, 140, 22);
		volverCheck.setBounds(180, 160, 40,40);
		add(nombreCheck);
		add(apellidoCheck);
		add(telefonoCheck);
		add(correoCheck);
		add(generoCheck);
		add(añoCheck);
		add(direccionCheck);
		
		add(volverCheck);
		add(continuarCheck);
	}
	
	public void paintComponent(Graphics g) {

		int width = this.getSize().width;
		int height = this.getSize().height;

		setBackground(ruta);

		if (this.fondo != null) {
			g.drawImage(this.fondo, 0, 0, width, height, null);
		}

		Graphics2D g2 = (Graphics2D) g;

		Font miFuente7 = new Font("Arial", Font.BOLD, 14);

		g2.setFont(miFuente7);

		g2.setColor(Color.BLACK);

		g2.drawString("Datos que desea actualizar", 22, 46);
	
		super.paintComponent(g);

	}
	
	/**
	 * Este pinta el panel con la imagen selecionada <b> pre </b> Debe existir el metodo
	 * paintComponent. <br>
	 * <b> post </b> Pinta el panel <br>
	 * 
	 * 
	 * @param imagePath ruta donde se encuentra la imagen de fondo
	 */
	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

	public JCheckBox getNombreCheck() {
		return nombreCheck;
	}

	public JCheckBox getApellidoCheck() {
		return apellidoCheck;
	}

	public JCheckBox getTelefonoCheck() {
		return telefonoCheck;
	}

	public JCheckBox getCorreoCheck() {
		return correoCheck;
	}

	public JCheckBox getDireccionCheck() {
		return direccionCheck;
	}

	public JCheckBox getGeneroCheck() {
		return generoCheck;
	}

	public JCheckBox getAñoCheck() {
		return añoCheck;
	}

	public JButton getVolverCheck() {
		return volverCheck;
	}

	public JButton getContinuarCheck() {
		return continuarCheck;
	}

	
}
