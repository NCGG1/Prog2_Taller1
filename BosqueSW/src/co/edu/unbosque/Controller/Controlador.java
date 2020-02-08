package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.VentanaActualizarCheck;
import co.edu.unbosque.View.VentanaActualizarPrincipal;
import co.edu.unbosque.View.VentanaBuscar;
import co.edu.unbosque.View.VentanaComision;
import co.edu.unbosque.View.VentanaEmpleados;
import co.edu.unbosque.View.VentanaEmpleadosFijos;
import co.edu.unbosque.View.VentanaJunior;
import co.edu.unbosque.View.VentanaLista;
import co.edu.unbosque.View.VentanaPrincipal;
import co.edu.unbosque.View.VentanaSenior;

public class Controlador implements ActionListener, KeyListener, MouseListener {

	private VentanaEmpleados ventanaEmpleados;
	private VentanaLista ventanaLista;
	private VentanaSenior ventanaSenior;
	private VentanaJunior ventanaJunior;
	private VentanaComision ventanaComision;
	private VentanaBuscar ventanaBuscar;
	private VentanaActualizarPrincipal ventanaActualizarPrincipal;
	private VentanaActualizarCheck ventanaActualizarCheck;
	private VentanaPrincipal ventanaPrincipal;
	private VentanaEmpleadosFijos ventanaEmpleadosFijos;
	private Mundo mundo;

