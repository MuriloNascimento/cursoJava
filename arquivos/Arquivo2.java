package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Paths.get("C:/Users/Murilo/Documents/javawork/cursoJava/arquivos/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		//Escrita ------------
		try (BufferedWriter w = Files.newBufferedWriter(caminho, utf8)){
			w.write("Texto alterado");
			w.write("\nTexto alterado novamente");
			w.write("\nnova linha de texto");
			w.flush();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		//Leitura ------------
		try(BufferedReader reader = Files.newBufferedReader(caminho, utf8)){
			String linha = null;
			while((linha = reader.readLine()) != null){
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
