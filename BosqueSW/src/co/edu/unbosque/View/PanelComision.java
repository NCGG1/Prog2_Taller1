package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class PanelComision extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton botonRegistrar, volverFlecha;
	private JTextField nombreComision, apellidoComision, telefonoComision, correoComision, direccionComision, cedulaComision;
	private JSpinner clientesComision;
	private JComboBox<String> prefijoTelefonoComision;
	private JRadioButton rbtnHombre, rbtnMujer;
	private ButtonGroup generos;
	private JDateChooser choser;

	public static final String REGISTRARCOMISION = "REGISTRAR COMISION";

	public static final String VOLVER_PRINCIPAL = "VOLVER PRINCIPAL";

	private Icon iconVolver;
	
	public PanelComision() {
	
		TitledBorder border = new TitledBorder("Registrar Empleado por Comision");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		//RUTA DE LA IMAGEN DEL FONDO DEL PANEL
		
		ruta = "src/co/edu/unbosque/Util/fondo.jpg";   

		
		//BOTON CON TEXTO
		botonRegistrar = new JButton("Registrar");
		botonRegistrar.setActionCommand(REGISTRARCOMISION);
		botonRegistrar.setOpaque(false);
		botonRegistrar.setContentAreaFilled(false);
		botonRegistrar.setBorderPainted(false);
		
		//ICON DESCARGADO DE ICONFINDER
		iconVolver = new ImageIcon(
			new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		//BOTON CON EL ICON
		volverFlecha = new JButton(iconVolver);
		volverFlecha.setActionCommand(VOLVER_PRINCIPAL);
		volverFlecha.setOpaque(false);
		volverFlecha.setContentAreaFilled(false);
		volverFlecha.setBorderPainted(false);
		generos = new ButtonGroup();
		choser = new JDateChooser();
		//Radio Buttons
		rbtnHombre = new JRadioButton("Hombre", true);
		rbtnHombre.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnHombre.setForeground(Color.BLUE);
		rbtnHombre.setBackground(Color.WHITE);
		rbtnHombre.setOpaque(false);
		rbtnHombre.setContentAreaFilled(false);
		rbtnHombre.setBorderPainted(false);
		
		rbtnMujer = new JRadioButton("Mujer", false);
		rbtnMujer.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		rbtnMujer.setForeground(Color.PINK);
		rbtnMujer.setBackground(Color.WHITE);
		rbtnMujer.setOpaque(false);
		rbtnMujer.setContentAreaFilled(false);
		rbtnMujer.setBorderPainted(false);
		
		generos.add(rbtnHombre);
		generos.add(rbtnMujer);
		//CURSOR
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);


		Font Fuente_Boton = new Font("ARIAL",Font.BOLD,22);
		
		botonRegistrar.setFont(Fuente_Boton);
		botonRegistrar.setForeground(Color.BLACK);

		
		//Panel captar datos ________________________________
		nombreComision = new JTextField();
		apellidoComision = new JTextField();
		telefonoComision = new JTextField();
		correoComision = new JTextField();
		direccionComision = new JTextField();
		cedulaComision = new JTextField();
		clientesComision = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));
		prefijoTelefonoComision = new JComboBox();
		
		prefijoTelefonoComision.addItem("300");
		prefijoTelefonoComision.addItem("301");
		prefijoTelefonoComision.addItem("302");
		prefijoTelefonoComision.addItem("303");
		prefijoTelefonoComision.addItem("304");
		prefijoTelefonoComision.addItem("305");
		prefijoTelefonoComision.addItem("310");
		prefijoTelefonoComision.addItem("311");
		prefijoTelefonoComision.addItem("312");
		prefijoTelefonoComision.addItem("313");
		prefijoTelefonoComision.addItem("314");
		prefijoTelefonoComision.addItem("315");
		prefijoTelefonoComision.addItem("316");
		prefijoTelefonoComision.addItem("317");
		prefijoTelefonoComision.addItem("318");
		prefijoTelefonoComision.addItem("319");
		prefijoTelefonoComision.addItem("320");
		prefijoTelefonoComision.addItem("321");
		prefijoTelefonoComision.addItem("322");
		prefijoTelefonoComision.addItem("323");
		prefijoTelefonoComision.addItem("350");
		prefijoTelefonoComision.addItem("351");
	
		
		//CAMBIAR CURSO DE FLECHA POR MANO
		botonRegistrar.setCursor(cursor);

		//MENSAJE SOBRE EL BOTON
		botonRegistrar.setToolTipText("Registrar nuevo Empleado");
		volverFlecha.setToolTipText("Regresar al menu principal");
		volverFlecha.setCursor(cursor);
		
		nombreComision.setBounds(150, 30, 220, 25);
				nombreComision.setToolTipText("Nombre del empleado a registrar.");
		apellidoComision.setBounds(150, 65, 220, 25);
				apellidoComision.setToolTipText("Apellido del empleado a registrar.");
		prefijoTelefonoComision.setBounds(150, 100, 60, 25);
				prefijoTelefonoComision.setToolTipText("Prefijo del numero de telefono.");
		telefonoComision.setBounds(210, 100, 160, 25);
				telefonoComision.setToolTipText("Telefono del empleado a registrar.");
		correoComision.setBounds(150, 135, 220, 25);
				correoComision.setToolTipText("Correo del empleado a registrar.");
		direccionComision.setBounds(150, 170, 220, 25);
				direccionComision.setToolTipText("Direccion del empleado a registrar.");
		cedulaComision.setBounds(150, 205, 220, 25);
				cedulaComision.setToolTipText("Cedula del empleado a registrar.");
		rbtnHombre.setBounds(160, 245, 90, 25);
				rbtnHombre.setToolTipText("Genero Masculino.");
		rbtnMujer.setBounds(270, 245, 90, 25);
				rbtnMujer.setToolTipText("Genero Femenino.");
		clientesComision.setBounds(210, 310, 60, 25);
				clientesComision.setToolTipText("Numero de clientes del empleado a registrar.");
				
				choser.setBounds(176, 277, 130, 24);
				choser.setToolTipText("Fecha en la cual ingreso a la empresa");
		volverFlecha.setBounds(320, 365, 40, 45);
		
		botonRegistrar.setBounds(110, 360, 170, 24);

		//TextFields
		add(nombreComision);
		add(apellidoComision);
		add(prefijoTelefonoComision);
		add(telefonoComision);
		add(correoComision);
		add(direccionComision);
		add(cedulaComision);
		add(clientesComision);

		//Botones
		add(botonRegistrar);
		add(volverFlecha);
		
		//Radio Botones
		add(rbtnHombre);
		add(rbtnMujer);

		add(choser);
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


		Font miFuente7 = new Font("Arial", Font.BOLD, 20);

		g2.setFont(miFuente7);

		g2.setColor(Color.BLACK);

		g2.drawString("Nombre:", 20, 50);
		g2.drawString("Apellido:", 20, 85);
		g2.drawString("Telefono:", 20, 120);
		g2.drawString("Correo:", 20, 155);
		g2.drawString("Direccion:", 20, 190);
		g2.drawString("Cedula:", 20, 225);
		g2.drawString("Genero:", 20, 260);
		g2.drawString("Numero de Clientes", 20, 295);
		g2.drawString("Nivel de Jerarquia:", 20, 330);


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

	public JTextField getNombreComision() {
		return nombreComision;
	}

	public void setNombreComision(JTextField nombreComision) {
		this.nombreComision = nombreComision;
	}

	public JTextField getApellidoComision() {
		return apellidoComision;
	}

	public void setApellidoComision(JTextField apellidoComision) {
		this.apellidoComision = apellidoComision;
	}

	public JTextField getTelefonoComision() {
		return telefonoComision;
	}

	public void setTelefonoComision(JTextField telefonoComision) {
		this.telefonoComision = telefonoComision;
	}

	public JTextField getCorreoComision() {
		return correoComision;
	}

	public void setCorreoComision(JTextField correoComision) {
		this.correoComision = correoComision;
	}

	public JTextField getDireccionComision() {
		return direccionComision;
	}

	public void setDireccionComision(JTextField direccionComision) {
		this.direccionComision = direccionComision;
	}

	public JTextField getCedulaComision() {
		return cedulaComision;
	}

	public void setCedulaComision(JTextField cedulaComision) {
		this.cedulaComision = cedulaComision;
	}

	public JSpinner getNumeroVentas() {
		return clientesComision;
	}

	public void setNumeroVentas(JSpinner numeroVentas) {
		this.clientesComision = numeroVentas;
	}

	public JComboBox getPrefijoTelefonoComision() {
		return prefijoTelefonoComision;
	}

	public void setPrefijoTelefonoComision(JComboBox prefijoTelefonoComision) {
		this.prefijoTelefonoComision = prefijoTelefonoComision;
	}



}