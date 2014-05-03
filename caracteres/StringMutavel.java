package caracteres;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		s1.toString();
		
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		System.out.println(s1);
		//System.out.println(s1.reverse());
		
		String[] s = {" PHP"," HTML"," RUBY"};
		
		for(int i = 0; i < s.length; i++){
			s1.append(s[i]);
		}
		
		System.out.println(s1);
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
		
	}

}
