package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import co.edu.unbosque.View.VentanaActualizarCheck;
import co.edu.unbosque.View.VentanaActualizarPrincipal;
import co.edu.unbosque.View.VentanaComision;
import co.edu.unbosque.View.VentanaEmpleados;
import co.edu.unbosque.View.VentanaJunior;
import co.edu.unbosque.View.VentanaLista;
import co.edu.unbosque.View.VentanaPrincipal;
import co.edu.unbosque.View.VentanaSenior;

public class Controlador implements ActionListener, KeyListener, MouseListener{

	private VentanaEmpleados ventanaEmpleados;
	private VentanaLista ventanaLista;
	private VentanaSenior ventanaSenior;
	private VentanaJunior ventanaJunior;
	private VentanaComision ventanaComision;
	private VentanaActualizarPrincipal ventanaActualizarPrincipal;
	private VentanaActualizarCheck ventanaActualizarCheck;
	private VentanaPrincipal ventanaPrincipal;
	public Controlador() {
		// TODO Auto-generated constructor stub
		ventanaEmpleados = new VentanaEmpleados(this);
		ventanaEmpleados.setVisible(true);
		ventanaActualizarPrincipal = new VentanaActualizarPrincipal(this);
		//ventanaActualizarPrincipal.setVisible(true);
		ventanaLista = new VentanaLista(this);
		ventanaActualizarCheck = new VentanaActualizarCheck(this);
		ventanaJunior = new VentanaJunior(this);
		ventanaSenior = new VentanaSenior(this);
		
		ventanaActualizarCheck.setVisible(true);
		ventanaLista.setVisible(true);
		ventanaComision = new VentanaComision(this);
		ventanaComision.setVisible(true);
		ventanaPrincipal = new VentanaPrincipal(this);
		ventanaPrincipal.setVisible(true);
	//	ventanaActualizarCheck.setVisible(true);
	//	ventanaLista.setVisible(true);
		
	//	ventanaSenior.setVisible(true);
		
	//	ventanaJunior.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
