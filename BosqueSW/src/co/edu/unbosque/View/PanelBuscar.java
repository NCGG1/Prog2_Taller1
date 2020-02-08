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
	private JLabel  cedulaBuscar, nombreBuscar, apellidoBuscar, telefonoBuscar, correoBuscar, direccionBuscar, variable, genero, fechaingreso;

	public static final String INCREMENTAR = "BUSCAR INCREMENTAR";

	public static final String VOLVER_PRINCIPAL = "VOLVER PRINCIPAL";

	private Icon iconVolver;
	
	
	public PanelBuscar() {
	
		TitledBorder border = new TitledBorder("Buscar Empleado");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		//RUTA DE LA IMAGEN DEL FONDO DEL PANEL
		
		ruta = "src/co/edu/unbosque/Util/fondo.jpg";   

		
		//BOTON CON TEXTO
		botonIncrementar = new JButton("Buscar");
		botonIncrementar.setActionCommand("BUSCAR");
		botonIncrementar.setOpaque(false);
		botonIncrementar.setContentAreaFilled(false);
		botonIncrementar.setBorderPainted(false);
		 
		//ICON DESCARGADO DE ICONFINDER
		iconVolver = new ImageIcon(
			new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		//BOTON CON EL ICON
		volverFlecha = new JButton(iconVolver);
		volverFlecha.setActionCommand(VOLVER_PRINCIPAL);
		volverFlecha.setOpaque(false);
		volverFlecha.setContentAreaFilled(false);
		volverFlecha.setBorderPainted(false);
		

		//CURSOR
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);


		Font Fuente_Boton = new Font("ARIAL",Font.BOLD,22);
		
		botonIncrementar.setFont(Fuente_Boton);
		botonIncrementar.setForeground(Color.BLACK);

		
		//Panel captar datos ________________________________
		nombreBuscar = new JLabel();
		apellidoBuscar = new JLabel();
		telefonoBuscar = new JLabel();
		correoBuscar = new JLabel();
		direccionBuscar = new JLabel();
		cedulaBuscar = new JLabel();
		variable = new JLabel();
		genero = new JLabel();
		fechaingreso = new JLabel();
		
		//CAMBIAR CURSO DE FLECHA POR MANO
		botonIncrementar.setCursor(cursor);
		volverFlecha.setCursor(cursor);
 
		//MENSAJE SOBRE EL BOTON
				botonIncrementar.setToolTipText("Incrementar");
				volverFlecha.setToolTipText("Regresar al menu principal");
		cedulaBuscar.setBounds(150, 30, 220, 25);
				cedulaBuscar.setToolTipText("Cedula del empleado.");
		nombreBuscar.setBounds(150, 65, 220, 25);
				nombreBuscar.setToolTipText("Nombre del empleado.");
		apellidoBuscar.setBounds(150, 100, 220, 25);
				apellidoBuscar.setToolTipText("Apellido del empleado.");
		telefonoBuscar.setBounds(210, 135, 160, 25);
				telefonoBuscar.setToolTipText("Telefono del empleado.");
		correoBuscar.setBounds(150, 170, 220, 25);
				correoBuscar.setToolTipText("Correo del empleado.");
		direccionBuscar.setBounds(150, 205, 220, 25);
				direccionBuscar.setToolTipText("Direccion del empleado.");
		variable.setBounds(160, 240, 90, 25);
			//	variable.setToolTipText("Variable");
		genero.setBounds(270, 275, 90, 25);
				genero.setToolTipText("Genero.");
		fechaingreso.setBounds(210, 310, 60, 25);
				fechaingreso.setToolTipText("Fecha Ingreso.");

		
		volverFlecha.setBounds(320, 365, 40, 45);
		
		botonIncrementar.setBounds(110, 360, 170, 24);

		//TextFields
		add(cedulaBuscar);
		add(nombreBuscar);
		add(apellidoBuscar);
		add(telefonoBuscar);
		add(correoBuscar);
		add(direccionBuscar);
		add(variable);
		add(genero);
		add(fechaingreso);

		//Botones
		add(botonIncrementar);
		add(volverFlecha);
		
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
		g2.drawString("Año de Ingreso:", 20, 295);
		g2.drawString("Nivel de Jerarquia:", 20, 330);


		super.paintComponent(g);
	
	}
//METODO 2 NECESARIO
	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

}