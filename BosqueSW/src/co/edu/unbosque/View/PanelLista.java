package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


public class PanelLista extends JPanel{
	
	private String ruta;
	private Image fondo;
	private JButton volverLista, eliminar, actualizar, buscar;
	private Icon volverListaIcon, actualizarIcon, eliminarIcon, buscarIcon;
	private JTable listaEmpleados;
	private DefaultTableModel dtm;
	private JTextField seleccion;
	private JScrollPane barrita;
	private String[] titulos;

	public static final String BUSCAR_PRIN = "BUSCAR_PRIN";
	public static final String ACTUALIZAR = "ACTUALIZAR PRIN";
	public static final String VOLVER_LISTA = "VOLVER LISTA";
	public static final String ELIMINAR = "ELIMINAR PRIN";

	
	public PanelLista() {
		// TODO Auto-generated constructor stub

		TitledBorder border = new TitledBorder("Lista Empleados");
		setBorder(border);
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitleColor(Color.BLACK);
		setLayout(null);
		//FONDO FALTA
		ruta = "src/FondoTinder.jpg";


		titulos = new String[13];
		titulos[0] = "Cedula";
		titulos[1] = "Nombre";
		titulos[2] = "Apellidos";
		titulos[3] = "Genero";
		titulos[4] = "Telefono";
		titulos[5] = "Email";
		titulos[6] = "Dirección";
		titulos[7] = "Ingeniero";
		titulos[8] = "Año de ingreso";
		titulos[9] = "Salario";
		titulos[10] = "Clientes";
		titulos[11] = "Ventas";
		titulos[12] = "Nivel";
		
		dtm = new DefaultTableModel(null, titulos);
		barrita = new JScrollPane();
		listaEmpleados = new JTable();
		listaEmpleados.setModel(dtm);
//		listaEmpleados.setEnabled(false);
//		barrita.setOpaque(false);
//		barrita.getViewport().setOpaque(false);
//		listaEmpleados.setOpaque(false);
//		listaEmpleados.setShowVerticalLines(false);
//		listaEmpleados.setShowHorizontalLines(false);
//		listaEmpleados.setDefaultRenderer(Object.class, new CeldalRenderer());
//		listaEmpleados.getTableHeader().setDefaultRenderer(new EncabezadoRenderer());
//		listaEmpleados.setForeground(Color.BLACK);
		barrita.setViewportView(listaEmpleados);
		

		volverListaIcon = new ImageIcon(
				new ImageIcon("src/co/edu/unbosque/Util/regresar.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		
		volverLista = new JButton(volverListaIcon);
		volverLista.setActionCommand(VOLVER_LISTA);
		volverLista.setOpaque(false);
		volverLista.setContentAreaFilled(false);
		volverLista.setBorderPainted(false);

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		volverLista.setToolTipText("Regresar al menu administrador");
		volverLista.setCursor(cursor);
		barrita.setBounds(12, 20, 1320, 550);
		volverLista.setBounds(6, 576, 40, 40);
	
		add(barrita);
		add(volverLista);

	}
	

	public void paintComponent(Graphics g) {

		int width = this.getSize().width;
		int height = this.getSize().height;

		setBackground(ruta);
		Graphics2D g2 = (Graphics2D) g;
		if (this.fondo != null) {
			g.drawImage(this.fondo, 0, 0, width, height, null);
		}

		super.paintComponent(g);

	}

	public void setBackground(String imagePath) {

		this.setOpaque(false);
		this.fondo = new ImageIcon(imagePath).getImage();
		repaint();
	}

	
}
