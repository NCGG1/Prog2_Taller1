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

	/**
	 * Este es el constructor del Personal
	 * <b> pre</b> Los atributos ya han sido creados. <br>
	 * <b> post </b> Se inicializaron los parametros. <br>
	 *  
	 * @param nombre			Es el nombre del Personal
	 * @param apellido			Es el apellido del Personal
	 * @param genero			Es el gero del Personal
	 * @param telefono			Es el telefono del Personal
	 * @param correo			Es el correo del Personal
	 * @param direccion			Es la direccion del Personal
	 * @param tipoIngeniero		Es el tipo de ingeniero del Personal
	 * @param anoIngreso		Es el año de ingreso del Personal
	 * @param cedula			Es la cedula del Personal
	 * @param salario			Es el salario del Personal
	 */
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
/**
 	 * Este metodo devuelve el nombre del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el nombre del Personal. <br>
	 *  
	 * @return Sring con el nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
  	 * Este metodo edita el nombre del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el nombre del Personal. <br>
	 *  
	 * @param nombre 	Es el nombre del Personal
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 	 * Este metodo devuelve el nombre del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el apellido del Personal. <br>
	 *  
 * @return 
 */
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
