package co.edu.unbosque.View;

import javax.swing.JFrame;

import co.edu.unbosque.Controller.Controlador;
import co.edu.unbosque.View.*;

public class VentanaLista extends JFrame {

	private PanelLista panelLista;
	
	public VentanaLista(Controlador control) {
		// TODO Auto-generated constructor stub
		
		setTitle("Eliminar");
		
		setSize(1350,650);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panelLista = new PanelLista();
		
		getContentPane().add(panelLista);
		iniciarComponentes(control);
	}
	
	public void iniciarComponentes(Controlador control) {
	
		
	}
}