	public Controlador() {

		// TODO Auto-generated constructor stub
		ventanaEmpleadosFijos = new VentanaEmpleadosFijos(this);
		ventanaEmpleados = new VentanaEmpleados(this);
		ventanaActualizarPrincipal = new VentanaActualizarPrincipal(this);
		ventanaLista = new VentanaLista(this);
		ventanaActualizarCheck = new VentanaActualizarCheck(this);
		ventanaJunior = new VentanaJunior(this);
		ventanaSenior = new VentanaSenior(this);
		ventanaComision = new VentanaComision(this);
		ventanaPrincipal = new VentanaPrincipal(this);
		ventanaBuscar = new VentanaBuscar(this);
		mundo = new Mundo();
		ventanaPrincipal.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent Command) {
		// TODO Auto-generated method stub

		if (Command.getActionCommand().equalsIgnoreCase(ventanaPrincipal.getPanelPrincipal().REGISTRAR)) {

			ventanaPrincipal.setVisible(false);
			ventanaEmpleados.setVisible(true);
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaEmpleados.getPanelEmpleados().COMISION)) {

			ventanaEmpleados.setVisible(false);
			ventanaComision.setVisible(true);
		}
		if (Command.getActionCommand().equalsIgnoreCase(ventanaEmpleados.getPanelEmpleados().VOLVER_EMPLEADO)) {
			ventanaEmpleados.setVisible(false);
			ventanaPrincipal.setVisible(true);
			ventanaEmpleados.dispose();

		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaComision.getPanelregistrarComision().REGISTRARCOMISION)) {

			String nombre = ventanaComision.getPanelregistrarComision().getNombreComision().getText().trim();
			String apellido = ventanaComision.getPanelregistrarComision().getApellidoComision().getText().trim();
			String prefijoTel = String.valueOf(
					ventanaComision.getPanelregistrarComision().getPrefijoTelefonoComision().getSelectedItem());
			String telefono = ventanaComision.getPanelregistrarComision().getTelefonoComision().getText().trim();
			String correo = ventanaComision.getPanelregistrarComision().getCorreoComision().getText().trim();
			String direccion = ventanaComision.getPanelregistrarComision().getDireccionComision().getText().trim();
			long cedula = Long.parseLong(
					String.valueOf(ventanaComision.getPanelregistrarComision().getCedulaComision().getText().trim()));

			String genero = "";

			if (ventanaComision.getPanelregistrarComision().getRbtnHombre().isSelected()) {
				genero = "Hombre";
			} else {
				genero = "Mujer";
			}

			String date = String.valueOf(ventanaComision.getPanelregistrarComision().getChoser().getDate());
			String[] fechas = date.split("\\s");

			int dia = Integer.parseInt(fechas[2]);
			int año = Integer.parseInt(fechas[5]);
			int mes = 0;
			String año_ingreso = "";

			if (fechas[1].equalsIgnoreCase("Jan")) {

				mes = 1;

			} else if (fechas[1].equalsIgnoreCase("Feb")) {

				mes = 2;

			} else if (fechas[1].equalsIgnoreCase("Mar")) {

				mes = 3;

			} else if (fechas[1].equalsIgnoreCase("Apr")) {

				mes = 4;

			} else if (fechas[1].equalsIgnoreCase("May")) {

				mes = 5;

			} else if (fechas[1].equalsIgnoreCase("Jun")) {

				mes = 6;

			} else if (fechas[1].equalsIgnoreCase("Jul")) {

				mes = 7;

			} else if (fechas[1].equalsIgnoreCase("Aug")) {

				mes = 8;

			} else if (fechas[1].equalsIgnoreCase("Sep")) {

				mes = 9;

			} else if (fechas[1].equalsIgnoreCase("Oct")) {

				mes = 10;

			} else if (fechas[1].equalsIgnoreCase("Nov")) {

				mes = 11;

			} else if (fechas[1].equalsIgnoreCase("Dec")) {

				mes = 12;

			}

			año_ingreso = dia + "/" + mes + "/" + año;

			String cantidad_DeDias = String.valueOf(dia);
			String cantidad_Mes = String.valueOf(mes);

			if (cantidad_DeDias.length() == 1) {

				if (cantidad_Mes.length() == 1) {

					año_ingreso = "0" + dia + "/0" + mes + "/" + año;

				}

				if (cantidad_Mes.length() == 2) {

					año_ingreso = "0" + dia + "/" + mes + "/" + año;

				}

			}

			if (cantidad_DeDias.length() == 2) {

				if (cantidad_Mes.length() == 1) {

					año_ingreso = dia + "/0" + mes + "/" + año;

				}

				if (cantidad_Mes.length() == 2) {
					año_ingreso = dia + "/" + mes + "/" + año;

				}
			}

			int clientes = Integer.parseInt(
					String.valueOf(ventanaComision.getPanelregistrarComision().getClientesComision().getValue()));

			if (!nombre.isEmpty()) {

				if (!apellido.isEmpty()) {

					if (!telefono.isEmpty()) {

						if (telefono.length() == 7) {

							if (!correo.isEmpty()) {

								if (!año_ingreso.isEmpty()) {
									double[] salarios = new double[clientes];
									
									try {
										String registro = mundo.registrarPersonal(nombre, apellido, genero,
												Long.parseLong(String.valueOf(prefijoTel + telefono)), correo, direccion,
												"Ingeniero Comision", año_ingreso, cedula,
												Double.parseDouble(String.valueOf(1100000)), clientes, salarios);
												System.out.println(mundo.buscarPersona(cedula).toString());
										if (registro.equalsIgnoreCase("Registrado, bienvenido a bosqueSW")) {
											ventanaComision.setVisible(false);
											JOptionPane.showMessageDialog(null, registro);
											ventanaComision.getPanelregistrarComision().getNombreComision().setText("");
											ventanaComision.getPanelregistrarComision().getApellidoComision()
													.setText("");
											ventanaComision.getPanelregistrarComision().getTelefonoComision()
													.setText("");
											ventanaComision.getPanelregistrarComision().getCorreoComision().setText("");
											ventanaComision.getPanelregistrarComision().getPrefijoTelefonoComision()
													.setSelectedIndex(0);
											ventanaComision.getPanelregistrarComision().getDireccionComision()
													.setText("");
											ventanaComision.getPanelregistrarComision().getCedulaComision().setText("");
											ventanaComision.getPanelregistrarComision().getRbtnHombre()
													.setSelected(true);
											ventanaComision.getPanelregistrarComision().getClientesComision()
													.setValue(1);
											ventanaComision.setVisible(true);
										} else {
											ventanaComision.setVisible(false);
											JOptionPane.showMessageDialog(null, registro);
											ventanaComision.getPanelregistrarComision().getCedulaComision().setText("");
											ventanaComision.setVisible(true);
										}
									} catch (Exception e) {
										// TODO Auto-generated catch block
										JOptionPane.showMessageDialog(null, e.getMessage());
									}

								} else {
									JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de ingreso");

								}
							} else {
								JOptionPane.showMessageDialog(null, "Debe ingresar el correo");
							}

						} else {
							JOptionPane.showMessageDialog(null,
									"No puede ingresar mas de 7 numeros en el complemento del telefono");

						}

					} else {
						JOptionPane.showMessageDialog(null, "Debe ingresar el complemento del numero");

					}

				} else {

					JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");

				}

			} else {

				JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");

			}

		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaComision.getPanelregistrarComision().VOLVER_COMISION)) {
			ventanaPrincipal.setVisible(true);
			ventanaComision.setVisible(false);
			ventanaComision.getPanelregistrarComision().getNombreComision().setText("");
			ventanaComision.getPanelregistrarComision().getApellidoComision().setText("");
			ventanaComision.getPanelregistrarComision().getTelefonoComision().setText("");
			ventanaComision.getPanelregistrarComision().getCorreoComision().setText("");
			ventanaComision.getPanelregistrarComision().getPrefijoTelefonoComision().setSelectedIndex(0);
			ventanaComision.getPanelregistrarComision().getDireccionComision().setText("");
			ventanaComision.getPanelregistrarComision().getCedulaComision().setText("");
			ventanaComision.getPanelregistrarComision().getRbtnHombre().setSelected(true);
			ventanaComision.getPanelregistrarComision().getClientesComision().setValue(1);
			ventanaComision.dispose();
		}

		
		

//		if(Command.getActionCommand().equalsIgnoreCase(ventanaEmpleados.getPanelEmpleados().FIJO)) {
//			
//
//			ventanaEmpleados.setVisible(false);
//			ventanaEmpleadosFijos.setVisible(true);
//		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
