package bancodedados;

import java.io.IOException;
import java.util.Scanner;

public class CadastroUsuario {

	private static Scanner s;

	public static void main(String[] args) throws IOException {
		
		s = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nomeInfo = s.nextLine();
		System.out.println("Informe seu email:");
		String emailInfo = s.nextLine();
		
		Cadastro c = new Cadastro();
		c.cadastrarUsuario(nomeInfo, emailInfo);
		
		System.out.println("Cadastro concluido com sucesso!");

	}

}
