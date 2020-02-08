package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaBuscar extends JFrame {
	
	private PanelComision panelBuscar;

	public VentanaBuscar(Controlador control) {
		
		setTitle("Buscar Empleado");
		  
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelBuscar = new PanelComision();
		//Agrega el panel al frame
		getContentPane().add(panelBuscar);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		
		//Boton
		panelBuscar.getVolverFlecha().addActionListener(control);
		panelBuscar.getBotonRegistrar().addActionListener(control);
		//Texto
		panelBuscar.getNombreComision().addKeyListener(control);
		panelBuscar.getApellidoComision().addKeyListener(control);
		panelBuscar.getTelefonoComision().addKeyListener(control);
		panelBuscar.getCorreoComision().addKeyListener(control);
		panelBuscar.getDireccionComision().addKeyListener(control);
		panelBuscar.getCedulaComision().addKeyListener(control);
		panelBuscar.getNumeroVentas().addKeyListener(control);
		
		
	}
}