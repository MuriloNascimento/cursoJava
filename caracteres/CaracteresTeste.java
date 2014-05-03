package caracteres;

public class CaracteresTeste {
	
	public static void main(String[] args) {
		String s1 = "Write once";
		String s2 = s1 + "Run AnyWhere";
		String s3 = new String("Java Virtual Machine");

		char[] array = {'j','a','v','a'};
		String s4 = new String(array);
		
		int tamanho = s1.length();
		char letra = s1.charAt(0);
		String texto = s1.toString();
		
		
		//Posicao
		int posicao = s1.indexOf("W");
		int ultimaPosicao = s3.lastIndexOf('e');
		boolean vazia = s3.isEmpty();
		
		System.out.println(ultimaPosicao);
		
		//Comparacao
		String xti = "XTI";
		boolean x = xti.equals("XTI");
		boolean y = xti.startsWith("XT");
		boolean z = xti.endsWith("X");
		System.out.println(z);
		
		String so = "Olhe la!";
		
		for (int i = 0; i < so.length(); i++) {
			boolean o = so.regionMatches(i, "Olhe", 0, 4);
			System.out.println(i+" = "+o);
		}
		
		String l = "O brasil é bonito";
		String sl = l.substring(2,8);
		System.out.println(sl);
		
		sl = l.concat(" que maravilha");
		
		System.out.println(sl);
		
		sl = l.toUpperCase();
		
		System.out.println(sl);
		
		//--------------------------------
		
		
		
		
		
	}

}
