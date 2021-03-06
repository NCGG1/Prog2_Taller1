package co.edu.unbosque.View;

import java.awt.Image;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaPrincipal extends JFrame {

	private PanelPrincipal panelPrincipal;

	public VentanaPrincipal(Controlador control) {
		
		setTitle("Principal");
		
		setSize(300,200);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelPrincipal = new PanelPrincipal();
		//Agrega el panel al frame
		getContentPane().add(panelPrincipal);
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
		
		panelPrincipal.getRegister().addActionListener(control);
		panelPrincipal.getLista().addActionListener(control);
		
	}

	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}
	
	
}
