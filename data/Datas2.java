package data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(1988, Calendar.FEBRUARY, 11);
		
		Date data = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(data));
		
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(data));
		
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(data));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(data));
		
		Date data2 = f.parse("12/02/1982");
		System.out.println(data2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(data));
		
		
		f = DateFormat.getDateTimeInstance();
		

	}

}
