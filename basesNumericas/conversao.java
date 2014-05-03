package basesNumericas;

import java.util.Scanner;

public class conversao {
	
	static Scanner s = new Scanner(System.in);
	
	static void converterParaBinario(int decimal) {

		int temp = 0;
		StringBuilder convertido = new StringBuilder();
		
		//Converte de binario para decimal
		for(int i = 0; decimal > 0; i++){
			temp = decimal % 2;
			convertido.append(temp);
			decimal /= 2;
		}
		
		System.out.println(convertido.reverse());
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Informe o número em decimal:");
		int dec = s.nextInt();
		
		converterParaBinario(dec);
		
	}

}
