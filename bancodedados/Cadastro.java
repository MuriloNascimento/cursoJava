package bancodedados;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Cadastro {

	public void cadastrarUsuario(String nome, String email) throws IOException {
		
		Usuario user = new Usuario(nome, email);
		
		String caminho = "C:/Users/Murilo/Documents/javawork/cursoJava/bancodedados/texto.txt";
		
		//Escrita ------------
		try (FileWriter w = new FileWriter(caminho, true)){
			w.write("\n"+user.getNome()+ " - " +user.getEmail());
			w.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	
}
