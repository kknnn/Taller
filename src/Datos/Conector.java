package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {
	protected Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	protected ResultSet rsAux = null;
	private final String driver = "com.mysql.jdbc.Driver"; //Final significa que no va a ser modificada en tiempo de ejecución.
	private final String user = "root";
	private final String pass = "root";
	//private final String pass = "Pijudoviejo1";
	private final String url = "jdbc:mysql://localhost:3306/taller?autoReconnect=true&useSSL=false";
	//private final String url = "jdbc:mysql://localhost:3306/carrito_compras_java";
	
	//Instanciamos y obtenemos la conexión a la base de datos.
	public Connection abrirConexion() throws Exception {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			
		} catch (Exception e) {
			
			throw new Exception("Problema al conectar con la base de datos");
		}
		return conn;
	}
	
	//Cerramos la conexión de la base de datos y ponemos todo en null.
	public void cerrarConexion() {
		try {
			conn.close();
			stmt = null;
			pstmt = null;
			rs = null;
			rsAux = null;
			conn = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
