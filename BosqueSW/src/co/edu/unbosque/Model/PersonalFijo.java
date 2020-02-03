package co.edu.unbosque.Model;

public abstract class PersonalFijo extends Personal {

	public PersonalFijo(String nombre, String apellido, String genero, long telefono, String correo, String direccion,
			String tipoIngeniero, String anoIngreso, long cedula, double salario) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void calcularSalario() ;
		// TODO Auto-generated method stub
		
	

}
