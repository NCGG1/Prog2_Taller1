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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

public class PanelBuscar extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton botonIncrementar, volverFlecha;
	private JLabel cedulaBuscar, nombreBuscar, apellidoBuscar, telefonoBuscar, correoBuscar, direccionBuscar, variable,
			lblVariable, genero, fechaingreso, salarioBuscar;

	public static final String INCREMENTAR = "BUSCAR INCREMENTAR";

	public static final String VOLVER_BUSCAR = "VOLVER BUSCAR";

	private Icon iconVolver;

	public PanelBuscar() {

		TitledBorder border = new TitledBorder("Buscar Empleado");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		// RUTA DE LA IMAGEN DEL FONDO DEL PANEL

		ruta = "src/co/edu/unbosque/Util/fondo.jpg";

		// BOTON CON TEXTO
		botonIncrementar = new JButton("Incrementar");
		botonIncrementar.setActionCommand(INCREMENTAR);
		botonIncrementar.setOpaque(false);
		botonIncrementar.setContentAreaFilled(false);
		botonIncrementar.setBorderPainted(false);

		// ICON DESCARGADO DE ICONFINDER
		iconVolver = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON
		volverFlecha = new JButton(iconVolver);
		volverFlecha.setActionCommand(VOLVER_BUSCAR);
		volverFlecha.setOpaque(false);
		volverFlecha.setContentAreaFilled(false);
		volverFlecha.setBorderPainted(false);

		// CURSOR
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		Font Fuente_Boton = new Font("ARIAL", Font.BOLD, 22);

		botonIncrementar.setFont(Fuente_Boton);
		botonIncrementar.setForeground(Color.BLACK);

		// Panel captar datos ________________________________
		nombreBuscar = new JLabel("----------");
		apellidoBuscar = new JLabel("----------");
		telefonoBuscar = new JLabel("----------");
		correoBuscar = new JLabel("----------");
		direccionBuscar = new JLabel("----------");
		cedulaBuscar = new JLabel("----------");
		variable = new JLabel("----------");
		lblVariable = new JLabel("Clientes:");
		genero = new JLabel("----------");
		fechaingreso = new JLabel("----------");
		salarioBuscar = new JLabel("----------");

		Font Fuente_Boton2 = new Font("ARIAL", Font.BOLD, 16);

		nombreBuscar.setForeground(Color.BLACK);
		nombreBuscar.setFont(Fuente_Boton2);
		apellidoBuscar.setForeground(Color.BLACK);
		apellidoBuscar.setFont(Fuente_Boton2);
		telefonoBuscar.setForeground(Color.BLACK);
		telefonoBuscar.setFont(Fuente_Boton2);
		correoBuscar.setForeground(Color.BLACK);
		correoBuscar.setFont(Fuente_Boton2);
		direccionBuscar.setForeground(Color.BLACK);
		direccionBuscar.setFont(Fuente_Boton2);
		cedulaBuscar.setForeground(Color.BLACK);
		cedulaBuscar.setFont(Fuente_Boton2);
		variable.setForeground(Color.BLACK);
		variable.setFont(Fuente_Boton2);
		genero.setForeground(Color.BLACK);
		genero.setFont(Fuente_Boton2);
		fechaingreso.setForeground(Color.BLACK);
		fechaingreso.setFont(Fuente_Boton2);
		salarioBuscar.setForeground(Color.BLACK);
		salarioBuscar.setFont(Fuente_Boton2);

		// CAMBIAR CURSO DE FLECHA POR MANO
		botonIncrementar.setCursor(cursor);
		volverFlecha.setCursor(cursor);

		// MENSAJE SOBRE EL BOTON
		botonIncrementar.setToolTipText("Incrementar");
		volverFlecha.setToolTipText("Regresar al menu principal");
		cedulaBuscar.setBounds(230, 30, 220, 25);
		cedulaBuscar.setToolTipText("Cedula del empleado.");
		nombreBuscar.setBounds(230, 65, 220, 25);
		nombreBuscar.setToolTipText("Nombre del empleado.");
		apellidoBuscar.setBounds(230, 100, 220, 25);
		apellidoBuscar.setToolTipText("Apellido del empleado.");
		telefonoBuscar.setBounds(230, 135, 220, 25);
		telefonoBuscar.setToolTipText("Telefono del empleado.");
		correoBuscar.setBounds(230, 170, 220, 25);
		correoBuscar.setToolTipText("Correo del empleado.");
		direccionBuscar.setBounds(230, 205, 220, 25);
		direccionBuscar.setToolTipText("Direccion del empleado.");
		variable.setBounds(230, 240, 220, 25);
		// variable.setToolTipText("Variable");
		genero.setBounds(230, 275, 220, 25);
		genero.setToolTipText("Genero.");
		fechaingreso.setBounds(230, 310, 220, 25);
		fechaingreso.setToolTipText("Fecha Ingreso.");
		salarioBuscar.setBounds(230, 345, 220, 25);
		salarioBuscar.setToolTipText("Fecha Ingreso.");

		volverFlecha.setBounds(320, 365, 40, 40);

		botonIncrementar.setBounds(100, 385, 180, 24);

		Font miFuente7 = new Font("Arial", Font.BOLD, 20);
		lblVariable.setForeground(Color.BLACK);

		lblVariable.setFont(miFuente7);
		// TextFields
		add(cedulaBuscar);
		add(nombreBuscar);
		add(apellidoBuscar);
		add(telefonoBuscar);
		add(correoBuscar);
		add(direccionBuscar);
		add(variable);
		add(genero);
		add(fechaingreso);
		add(salarioBuscar);
		// Botones
		add(botonIncrementar);
		add(volverFlecha);

	}

	public void paintComponent(Graphics g) {

		int width = this.getSize().width;
		int height = this.getSize().height;

		setBackground(ruta);

		if (this.fondo != null) {
			g.drawImage(this.fondo, 0, 0, width, height, null);
		}

		// CREAMOS NOSOTROS
		Graphics2D g2 = (Graphics2D) g;

		Font miFuente7 = new Font("Arial", Font.BOLD, 20);

		g2.setFont(miFuente7);

		g2.setColor(Color.BLACK);

		g2.drawString("Cedula:", 20, 50);
		g2.drawString("Nombre:", 20, 85);
		g2.drawString("Apellido:", 20, 120);
		g2.drawString("Telefono:", 20, 155);
		g2.drawString("Correo:", 20, 190);
		g2.drawString("Direccion:", 20, 225);
		lblVariable.setBounds(20, 240, 220, 25);
		g2.drawString("Genero:", 20, 295);
		g2.drawString("Año de Ingreso:", 20, 330);
		g2.drawString("Salario:", 20, 365);

		add(lblVariable);

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

	public JButton getBotonIncrementar() {
		return botonIncrementar;
	}

	public JButton getVolverFlecha() {
		return volverFlecha;
	}

	public JLabel getCedulaBuscar() {
		return cedulaBuscar;
	}

	public JLabel getNombreBuscar() {
		return nombreBuscar;
	}

	public JLabel getApellidoBuscar() {
		return apellidoBuscar;
	}

	public JLabel getTelefonoBuscar() {
		return telefonoBuscar;
	}

	public JLabel getCorreoBuscar() {
		return correoBuscar;
	}

	public JLabel getDireccionBuscar() {
		return direccionBuscar;
	}

	public JLabel getVariable() {
		return variable;
	}

	public JLabel getLblVariable() {
		return lblVariable;
	}

	public JLabel getGenero() {
		return genero;
	}

	public JLabel getFechaingreso() {
		return fechaingreso;
	}

	public JLabel getSalarioBuscar() {
		return salarioBuscar;
	}

}