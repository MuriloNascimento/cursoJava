package erros;

import java.util.Scanner;

public class SenhaTeste {
	
	private static final String senha = null;
	static Scanner s = new Scanner(System.in);
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		if("123".equals(senha)){
			System.out.println("Acesso liberado");
		} else {
			throw new SenhaInvalidaException("Senha errada");
		}
	}

	public static void main(String[] args) {
		
		boolean continua = true;
		
		do{
			try{
				System.out.print("Informe sua senha: ");
				String senha = s.nextLine();
				autenticar(senha);
				continua = false;
			} catch(SenhaInvalidaException e) {
				System.out.println(e.getMessage());
				
			}
		} while (continua);

	}

}
