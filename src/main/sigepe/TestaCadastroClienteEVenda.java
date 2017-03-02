package main.sigepe;

import java.sql.SQLException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;

import com.banco.dao.Acesso;

import cadastros.sigepe.CadastroCliente;
import comercial.sigepe.Venda;
import consulta.banco.ConsultaCliente;
import consulta.banco.ConsultaVenda;

public class TestaCadastroClienteEVenda {

	public static void main(String[] args) throws FindFailed, ClassNotFoundException, SQLException {

		CadastroCliente c = new CadastroCliente();
		Venda d = new Venda();
		

		c.CadCli();
		d.PedSai();
		

	}

}
