package co.edu.unbosque.Model;

import java.util.ArrayList;

public class Mundo {

	private ArrayList<Personal> empleados;

	public Mundo() {
		// TODO Auto-generated constructor stub
		empleados = new ArrayList<>();
	}

//	
<<<<<<< HEAD
	public String registrarPersonal(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int variable,
			double[] salarios) throws Exception {
			
			int contaArroba = 0;

			for (int i = 0; i < correo.length(); i++) {

			if (correo.charAt(i) == '@') {

			contaArroba++;

			}
			}
			if (contaArroba != 1) {

			throw new Exception("El correo que ingreso no es valido");

			}

			if (correo.charAt(0) == '@') {

			throw new Exception("El correo que ingreso no es valido");
=======
//	public String registrarPersonal(String nombre, String apellido, String genero, long telefono, String correo,
//			String direccion, String tipoIngeniero, String anoIngreso, long cedula, double salario, int variable,
//			double[] salarios) throws Exception {
//			
//			int contaArroba = 0;
//
//			for (int i = 0; i < correo.length(); i++) {
//
//			if (correo.charAt(i) == '@') {
//
//			contaArroba++;
//
//			}
//			}
//			if (contaArroba != 1) {
//
//			throw new Exception("El correo que ingreso no es valido");
//
//			}
//
//			if (correo.charAt(0) == '@') {
//
//			throw new Exception("El correo que ingreso no es valido");
//
//			}
//
//			if(correo.charAt(correo.length()-1) == '@') {
//
//			throw new Exception("El correo que ingreso no es valido");
//
//			}
//
//
//			String ag = "";
//
//			try {
//
//			if (existePersonal(cedula) == false) {
//
//			Personal persona = new Personal( nombre,  apellido,  genero,  telefono,  correo,
//					 direccion,  tipoIngeniero,  anoIngreso,  cedula,  salario,  variable, salarios);
//			persona.add(persona);
//			ag = "Registrado, bienvenido a BosTinder";
//			} else {
//			ag = "El usuario ya existe\n" + buscarPersona(cedula);
//			}
//			} catch (Exception e) {
//			e = new Exception("Error al agregar la persona");
//			e.printStackTrace();
//			}
//			return ag;
//
//			}
>>>>>>> b590b26353df95bd5161c6458d9eb2e7557da458

			}

			if(correo.charAt(correo.length()-1) == '@') {

			throw new Exception("El correo que ingreso no es valido");

			}


			String ag = "";

			try {

			if (existePersonal(cedula) == false) {
				if (tipoIngeniero.equalsIgnoreCase("Ingeniero Junior")) {
			IngenieroJunior junior = new IngenieroJunior(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario, (short)variable);
			empleados.add(junior);
			ag = "Registrado, bienvenido a BosqueSW";
			}else if(tipoIngeniero.equalsIgnoreCase("Ingeniero Senior")) {
				IngenieroSenior senior = new IngenieroSenior(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario, variable);
				empleados.add(senior);
				ag = "Registrado, bienvenido a BosqueSW";
			}else if(tipoIngeniero.equalsIgnoreCase("Ingeniero Comision")){
				PersonalComision comision = new PersonalComision(nombre, apellido, genero, telefono, correo, direccion, tipoIngeniero, anoIngreso, cedula, salario, variable, salarios);
				empleados.add(comision);
				ag = "Registrado, bienvenido a BosqueSW";
			}
			} else {
			ag = "El usuario ya existe\n" + buscarPersona(cedula).toString();
			}
			} catch (Exception e) {
			e = new Exception("Error al agregar la persona");
			e.printStackTrace();
			}
			return ag;

			}
	
	
	public String actualizarPersona(String nombre, String apellido, String genero, long telefono, String correo,
			String direccion, String anoIngreso, long cedula) {

		String actualizar = "";
		if (existePersonal(cedula) == true) {

			Personal personal = buscarPersona(cedula);

			if (!nombre.equalsIgnoreCase(personal.getNombre())) {

				personal.setNombre(nombre);
				actualizar = "Se actualizo el personal";
			}

			if (!apellido.equalsIgnoreCase(personal.getApellido())) {

				personal.setApellido(apellido);
				actualizar = "Se actualizo el personal";

			}

			if (!genero.equalsIgnoreCase(personal.getGenero())) {
				personal.setGenero(genero);
				actualizar = "Se actualizo el personal";

			}

			if (telefono != personal.getTelefono()) {

				personal.setTelefono(telefono);
				actualizar = "Se actualizo el personal";

			}

			if (correo.equalsIgnoreCase(personal.getCorreo())) {
				personal.setCorreo(correo);
				actualizar = "Se actualizo el personal";

			}

			if (anoIngreso.equalsIgnoreCase(personal.getAnoIngreso())) {

				personal.getAnoIngreso();
				actualizar = "Se actualizo el personal";

			}

			if (direccion.equalsIgnoreCase(personal.getDireccion())) {

				personal.setDireccion(direccion);
				actualizar = "Se actualizo el personal";

			}

		} else {

			actualizar = "No existe el personal";

		}

		return actualizar;
	}

