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
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEmpleados extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton fijoE, comisionE, volverEmpleados;
	private Icon comisionIcon, fijoIcon, volverEmpleadosIcon;
	public static final String FIJO = "FIJO";
	public static final String VOLVER_EMPLEADO = "VOLVER_EMPLEADO";
	public static final String COMISION = "COMISION";

	public PanelEmpleados() {

		TitledBorder border = new TitledBorder("Comision");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);

		ruta = "src/co/edu/unbosque/Util/fondo.jpg";

		comisionIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/comision.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON

		comisionE = new JButton(comisionIcon);
		comisionE.setActionCommand(COMISION);
		comisionE.setOpaque(false);
		comisionE.setContentAreaFilled(false);
		comisionE.setBorderPainted(false);

		// x,y, lados,alto
		comisionE.setBounds(20, 45, 100, 40);
		add(comisionE);

		fijoIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/fijo.png").getImage().getScaledInstance(40, 40,
				Image.SCALE_SMOOTH));

		fijoE = new JButton(fijoIcon);
		fijoE.setActionCommand(FIJO);
		fijoE.setOpaque(false);
		fijoE.setContentAreaFilled(false);
		fijoE.setBorderPainted(false);

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		fijoE.setCursor(cursor);
		fijoE.setToolTipText("Empleado Fijo");

		comisionE.setCursor(cursor);
		comisionE.setToolTipText("Empleado por Comisi�n");

		// x,y, lados,alto
		fijoE.setBounds(160, 45, 100, 40);
		add(fijoE);


		volverEmpleadosIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON

		volverEmpleados = new JButton(volverEmpleadosIcon);
		volverEmpleados.setActionCommand(VOLVER_EMPLEADO);
		volverEmpleados.setOpaque(false);
		volverEmpleados.setContentAreaFilled(false);
		volverEmpleados.setBorderPainted(false);
		volverEmpleados.setCursor(cursor);
		volverEmpleados.setToolTipText("Volver principal");

		// x,y, lados,alto
		volverEmpleados.setBounds(5, 10, 40, 40);
		add(volverEmpleados);
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

		g2.drawString("F: Personal Fijo", 50, 160);
		g2.drawString("C: Personal Comision", 50, 200);

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

	public JButton getFijoE() {
		return fijoE;
	}

	public JButton getComisionE() {
		return comisionE;
	}

	public JButton getVolverEmpleados() {
		return volverEmpleados;
	}
	
	
}
