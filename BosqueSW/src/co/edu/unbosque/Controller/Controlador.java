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
			String cedula = ventanaComision.getPanelregistrarComision().getCedulaComision().getText().trim();

			String genero = "";

			if (ventanaComision.getPanelregistrarComision().getRbtnHombre().isSelected()) {
				genero = "Hombre";
			} else {
				genero = "Mujer";
			}

			Object date = ventanaComision.getPanelregistrarComision().getChoser().getDate();
			String año_ingreso = "";
			
			if(date != null) {
				
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
			}else {
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
											String registro = mundo.registrarPersonal(nombre, apellido, genero,
													Long.parseLong(String.valueOf(prefijoTel + telefono)), correo,
													direccion, "Ingeniero Comision", año_ingreso,
													Long.parseLong(String.valueOf(cedula)),
													Double.parseDouble(String.valueOf(1100000)), clientes, salarios);
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
												ventanaComision.getPanelregistrarComision().getPrefijoTelefonoComision()
														.setSelectedIndex(0);
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
												ventanaComision.setVisible(true);
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
			
			if(date != null) {
				
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
			}else {
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
												String registro = mundo.registrarPersonal(nombre, apellido, genero,
														Long.parseLong(String.valueOf(prefijoTel+telefono)), correo, direccion, "Ingeniero Senior", año_ingreso,
														Long.parseLong(String.valueOf(cedula)), 3500000, ventas, null);
													
												if(registro.equalsIgnoreCase("Registrado, bienvenido a bosqueSW")) {
													
													ventanaSenior.setVisible(false);
													JOptionPane.showMessageDialog(null, registro);
													
													ventanaSenior.getPanelregistrarSenior().getNombreSenior().setText("");
													ventanaSenior.getPanelregistrarSenior().getApellidoSenior().setText("");
													ventanaSenior.getPanelregistrarSenior().getPrefijoTelefonoSenior().setSelectedIndex(0);
													ventanaSenior.getPanelregistrarSenior().getTelefonoSenior().setText("");
													ventanaSenior.getPanelregistrarSenior().getCorreoSenior().setText("");
													ventanaSenior.getPanelregistrarSenior().getDireccionSenior().setText("");
													ventanaSenior.getPanelregistrarSenior().getRbtnHombre().setSelected(true);
													ventanaSenior.getPanelregistrarSenior().getNumeroVentas().setValue(1);
													ventanaSenior.getPanelregistrarSenior().getCedulaSenior().setText("");
													ventanaSenior.setVisible(true);
												}else{
												
													ventanaSenior.setVisible(false);
													JOptionPane.showMessageDialog(null, registro);
													ventanaSenior.getPanelregistrarSenior().getCedulaSenior().setText("");
													ventanaSenior.setVisible(true);
													
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
		
		if(Command.getActionCommand().equalsIgnoreCase(ventanaSenior.getPanelregistrarSenior().VOLVER_SENIOR)){
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
