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

public class PanelEmpleadosFijos extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton junior, senior, volverFijos;
	private Icon seniorIcon, junioIcon, volverFijosIcon;
	public static final String SENIOR = "SENIOR";
	public static final String VOLVER_EMPLEADO_FIJOS = "VOLVER_EMPLEADO_FIJOS";
	public static final String JUNIOR = "JUNIOR";

	public PanelEmpleadosFijos() {

		TitledBorder border = new TitledBorder("Empleados fijos");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);

		ruta = "src/co/edu/unbosque/Util/fondo.jpg";

		seniorIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/senior.png").getImage().getScaledInstance(40,
				40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON

		senior = new JButton(seniorIcon);
		senior.setActionCommand(SENIOR);
		senior.setOpaque(false);
		senior.setContentAreaFilled(false);
		senior.setBorderPainted(false);

		// x,y, lados,alto
		senior.setBounds(20, 45, 100, 40);
		add(senior);

		junioIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/junior.png").getImage().getScaledInstance(40,
				40, Image.SCALE_SMOOTH));

		junior = new JButton(junioIcon);
		junior.setActionCommand(JUNIOR);
		junior.setOpaque(false);
		junior.setContentAreaFilled(false);
		junior.setBorderPainted(false);

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		junior.setCursor(cursor);
		junior.setToolTipText("Ingeniero junior");

		senior.setCursor(cursor);
		senior.setToolTipText("Ingeniero senior");
		
		// x,y, lados,alto
		junior.setBounds(160, 45, 100, 40);
		add(junior);

		volverFijosIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON

		volverFijos = new JButton(volverFijosIcon);
		volverFijos.setActionCommand(VOLVER_EMPLEADO_FIJOS);
		volverFijos.setOpaque(false);
		volverFijos.setContentAreaFilled(false);
		volverFijos.setBorderPainted(false);

		volverFijos.setCursor(cursor);
		volverFijos.setToolTipText("Volver filtro empleados");
		
		// x,y, lados,alto
		volverFijos.setBounds(5, 10, 40, 40);
		add(volverFijos);
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

		g2.drawString("S: Ingeniero Senior", 50, 160);
		g2.drawString("J: Ingeniero Junior", 50, 200);

		super.paintComponent(g);

	}

//METODO 2 NECESARIO
	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

	public JButton getJunior() {
		return junior;
	}

	public JButton getSenior() {
		return senior;
	}

	public JButton getVolverFijos() {
		return volverFijos;
	}

}
