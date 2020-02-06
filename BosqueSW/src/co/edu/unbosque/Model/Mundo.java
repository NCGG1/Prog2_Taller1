package co.edu.unbosque.Model;

import java.util.ArrayList;

import sun.util.logging.resources.logging;

public class Mundo {

	private ArrayList <Personal> empleados;
	
	
	public Personal buscarPersona(long cedula) {
		
		
		return null;
	}
	
	public boolean existePersonal(long cedula) {
		
		
		return true;
	}
	
	/**
	 * 
	 * 
	 * @param cedula
	 * @return
	 */
	public String incrementarDatosVarios(long cedula) {
		
		String respuesta = "";
		
		if(existePersonal(cedula)) {
		Personal persona = buscarPersona(cedula);
		
		if(persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Junior")) {
			
			IngenieroJunior junior = (IngenieroJunior)persona;
			
			if(junior.getNivel() < 5) {
				
				junior.setNivel((short)(junior.getNivel() + 1));
				junior.calcularSalario();
				respuesta = "Nivel incrementado, felicitaciones ingeniero";
			}else {

				respuesta = "Lo sentimos ha alcanzado el nivel maximo";
			}
		}else if(persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Senior")) {
			
			IngenieroSenior senior = (IngenieroSenior)persona;
			
			senior.setVentas(senior.getVentas()+1);
			respuesta = "Nueva venta, felicitaciones ingeniero";
				
		}else if(persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Comision")) {
			
			PersonalComision comision = (PersonalComision)persona;
			
			int[] clientesViejos = comision.getSalarios();
			int[] clientesNuevos = new int[clientesViejos.length+1];

			for (int i = 0; i < clientesViejos.length; i++) {
				
			
				clientesNuevos[i] = clientesViejos[i];
				
			}
			//MATH RANDOM!!!! FALTA
				clientesNuevos[clientesViejos.length-1] = 10000;
				
				comision.setSalarios(clientesNuevos);
				comision.calcularSalario();
				respuesta = "Nuevo cliente, felicitaciones ingeniero";
		}
		
		
		}else {
			
			respuesta = "No existe ningun ingeniero con la cedula ingresada";
			
		}
		
		return respuesta;
		
	}

	
	
	
}
	