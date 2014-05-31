package data;

import java.text.NumberFormat;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) {
		
		double saldo = 120_123.878;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(1);
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println(f.format(saldo));
		

	}

}
