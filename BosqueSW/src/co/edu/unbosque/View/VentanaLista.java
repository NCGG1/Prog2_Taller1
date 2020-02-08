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
	
		panelLista.getListaEmpleados().addMouseListener(control);
		panelLista.getEliminar().addActionListener(control);
		panelLista.getBuscar().addActionListener(control);
		panelLista.getActualizar().addActionListener(control);
		panelLista.getVolverLista().addActionListener(control);
		
	}

	public PanelLista getPanelLista() {
		return panelLista;
	}
	
	
}



