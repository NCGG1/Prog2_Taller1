package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaEmpleadosFijos extends JFrame{

	private PanelEmpleadosFijos panelEmpleadosFijos;

	public VentanaEmpleadosFijos(Controlador control) {
	
		setTitle("Empleados Fijos");

		setSize(300, 280 );
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panelEmpleadosFijos = new PanelEmpleadosFijos();
		// Agrega el panel al frame
		getContentPane().add(panelEmpleadosFijos);
		iniciarComponentes(control);

	}

	public void iniciarComponentes(Controlador control) {
		
		panelEmpleadosFijos.getSenior().addActionListener(control);
		panelEmpleadosFijos.getJunior().addActionListener(control);
		panelEmpleadosFijos.getVolverFijos().addActionListener(control);
		
	}

	public PanelEmpleadosFijos getPanelEmpleadosFijos() {
		return panelEmpleadosFijos;
	}
	
	
}
