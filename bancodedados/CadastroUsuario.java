package bancodedados;

import java.util.Scanner;

public class CadastroUsuario {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nomeInfo = s.nextLine();
		System.out.println("Informe seu email:");
		String emailInfo = s.nextLine();
		
		Cadastro c = new Cadastro();
		c.cadastrarUsuario(nomeInfo, emailInfo);
		
		System.out.println("Cadastro concluido com sucesso!");

	}

}
