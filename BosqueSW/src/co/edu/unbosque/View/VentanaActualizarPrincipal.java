package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaActualizarPrincipal extends JFrame{

	private PanelActualizarPrincipal panelActualizarPrincipal;

	public VentanaActualizarPrincipal(Controlador control) {
		
		setTitle("Actualizar Empleado");
		
		setSize(400,420);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelActualizarPrincipal = new PanelActualizarPrincipal();
		//Agrega el panel al frame
		getContentPane().add(panelActualizarPrincipal);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		
		panelActualizarPrincipal.getActualizar().addActionListener(control);
		panelActualizarPrincipal.getVolverActualizar().addActionListener(control);
		panelActualizarPrincipal.getNombreTxt().addKeyListener(control);
		panelActualizarPrincipal.getApellidoTxt().addKeyListener(control);
		panelActualizarPrincipal.getTelefonoTxt().addKeyListener(control);
		
	}

	public PanelActualizarPrincipal getPanelActualizarPrincipal() {
		return panelActualizarPrincipal;
	}
	
	
	
}
