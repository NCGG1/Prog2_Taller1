package co.edu.unbosque.Model;

public class PersonalComision extends PersonalFijo {
	
	private int clientes;
	private int[] salarios;

	public PersonalComision(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int cliente,int  []salarios) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		
		
		this.clientes = cliente;
		this.salarios = salarios;
		// TODO Auto-generated constructor stub
	}

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

	public int[] getSalarios() {
		return salarios;
	}

	public void setSalarios(int[] salarios) {
		this.salarios = salarios;
	}

	@Override
	public String toString() {
		return "IngenieroSenior clientes: " + clientes;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

	}

	
}
