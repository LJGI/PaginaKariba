package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionManager;





public class DbManager {

	
	private static Connection conn = ConnectionManager.getInstance().getConnection();
	public static void Select() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT Imagen FROM modelos WHERE Nombre = 'Vestido rojo'");
		while (rs.next()) {
			  String Imagen = rs.getString("Imagen");
			  System.out.println(Imagen + "\n");
			}
		ConnectionManager.getInstance().close();		
	}
}
