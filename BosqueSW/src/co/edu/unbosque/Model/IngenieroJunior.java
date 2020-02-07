package co.edu.unbosque.Model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class IngenieroJunior extends PersonalFijo {

	public IngenieroJunior(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, short nivel) {
		super(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario);
		// TODO Auto-generated constructor stub
		this.nivel = nivel;
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

		return super.toString() + "Nivel: " + nivel;
	}

	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub

		double salario = getSalario();
		String año_ingreso[] = getAnoIngreso().split("/");
		int años = 0;
		double porcentaje = 0;
		double porcentajeNivel = 0;

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
		
		short nivel = getNivel();
		
		if(nivel == 2 || nivel == 3) {
			
			porcentajeNivel = salario * 0.05;
			
			setSalario(getSalario() + porcentajeNivel);

			
		}else if(nivel == 4 || nivel == 5) {
			
			porcentajeNivel = salario * 0.08;
			
			setSalario(getSalario() + porcentajeNivel);

		}

	}

}
