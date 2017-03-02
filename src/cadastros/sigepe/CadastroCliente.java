package cadastros.sigepe;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;

import org.python.antlr.PythonParser.break_stmt_return;
import org.python.antlr.PythonParser.exprlist_return;
import org.python.antlr.ast.Break;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.sikuli.script.FindFailed;

import com.banco.dao.Acesso;
import com.sun.prism.paint.Stop;

import consulta.banco.ConsultaCliente;
import jnr.ffi.Struct.key_t;

public class CadastroCliente {

	public void CadCli() throws FindFailed, ClassNotFoundException, SQLException {

		Screen executa = new Screen();

		executa.click("E:/Java/TesteAuto/imagens/TelaInicialMenuCadastro.png");
		executa.wait("E:/Java/TesteAuto/imagens/CadastroCliente.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.type("Danilo Augusto");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("87030140");
		executa.type(Key.ENTER);
		executa.paste("Avenida Tiradentes");
		executa.type(Key.ENTER);
		executa.type("441");
		executa.type(Key.ENTER);
		executa.type("Proximo a Sanepar");
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

		if (executa.exists("E:/Java/TesteAuto/imagens/houver.png") != null) {
			System.out.println("Houve Algum Erro");
			return;

		} else{
			ConsultaCliente banco = new ConsultaCliente();
			banco.ConsultaCli();
		}

	}

}
