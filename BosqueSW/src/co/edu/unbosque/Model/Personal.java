package co.edu.unbosque.Model;

public abstract class Personal {

	private String nombre;
	private String apellido;
	private String genero;
	private long telefono;
	private String correo;
	private String direccion;
	private String tipoIngeniero;
	private String anoIngreso;
	private long cedula;
	private double salario;

	public Personal(String nombre, String apellido, String genero, long telefono, String correo, String direccion,
			String tipoIngeniero, String anoIngreso, long cedula, double salario) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.tipoIngeniero = tipoIngeniero;
		this.anoIngreso = anoIngreso;
		this.cedula = cedula;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoIngeniero() {
		return tipoIngeniero;
	}

	public void setTipoIngeniero(String tipoIngeniero) {
		this.tipoIngeniero = tipoIngeniero;
	}

	public String getAnoIngreso() {
		return anoIngreso;
	}

	public void setAnoIngreso(String anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Personal nombre: " + nombre + ", apellido: " + apellido + ", genero: " + genero + ", telefono: " + telefono
				+ ", correo: " + correo + ", direccion: " + direccion + ", tipoIngeniero: " + tipoIngeniero
				+ ", anoIngreso: " + anoIngreso + ", cedula: " + cedula + ", salario: " + salario + ", ";
	}

	public abstract void calcularSalario();

}
