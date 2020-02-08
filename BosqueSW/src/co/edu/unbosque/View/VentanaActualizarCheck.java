package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaActualizarCheck extends JFrame{

	private PanelActualizarCheck panelActualizarCheck;

	public VentanaActualizarCheck(Controlador control) {
		
		setTitle("Datos Empleado");
		
		setSize(240,240);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelActualizarCheck = new PanelActualizarCheck();
		//Agrega el panel al frame
		getContentPane().add(panelActualizarCheck);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
	
		panelActualizarCheck.getContinuarCheck().addActionListener(control);
		panelActualizarCheck.getVolverCheck().addActionListener(control);
		
	}

	public PanelActualizarCheck getPanelActualizarCheck() {
		return panelActualizarCheck;
	}
	
	
}
