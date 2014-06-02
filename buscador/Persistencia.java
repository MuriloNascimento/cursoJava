package buscador;

import java.io.*;


public class Persistencia {
	
	private String caminho = "C:/Users/Murilo/Documents/javawork/cursoJava/buscador/busca.txt";
	
	public void salvar(String[] parametros) throws IOException{
		
		try (FileWriter w = new FileWriter(caminho, true)){
			w.write( "\n" + parametros[0] + " - " + parametros[1] + " - " + parametros[2] + " - " + parametros[3] + " - " + parametros[4] );
			w.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	

	
}
