package enumeracao;

public class EnumTest {
	
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		System.out.println(Medida.M.titulo);
	
		for(Medida med : Medida.values()){
			System.out.println(med + " : " + med.titulo);
		}
	}
	
}
