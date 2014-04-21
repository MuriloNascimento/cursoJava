package calculo;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior entre os dois numeros
	 */
	int maior(int valorUm, int valorDois){
		if(valorUm > valorDois){
			return valorUm;
		} else {
			return valorDois;
		}
	}
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return a soma entre os dois numeros
	 */
	double soma(double ... valores){
		double total = 0;
		for(double n : valores){
			total += n;
		}
		return total;
	}
	
	/**
	 * 
	 * @param valorUm
	 * @return a raiz quadrada usando a equação de pell
	 */
	double raiz(double valorUm){
		double contador = 0;
		double i = 1;
		while(i <= valorUm){
			valorUm -= i;
			i += 2; //pula para o próximo numero impar
			contador++;
		}
		return contador;
	}
	
	
	double media(int x, int y){
		System.out.print("media(int x, int y) = ");
		return (x + y)/2;
	}
	
	double media(String x, String y){
		System.out.print("media(String x, String y) = ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		
		return (ix + iy)/2;
	}
	
	double media(double ... numeros){
		System.out.print("media(double ... numeros) = ");
		return this.soma(numeros) / numeros.length;
	}
}
