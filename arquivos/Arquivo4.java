package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		Path caminho = Paths.get("C:/Users/Murilo/Documents/javawork/cursoJava/arquivos/texto.txt");
		System.out.println(Files.exists(caminho));
		System.out.println(Files.isDirectory(caminho));
		System.out.println(Files.size(caminho));
		System.out.println(Files.getOwner(caminho));
		System.out.println(Files.probeContentType(caminho));

		
	
	}

}
