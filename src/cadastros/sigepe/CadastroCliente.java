package cadastros.sigepe;


import java.sql.SQLException;


import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;



public class CadastroCliente {

	public void CadCli() throws FindFailed, ClassNotFoundException, SQLException {

		Screen executa = new Screen();

		executa.click("//TIFIRE-SUPORTE0/imagens/TelaInicialMenuCadastro.png");
		executa.wait("//TIFIRE-SUPORTE0//imagens/CadastroCliente.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Danilo Augusto");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("87030140");
		executa.type(Key.ENTER);
		executa.paste("Avenida Tiradentes");
		executa.type(Key.ENTER);
		executa.type("441");
		executa.type(Key.ENTER);
		executa.paste("Proximo a Sanepar");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("3023-7230");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.paste("contato@tifire.com");
		executa.type(Key.ENTER);
		executa.type("09805631940");
		executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.type(Key.F4, KeyModifier.ALT);
		executa.wait("//TIFIRE-SUPORTE0/imagens/TelaInicial.png", 5);

		}

	}

	
	
