package calculo;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int maiorNumero = m.maior(10, 20);
		System.out.println(maiorNumero);
		
		double somaNumero = m.soma(10, 20, 40, 30, 50);
		System.out.println("soma de todos os numeros = " +somaNumero);
		
		/*int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		double soma = m.soma(par, impar);
		System.out.println(soma);*/
		
		double raizQuadrada = m.raiz(276);
		System.out.println(raizQuadrada);
		
		System.out.println(Math.sqrt(276));
		
		System.out.println(m.media(5,3));
		System.out.println(m.media("5","3"));
		System.out.println(m.media(5,3,4,34));

	}

}
