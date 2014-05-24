package data;

import java.util.*;

public class Datas {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		/*Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		data.getTime();
		data.setTime(1_000_000);
		data.compareTo(agora);*/
		//---------------------------------------------
		
		//Calendario não é criado, pois é uma classe abstrata
		Calendar c = Calendar.getInstance();
		
		c.set(1988, Calendar.FEBRUARY, 11);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.YEAR, 1989);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 24);
		
		System.out.println(c.getTime());
		
		//Saudacao -------------------------------
		
		Calendar saudacao = Calendar.getInstance();
		int hora = saudacao.get(Calendar.HOUR_OF_DAY);
		if(hora <= 12){
			System.out.println("Bom dia");
		} else if (hora > 12 && hora < 18){
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa Noite");
		}
	}

}
