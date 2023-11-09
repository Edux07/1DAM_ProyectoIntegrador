package controlador;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JFrame;

import modelo.*;
import vista.*;

public class Controlador {

	private _00_Login miLogin;
	private _02_Hoyos miBienvenida;
	private Vistas ventanaActiva;

	private Modelo miModelo;
	private Vistas[] misVistas;

	public void setVista(Vistas[] misVistas) {
		this.misVistas = misVistas;
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void cambiarVentana(int i, int j) {
		((JFrame) misVistas[i]).setVisible(false);
		((JFrame) misVistas[j]).setVisible(true);
	}

	public void cambiarLogin() {
		misVistas[0].setVisible(false);
		misVistas[2].setVisible(true);
		ventanaActiva = misVistas[0];
	}

	public void cambiarBienvenida() {
		misVistas[2].setVisible(false);
		misVistas[0].setVisible(true);
		ventanaActiva = misVistas[2];
	}

	public void setLogin(_00_Login login) {
		this.miLogin = login;
	}

	public void setBienvenida(_02_Hoyos bienvenida) {
		this.miBienvenida = bienvenida;
	}

	public void setVentanaActiva(Vistas vista) {
		this.ventanaActiva = vista;
	}

	public void login() {
		Vistas aux = misVistas[0];
		String usr = aux.getUsr();
		String pwd = aux.getPwd();
		String sgbd = aux.getSGBD();
		miModelo.conectar(sgbd);
//		miModelo.login(usr, pwd);
		String prueba = miModelo.loginSeguro(usr, pwd);
		aux.actualizar(prueba);
	}

	public void registro(String usr, String pwd, String rol) {
		try {
			miModelo.OperacionesInsert(usr, pwd, rol);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void OperacionesDelete(String usr) {
 		miModelo.OperacionesDelete(usr);

 	}

//insertado de hoyos
	public void insertarHoyos(String firmeza_de_green, String humedad, String altura_de_siega, String bote,
			String velocidad, String color, java.util.Date date, String temperatura, String volumen_siega, int hoyo)
			throws SQLException {
		miModelo.OperacionesInsertHoyos(firmeza_de_green, humedad, altura_de_siega, bote, velocidad, color, date,
				temperatura, volumen_siega, hoyo);

	}

}
