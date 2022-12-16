package mysql_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao{
	
	public static Connection main(String[] args) {
			Connection conn = null;
			
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","MySQL@2022");
				System.out.println("Conectado com sucessor");
				
			} catch (SQLException error) {
				System.out.println("Erro ao conectar");
			}
		return conn;
	}
}