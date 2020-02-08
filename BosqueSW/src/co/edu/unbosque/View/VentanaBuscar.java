package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaBuscar extends JFrame {
	
	private PanelBuscar panelBuscar;

	public VentanaBuscar(Controlador control) {
		
		setTitle("Buscar Empleado");
		  
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelBuscar = new PanelBuscar();
		//Agrega el panel al frame
		getContentPane().add(panelBuscar);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		panelBuscar.getVolverFlecha().addActionListener(control);
		panelBuscar.getBotonIncrementar().addActionListener(control);
		
	}

	public PanelBuscar getPanelBuscar() {
		return panelBuscar;
	}
	
	
}