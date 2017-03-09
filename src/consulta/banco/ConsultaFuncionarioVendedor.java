package consulta.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaFuncionarioVendedor {
	
	public void ConsulFunVen() throws ClassNotFoundException, SQLException {

	String url = "jdbc:postgresql://localhost:5432/teste_viverde";
	String usuario = "postgres";
	String senha = "1";

	Class.forName("org.postgresql.Driver");

	Connection co;

	co = DriverManager.getConnection(url, usuario, senha);

	System.out.println("Conexão realizada com sucesso.");

	Statement stm = co.createStatement();

	stm = co.createStatement();
	ResultSet rs = stm.executeQuery("SELECT * FROM Cliente ORDER BY cod DESC LIMIT 1");

	while(rs.next())
	{
		int Cod = rs.getInt("Cod");
		String ven = rs.getString("ven");
		String rua = rs.getString("rua");
		String Bai = rs.getString("Bai");
		int CodCid = rs.getInt("CodCid");
		String Cep = rs.getString("Cep");
		String Fon = rs.getString("Fon");
		String Fax = rs.getString("Fax");
		Short cel = rs.getShort("cel");
		String Cgc = rs.getString("Cgc");
		String Ins = rs.getString("Ins");
		String email = rs.getString("email");
		Double porcom = rs.getDouble("porcom");
		int CodFor = rs.getInt("CodFor");
		String obs = rs.getString("CodFor");
		Double saliniext = rs.getDouble("");
		
		int codTipCliFat = rs.getInt("codTipCliFat");
		String CodCFO = rs.getString("CodCFO");
		int CodGui = rs.getInt("CodGui");
		String NumFicGui = rs.getString("NumFicGui");

		
		
		
		System.out.println("");
		System.out.println("CADASTRO DO CLIENTE COD: " + Cod + "  Nome Fantasia:  " + Fan);
		System.out.println("");
		System.out.println("Cod = " + Cod);
		System.out.println("Fan = " + Fan);
		System.out.println("Raz = " + Raz);
		System.out.println("End = " + Endereco);
		System.out.println("Bai = " + Bai);
		System.out.println("CodCid = " + CodCid);
		System.out.println("Cep = " + Cep);
		System.out.println("Fon = " + Fon);
		System.out.println("Fax = " + Fax);
		System.out.println("Pes = " + Pes);
		System.out.println("Cgc = " + Cgc);
		System.out.println("Ins = " + Ins);
		System.out.println("DatCad = " + DatCad);
		System.out.println("con = " + con);
		System.out.println(" email= " + email);
		System.out.println("ativo = " + ativo);
		System.out.println("PodGerRem = " + PodGerRem);
		System.out.println("codTipCliFat = " + codTipCliFat);
		System.out.println("CodCFO = " + CodCFO);
		System.out.println("CodGui = " + CodGui);
		System.out.println("NumFicGui = " + NumFicGui);

		System.out.println();

		}
	}
}

