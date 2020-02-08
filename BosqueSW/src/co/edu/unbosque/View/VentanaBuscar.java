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

	/**
	 * Conecta los eventos del controlador con los elementos de vista
	 *	<b> pre </b> El controlador debe implementar los diferente eventos listener <br>
	 * <b> post </b> El controlador escucha los elementos de vista<br>
	 * 
	 * @param control A cual controlador va asociado los eventos
	 * 
	 */
	public void iniciarComponentes(Controlador control) {
		panelBuscar.getVolverFlecha().addActionListener(control);
		panelBuscar.getBotonIncrementar().addActionListener(control);
		
	}

	public PanelBuscar getPanelBuscar() {
		return panelBuscar;
	}
	
	
}