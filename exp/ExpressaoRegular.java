package exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		
		boolean b = "Java".matches("(?im)java");
		System.out.println(b);
		
		b = "@".matches(".");
		b = "3".matches("\\d");
		b = "a".matches("\\w");
		b = " ".matches("\\s");
		b = "Pii".matches("...");
		b = "23".matches("\\d\\d");
		
		String cep = "\\d{5}-\\d{3}";
		
		b = "81330-400".matches(cep);
		System.out.println(b);
		
		
		b = "2345".matches("\\d{3,}");
		b = "233".matches("\\d{3,6}");
		System.out.println(b);
		
		b = "ab".matches(".*");
		System.out.println(b);
		
		String data = "\\d{2}/\\d{2}/\\d{4}";
		
		b = "11/02/1988".matches(data);
		System.out.println(b);
		
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sim|nao");

		System.out.println(b);
		
		
		b = "Murilo".matches("[A-Z][a-z]*");
		System.out.println(b);
		
		b = "rh@xtiuni.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println(b);
		
		String doce = "Qual é o dOce mais doce que o Doce";
		Matcher m = Pattern.compile("(?i)doce").matcher(doce);
		
		while(m.find()){
			System.out.println(m.group());
		}
		
		String url = "www.xti.com.br";
		
		String re = "";
		
		
		

	}

}
