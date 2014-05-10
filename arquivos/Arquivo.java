package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Paths.get("C:/Users/Murilo/Documents/javawork/cursoJava/arquivos/texto.txt");
		// metodos da classe path.
		System.out.println(caminho.toAbsolutePath());		 
		System.out.println(caminho.getRoot());
		System.out.println(caminho.getFileName());
		
		
		byte[] texto = "Meu texto".getBytes();
		Files.write(caminho, texto);
		
		byte[] retorno = Files.readAllBytes(caminho);
		System.out.println(new String(retorno));
		
	}

}
