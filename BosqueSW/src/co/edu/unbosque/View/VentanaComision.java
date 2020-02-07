package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaComision extends JFrame {
	
	private PanelComision panelregistrarComision;

	public VentanaComision(Controlador control) {
		
		setTitle("Registrar Empleado por Comision");
		 
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelregistrarComision = new PanelComision();
		//Agrega el panel al frame
		getContentPane().add(panelregistrarComision);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		
		//Boton
		panelregistrarComision.getVolverFlecha().addActionListener(control);
		panelregistrarComision.getBotonRegistrar().addActionListener(control);
		//Texto
		panelregistrarComision.getNombreComision().addKeyListener(control);
		panelregistrarComision.getApellidoComision().addKeyListener(control);
		panelregistrarComision.getTelefonoComision().addKeyListener(control);
		panelregistrarComision.getCorreoComision().addKeyListener(control);
		panelregistrarComision.getDireccionComision().addKeyListener(control);
		panelregistrarComision.getCedulaComision().addKeyListener(control);
		panelregistrarComision.getNumeroVentas().addKeyListener(control);
		
		
	}
}