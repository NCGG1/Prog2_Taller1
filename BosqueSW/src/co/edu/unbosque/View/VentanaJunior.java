package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;

public class VentanaJunior extends JFrame {
	
	private PanelJunior panelregistrarJunior;

	public VentanaJunior(Controlador control) {
		
		setTitle("Registrar Empleado Junior");
		
		setSize(400,460);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelregistrarJunior = new PanelJunior();
		//Agrega el panel al frame
		getContentPane().add(panelregistrarJunior);
		iniciarComponentes(control);
	}

	public void iniciarComponentes(Controlador control) {
		
		//Boton
		panelregistrarJunior.getVolverFlecha().addActionListener(control);
		panelregistrarJunior.getBotonRegistrar().addActionListener(control);
		//Texto
		panelregistrarJunior.getNombreJunior().addKeyListener(control);
		panelregistrarJunior.getApellidoJunior().addKeyListener(control);
		panelregistrarJunior.getTelefonoJunior().addKeyListener(control);
		panelregistrarJunior.getCorreoJunior().addKeyListener(control);
		panelregistrarJunior.getDireccionJunior().addKeyListener(control);
		panelregistrarJunior.getCedulaJunior().addKeyListener(control);
		panelregistrarJunior.getNumeroVentas().addKeyListener(control);
		
		
	}
}