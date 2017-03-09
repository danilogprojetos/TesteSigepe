package cadastros.sigepe;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

public class CadastroFuncionarioVendedor {

	public void CadVendedor() throws FindFailed {

		Screen executa = new Screen();

		executa.click("//TIFIRE-SUPORTE0/imagens/Cadastros.png");
		executa.click("//TIFIRE-SUPORTE0/imagens/CadastroFuncionarioVendedor.png");
		executa.wait("//TIFIRE-SUPORTE0/imagens/TelaCadastroFuncionarioVendedor.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Jose Ramos Silva");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("3");
		executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.wait("//TIFIRE-SUPORTE0/imagens/TelaCadastroFuncionarioVendedor.png", 10);
		executa.type(Key.F4, KeyModifier.ALT);
		
		
		
		if (executa.exists("//TIFIRE-SUPORTE0/imagens/houver.png") != null) {
			System.out.println("Houve Algum Erro");
			return;

		} else {

			
		}

	}

}
