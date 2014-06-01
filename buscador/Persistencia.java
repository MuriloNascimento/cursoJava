package buscador;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Persistencia {
	
	private Path caminho = Paths.get("C:/Users/Murilo/Documents/javawork/cursoJava/buscador/busca.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void salvar(String[] parametros) throws IOException{
		try (BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){
			
			
			w.write( "\n" + parametros[0] + " - " + parametros[1] + " - " + parametros[2] + " - " + parametros[3] + " - " + parametros[4] );
			w.flush();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	/*
	public void comparar(String[] parametros) throws IOException, ClassNotFoundException{
		try(BufferedReader reader = Files.newBufferedReader(caminho,utf8)){
			String linha = null;
			while((linha = reader.readLine()) != null){
				for (int i = 0; i < parametros.length; i++) {

					if(linha.contains(parametros[i])){
						
						TelaResultado t = new TelaResultado();
						t.exibeResultado("Essa url já foi salva.");
						
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	*/
}
