package buscador;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Buscador {

	public static void main(String[] args) throws IOException {
		
		URL urlTeste = new URL("http://www.sbt.com.br/");
		File fileTeste = new File("C:/Users/Murilo/Documents/javawork/cursoJava/buscador/arquivo.html");
		
        Pagina novaPagina = new Pagina(urlTeste,fileTeste);
        
        Busca b = new Busca(novaPagina);
        
        b.buscar();
	}

}
