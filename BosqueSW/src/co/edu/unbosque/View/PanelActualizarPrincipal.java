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

public class PanelActualizarPrincipal extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton actualizar, volverActualizar;
	private Icon iconVolverActualizar;
	private JTextField nombreTxt, apellidoTxt, telefonoTxt, correoTxt, direccionTxt;
	private JLabel cedulaTxt;
	private JComboBox<String> prefijoTelefono;
	private JDateChooser añoIngresoTxt;
	private JRadioButton rbtnHombre, rbtnMujer;
	private ButtonGroup generos;

	public static final String ACTUALIZAR = "ACTUALIZAR PRINCI";

	public static final String VOLVER_ACTU = "VOLVER ACTUALIZAR PRIN";

	public PanelActualizarPrincipal() {
		// TODO Auto-generated constructor stub

		TitledBorder border = new TitledBorder("Actualizar Empleado");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		// RUTA DE LA IMAGEN DEL FONDO DEL PANEL

		 ruta = "src/co/edu/unbosque/Util/fondo.jpg";
		// ventanas_________________

		
		// BOTON CON EL ICON
		actualizar = new JButton("Actualizar");
		actualizar.setActionCommand(ACTUALIZAR);
		actualizar.setOpaque(false);
		actualizar.setContentAreaFilled(false);
		actualizar.setBorderPainted(false);

		Font Fuente_Boton = new Font("ARIAL",Font.BOLD,22);
		
		actualizar.setFont(Fuente_Boton);
		actualizar.setForeground(Color.BLACK);
		// ICON DESCARGADO DE ICONFINDER
		iconVolverActualizar = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON
		volverActualizar = new JButton(iconVolverActualizar);
		volverActualizar.setActionCommand(VOLVER_ACTU);
		volverActualizar.setOpaque(false);
		volverActualizar.setContentAreaFilled(false);
		volverActualizar.setBorderPainted(false);

		añoIngresoTxt = new JDateChooser();
		
		// Radio Buttons


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
		generos = new ButtonGroup();
		generos.add(rbtnHombre);
		generos.add(rbtnMujer);
		// CURSOR
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		// Panel captar datos ________________________________
		nombreTxt = new JTextField();
		apellidoTxt = new JTextField();
		telefonoTxt = new JTextField();
		correoTxt = new JTextField();
		direccionTxt = new JTextField();
		cedulaTxt = new JLabel("----");
		prefijoTelefono = new JComboBox<String>();
		
		prefijoTelefono.addItem("300");
		prefijoTelefono.addItem("301");
		prefijoTelefono.addItem("302");
		prefijoTelefono.addItem("303");
		prefijoTelefono.addItem("304");
		prefijoTelefono.addItem("305");
		prefijoTelefono.addItem("310");
		prefijoTelefono.addItem("311");
		prefijoTelefono.addItem("312");
		prefijoTelefono.addItem("313");
		prefijoTelefono.addItem("314");
		prefijoTelefono.addItem("315");
		prefijoTelefono.addItem("316");
		prefijoTelefono.addItem("317");
		prefijoTelefono.addItem("318");
		prefijoTelefono.addItem("319");
		prefijoTelefono.addItem("320");
		prefijoTelefono.addItem("321");
		prefijoTelefono.addItem("322");
		prefijoTelefono.addItem("323");
		prefijoTelefono.addItem("350");
		prefijoTelefono.addItem("351");

		// CAMBIAR CURSO DE FLECHA POR MANO

		volverActualizar.setToolTipText("Regresar al la lista de empleados");
		volverActualizar.setCursor(cursor);
		actualizar.setToolTipText("Actualizar empleado");
		actualizar.setCursor(cursor);
		rbtnHombre.setCursor(cursor);
		rbtnMujer.setCursor(cursor);
		nombreTxt.setBounds(150, 65, 220, 25);
		nombreTxt.setToolTipText("Nombre del empleado a actualizar.");
		apellidoTxt.setBounds(150, 100, 220, 25);
		apellidoTxt.setToolTipText("Apellido del empleado  a actualizar.");
		prefijoTelefono.setBounds(150, 135, 60, 25);
		prefijoTelefono.setToolTipText("Prefijo del numero de telefono.");
		telefonoTxt.setBounds(210, 135, 160, 25);
		telefonoTxt.setToolTipText("Telefono del empleado a actualizar.");
		correoTxt.setBounds(150, 170, 220, 25);
		correoTxt.setToolTipText("Correo del empleado a actualizar.");
		direccionTxt.setBounds(150, 205, 220, 25);
		direccionTxt.setToolTipText("Direccion del empleado a actualizar.");
		cedulaTxt.setBounds(150, 30, 220, 25);
		cedulaTxt.setToolTipText("Cedula del empleado a actualizar.");
		rbtnHombre.setBounds(160, 240, 90, 25);
		rbtnHombre.setToolTipText("Genero Masculino.");
		rbtnMujer.setBounds(270, 240, 90, 25);
		rbtnMujer.setToolTipText("Genero Femenino.");
		añoIngresoTxt.setBounds(176, 277, 130, 24);
		
		actualizar.setBounds(116, 310, 160, 65);
		volverActualizar.setBounds(320, 325, 40, 45);

		// TextFields
		add(nombreTxt);
		add(apellidoTxt);
		add(prefijoTelefono);
		add(telefonoTxt);
		add(correoTxt);
		add(direccionTxt);
		add(cedulaTxt);
		add(añoIngresoTxt);
		// Botones
		add(volverActualizar);
		add(actualizar);
		add(rbtnHombre);
		add(rbtnMujer);
		

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

		g2.drawString("Cedula:" , 20, 50);
		g2.drawString("Nombre:", 20, 85);
		g2.drawString("Apellido:", 20, 120);
		g2.drawString("Telefono:", 20, 155);
		g2.drawString("Correo:", 20, 190);
		g2.drawString("Direccion:", 20, 225);
		g2.drawString("Genero:", 20, 260);
		g2.drawString("Año de Ingreso:", 20, 295);
		
		super.paintComponent(g);

	}

	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

	public JButton getActualizar() {
		return actualizar;
	}

	public JButton getVolverActualizar() {
		return volverActualizar;
	}

	public JTextField getNombreTxt() {
		return nombreTxt;
	}

	public JTextField getApellidoTxt() {
		return apellidoTxt;
	}

	public JTextField getTelefonoTxt() {
		return telefonoTxt;
	}

	public JTextField getCorreoTxt() {
		return correoTxt;
	}

	public JTextField getDireccionTxt() {
		return direccionTxt;
	}

	public JLabel getCedulaTxt() {
		return cedulaTxt;
	}

	public JComboBox<String> getPrefijoTelefono() {
		return prefijoTelefono;
	}

	public JDateChooser getAñoIngresoTxt() {
		return añoIngresoTxt;
	}

	public JRadioButton getRbtnHombre() {
		return rbtnHombre;
	}

	public JRadioButton getRbtnMujer() {
		return rbtnMujer;
	}

	
	
}

