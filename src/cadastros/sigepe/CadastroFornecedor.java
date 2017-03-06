package cadastros.sigepe;

import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.sikuli.script.Key;

public class CadastroFornecedor {

	private static final String Key_F= null;
	
	public void CadFor () throws FindFailed{
		
		Screen executa = new Screen();
		
		
		executa.wait("//TIFIRE-SUPORTE0/imagens/TelaInicial.png" , 10);
		executa.type(Key_F, KeyModifier.CTRL);
		executa.type("//TIFIRE-SUPORTE0/imagens/TelaInicialCadastroFornecedor.png" , 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("TiFire Sistemas");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.paste("Rua S�o Silvestre");
		executa.type(Key.ENTER);
		executa.paste("Vila Santo Antonio");
		executa.type(Key.ENTER);
		executa.paste("Maringa");
		executa.type("//TIFIRE-SUPORTE0/imagens/BuscaCidades.png" , 10);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("//TIFIRE-SUPORTE0/imagens/TelaInicialCadastroFornecedor.png" , 10);
		executa.type("87030140");
		executa.type(Key.ENTER);
		executa.type("3023-7230");
		executa.type(Key.ENTER);
		executa.type("12081209000106");
		executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.type(Key.F4, KeyModifier.ALT);
		
		if (executa.exists("//TIFIRE-SUPORTE0/imagens/houver.png") != null) {
			System.out.println("Houve Algum Erro");
			return;

		} else {
			CadFor();
			System.out.println("Efetuando novo Cadastro");
		}
		
		
	}
	
}