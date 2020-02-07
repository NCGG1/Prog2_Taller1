package co.edu.unbosque.Model;

public class PersonalComision extends Personal {


	private int clientes;
	private double[] salarios;

	public PersonalComision(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int clientes, double[] salarios) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
		this.clientes = clientes;
		this.salarios = salarios;
	}

	

	public int getClientes() {
		return clientes;
	}

	public void setClientes(int clientes) {
		this.clientes = clientes;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	@Override
	public String toString() {
		return "Clientes: " + clientes;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

		double salario = 1100000;
			
		double[] salarios = getSalarios();
		
		double Suma_Salario = 0;
		
		
		for (int i = 0; i < salarios.length; i++) {
			
			Suma_Salario += salarios[i]; 
			
		}
		if(salario < 1100000) {
		setSalario(Suma_Salario + salario); 
		}else {
			
			setSalario(Suma_Salario); 				
		}
	}

	
}
