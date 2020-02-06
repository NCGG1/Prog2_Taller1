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
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSenior extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton botonRegistrar, volverFlecha;
	private JTextField nombreSenior, apellidoSenior, telefonoSenior, correoSenior, direccionSenior, cedulaSenior, numeroVentas;
	private JComboBox prefijoTelefonoSenior;
	private JRadioButton rbtnHombre, rbtnMujer;
	
	public static final String REGISTRARSENIOR = "REGISTRAR SENIOR";

	public static final String VOLVER_PRINCIPAL = "VOLVER PRINCIPAL";

	private Icon iconVolver;
	
	public PanelSenior() {
	
		TitledBorder border = new TitledBorder("Registrar Empleado Senior");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		//RUTA DE LA IMAGEN DEL FONDO DEL PANEL
		
		//ruta = "src/co/edu/unbosque/Util/Fondo.jpg";         Falta buscar el fondo de las ventanas_________________

		//BOTON CON TEXTO
		botonRegistrar = new JButton("REGISTRAR");
		botonRegistrar.setActionCommand(REGISTRARSENIOR);
		botonRegistrar.setOpaque(false);
		botonRegistrar.setContentAreaFilled(false);
		botonRegistrar.setBorderPainted(false);
		
		//ICON DESCARGADO DE ICONFINDER
		iconVolver = new ImageIcon(
			new ImageIcon("src/co/edu/unbosque/Util/Flecha_Regreso.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		//BOTON CON EL ICON
		volverFlecha = new JButton(iconVolver);
		volverFlecha.setActionCommand(VOLVER_PRINCIPAL);
		volverFlecha.setOpaque(false);
		volverFlecha.setContentAreaFilled(false);
		volverFlecha.setBorderPainted(false);
		//Radio Buttons
		rbtnHombre = new JRadioButton("Hombre", false);
		rbtnHombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnHombre.setForeground(Color.BLUE);
		rbtnHombre.setBackground(Color.WHITE);

		rbtnMujer = new JRadioButton("Mujer", false);
		rbtnMujer.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnMujer.setForeground(Color.PINK);
		rbtnMujer.setBackground(Color.WHITE);
		//CURSOR
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		
		//Panel captar datos ________________________________
		nombreSenior = new JTextField();
		apellidoSenior = new JTextField();
		telefonoSenior = new JTextField();
		correoSenior = new JTextField();
		direccionSenior = new JTextField();
		cedulaSenior = new JTextField();
		numeroVentas = new JTextField();
		prefijoTelefonoSenior = new JComboBox();
		
		//CAMBIAR CURSO DE FLECHA POR MANO
		botonRegistrar.setCursor(cursor);

		//MENSAJE SOBRE EL BOTON
		botonRegistrar.setToolTipText("Registrar nuevo usuario");
		volverFlecha.setToolTipText("Regresar al menu principal");
		volverFlecha.setCursor(cursor);
		
		nombreSenior.setBounds(150, 30, 220, 25);
				nombreSenior.setToolTipText("Nombre del empleado a registrar.");
		apellidoSenior.setBounds(150, 65, 220, 25);
				apellidoSenior.setToolTipText("Apellido del empleado a registrar.");
		prefijoTelefonoSenior.setBounds(150, 100, 60, 25);
				prefijoTelefonoSenior.setToolTipText("Prefijo del numero de telefono.");
		telefonoSenior.setBounds(210, 100, 160, 25);
				telefonoSenior.setToolTipText("Telefono del empleado a registrar.");
		correoSenior.setBounds(150, 135, 220, 25);
				correoSenior.setToolTipText("Correo del empleado a registrar.");
		direccionSenior.setBounds(150, 170, 220, 25);
				direccionSenior.setToolTipText("Direccion del empleado a registrar.");
		cedulaSenior.setBounds(150, 205, 220, 25);
				cedulaSenior.setToolTipText("Cedula del empleado a registrar.");
		rbtnHombre.setBounds(160, 245, 90, 25);
				rbtnHombre.setToolTipText("Genero Masculino.");
		rbtnMujer.setBounds(270, 245, 90, 25);
				rbtnMujer.setToolTipText("Genero Femenino.");
		numeroVentas.setBounds(210, 310, 160, 25);
				numeroVentas.setToolTipText("Numero de Ventas del empleado a registrar.");
		
		volverFlecha.setBounds(320, 365, 40, 45);
		botonRegistrar.setBounds(125,380,130,10);
		
		//TextFields
		add(nombreSenior);
		add(apellidoSenior);
		add(prefijoTelefonoSenior);
		add(telefonoSenior);
		add(correoSenior);
		add(direccionSenior);
		add(cedulaSenior);
		add(numeroVentas);

		//Botones
		add(botonRegistrar);
		add(volverFlecha);
		
		//Radio Botones
		add(rbtnHombre);
		add(rbtnMujer);

	}
	 
//METODO 1 NECESARIO
	public void paintComponent(Graphics g) {

		
		int width = this.getSize().width;
		int height = this.getSize().height;

		setBackground(ruta);

		if (this.fondo != null) {
			g.drawImage(this.fondo, 0, 0, width, height, null);
		}

		//CREAMOS NOSOTROS
		Graphics2D g2 = (Graphics2D)g;


		Font miFuente7 = new Font("Arial", Font.ITALIC, 20);

		g2.setFont(miFuente7);

		g2.setColor(Color.BLACK);

		g2.drawString("Nombre:", 20, 50);
		g2.drawString("Apellido:", 20, 85);
		g2.drawString("Telefono:", 20, 120);
		g2.drawString("Correo:", 20, 155);
		g2.drawString("Direccion:", 20, 190);
		g2.drawString("Cedula:", 20, 225);
		g2.drawString("Genero:", 20, 260);
		g2.drawString("Año de Ingreso:", 20, 295);
		g2.drawString("Numero de Ventas:", 20, 330);


		super.paintComponent(g);
	
	}
//METODO 2 NECESARIO
	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}


	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}


	public JButton getVolverFlecha() {
		return volverFlecha;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}


	public void setVolverFlecha(JButton volverFlecha) {
		this.volverFlecha = volverFlecha;
	}

	public JTextField getNombreSenior() {
		return nombreSenior;
	}

	public void setNombreSenior(JTextField nombreSenior) {
		this.nombreSenior = nombreSenior;
	}

	public JTextField getApellidoSenior() {
		return apellidoSenior;
	}

	public void setApellidoSenior(JTextField apellidoSenior) {
		this.apellidoSenior = apellidoSenior;
	}

	public JTextField getTelefonoSenior() {
		return telefonoSenior;
	}

	public void setTelefonoSenior(JTextField telefonoSenior) {
		this.telefonoSenior = telefonoSenior;
	}

	public JTextField getCorreoSenior() {
		return correoSenior;
	}

	public void setCorreoSenior(JTextField correoSenior) {
		this.correoSenior = correoSenior;
	}

	public JTextField getDireccionSenior() {
		return direccionSenior;
	}

	public void setDireccionSenior(JTextField direccionSenior) {
		this.direccionSenior = direccionSenior;
	}

	public JTextField getCedulaSenior() {
		return cedulaSenior;
	}

	public void setCedulaSenior(JTextField cedulaSenior) {
		this.cedulaSenior = cedulaSenior;
	}

	public JTextField getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(JTextField numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public JComboBox getPrefijoTelefonoSenior() {
		return prefijoTelefonoSenior;
	}

	public void setPrefijoTelefonoSenior(JComboBox prefijoTelefonoSenior) {
		this.prefijoTelefonoSenior = prefijoTelefonoSenior;
	}



}