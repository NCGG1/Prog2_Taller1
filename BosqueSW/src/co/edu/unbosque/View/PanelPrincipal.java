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


public class PanelPrincipal extends JPanel {

	private String ruta;
	private Image fondo;
	private JButton register, lista;
	private Icon registrarIcon, ListaIcon;
	public final String REGISTRAR = "REGISTRAR";
	public final String LISTA = "LISTA PRIN";

	public PanelPrincipal() {

		TitledBorder border = new TitledBorder("Panel Principal");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);

		ruta = "src/co/edu/unbosque/Util/fondo.jpg";

		registrarIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/registar.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON
		register = new JButton(registrarIcon);
		register.setActionCommand(REGISTRAR);
		register.setOpaque(false);
		register.setContentAreaFilled(false);
		register.setBorderPainted(false);

			//x,y, lados,alto
		register.setBounds(50, 90, 40, 40);
		add(register);
		
		ListaIcon = new ImageIcon(new ImageIcon("src/co/edu/unbosque/Util/lista.png").getImage()
				.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		// BOTON CON EL ICON
		lista = new JButton(ListaIcon);
		lista.setActionCommand(LISTA);
		lista.setOpaque(false);
		lista.setContentAreaFilled(false);
		lista.setBorderPainted(false);
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		lista.setCursor(cursor);
		lista.setToolTipText("Lista empleados");
		
		register.setCursor(cursor);
		register.setToolTipText("Registrar empleado");
		
			//x,y, lados,alto
		lista.setBounds(180, 90, 100, 40);
		add(lista);
	}

	// METODO 1 NECESARIO
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

		g2.drawString("BosqueSW", 94, 50);

		super.paintComponent(g);

	}

	// METODO 2 NECESARIO
	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

	public JButton getRegister() {
		return register;
	}

	public JButton getLista() {
		return lista;
	}

	
}
