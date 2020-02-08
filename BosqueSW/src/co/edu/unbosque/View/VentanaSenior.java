package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;
//import Controlador.Controlador;
import co.edu.unbosque.View.PanelSenior;

public class VentanaSenior extends JFrame {
	
	private PanelSenior panelregistrarSenior;

	public VentanaSenior(Controlador control) {
		
		setTitle("Registrar Empleado Senior");
		
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelregistrarSenior = new PanelSenior();
		//Agrega el panel al frame
		getContentPane().add(panelregistrarSenior);
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
		
		//Boton
		panelregistrarSenior.getVolverFlecha().addActionListener(control);
		panelregistrarSenior.getBotonRegistrar().addActionListener(control);
		//Texto
		panelregistrarSenior.getNombreSenior().addKeyListener(control);
		panelregistrarSenior.getApellidoSenior().addKeyListener(control);
		panelregistrarSenior.getTelefonoSenior().addKeyListener(control);
		panelregistrarSenior.getCorreoSenior().addKeyListener(control);
		panelregistrarSenior.getDireccionSenior().addKeyListener(control);
		panelregistrarSenior.getCedulaSenior().addKeyListener(control);
		panelregistrarSenior.getNumeroVentas().addKeyListener(control);
		
		
	}

	public PanelSenior getPanelregistrarSenior() {
		return panelregistrarSenior;
	}
	
}