package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaEmpleados extends JFrame{

	private PanelEmpleados panelEmpleados;

	public VentanaEmpleados(Controlador control) {
	
		setTitle("Empleadosr");

		setSize(300, 280 );
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panelEmpleados = new PanelEmpleados();
		// Agrega el panel al frame
		getContentPane().add(panelEmpleados);
		iniciarComponentes(control);

	}

	public void iniciarComponentes(Controlador control) {
		panelEmpleados.getFijoE().addActionListener(control);
		panelEmpleados.getComisionE().addActionListener(control);
		panelEmpleados.getVolverEmpleados().addActionListener(control);
	}

	public PanelEmpleados getPanelEmpleados() {
		return panelEmpleados;
	}
	
	
}
