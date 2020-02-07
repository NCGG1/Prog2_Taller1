package co.edu.unbosque.Model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class IngenieroSenior extends PersonalFijo {

	private int ventas;

	public IngenieroSenior(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int ventas) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
		this.ventas = ventas;

	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Ventas: " + ventas;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

		double salario = 3500000;
		String año_ingreso[] = getAnoIngreso().split("/");
		int años = 0;
		double porcentaje = 0;
		double porcentajeVentas = 0;

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse("0" + año_ingreso[0] + "/0" + año_ingreso[1] + "/" + año_ingreso[2], fmt);
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

			setSalario(getSalario() + porcentaje);

		}

		int ventas = getVentas();

		if (ventas >= 1 && ventas <= 5) {

			porcentajeVentas = salario * 0.1;

			setSalario(getSalario() + porcentajeVentas);

		} else if (ventas >= 6 && ventas <= 10) {

			porcentajeVentas = salario * 0.15;

			setSalario(getSalario() + porcentajeVentas);

		} else if (ventas >= 11 && ventas <= 20) {

			porcentajeVentas = salario * 0.2;

			setSalario(getSalario() + porcentajeVentas);

		} else if (ventas > 20) {

			porcentajeVentas = salario * 0.3;

			setSalario(getSalario() + porcentajeVentas);

		}

	}

}
