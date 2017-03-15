package main.sigepe;

import java.sql.SQLException;

import org.sikuli.script.FindFailed;



import cadastros.sigepe.CadastroCliente;
import cadastros.sigepe.CadastroFornecedor;
import cadastros.sigepe.CadastroFuncionarioVendedor;
import comercial.sigepe.Venda;
import consulta.banco.ConsultaCliente;

public class Main {

	public static void main(String[] args) throws FindFailed, ClassNotFoundException, SQLException {

		CadastroCliente c = new CadastroCliente();
		Venda d = new Venda();
		CadastroFornecedor cad = new CadastroFornecedor();
		ConsultaCliente con = new ConsultaCliente();
		CadastroFuncionarioVendedor a = new CadastroFuncionarioVendedor();

		//cad.CadFor();
		// c.CadCli();
		// d.PedSai();
		  // a.CadVendedor();
	}

}
