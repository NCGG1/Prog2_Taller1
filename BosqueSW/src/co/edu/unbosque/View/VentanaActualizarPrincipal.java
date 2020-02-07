package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaActualizarPrincipal extends JFrame{

	private PanelActualizarPrincipal panelActualizarPrincipal;

	public VentanaActualizarPrincipal(Controlador control) {
		
		setTitle("Actualizar Empleado");
		
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelActualizarPrincipal = new PanelActualizarPrincipal();
		//Agrega el panel al frame
		getContentPane().add(panelActualizarPrincipal);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		
		//Boton
//		panelActualizarPrincipal.getVolverFlecha().addActionListener(control);
//		panelActualizarPrincipal.getBotonRegistrar().addActionListener(control);
//		//Texto
//		panelActualizarPrincipal.getNombreJunior().addKeyListener(control);
//		panelActualizarPrincipal.getApellidoJunior().addKeyListener(control);
//		panelActualizarPrincipal.getTelefonoJunior().addKeyListener(control);
//		panelActualizarPrincipal.getCorreoJunior().addKeyListener(control);
//		panelActualizarPrincipal.getDireccionJunior().addKeyListener(control);
//		panelActualizarPrincipal.getCedulaJunior().addKeyListener(control);
//		panelActualizarPrincipal.getNumeroVentas().addKeyListener(control);
//		
//		
	}
	
}
