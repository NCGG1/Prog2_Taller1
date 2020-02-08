package co.edu.unbosque.Model;

public class PersonalComision extends Personal {

	private int clientes;
	private double[] salarios;
/**
 * Este es el constructor del Personal por Comision
 * <b> pre</b> Los atributos ya han sido creados. <br>
 * <b> post </b> Se inicializaron los parametros. <br>
 *    
 * @param nombre			Es el nombre del Personal
 * @param apellido			Es el apellido del Personal
 * @param genero			Es el genero del Personal
 * @param telefono			Es el telefono del Personal
 * @param correo			Es el correo del Personal
 * @param direccion			Es el direccion del Personal
 * @param tipoIngeniero		Es el tipo de ingeniero del Personal
 * @param anoIngreso		Es el año de ingreso del Personal
 * @param cedula			Es el cedula del Personal
 * @param salario			Es el salario del Personal
 * @param clientes			Es el numero de clientes del Personal
 */
	public PersonalComision(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int clientes,
			double[] salarios) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
		this.clientes = clientes;
		this.salarios = salarios;
	}
	/**
 	 * Este metodo devuelve el numero de clientes del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtienen los clientes del Personal. <br>
	 *  
	 * @return int con el numero de clientes del Personal
 */
	public int getClientes() {
		return clientes;
	}
	/**
  	 * Este metodo edita los clientes del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se editan los clientes del Personal. <br>
	 *  
	 * @param ventas 	Son los clientes del Personal
 */
	public void setClientes(int clientes) {
		this.clientes = clientes;
	}
	/**
 	 * Este metodo devuelve los salarios del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtienen los salarios del Personal. <br>
	 *  
	 * @return double[] con los salarios de clientes del Personal
 */
	public double[] getSalarios() {
		return salarios;
	}
	/**
  	 * Este metodo edita los salarios del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se editan los salarios del Personal. <br>
	 *  
	 * @param salarios 	Son los salarios del Personal
 */
	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}
	/**
	 * Este metodo pasa la informacion del toString de personal y sus clientes.
	 * <b> pre </b> Los atributos ya han sido creados. <br>
	 * <b> post </b> Se obtiene el String con toda la informacion mas los clientes. <br>
	 * 
	 *  @return String con toda la info del toString de Personal mas los clientes del Personal.
	 */
	@Override
	public String toString() {
		return super.toString() + "Clientes: " + clientes;
	}
	/**
	 /**
	 	 * Este metodo calcula el salario con sus respectivos incrementos
		 * <b> pre </b> El atributo salario ya ha sido creado. <br>
		 * <b> post </b> Se obtiene el salario completo del Personal. <br>
		 *  
	 */ 
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

		double salario = 1100000;

		double[] salarios = getSalarios();

		double Suma_Salario = 0;

		for (int i = 0; i < salarios.length; i++) {

			Suma_Salario += salarios[i];

		}
		if (salario < 1100000) {
			setSalario(Suma_Salario + salario);
		} else {

			setSalario(Suma_Salario);
		}
	}

}
