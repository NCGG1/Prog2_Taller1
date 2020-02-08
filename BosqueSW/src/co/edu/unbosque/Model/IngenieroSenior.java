package co.edu.unbosque.Model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class IngenieroSenior extends PersonalFijo {

	private int ventas;
/**
 * Este es el constructor del Ingeniero Senior
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
 * @param ventas			Es el ventas del Personal
 */
	public IngenieroSenior(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int ventas) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
		this.ventas = ventas;

	}
	/**
 	 * Este metodo devuelve el valor ventas del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se obtiene el valor ventas del Personal. <br>
	 *  
	 * @return int con las ventas del Personal
 */
	public int getVentas() {
		return ventas;
	}
	/**
  	 * Este metodo edita las ventas del Personal
	 * <b> pre </b> El atributo ya ha sido creado. <br>
	 * <b> post </b> Se edita las ventas del Personal. <br>
	 *  
	 * @param ventas 	Son las ventas del Personal
 */
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	/**
	 * Este metodo pasa la informacion del toString de personal y sus ventas.
	 * <b> pre </b> Los atributos ya han sido creados. <br>
	 * <b> post </b> Se obtiene el String con toda la informacion mas las ventas. <br>
	 * 
	 *  @return String con toda la info del toString de Personal mas las ventas del Personal.
	 */
	@Override
	public String toString() {
		return super.toString() + "Ventas: " + ventas;
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

		double salario = 3500000;
		String año_ingreso[] = getAnoIngreso().split("/");
		int años = 0;
		double porcentaje = 0;
		double porcentajeVentas = 0;

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(año_ingreso[0] + "/" + año_ingreso[1] + "/" + año_ingreso[2], fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);

		años = periodo.getYears();

		if (años >= 2 && años <= 3) {

			porcentaje = salario * 0.05;

			setSalario(salario + porcentaje);

		} else if (años >= 4 && años <= 7) {

			porcentaje = salario * 0.1;

			setSalario(salario + porcentaje);

		} else if (años >= 8 && años <= 15) {

			porcentaje = salario * 0.15;

			setSalario(salario + porcentaje);

		} else if (años > 15) {

			porcentaje = salario * 0.2;

			setSalario(salario + porcentaje);

		}

		int ventas = getVentas();

		if (ventas >= 1 && ventas <= 5) {

			porcentajeVentas = salario * 0.1;

			setSalario(salario + porcentajeVentas);

		} else if (ventas >= 6 && ventas <= 10) {

			porcentajeVentas = salario * 0.15;

			setSalario(salario + porcentajeVentas);

		} else if (ventas >= 11 && ventas <= 20) {

			porcentajeVentas = salario * 0.2;

			setSalario(salario + porcentajeVentas);

		} else if (ventas > 20) {

			porcentajeVentas = salario * 0.3;

			setSalario(salario + porcentajeVentas);

		}

	}

}
