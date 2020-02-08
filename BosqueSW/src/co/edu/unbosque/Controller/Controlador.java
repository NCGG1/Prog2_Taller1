package co.edu.unbosque.Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.Model.IngenieroJunior;
import co.edu.unbosque.Model.IngenieroSenior;
import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.Model.Personal;
import co.edu.unbosque.Model.PersonalComision;
import co.edu.unbosque.Persistence.Persistencia;
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
	private Persistencia persistencia;

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
		persistencia = new Persistencia();
		mundo.setEmpleados(persistencia.leerArchivo());
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
			String cedula = ventanaComision.getPanelregistrarComision().getCedulaComision().getText().trim();

			String genero = "";

			if (ventanaComision.getPanelregistrarComision().getRbtnHombre().isSelected()) {
				genero = "Hombre";
			} else {
				genero = "Mujer";
			}

			Object date = ventanaComision.getPanelregistrarComision().getChoser().getDate();
			String año_ingreso = "";

			if (date != null) {

				String date2 = String.valueOf(ventanaComision.getPanelregistrarComision().getChoser().getDate());

				String[] fechas = date2.split("\\s");

				int dia = Integer.parseInt(fechas[2]);
				int año = Integer.parseInt(fechas[5]);
				int mes = 0;

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
			} else {
				año_ingreso = "";
			}
			int clientes = Integer.parseInt(
					String.valueOf(ventanaComision.getPanelregistrarComision().getClientesComision().getValue()));

			if (!nombre.isEmpty()) {

				if (!apellido.isEmpty()) {

					if (!telefono.isEmpty()) {

						if (telefono.length() == 7) {

							if (!correo.isEmpty()) {

								if (!año_ingreso.isEmpty()) {
									if (!cedula.isEmpty() && !cedula.equalsIgnoreCase("0")) {
										double[] salarios = new double[clientes];

										for (int i = 0; i < salarios.length; i++) {

											salarios[i] = (int) (Math.floor(Math.random() * (2000000 - 500000) + 0));
										}

										try {
											int i = JOptionPane.showConfirmDialog(null,
													"Verifique sus datos\nNombre: " + nombre + "\nApellido: " + apellido
															+ "\nGenero: " + genero + "\nTelefono: " + prefijoTel
															+ telefono + "\nCorreo: " + correo + "\nDireccion: "
															+ direccion + "\nAño de ingreso: " + año_ingreso
															+ "\nCedula: " + cedula + "\nClientes: " + clientes,
													"Verificacion", JOptionPane.YES_NO_OPTION);
											if (i == 0) {

												String registro = mundo.registrarPersonal(nombre, apellido, genero,
														Long.parseLong(String.valueOf(prefijoTel + telefono)), correo,
														direccion, "Ingeniero Comision", año_ingreso,
														Long.parseLong(String.valueOf(cedula)),
														Double.parseDouble(String.valueOf(1100000)), clientes,
														salarios);
												persistencia.guardarArchivo(mundo.getEmpleados());
												System.out.println(mundo.getEmpleados().size());

												if (registro.equalsIgnoreCase("Registrado, bienvenido a bosqueSW")) {
													ventanaComision.setVisible(false);
													JOptionPane.showMessageDialog(null, registro);
													ventanaComision.getPanelregistrarComision().getNombreComision()
															.setText("");
													ventanaComision.getPanelregistrarComision().getApellidoComision()
															.setText("");
													ventanaComision.getPanelregistrarComision().getTelefonoComision()
															.setText("");
													ventanaComision.getPanelregistrarComision().getCorreoComision()
															.setText("");
													ventanaComision.getPanelregistrarComision()
															.getPrefijoTelefonoComision().setSelectedIndex(0);
													ventanaComision.getPanelregistrarComision().getDireccionComision()
															.setText("");
													ventanaComision.getPanelregistrarComision().getCedulaComision()
															.setText("");
													ventanaComision.getPanelregistrarComision().getRbtnHombre()
															.setSelected(true);
													ventanaComision.getPanelregistrarComision().getClientesComision()
															.setValue(1);
													ventanaComision.setVisible(true);
												} else {
													ventanaComision.setVisible(false);
													JOptionPane.showMessageDialog(null, registro);
													ventanaComision.getPanelregistrarComision().getCedulaComision()
															.setText("");
													cedula = "";
													ventanaComision.setVisible(true);
												}

											} else if (i == 1) {
												JOptionPane.showMessageDialog(null,
														"Por favor ingrese los datos correctos");
											}

										} catch (Exception e) {
											// TODO Auto-generated catch block
											JOptionPane.showMessageDialog(null, e.getMessage());
										}
									} else {
										JOptionPane.showMessageDialog(null, "Debe ingresar una cedula valida");
									}
								} else {
									JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de ingreso");

								}
							} else {
								JOptionPane.showMessageDialog(null, "Debe ingresar el correo");
							}

						} else {
							JOptionPane.showMessageDialog(null,
									"Debe ingresar 7 numeros en el complemento del telefono");

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

		if (Command.getActionCommand().equalsIgnoreCase(ventanaEmpleados.getPanelEmpleados().FIJO)) {

			ventanaEmpleados.setVisible(false);
			ventanaEmpleadosFijos.setVisible(true);
			ventanaEmpleados.dispose();
		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaEmpleadosFijos.getPanelEmpleadosFijos().VOLVER_EMPLEADO_FIJOS)) {

			ventanaEmpleados.setVisible(true);
			ventanaEmpleadosFijos.setVisible(false);
			ventanaEmpleadosFijos.dispose();
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaEmpleadosFijos.getPanelEmpleadosFijos().SENIOR)) {

			ventanaEmpleadosFijos.setVisible(false);
			ventanaEmpleadosFijos.dispose();
			ventanaSenior.setVisible(true);
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaSenior.getPanelregistrarSenior().REGISTRARSENIOR)) {

			String nombre = ventanaSenior.getPanelregistrarSenior().getNombreSenior().getText().trim();
			String apellido = ventanaSenior.getPanelregistrarSenior().getApellidoSenior().getText().trim();

			String prefijoTel = String
					.valueOf(ventanaSenior.getPanelregistrarSenior().getPrefijoTelefonoSenior().getSelectedItem());
			String telefono = ventanaSenior.getPanelregistrarSenior().getTelefonoSenior().getText().trim();
			String correo = ventanaSenior.getPanelregistrarSenior().getCorreoSenior().getText().trim();
			String direccion = ventanaSenior.getPanelregistrarSenior().getDireccionSenior().getText().trim();
			String cedula = ventanaSenior.getPanelregistrarSenior().getCedulaSenior().getText().trim();

			String genero = "";

			if (ventanaSenior.getPanelregistrarSenior().getRbtnHombre().isSelected()) {
				genero = "Hombre";
			} else {
				genero = "Mujer";
			}

			Object date = ventanaSenior.getPanelregistrarSenior().getChoser().getDate();
			String año_ingreso = "";

			if (date != null) {

				String date2 = String.valueOf(ventanaSenior.getPanelregistrarSenior().getChoser().getDate());

				String[] fechas = date2.split("\\s");

				int dia = Integer.parseInt(fechas[2]);
				int año = Integer.parseInt(fechas[5]);
				int mes = 0;

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
			} else {
				año_ingreso = "";
			}

			int ventas = Integer
					.parseInt(String.valueOf(ventanaSenior.getPanelregistrarSenior().getNumeroVentas().getValue()));

			if (!nombre.isEmpty()) {

				if (!apellido.isEmpty()) {

					if (!telefono.isEmpty()) {

						if (telefono.length() == 7) {

							if (!correo.isEmpty()) {

								if (!direccion.isEmpty()) {

									if (!cedula.isEmpty() && !cedula.equalsIgnoreCase("0")) {

										if (!año_ingreso.isEmpty()) {

											try {
												int i = JOptionPane.showConfirmDialog(null,
														"Verifique sus datos\nNombre: " + nombre + "\nApellido: "
																+ apellido + "\nGenero: " + genero + "\nTelefono: "
																+ prefijoTel + telefono + "\nCorreo: " + correo
																+ "\nDireccion: " + direccion + "\nAño de ingreso: "
																+ año_ingreso + "\nCedula: " + cedula + "\nVentas: "
																+ ventas,
														"Verificacion", JOptionPane.YES_NO_OPTION);
												if (i == 0) {
													String registro = mundo.registrarPersonal(nombre, apellido, genero,
															Long.parseLong(String.valueOf(prefijoTel + telefono)),
															correo, direccion, "Ingeniero Senior", año_ingreso,
															Long.parseLong(String.valueOf(cedula)), 3500000, ventas,
															null);
													persistencia.guardarArchivo(mundo.getEmpleados());
													System.out.println(mundo.getEmpleados().size());

													if (registro
															.equalsIgnoreCase("Registrado, bienvenido a bosqueSW")) {

														ventanaSenior.setVisible(false);
														JOptionPane.showMessageDialog(null, registro);

														ventanaSenior.getPanelregistrarSenior().getNombreSenior()
																.setText("");
														ventanaSenior.getPanelregistrarSenior().getApellidoSenior()
																.setText("");
														ventanaSenior.getPanelregistrarSenior()
																.getPrefijoTelefonoSenior().setSelectedIndex(0);
														ventanaSenior.getPanelregistrarSenior().getTelefonoSenior()
																.setText("");
														ventanaSenior.getPanelregistrarSenior().getCorreoSenior()
																.setText("");
														ventanaSenior.getPanelregistrarSenior().getDireccionSenior()
																.setText("");
														ventanaSenior.getPanelregistrarSenior().getRbtnHombre()
																.setSelected(true);
														ventanaSenior.getPanelregistrarSenior().getNumeroVentas()
																.setValue(1);
														ventanaSenior.getPanelregistrarSenior().getCedulaSenior()
																.setText("");
														ventanaSenior.setVisible(true);
													} else {

														ventanaSenior.setVisible(false);
														JOptionPane.showMessageDialog(null, registro);
														ventanaSenior.getPanelregistrarSenior().getCedulaSenior()
																.setText("");
														cedula = "";
														ventanaSenior.setVisible(true);

													}

												} else if (i == 1) {
													JOptionPane.showMessageDialog(null,
															"Por favor ingrese los datos correctos");
												}

											} catch (NumberFormatException e) {
												// TODO Auto-generated catch block
												JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico");
											} catch (Exception e) {
												// TODO Auto-generated catch block
												JOptionPane.showMessageDialog(null, e.getMessage());

											}

										} else {

											JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de ingreso");

										}
									} else {
										JOptionPane.showMessageDialog(null, "Debe ingresar una cedula valida");

									}

								} else {

									JOptionPane.showMessageDialog(null, "Debe ingresar una direccion");

								}

							} else {
								JOptionPane.showMessageDialog(null, "Debe ingresar un correo");

							}

						} else {

							JOptionPane.showMessageDialog(null, "Debe ingresar 7 numeros del complemento del telefono");

						}

					} else {

						JOptionPane.showMessageDialog(null, "Debe el complemento del telefono");

					}

				} else {
					JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
				}

			} else {

				JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
			}
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaSenior.getPanelregistrarSenior().VOLVER_SENIOR)) {
			ventanaSenior.setVisible(false);
			ventanaSenior.getPanelregistrarSenior().getNombreSenior().setText("");
			ventanaSenior.getPanelregistrarSenior().getApellidoSenior().setText("");
			ventanaSenior.getPanelregistrarSenior().getPrefijoTelefonoSenior().setSelectedIndex(0);
			ventanaSenior.getPanelregistrarSenior().getTelefonoSenior().setText("");
			ventanaSenior.getPanelregistrarSenior().getCorreoSenior().setText("");
			ventanaSenior.getPanelregistrarSenior().getDireccionSenior().setText("");
			ventanaSenior.getPanelregistrarSenior().getRbtnHombre().setSelected(true);
			ventanaSenior.getPanelregistrarSenior().getNumeroVentas().setValue(1);
			ventanaSenior.getPanelregistrarSenior().getCedulaSenior().setText("");
			ventanaSenior.dispose();
			ventanaEmpleados.setVisible(true);

		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaEmpleadosFijos.getPanelEmpleadosFijos().JUNIOR)) {

			ventanaEmpleadosFijos.setVisible(false);
			ventanaEmpleadosFijos.dispose();
			ventanaJunior.setVisible(true);

		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaJunior.getPanelregistrarJunior().REGISTRARJUNIOR)) {

			String nombre = ventanaJunior.getPanelregistrarJunior().getNombreJunior().getText().trim();
			String apellido = ventanaJunior.getPanelregistrarJunior().getApellidoJunior().getText().trim();

			String prefijoTel = String
					.valueOf(ventanaJunior.getPanelregistrarJunior().getPrefijoTelefonoJunior().getSelectedItem());
			String telefono = ventanaJunior.getPanelregistrarJunior().getTelefonoJunior().getText().trim();
			String correo = ventanaJunior.getPanelregistrarJunior().getCorreoJunior().getText().trim();
			String direccion = ventanaJunior.getPanelregistrarJunior().getDireccionJunior().getText().trim();
			String cedula = ventanaJunior.getPanelregistrarJunior().getCedulaJunior().getText().trim();

			String genero = "";

			if (ventanaJunior.getPanelregistrarJunior().getRbtnHombre().isSelected()) {
				genero = "Hombre";
			} else {
				genero = "Mujer";
			}
			Object date = ventanaJunior.getPanelregistrarJunior().getChoser().getDate();
			String año_ingreso = "";

			if (date != null) {

				String date2 = String.valueOf(ventanaJunior.getPanelregistrarJunior().getChoser().getDate());

				String[] fechas = date2.split("\\s");

				int dia = Integer.parseInt(fechas[2]);
				int año = Integer.parseInt(fechas[5]);
				int mes = 0;

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
			} else {
				año_ingreso = "";
			}

			int nivel = Integer
					.parseInt(String.valueOf(ventanaJunior.getPanelregistrarJunior().getNivelJunior().getValue()));

			if (!nombre.isEmpty()) {

				if (!apellido.isEmpty()) {

					if (!telefono.isEmpty()) {

						if (telefono.length() == 7) {

							if (!correo.isEmpty()) {

								if (!direccion.isEmpty()) {

									if (!cedula.isEmpty() && !cedula.equalsIgnoreCase("0")) {

										if (!año_ingreso.isEmpty()) {

											try {
												int i = JOptionPane.showConfirmDialog(null,
														"Verifique sus datos\nNombre: " + nombre + "\nApellido: "
																+ apellido + "\nGenero: " + genero + "\nTelefono: "
																+ prefijoTel + telefono + "\nCorreo: " + correo
																+ "\nDireccion: " + direccion + "\nAño de ingreso: "
																+ año_ingreso + "\nCedula: " + cedula + "\nNivel: "
																+ nivel,
														"Verificacion", JOptionPane.YES_NO_OPTION);
												if (i == 0) {
													String registro = mundo.registrarPersonal(nombre, apellido, genero,
															Long.parseLong(String.valueOf(prefijoTel + telefono)),
															correo, direccion, "Ingeniero Junior", año_ingreso,
															Long.parseLong(cedula), 3500000, nivel, null);

													persistencia.guardarArchivo(mundo.getEmpleados());
													System.out.println(mundo.getEmpleados().size());

													persistencia.guardarArchivo(mundo.getEmpleados());
													System.out.println(mundo.getEmpleados().size());

													if (registro
															.equalsIgnoreCase("Registrado, bienvenido a bosqueSW")) {

														ventanaJunior.setVisible(false);
														JOptionPane.showMessageDialog(null, registro);

														ventanaJunior.getPanelregistrarJunior().getNombreJunior()
																.setText("");
														ventanaJunior.getPanelregistrarJunior().getApellidoJunior()
																.setText("");
														ventanaJunior.getPanelregistrarJunior()
																.getPrefijoTelefonoJunior().setSelectedIndex(0);
														ventanaJunior.getPanelregistrarJunior().getTelefonoJunior()
																.setText("");
														ventanaJunior.getPanelregistrarJunior().getCorreoJunior()
																.setText("");
														ventanaJunior.getPanelregistrarJunior().getDireccionJunior()
																.setText("");
														ventanaJunior.getPanelregistrarJunior().getRbtnHombre()
																.setSelected(true);
														ventanaJunior.getPanelregistrarJunior().getNivelJunior()
																.setValue(1);
														ventanaJunior.getPanelregistrarJunior().getCedulaJunior()
																.setText("");
														ventanaJunior.setVisible(true);
													} else {

														ventanaJunior.setVisible(false);
														JOptionPane.showMessageDialog(null, registro);
														ventanaJunior.getPanelregistrarJunior().getCedulaJunior()
																.setText("");
														cedula = "";
														ventanaJunior.setVisible(true);

													}

												} else if (i == 1) {
													JOptionPane.showMessageDialog(null,
															"Por favor ingrese los datos correctos");
												}

											} catch (NumberFormatException e) {
												// TODO Auto-generated catch block
												JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico");
											} catch (Exception e) {
												// TODO Auto-generated catch block
												JOptionPane.showMessageDialog(null, e.getMessage());

											}

										} else {

											JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de ingreso");

										}
									} else {
										JOptionPane.showMessageDialog(null, "Debe ingresar una cedula valida");

									}

								} else {

									JOptionPane.showMessageDialog(null, "Debe ingresar una direccion");

								}

							} else {
								JOptionPane.showMessageDialog(null, "Debe ingresar un correo");

							}

						} else {

							JOptionPane.showMessageDialog(null, "Debe ingresar 7 numeros del complemento del telefono");

						}

					} else {

						JOptionPane.showMessageDialog(null, "Debe el complemento del telefono");

					}

				} else {
					JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
				}

			} else {

				JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
			}

		}
		if (Command.getActionCommand().equalsIgnoreCase(ventanaJunior.getPanelregistrarJunior().VOLVER_JUNIOR)) {
			ventanaJunior.setVisible(false);
			ventanaJunior.getPanelregistrarJunior().getNombreJunior().setText("");
			ventanaJunior.getPanelregistrarJunior().getApellidoJunior().setText("");
			ventanaJunior.getPanelregistrarJunior().getPrefijoTelefonoJunior().setSelectedIndex(0);
			ventanaJunior.getPanelregistrarJunior().getTelefonoJunior().setText("");
			ventanaJunior.getPanelregistrarJunior().getCorreoJunior().setText("");
			ventanaJunior.getPanelregistrarJunior().getDireccionJunior().setText("");
			ventanaJunior.getPanelregistrarJunior().getRbtnHombre().setSelected(true);
			ventanaJunior.getPanelregistrarJunior().getNivelJunior().setValue(1);
			ventanaJunior.getPanelregistrarJunior().getCedulaJunior().setText("");
			ventanaJunior.dispose();
			ventanaEmpleados.setVisible(true);

		}
		if (Command.getActionCommand().equalsIgnoreCase(ventanaPrincipal.getPanelPrincipal().LISTA)) {

			ventanaPrincipal.setVisible(false);
			ventanaLista.getPanelLista().getDtm().setRowCount(0);
			actutabla(ventanaLista.getPanelLista().getDtm(), ventanaLista.getPanelLista().getListaEmpleados(),
					mundo.getEmpleados());

			ventanaLista.setVisible(true);
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaLista.getPanelLista().ELIMINAR)) {
			ventanaLista.setVisible(false);
			if (!ventanaLista.getPanelLista().getSeleccion().getText().trim().isEmpty()) {
				if (mundo.existePersonal(Integer
						.parseInt(String.valueOf(ventanaLista.getPanelLista().getSeleccion().getText().trim())))) {

					Personal persona = mundo.buscarPersona(Integer
							.parseInt(String.valueOf(ventanaLista.getPanelLista().getSeleccion().getText().trim())));

					int i = JOptionPane.showConfirmDialog(null,
							"¿Desea eliminar al empleado? \nDatos\nNombre: " + persona.getNombre() + "\nApellido: "
									+ persona.getApellido() + "\nGenero: " + persona.getGenero() + "\nTelefono: "
									+ persona.getTelefono() + "\nCorreo: " + persona.getCorreo() + "\nDireccion: "
									+ persona.getDireccion() + "\nAño de ingreso: " + persona.getAnoIngreso()
									+ "\nCedula: " + persona.getCedula(),
							"Verificacion", JOptionPane.YES_NO_OPTION);

					if (i == 0) {

						String eliminar = mundo.borrarPersona(Integer.parseInt(
								String.valueOf(ventanaLista.getPanelLista().getSeleccion().getText().trim())));

						if (eliminar.equalsIgnoreCase("Se eliminó a la persona correctamente")) {

							JOptionPane.showMessageDialog(null, eliminar);
							ventanaLista.getPanelLista().getDtm().setRowCount(0);
							actutabla(ventanaLista.getPanelLista().getDtm(),
									ventanaLista.getPanelLista().getListaEmpleados(), mundo.getEmpleados());
							persistencia.guardarArchivo(mundo.getEmpleados());
						}

					} else {

						JOptionPane.showMessageDialog(null, "Se cancelo la eliminacion del empleado");
					}

				} else {

					JOptionPane.showMessageDialog(null, "No existe el empleado a eliminar");

				}
			} else {

				JOptionPane.showMessageDialog(null, "Debe selecionar una cedula");
			}

			ventanaLista.setVisible(true);

		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaLista.getPanelLista().BUSCAR_PRIN)) {

			if (!ventanaLista.getPanelLista().getSeleccion().getText().trim().isEmpty()) {

				Personal persona = mundo
						.buscarPersona(Long.parseLong(ventanaLista.getPanelLista().getSeleccion().getText().trim()));

				if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Comision")) {

					PersonalComision personal = (PersonalComision) persona;

					ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
					ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
					ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
					ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
					ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
					ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
					ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getClientes()));
					ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
					ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
					ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
					ventanaBuscar.getPanelBuscar().getLblVariable().setText("Clientes:");
					ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Añadir cliente");

				} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Junior")) {

					IngenieroJunior personal = (IngenieroJunior) persona;

					ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
					ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
					ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
					ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
					ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
					ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
					ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getNivel()));
					ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
					ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
					ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
					ventanaBuscar.getPanelBuscar().getLblVariable().setText("Nivel:");
					ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Subir nivel");
				} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Senior")) {

					IngenieroSenior personal = (IngenieroSenior) persona;

					ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
					ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
					ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
					ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
					ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
					ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
					ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getVentas()));
					ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
					ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
					ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
					ventanaBuscar.getPanelBuscar().getLblVariable().setText("Ventas:");
					ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Añadir venta");
				}

				ventanaLista.setVisible(false);
				ventanaLista.dispose();
				ventanaBuscar.setVisible(true);

			} else {

				JOptionPane.showMessageDialog(null, "Debe selecionar una cedula");
			}
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaBuscar.getPanelBuscar().INCREMENTAR)) {

			String respuesta = mundo.incrementarDatosVarios(
					Long.parseLong(String.valueOf(ventanaBuscar.getPanelBuscar().getCedulaBuscar().getText().trim())));
			persistencia.guardarArchivo(mundo.getEmpleados());
			ventanaBuscar.setVisible(false);
			Personal persona = mundo.buscarPersona(
					Long.parseLong(String.valueOf(ventanaBuscar.getPanelBuscar().getCedulaBuscar().getText().trim())));

			if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Comision")) {

				PersonalComision personal = (PersonalComision) persona;

				ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
				ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
				ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
				ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
				ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
				ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
				ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getClientes()));
				ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
				ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
				ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
				ventanaBuscar.getPanelBuscar().getLblVariable().setText("Clientes:");
				ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Añadir cliente");

			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Junior")) {

				IngenieroJunior personal = (IngenieroJunior) persona;

				ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
				ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
				ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
				ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
				ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
				ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
				ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getNivel()));
				ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
				ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
				ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
				ventanaBuscar.getPanelBuscar().getLblVariable().setText("Nivel:");
				ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Subir nivel");
			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Senior")) {

				IngenieroSenior personal = (IngenieroSenior) persona;

				ventanaBuscar.getPanelBuscar().getNombreBuscar().setText(String.valueOf(personal.getNombre()));
				ventanaBuscar.getPanelBuscar().getCedulaBuscar().setText(String.valueOf(personal.getCedula()));
				ventanaBuscar.getPanelBuscar().getApellidoBuscar().setText(personal.getApellido());
				ventanaBuscar.getPanelBuscar().getTelefonoBuscar().setText(String.valueOf(personal.getTelefono()));
				ventanaBuscar.getPanelBuscar().getCorreoBuscar().setText(personal.getCorreo());
				ventanaBuscar.getPanelBuscar().getDireccionBuscar().setText(personal.getDireccion());
				ventanaBuscar.getPanelBuscar().getVariable().setText(String.valueOf(personal.getVentas()));
				ventanaBuscar.getPanelBuscar().getGenero().setText(personal.getGenero());
				ventanaBuscar.getPanelBuscar().getFechaingreso().setText(personal.getAnoIngreso());
				ventanaBuscar.getPanelBuscar().getSalarioBuscar().setText(String.valueOf(personal.getSalario()));
				ventanaBuscar.getPanelBuscar().getLblVariable().setText("Ventas:");
				ventanaBuscar.getPanelBuscar().getBotonIncrementar().setText("Añadir venta");
			}

			JOptionPane.showMessageDialog(null, respuesta);
			ventanaBuscar.setVisible(true);
		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaBuscar.getPanelBuscar().VOLVER_BUSCAR)) {
			ventanaLista.getPanelLista().getSeleccion().setText("");
			ventanaLista.getPanelLista().getDtm().setRowCount(0);
			actutabla(ventanaLista.getPanelLista().getDtm(), ventanaLista.getPanelLista().getListaEmpleados(),
					mundo.getEmpleados());

			ventanaBuscar.setVisible(false);
			ventanaBuscar.dispose();
			ventanaLista.setVisible(true);

		}

		if (Command.getActionCommand().equalsIgnoreCase(ventanaLista.getPanelLista().ACTUALIZAR)) {
			if (!ventanaLista.getPanelLista().getSeleccion().getText().trim().isEmpty()) {
				ventanaLista.setVisible(false);

				ventanaActualizarCheck.setVisible(true);

			} else {

				JOptionPane.showMessageDialog(null, "Debe selecionar una cedula");
			}
		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaActualizarCheck.getPanelActualizarCheck().VOLVER_CHECK)) {

			ventanaLista.setVisible(true);
			ventanaActualizarCheck.setVisible(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().setSelected(false);

		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaActualizarCheck.getPanelActualizarCheck().CONTINUAR_CHECK)) {

			ventanaActualizarCheck.setVisible(false);
			String cedula = ventanaLista.getPanelLista().getSeleccion().getText().trim();

			Personal persona = mundo.buscarPersona(Long.parseLong(cedula));

			if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Comision")) {

				PersonalComision personal = (PersonalComision) persona;
				ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(true);
				ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCedulaTxt().setText(cedula);
				if (ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setText("");

				} else {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt()
							.setText(personal.getNombre());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(true);

				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setText(personal.getApellido());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setSelectedIndex(0);
					ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(true);

				} else {

					String telefono = String.valueOf(personal.getTelefono());

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setSelectedItem(telefono.charAt(0) + telefono.charAt(1) + telefono.charAt(2));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setText(String.valueOf(telefono.charAt(3)) + String.valueOf(telefono.charAt(4))
									+ String.valueOf(telefono.charAt(5)) + telefono.charAt(6) + telefono.charAt(7)
									+ telefono.charAt(8) + telefono.charAt(9));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setForeground(Color.BLACK);

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setForeground(Color.BLACK);

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().isSelected()) {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(true);
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt()
							.setText(personal.getCorreo());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setForeground(Color.BLACK);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(true);

				} else {

					if (persona.getGenero().equalsIgnoreCase("Mujer")) {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
					} else {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
					}

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(true);
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setDate(new Date());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(false);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setText("");

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(true);
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setText(personal.getDireccion());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setForeground(Color.BLACK);

				}

			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Junior")) {

				IngenieroJunior personal = (IngenieroJunior) persona;

				ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCedulaTxt().setText(cedula);
				if (ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(true);

				} else {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt()
							.setText(personal.getNombre());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(true);

				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setText(personal.getApellido());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setSelectedIndex(0);
					ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(true);

				} else {

					String telefono = String.valueOf(personal.getTelefono());

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setSelectedItem(telefono.charAt(0) + telefono.charAt(1) + telefono.charAt(2));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setText(String.valueOf(telefono.charAt(3)) + String.valueOf(telefono.charAt(4))
									+ String.valueOf(telefono.charAt(5)) + telefono.charAt(6) + telefono.charAt(7)
									+ telefono.charAt(8) + telefono.charAt(9));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setForeground(Color.BLACK);

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setForeground(Color.BLACK);

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().isSelected()) {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(true);

				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt()
							.setText(personal.getCorreo());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setForeground(Color.BLACK);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(true);
				} else {

					if (persona.getGenero().equalsIgnoreCase("Mujer")) {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
					} else {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
					}

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().isSelected()) {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(true);

				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setDate(new Date());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(false);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setText("");
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setText(personal.getDireccion());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setForeground(Color.BLACK);

				}

			} else if (persona.getTipoIngeniero().equalsIgnoreCase("Ingeniero Senior")) {

				IngenieroSenior personal = (IngenieroSenior) persona;

				ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCedulaTxt().setText(cedula);
				if (ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setText("");

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(true);

				} else {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt()
							.setText(personal.getNombre());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(true);

				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setText(personal.getApellido());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()
							.setForeground(Color.BLACK);

				}
				if (ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setSelectedIndex(0);
					ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setText("");
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(true);

				} else {

					String telefono = String.valueOf(personal.getTelefono());

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setSelectedItem(telefono.charAt(0) + telefono.charAt(1) + telefono.charAt(2));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setText(String.valueOf(telefono.charAt(3)) + String.valueOf(telefono.charAt(4))
									+ String.valueOf(telefono.charAt(5)) + telefono.charAt(6) + telefono.charAt(7)
									+ telefono.charAt(8) + telefono.charAt(9));
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().setEnabled(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono()
							.setForeground(Color.BLACK);

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()
							.setForeground(Color.BLACK);

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().isSelected()) {
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setText("");

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(true);
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt()
							.setText(personal.getCorreo());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().setForeground(Color.BLACK);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(true);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(true);
			
				} else {

					if (persona.getGenero().equalsIgnoreCase("Mujer")) {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
					} else {

						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setSelected(true);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().setEnabled(false);
						ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnMujer().setEnabled(false);
					}

				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(true);
					
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setDate(new Date());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().setEnabled(false);
				}

				if (ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().isSelected()) {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setText("");

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(true);
				} else {

					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setText(personal.getDireccion());
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().setEditable(false);
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt()
							.setForeground(Color.BLACK);

				}

			}

			ventanaActualizarPrincipal.setVisible(true);

		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaActualizarPrincipal.getPanelActualizarPrincipal().ACTUALIZAR)) {

			String cedula = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCedulaTxt().getText().trim();
			String nombre = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt().getText().trim();
			String apellido = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt().getText()
					.trim();
			String prefijo = String.valueOf(
					ventanaActualizarPrincipal.getPanelActualizarPrincipal().getPrefijoTelefono().getSelectedItem());
			String telefono = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt().getText()
					.trim();
			String correo = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getCorreoTxt().getText().trim();
			String direccion = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getDireccionTxt().getText()
					.trim();
			String genero = "";

			if (ventanaActualizarPrincipal.getPanelActualizarPrincipal().getRbtnHombre().isSelected()) {

				genero = "Hombre";
			} else {
				genero = "Mujer";
			}

			Object date = ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().getDate();
			String año_ingreso = "";
			Date actual = new Date();
			if (date != actual) {
				if (date != null) {

					String date2 = String.valueOf(
							ventanaActualizarPrincipal.getPanelActualizarPrincipal().getAñoIngresoTxt().getDate());

					String[] fechas = date2.split("\\s");

					int dia = Integer.parseInt(fechas[2]);
					int año = Integer.parseInt(fechas[5]);
					int mes = 0;

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
				} else {
					año_ingreso = "";
				}
			} else {
				Personal personal2 = mundo.buscarPersona(Long.parseLong(String.valueOf(cedula)));
				año_ingreso = personal2.getAnoIngreso();
			}
			if (!nombre.isEmpty()) {
				if (!apellido.isEmpty()) {

					if (!telefono.isEmpty()) {

						if (telefono.length() == 7) {

							if (!correo.isEmpty()) {

								if (!direccion.isEmpty()) {

									if (!año_ingreso.isEmpty()) {

										try {
											String respuesta = mundo.actualizarPersona(nombre, apellido, genero,
													Long.parseLong(String.valueOf(prefijo + telefono)), correo,
													direccion, año_ingreso, Long.parseLong(String.valueOf(cedula)));
											JOptionPane.showMessageDialog(null, respuesta);
											persistencia.guardarArchivo(mundo.getEmpleados());
											if (respuesta.equalsIgnoreCase("Se actualizo el personal")) {
												ventanaActualizarPrincipal.setVisible(false);

												ventanaActualizarPrincipal.setVisible(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().setSelected(false);
												ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().setSelected(false);

												ventanaLista.getPanelLista().getSeleccion().setText("");
												ventanaLista.getPanelLista().getDtm().setRowCount(0);
												actutabla(ventanaLista.getPanelLista().getDtm(), ventanaLista.getPanelLista().getListaEmpleados(),
														mundo.getEmpleados());
												ventanaActualizarPrincipal.dispose();

												ventanaLista.setVisible(true);

											}

										} catch (Exception e) {
											// TODO Auto-generated catch block
											JOptionPane.showMessageDialog(null, e.getMessage());
										}

									} else {
										JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de ingreso");

									}

								} else {
									JOptionPane.showMessageDialog(null, "Debe ingresar una direccion");

								}

							} else {
								JOptionPane.showMessageDialog(null, "Debe ingresar un correo");

							}

						} else {
							JOptionPane.showMessageDialog(null,
									"Debe ingresar 7 numeros en el complemento del telefono");

						}

					} else {
						JOptionPane.showMessageDialog(null, "Debe ingresar el complemento del telefono");

					}

				} else {
					JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");

				}

			} else {
				JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");

			}
		}

		if (Command.getActionCommand()
				.equalsIgnoreCase(ventanaActualizarPrincipal.getPanelActualizarPrincipal().VOLVER_ACTU)) {

			ventanaActualizarPrincipal.setVisible(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getNombreCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getApellidoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getTelefonoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getCorreoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getGeneroCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getAñoCheck().setSelected(false);
			ventanaActualizarCheck.getPanelActualizarCheck().getDireccionCheck().setSelected(false);

			ventanaLista.getPanelLista().getSeleccion().setText("");
			ventanaLista.getPanelLista().getDtm().setRowCount(0);
			actutabla(ventanaLista.getPanelLista().getDtm(), ventanaLista.getPanelLista().getListaEmpleados(),
					mundo.getEmpleados());
			ventanaActualizarPrincipal.dispose();
			ventanaLista.setVisible(true);

		}
		
		if(Command.getActionCommand().equalsIgnoreCase(ventanaLista.getPanelLista().VOLVER_LISTA)) {
			
			ventanaLista.setVisible(false);
			ventanaLista.dispose();
			ventanaPrincipal.setVisible(true);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int selecion = ventanaLista.getPanelLista().getListaEmpleados().rowAtPoint(e.getPoint());

		ventanaLista.getPanelLista().getSeleccion()
				.setText(String.valueOf(ventanaLista.getPanelLista().getListaEmpleados().getValueAt(selecion, 0)));

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
		char letra = e.getKeyChar();

		if (e.getSource() == ventanaComision.getPanelregistrarComision().getNombreComision()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}

		}
		if (e.getSource() == ventanaComision.getPanelregistrarComision().getApellidoComision()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}

		}

		if (e.getSource() == ventanaComision.getPanelregistrarComision().getTelefonoComision()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}
		if (e.getSource() == ventanaComision.getPanelregistrarComision().getCedulaComision()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}

		if (e.getSource() == ventanaSenior.getPanelregistrarSenior().getNombreSenior()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}

		if (e.getSource() == ventanaSenior.getPanelregistrarSenior().getApellidoSenior()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}

		if (e.getSource() == ventanaSenior.getPanelregistrarSenior().getTelefonoSenior()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}

		if (e.getSource() == ventanaSenior.getPanelregistrarSenior().getCedulaSenior()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}

		if (e.getSource() == ventanaJunior.getPanelregistrarJunior().getNombreJunior()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}

		if (e.getSource() == ventanaJunior.getPanelregistrarJunior().getApellidoJunior()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}

		if (e.getSource() == ventanaJunior.getPanelregistrarJunior().getTelefonoJunior()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}

		if (e.getSource() == ventanaJunior.getPanelregistrarJunior().getCedulaJunior()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}
		
		if (e.getSource() == ventanaActualizarPrincipal.getPanelActualizarPrincipal().getTelefonoTxt()) {

			if (letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {

				e.consume();

			}

		}
		
		if (e.getSource() == ventanaActualizarPrincipal.getPanelActualizarPrincipal().getNombreTxt()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}
		
		if (e.getSource() == ventanaActualizarPrincipal.getPanelActualizarPrincipal().getApellidoTxt()) {

			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {

				e.consume();

			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void actutabla(DefaultTableModel dtm, JTable f, ArrayList<Personal> personitas) {
		dtm.setRowCount(0);
		RegTabla(dtm, f, personitas);
	}

	public void RegTabla(DefaultTableModel dtm, JTable f, ArrayList<Personal> personas) {

		int i = 0;
		String[] filas = new String[13];
		String tipoInge = "";
		for (int j = 0; j < personas.size(); j++) {
			try {

				tipoInge = personas.get(j).getTipoIngeniero();

				if (tipoInge.equalsIgnoreCase("Ingeniero Comision")) {
					PersonalComision personaC = (PersonalComision) personas.get(j);
					filas[0] = String.valueOf(personaC.getCedula());
					filas[1] = personaC.getNombre();
					filas[2] = personaC.getApellido();
					filas[3] = personaC.getGenero();
					filas[4] = String.valueOf(personaC.getTelefono());
					filas[5] = personaC.getCorreo();
					filas[6] = personaC.getDireccion();
					filas[7] = "Comision";
					filas[8] = personaC.getAnoIngreso();
					filas[9] = String.valueOf(personaC.getSalario());
					filas[10] = String.valueOf(personaC.getClientes());
					filas[11] = "No aplica";
					filas[12] = "No aplica";

					dtm.addRow(filas);
				}

				if (tipoInge.equalsIgnoreCase("Ingeniero Junior")) {

					IngenieroJunior personaJ = (IngenieroJunior) personas.get(j);
					filas[0] = String.valueOf(personaJ.getCedula());
					filas[1] = personaJ.getNombre();
					filas[2] = personaJ.getApellido();
					filas[3] = personaJ.getGenero();
					filas[4] = String.valueOf(personaJ.getTelefono());
					filas[5] = personaJ.getCorreo();
					filas[6] = personaJ.getDireccion();
					filas[7] = "Junior";
					filas[8] = personaJ.getAnoIngreso();
					filas[9] = String.valueOf(personaJ.getSalario());
					filas[10] = "No aplica";
					filas[11] = "No aplica";
					filas[12] = String.valueOf(personaJ.getNivel());

					dtm.addRow(filas);
				}
				if (tipoInge.equalsIgnoreCase("Ingeniero Senior")) {

					IngenieroSenior personaS = (IngenieroSenior) personas.get(j);
					filas[0] = String.valueOf(personaS.getCedula());
					filas[1] = personaS.getNombre();
					filas[2] = personaS.getApellido();
					filas[3] = personaS.getGenero();
					filas[4] = String.valueOf(personaS.getTelefono());
					filas[5] = personaS.getCorreo();
					filas[6] = personaS.getDireccion();
					filas[7] = "Senior";
					filas[8] = personaS.getAnoIngreso();
					filas[9] = String.valueOf(personaS.getSalario());
					filas[10] = "No aplica";
					filas[11] = String.valueOf(personaS.getVentas());
					filas[12] = "No aplica";

					dtm.addRow(filas);
				}

			} catch (Exception e) {
			}

		}
		f.setModel(dtm);
	}

}
