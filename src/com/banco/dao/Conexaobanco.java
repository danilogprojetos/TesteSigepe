package com.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexaobanco {

	public void ConsultaCli() throws ClassNotFoundException, SQLException {

		String url = "jdbc:postgresql://localhost:5432/teste_viverde";
		String usuario = "postgres";
		String senha = "1";

		Class.forName("org.postgresql.Driver");

		Connection co;

		co = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Conexão realizada com sucesso.");

		Statement stm = co.createStatement();

		stm = co.createStatement();
		}

	public void BuscaCliente(){
		
		ResultSet rs = stm.executeQuery("SELECT * FROM Cliente ORDER BY cod DESC LIMIT 1");
		
	}
		
}

