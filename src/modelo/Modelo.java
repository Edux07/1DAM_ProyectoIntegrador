package modelo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import vista.*;

public class Modelo {
	private Vistas[] misVistas;
	private Tablas[] misTablas; // array de tablas
	private String sqlTabla1;
	private String sqlTabla2;
	private String sqlTabla3;
	private String sqlTabla4;
	private String sqlTabla5;
	private _00_Login miVista;
	private String bd;
	private String login;
	private String pwd;
	private String url;
	private String driver;
	private Connection conexion;
	PreparedStatement pstmt;
	private String resultado;
	private int fallos;
	private DefaultTableModel miTabla;
	private DefaultTableModel miTabla2;

	public void conectar(String sgbd) {
		try {
			configuraMySQL();
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, login, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void configuraMySQL() {
		bd = "pi";
		login = "root";
		pwd = "";
		url = "jdbc:mysql://localhost/" + bd
				+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		driver = "com.mysql.cj.jdbc.Driver";

		// cargar las tablas de base de datos
		sqlTabla1 = "Select * from registro";
		sqlTabla2 = "select * from users";
		sqlTabla3 = "select * from green";
		sqlTabla4 = "select * from unidades"; // falta en base de datos
		sqlTabla5 = "select * from ";
	}

//	private void configuraOracle() {
//		bd = "PEDRO";
//		login = "SYSTEM";
//		pwd = "root";
//		url = "jdbc:oracle:thin:@localhost:1521:XE";
//		driver = "oracle.jdbc.driver.OracleDriver";
//	}

	public void setVistas(Vistas[] misVistas) {
		this.misVistas = misVistas;
	}

	public void login(String usr, String pwd) {
		// SQL Inyection: ' or '1'='1
		String query = "SELECT * FROM " + bd + ".users WHERE usr='" + usr + "' AND pwd='" + pwd + "'";
		System.out.println(query);
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			if (rset.next()) {
				resultado = "Correcto";
				fallos = 0;
			} else {
				fallos++;
				if (fallos == 3) {
					resultado = "Cerrar";
				} else
					resultado = "Incorrecto";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String loginSeguro(String usr, String pwd) {
		String query = "SELECT * FROM " + bd + ".users WHERE usr=? AND pwd=?";
		String nom1;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(query);
			pstmt.setString(1, usr);
			pstmt.setString(2, pwd);
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()) {
				resultado = "Correcto";
				fallos = 0;
				return resultado;
			} else {
				fallos++;
				if (fallos == 3) {
					resultado = "Cerrar";
				} else
					resultado = "Incorrecto";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		miVista.actualizar();
		return "incorrecto";
	}

	public void OperacionesInsert(String usr, String pwd, String rol) throws SQLException {
		this.pstmt = conexion.prepareStatement("INSERT INTO `users` (`USR`, `PWD`, `ROL`) VALUES (?,?,?)");
		pstmt.setString(1, usr);
		pstmt.setString(2, pwd);
		pstmt.setString(3, rol);
		this.pstmt.executeUpdate();

	}

//tabla de registro
	private void cargarTablaRegistro() {
		int numColumnas = getNumColumnas(sqlTabla1);
		int numFilas = getNumFilas(sqlTabla1);
		String[] cabecera = new String[numColumnas];
		Object[][] contenido = new Object[numFilas][numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTabla1);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				cabecera[i] = rsmd.getColumnName(i + 1);
			}
			int fila = 0;
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[fila][col - 1] = rset.getString(col);
				}
				fila++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		miTabla = new DefaultTableModel(contenido, cabecera);
	}

	private void cargarTablaRegistro2(String fecha) {
		int numColumnas = getNumColumnas(fecha);
		int numFilas = getNumFilas(fecha);
		String[] cabecera = new String[numColumnas];
		Object[][] contenido = new Object[numFilas][numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(fecha);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				cabecera[i] = rsmd.getColumnName(i + 1);
			}
			int fila = 0;
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[fila][col - 1] = rset.getString(col);
				}
				fila++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		miTabla = new DefaultTableModel(contenido, cabecera);
	}

	private int getNumFilas(String sqlTabla1) {
		int numFilas = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sqlTabla1);
			ResultSet rset = pstmt.executeQuery();
			while (rset.next())
				numFilas++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numFilas;
	}

