package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	static Scanner s = new Scanner(System.in);
	
	public static void dividir(Scanner s)
	throws InputMismatchException, ArithmeticException
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		System.out.print("Divisor: ");
		int b = s.nextInt();
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		boolean continua = true;
		
		do{
			dividir(s);
			continua = false;	
		} while (continua);
			
	}

}
