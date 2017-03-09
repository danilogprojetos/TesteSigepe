package consulta.banco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import javax.xml.crypto.Data;

import com.banco.dao.Conexaobanco;

public class ConsultaVenda extends Conexaobanco {

	public void ConsultaPedSai() throws ClassNotFoundException, SQLException {

		String url = "jdbc:postgresql://localhost:5432/teste_viverde";
		String usuario = "postgres";
		String senha = "1";

		Class.forName("org.postgresql.Driver");

		Connection co;

		co = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Conexão realizada com sucesso.");

		Statement stm = co.createStatement();

		stm = co.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM PedSai ORDER BY cod DESC LIMIT 1");

		while (rs.next()) {
			int Cod = rs.getInt("Cod");
			Date Dat = rs.getDate("Dat");
			String Hor = rs.getString("Hor");
			String rom = rs.getString("rom");
			int CodVen = rs.getInt("CodVen");
			int Codcli = rs.getInt("Codcli");
			int CodCat = rs.getInt("CodCat");
			Double valbru = rs.getDouble("valbru");
			Double pordesata = rs.getDouble("pordesata");
			Double pordesvis = rs.getDouble("pordesvis");
			Double porjurpra = rs.getDouble("porjurpra");
			Double valdes = rs.getDouble("valdes");
			Double valdestro = rs.getDouble("valdestro");
			Double valjur = rs.getDouble("valjur");
			Double valliq = rs.getDouble("valliq");
			Double valcom = rs.getDouble("valcom");
			Double valdesadi = rs.getDouble("valdesadi");
			Double valimp = rs.getDouble("valimp");
			int CodCom = rs.getInt("CodCom");
			int NotFisImp = rs.getInt("NotFisImp");
			int ConRec = rs.getInt("ConRec");
			int Bai = rs.getInt("Bai");
			String obs = rs.getString("obs");
			Double indcom = rs.getDouble("indcom");
			String nummes = rs.getString("nummes");
			int mesabe = rs.getInt("mesabe");
			String codcfo = rs.getString("codcfo");
			String DatPreFat = rs.getString("DatPreFat");
			String DatRec = rs.getString("DatRec");
			int CodDig = rs.getInt("CodDig");
			int CodCon = rs.getInt("CodCon");
			int CodForPag = rs.getInt("CodForPag");
			int CodTroDev = rs.getInt("CodTroDev");
			Double porcom = rs.getDouble("porcom");
			String ordent = rs.getString("ordent");
			int codped = rs.getInt("codped");
			int CodPedSaiRec = rs.getInt("CodPedSaiRec");
			int CodGui = rs.getInt("CodGui");
			String numficgui = rs.getString("numficgui");
			int comguipag = rs.getInt("comguipag");
			Double porcomgui = rs.getDouble("porcomgui");
			String DatPagComGui = rs.getString("DatPagComGui");

			System.out.println("");
			System.out.println("");
			System.out.println("Cod = " + Cod);
			System.out.println("Dat = " + Dat);
			System.out.println("Hor = " + Hor);
			System.out.println("rom = " + rom);
			System.out.println("CodVen = " + CodVen);
			System.out.println("codcli = " + Codcli);
			System.out.println("CodCat = " + CodCat);
			System.out.println("valbru = " + valbru);
			System.out.println("pordesata = " + pordesata);
			System.out.println("pordesvis = " + pordesvis);
			System.out.println("porjurpra = " + porjurpra);
			System.out.println("valdes = " + valdes);
			System.out.println("valdestro = " + valdestro);
			System.out.println("valjur = " + valjur);
			System.out.println("valliq = " + valliq);
			System.out.println(" valcom= " + valcom);
			System.out.println("valdesadi = " + valdesadi);
			System.out.println("valimp = " + valimp);
			System.out.println("CodCom = " + CodCom);
			System.out.println("NotFisImp = " + NotFisImp);
			System.out.println("ConRec = " + ConRec);
			System.out.println("Bai = " + Bai);
			System.out.println("obs = " + obs);
			System.out.println("indcom = " + indcom);
			System.out.println("nummes = " + nummes);
			System.out.println("mesabe = " + mesabe);
			System.out.println("codcfo = " + codcfo);
			System.out.println("DatPreFat = " + DatPreFat);
			System.out.println("DatRec = " + DatRec);
			System.out.println("CodDig = " + CodDig);
			System.out.println("CodCon = " + CodCon);
			System.out.println("CodForPag = " + CodForPag);
			System.out.println("CodTroDev = " + CodTroDev);
			System.out.println("porcom = " + porcom);
			System.out.println("ordent = " + ordent);
			System.out.println("codped = " + codped);
			System.out.println("CodPedSaiRec = " + CodPedSaiRec);
			System.out.println("CodGui = " + CodGui);
			System.out.println("numficgui = " + numficgui);
			System.out.println("comguipag = " + comguipag);
			System.out.println("porcomgui = " + porcomgui);
			System.out.println("DatPagComGui = " + DatPagComGui);

			System.out.println();

		}

	}
}