	/**
	 * 
	 * @param cedula
	 * @return
	 */
	public Personal buscarPersona(long cedula) {

		Personal persona1 = null;

		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getCedula() == cedula) {
				persona1 = empleados.get(i);
			}
		}

		return persona1;
	}

	/**
	 * 
	 * @param cedula
	 * @return
	 */
	public boolean existePersonal(long cedula) {

		boolean existePersona = false;

		if (buscarPersona(cedula) != null) {
			existePersona = true;
		}

		return existePersona;
	}

	/**
	 * 
	 * @param cedula
	 * @return
	 */
	public String borrarPersona(long cedula) {

		String oo = "";

		if (existePersonal(cedula)) {
			if (buscarPersona(cedula) != null) {
				empleados.remove(buscarPersona(cedula));
				oo = "Se eliminó a la persona correctamente ";
			} else {
				oo = "No se eliminó a la persona correctamente ";

			}
		} else {
			oo = "No se encontró a la persona, por lo tanto no se eliminó ";

		}
		return oo;
	}

	/**
	 * 
	 * 
	 * @param cedula
	 * @return
	 */
	public String incrementarDatosVarios(long cedula) {

		String respuesta = "";

		if (existePersonal(cedula)) {
			Personal persona = buscarPersona(cedula);

			if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Junior")) {

				IngenieroJunior junior = (IngenieroJunior) persona;

				if (junior.getNivel() < 5) {

					junior.setNivel((short) (junior.getNivel() + 1));
					junior.calcularSalario();
					respuesta = "Nivel incrementado, felicitaciones ingeniero";
				} else {

					respuesta = "Lo sentimos ha alcanzado el nivel maximo";
				}
			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Senior")) {

				IngenieroSenior senior = (IngenieroSenior) persona;

				senior.setVentas(senior.getVentas() + 1);
				respuesta = "Nueva venta, felicitaciones ingeniero";

			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Comision")) {

				PersonalComision comision = (PersonalComision) persona;

				double[] clientesViejos = comision.getSalarios();
				double[] clientesNuevos = new double[clientesViejos.length + 1];

				for (int i = 0; i < clientesViejos.length; i++) {

					clientesNuevos[i] = clientesViejos[i];

				}
				// MATH RANDOM!!!! FALTA
				clientesNuevos[clientesViejos.length - 1] = 10000;

				comision.setSalarios(clientesNuevos);
				comision.calcularSalario();
				respuesta = "Nuevo cliente, felicitaciones ingeniero";
			}

		} else {

			respuesta = "No existe ningun ingeniero con la cedula ingresada";

		}

		return respuesta;

	}

}
