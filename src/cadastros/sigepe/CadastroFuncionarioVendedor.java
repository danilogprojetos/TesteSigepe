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
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Jose Ramos Silva");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("3");
		
		
		
		
	}

}
