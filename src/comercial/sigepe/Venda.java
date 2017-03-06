package comercial.sigepe;

import java.sql.SQLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

import consulta.banco.ConsultaVenda;

public class Venda {

	private static final String Key_H = null;

	public void PedSai() throws FindFailed, ClassNotFoundException, SQLException {

		Screen executa = new Screen();

		executa.wait("//TIFIRE-SUPORTE0/imagens/TelaInicial.png", 10);
		executa.click("//TIFIRE-SUPORTE0/imagens/Comercial.png");
		executa.click("//TIFIRE-SUPORTE0/imagens/Vendas.png");
		executa.waitVanish("//TIFIRE-SUPORTE0/imagens/TelaVenda.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.type(Key_H, KeyModifier.CTRL);
		executa.wait("//TIFIRE-SUPORTE0/imagens/NovaVenda.png", 10);
		executa.type(Key.ENTER);
		executa.type("50316");
		executa.type(Key.ENTER);
		executa.type("50");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.wait("//TIFIRE-SUPORTE0/imagens/InserindoItens.png", 20);
		executa.type("2654");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.wait("//TIFIRE-SUPORTE0/imagens/InserindoItens.png", 10);
		executa.type(Key.ESC);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.wait("//TIFIRE-SUPORTE0/imagens/RecriarParcelas.png", 10);
		executa.type(Key.ENTER);
		executa.type("999");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);

		if (executa.exists("") != null) {
			System.out.println("Houve Algum Erro");
			return;
		} else {
			PedSai();
		}

	}

}
