package co.edu.unbosque.Model;

public class IngenieroSenior {

	private int ventas;

	public IngenieroSenior(int ventas) {

		this.ventas = ventas;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "IngenieroSenior ventas: " + ventas ;
	}

	
}
