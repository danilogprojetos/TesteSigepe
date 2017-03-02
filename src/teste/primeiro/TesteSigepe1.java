package teste.primeiro;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class TesteSigepe1 {
	public static void main(String[] args) throws FindFailed {

		Screen s = new Screen();
		Screen d = new Screen();
		Screen aguardar = new Screen();
		Screen escreve = new Screen();
		Screen compara = new Screen();
		Screen texto = new Screen();
		Screen enter = new Screen();

		d.doubleClick("E:/Java/TesteAuto/imagens/abrir.png");
		// aguardar.wait("E:/Java/TesteAuto/imagens/mensagemDemonstracao.png" ,
		// 50);
		// d.click("E:/Java/TesteAuto/imagens/clicar1.png" , 50);

		/*
		 * aguardar.wait("E:/Java/TesteAuto/imagens/aguardar2.png" , 50);
		 * d.click("E:/Java/TesteAuto/imagens/login.png"); escreve.paste("f");
		 * d.click("E:/Java/TesteAuto/imagens/senha.png"); escreve.paste("f");
		 * d.click("E:/Java/TesteAuto/imagens/entrar.png");
		 * aguardar.wait("E:/Java/TesteAuto/imagens/TelaInicialMenuCadastro.png"
		 * ,120);
		 * d.click("E:/Java/TesteAuto/imagens/TelaInicialMenuCadastro.png");
		 */
		// aguardar.wait("E:/Java/TesteAuto/imagens/TelaCadastroNovo.png" );
		d.click("E:/Java/TesteAuto/imagens/TelaCadastroNovo.png");
		escreve.paste("Danilo Augusto Dias");

	}

}
