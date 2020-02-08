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
	 * @return String con el apellido del Personal
 */
	public String getApellido() {
		return apellido;
	}
	/**
  	 * Este metodo edita el apellido del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el apellido del Personal. <br>
	 *  
	 * @param apellido 	Es el apellido del Personal
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
 	 * Este metodo devuelve el genero del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el genero del Personal. <br>
	 *  
	 * @return String con el genero del Personal
 */
	public String getGenero() {
		return genero;
	}
	/**
  	 * Este metodo edita el genero del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el genero del Personal. <br>
	 *  
	 * @param genero 	Es el genero del Personal
 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
 	 * Este metodo devuelve el telefono del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el telefono del Personal. <br>
	 *  
	 * @return String con el telefono del Personal
 */
	public long getTelefono() {
		return telefono;
	}
	/**
  	 * Este metodo edita el telefono del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el telefono del Personal. <br>
	 *  
	 * @param telefono 	Es el telefono del Personal
 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
 	 * Este metodo devuelve el correo del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el correo del Personal. <br>
	 *  
	 * @return String con el correo del Personal
 */
	public String getCorreo() {
		return correo;
	}
	/**
  	 * Este metodo edita el correo del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el correo del Personal. <br>
	 *  
	 * @param correo 	Es el correo del Personal
 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
 	 * Este metodo devuelve el direccion del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el direccion del Personal. <br>
	 *  
	 * @return String con el direccion del Personal
 */
	public String getDireccion() {
		return direccion;
	}
	/**
  	 * Este metodo edita el direccion del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el direccion del Personal. <br>
	 *  
	 * @param direccion 	Es el direccion del Personal
 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
 	 * Este metodo devuelve el tipo de ingeniero del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el tipo de ingeniero del Personal. <br>
	 *  
	 * @return String con el tipo de ingeniero del Personal
 */
	public String getTipoIngeniero() {
		return tipoIngeniero;
	}
	/**
  	 * Este metodo edita el tipo de ingeniero del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el tipo de ingeniero del Personal. <br>
	 *  
	 * @param tipoIngeniero 	Es el tipo de ingeniero del Personal
 */
	public void setTipoIngeniero(String tipoIngeniero) {
		this.tipoIngeniero = tipoIngeniero;
	}
	/**
 	 * Este metodo devuelve el año de ingreso del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el año de ingreso del Personal. <br>
	 *  
	 * @return String con el año de ingreso del Personal
 */
	public String getAnoIngreso() {
		return anoIngreso;
	}
	/**
  	 * Este metodo edita el año de ingreso del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el año de ingreso del Personal. <br>
	 *  
	 * @param anoIngreso 	Es el año de ingreso del Personal
 */
	public void setAnoIngreso(String anoIngreso) {
		this.anoIngreso = anoIngreso;
	}
	/**
 	 * Este metodo devuelve la cedula del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene la cedula del Personal. <br>
	 *  
	 * @return Long con la cedula del Personal
 */
	public long getCedula() {
		return cedula;
	}
	/**
  	 * Este metodo edita la cedula del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita la cedula del Personal. <br>
	 *  
	 * @param cedula 	Es la cedula del Personal
 */
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	/**
 	 * Este metodo devuelve el salario del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el salario del Personal. <br>
	 *  
	 * @return double con el salario del Personal
 */
	public double getSalario() {
		return salario;
	}
	/**
  	 * Este metodo edita el salario del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita el salario del Personal. <br>
	 *  
	 * @param cedula 	Es el salario del Personal
 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	/**
	 * Este metodo pasa la informacion del personal a un String.
	 * <b> pre </b> Los atributos ya han sido creados. <br>
	 * <b> post </b> Se obtiene el String con toda la informacion. <br>
	 * 
	 *  @return String con toda la info del Personal.
	 */
	public String toString() {
		return "Personal nombre: " + nombre + ", apellido: " + apellido + ", genero: " + genero + ", telefono: " + telefono
				+ ", correo: " + correo + ", direccion: " + direccion + ", tipoIngeniero: " + tipoIngeniero
				+ ", anoIngreso: " + anoIngreso + ", cedula: " + cedula + ", salario: " + salario + ", ";
	}
/**
 * Metodo abstracto
 */
	public abstract void calcularSalario();

}
