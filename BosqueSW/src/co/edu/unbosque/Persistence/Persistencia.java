package co.edu.unbosque.Persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.Model.*;

public class Persistencia {

	private File ruta;

	public Persistencia() {

		ruta = new File("src/co/edu/unbosque/Util/Empleados.dat");

	}

	/**
	 * 
	 * 
	 * @param empleados
	 * @return
	 */
	public String guardarArchivo(ArrayList<Personal> empleados) {

		String resultado = "Se guardo el archivo";
		try {

			if (ruta.exists()) {

				ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream(ruta));

				escribiendoFichero.writeObject(empleados);
				escribiendoFichero.close();

			} else {

				ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream(ruta));

				escribiendoFichero.writeObject(empleados);
				escribiendoFichero.close();

			}
		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}
		return resultado;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Personal> leerArchivo(){
		
			ArrayList<Personal> empleados = new ArrayList<>();
			try {
				
			ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream(ruta));
			empleados = (ArrayList<Personal>) leyendoFichero.readObject();
			leyendoFichero.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.getMessage();	
			}
			
			return empleados;
		}


		
	
}
