package com.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexaobanco {

	
	private static final String USERNAME = "postgres";

	
	private static final String PASSWORD = "1";

	
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/teste_viverde";


	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("org.postgresql.Driver"); 

	
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {

		
		Connection con = createConnectionToMySQL();

		
		if (con != null) {
			System.out.println("Conexão obtida com sucesso!" + con);
			con.close();
		}

	}
}
