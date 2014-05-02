package tokenizacao;

public class TokenTeste {

	public static void main(String[] args) {
		
		String tecno = " XHTML; CSS; Javascript; jQuery; Java";
		String[] tokens = tecno.split(";");
		System.out.println(tokens.length);
		
		for(String token : tokens){
			System.out.println(token.trim());
		}

	}

}
