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
	private JButton botonBuscar, volverFlecha;
	private JLabel nombreBuscar, apellidoBuscar, telefonoBuscar, correoBuscar, direccionBuscar, cedulaBuscar, labelVarables, numeroBuscar, variable;
	private JRadioButton rbtnHombre, rbtnMujer;
	private ButtonGroup generos;

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
		botonBuscar = new JButton("Buscar");
		botonBuscar.setActionCommand(BUSCAR);
		botonBuscar.setOpaque(false);
		botonBuscar.setContentAreaFilled(false);
		botonBuscar.setBorderPainted(false);
		 
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
		
		botonBuscar.setFont(Fuente_Boton);
		botonBuscar.setForeground(Color.BLACK);

		
		//Panel captar datos ________________________________
		nombreBuscar = new JTextField();
		apellidoBuscar = new JTextField();
		telefonoBuscar = new JTextField();
		correoBuscar = new JTextField();
		direccionBuscar = new JTextField();
		cedulaBuscar = new JTextField();
		variable = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));
		labelVarables = new JLabel();
		prefijoTelefonoBuscar = new JComboBox();
		
		prefijoTelefonoBuscar.addItem("300");
		prefijoTelefonoBuscar.addItem("301");
		prefijoTelefonoBuscar.addItem("302");
		prefijoTelefonoBuscar.addItem("303");
		prefijoTelefonoBuscar.addItem("304");
		prefijoTelefonoBuscar.addItem("305");
		prefijoTelefonoBuscar.addItem("310");
		prefijoTelefonoBuscar.addItem("311");
		prefijoTelefonoBuscar.addItem("312");
		prefijoTelefonoBuscar.addItem("313");
		prefijoTelefonoBuscar.addItem("314");
		prefijoTelefonoBuscar.addItem("315");
		prefijoTelefonoBuscar.addItem("316");
		prefijoTelefonoBuscar.addItem("317");
		prefijoTelefonoBuscar.addItem("318");
		prefijoTelefonoBuscar.addItem("319");
		prefijoTelefonoBuscar.addItem("320");
		prefijoTelefonoBuscar.addItem("321");
		prefijoTelefonoBuscar.addItem("322");
		prefijoTelefonoBuscar.addItem("323");
		prefijoTelefonoBuscar.addItem("350");
		prefijoTelefonoBuscar.addItem("351");
	
		
		//CAMBIAR CURSO DE FLECHA POR MANO
		botonBuscar.setCursor(cursor);

		//MENSAJE SOBRE EL BOTON
		botonBuscar.setToolTipText("Buscar Empleado");
		volverFlecha.setToolTipText("Regresar al menu principal");
		volverFlecha.setCursor(cursor);
		
		nombreBuscar.setBounds(150, 30, 220, 25);
				nombreBuscar.setToolTipText("Nombre del empleado.");
		apellidoBuscar.setBounds(150, 65, 220, 25);
				apellidoBuscar.setToolTipText("Apellido del empleado.");
		prefijoTelefonoBuscar.setBounds(150, 100, 60, 25);
				prefijoTelefonoBuscar.setToolTipText("Prefijo del numero de telefono.");
		telefonoBuscar.setBounds(210, 100, 160, 25);
				telefonoBuscar.setToolTipText("Telefono del empleado.");
		correoBuscar.setBounds(150, 135, 220, 25);
				correoBuscar.setToolTipText("Correo del empleado.");
		direccionBuscar.setBounds(150, 170, 220, 25);
				direccionBuscar.setToolTipText("Direccion del empleado.");
		cedulaBuscar.setBounds(150, 205, 220, 25);
				cedulaBuscar.setToolTipText("Cedula del empleado.");
		rbtnHombre.setBounds(160, 245, 90, 25);
				rbtnHombre.setToolTipText("Genero Masculino.");
		rbtnMujer.setBounds(270, 245, 90, 25);
				rbtnMujer.setToolTipText("Genero Femenino.");
		labelVarables.setBounds(210, 310, 60, 25);		
			
		//variable.setBounds(210, 310, 60, 25);
			//	variable.setToolTipText("Nivel del empleado a registrar.");
				
				choser.setBounds(176, 277, 130, 24);
				choser.setToolTipText("Fecha en la cual ingreso a la empresa");
		volverFlecha.setBounds(320, 365, 40, 45);
		
		botonBuscar.setBounds(110, 360, 170, 24);

		//TextFields
		add(nombreBuscar);
		add(apellidoBuscar);
		add(prefijoTelefonoBuscar);
		add(telefonoBuscar);
		add(correoBuscar);
		add(direccionBuscar);
		add(cedulaBuscar);
		//add(variable);
		add(labelVarables);

		//Botones
		add(botonBuscar);
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