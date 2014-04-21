package Interface;

public class TestaInterface {
	
	public static void areaCalculo(Area a){
		System.out.println(a.calculaArea());
	}

	public static void main(String[] args) {
		
		FolhaPapel f = new FolhaPapel(15, 30);
		Quadrado q = new Quadrado(45);
		areaCalculo(f);
		areaCalculo(q);

	}

}
