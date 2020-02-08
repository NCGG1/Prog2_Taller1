package co.edu.unbosque.Model;

public abstract class PersonalFijo extends Personal {
/**
  * Este es el constructor del Personal con salario Fijo
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
 * @param cedula			Es la cedula del Personal
 * @param salario			Es el salario del Personal
 */
	public PersonalFijo(String nombre, String apellido, String genero, long telefono, String correo, String direccion,
			String tipoIngeniero, String anoIngreso, long cedula, double salario) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
	}
/**
 * Metodo Abstracto
 */
	@Override
	public abstract void calcularSalario() ;
		// TODO Auto-generated method stub
		
	

}
