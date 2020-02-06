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
		panelregistrarJunior.getNombreSenior().addKeyListener(control);
		panelregistrarJunior.getApellidoSenior().addKeyListener(control);
		panelregistrarJunior.getTelefonoSenior().addKeyListener(control);
		panelregistrarJunior.getCorreoSenior().addKeyListener(control);
		panelregistrarJunior.getDireccionSenior().addKeyListener(control);
		panelregistrarJunior.getCedulaSenior().addKeyListener(control);
		panelregistrarJunior.getNumeroVentas().addKeyListener(control);
		
		
	}
}