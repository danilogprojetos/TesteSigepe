package com.banco.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.text.StyleContext.SmallAttributeSet;

import org.python.antlr.base.stmt;

import java.sql.Statement;

public class Acesso {

	public boolean acesso;

	Connection conexao = null;

	Statement consulta = null;

	ResultSet tabela = null;

}