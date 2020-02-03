package co.edu.unbosque.Model;

public class IngenieroJunior extends PersonalFijo {

	public IngenieroJunior(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
	}

	private short nivel;

	public short getNivel() {
		return nivel;
	}

	public void setNivel(short nivel) {
		this.nivel = nivel;
	}

	
	@Override
	public String toString() {

		return super.toString() + "IngenieroJunior nivel: " + nivel;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

	}

	
}