	private int getNumColumnas(String sqlTabla1) {
		int numColum = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sqlTabla1);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			numColum = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numColum;
	}

	public DefaultTableModel getTabla() {
		cargarTablaRegistro();
		return miTabla;
	}
//*tabla de registros

//tabla de users

	private void cargarTablaUsers() {
		int numColumnas = getNumColumnas(sqlTabla2);
		int numFilas = getNumFilas(sqlTabla2);
		String[] cabecera = new String[numColumnas];
		Object[][] contenido = new Object[numFilas][numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTabla2);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				cabecera[i] = rsmd.getColumnName(i + 1);
			}
			int fila = 0;
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[fila][col - 1] = rset.getString(col);
				}
				fila++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		miTabla2 = new DefaultTableModel(contenido, cabecera);
	}

	private int getNumFilas2(String sqlTabla2) {
		int numFilas = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sqlTabla2);
			ResultSet rset = pstmt.executeQuery();
			while (rset.next())
				numFilas++;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numFilas;
	}

	private int getNumColumnas2(String sqlTabla2) {
		int numColum = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sqlTabla2);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			numColum = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numColum;
	}

	public DefaultTableModel getTabla2() {
		cargarTablaUsers();
		return miTabla2;
	}

//*tabla de users

	public String getResultado() {
		return this.resultado;
	}

//TODO insertado
//	de hoyos

	public void OperacionesInsertHoyos(String firmeza_de_green, String humedad, String altura_de_siega, String bote,
			String velocidad, String color, Date date, String temperatura, String volumen_siega, int hoyo)
			throws SQLException {
		this.pstmt = conexion.prepareStatement(
				"INSERT INTO `registro`(`firmeza_de_green`, `humedad`, `altura_de_siega`, `bote`, `velocidad`, `color`, `fecha`, `temperatura`, `volumen_siega`, `numero_hoyo`) VALUES (?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1, firmeza_de_green);
		pstmt.setString(2, humedad);
		pstmt.setString(3, altura_de_siega);
		pstmt.setString(4, bote);
		pstmt.setString(5, velocidad);
		pstmt.setString(6, color);
		pstmt.setDate(7, (java.sql.Date) date);
		pstmt.setString(8, temperatura);
		pstmt.setString(9, volumen_siega);
		pstmt.setInt(10, hoyo);
		this.pstmt.executeUpdate();

	}

	public void OperacionesDelete(String usr) {
		try {
			PreparedStatement pstmt = conexion.prepareStatement("DELETE FROM " + bd + ".users WHERE usr = ?");
			pstmt.setString(1, usr);

			int filasBorradas = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al eliminar el registro: " + e.getMessage());
		}
	}

	protected void cargarTablas(String tabla) {
		int numColumnas = getNumColumnas(tabla);
		int numFilas = getNumFilas(tabla);

		String[] cabecera = new String[numColumnas];

		Object[][] contenido = new Object[numFilas][numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(getSelect(tabla));
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				cabecera[i] = rsmd.getColumnName(i + 1);
			}
			int fila = 0;
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[fila][col - 1] = rset.getString(col);
				}
				fila++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DefaultTableModel a = new DefaultTableModel(contenido, cabecera);
		this.miTabla = new DefaultTableModel(contenido, cabecera);
	}

	private String getSelect(String tabla) {
		return "SELECT * FROM " + tabla;
	}

	public DefaultTableModel getTablaFecha(String fechadesde, String fechahasta) {
		cargarTablaRegistro2(selectFecha(fechahasta, fechadesde));
		return miTabla;
	}

	private String selectFecha(String fechadesde, String fechahasta) {
		String fecha = "registro WHERE fecha > " + fechadesde + " AND fecha < " + fechahasta;
		return "select * from " +fecha;
	}
	

}