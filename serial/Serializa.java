package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {
  
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Isabela","Murilo","Elaine"};
		
		
		//escrita de um serial
		FileOutputStream fos = new FileOutputStream("C:/Users/Murilo/Documents/javawork/cursoJava/serial/texto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nomes);
		oos.close();
		
		//leitura de um serial
		FileInputStream fis = new FileInputStream("C:/Users/Murilo/Documents/javawork/cursoJava/serial/texto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		String[] nomes1 = (String[]) ois.readObject();
		ois.close();
		
		System.out.println(Arrays.toString(nomes1));
	}
	
}
