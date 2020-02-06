package co.edu.unbosque.Model;

public class IngenieroSenior extends PersonalFijo{

	private int ventas;

	public IngenieroSenior(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int ventas) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
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
		return "Ventas: " + ventas ;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

			
		
	}

	
}
