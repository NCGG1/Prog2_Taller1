package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelEmpleados extends JPanel {

	private String ruta;
	private Image fondo; 
	private JButton fijoE, comisionE, volverEmpleados;
	private Icon comisionIcon, fijoIcon, volverEmpleadosIcon;
	public static final String FIJO = "FIJO";
	public static final String VOLVER_EMPLEADO = "VOLVER_EMPLEADO";
	public static final String COMISION = "COMISION";
	
	
	public PanelEmpleados() {
	
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

	g2.drawString("F: Personal Fijo", 94, 50);

	super.paintComponent(g);

}

// METODO 2 NECESARIO
public void setBackground(String imagePath) {

	this.setOpaque(false);
	this.fondo = new ImageIcon(imagePath).getImage();
	repaint();
}
}
