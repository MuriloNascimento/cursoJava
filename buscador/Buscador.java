package buscador;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Buscador {

	public static void main(String[] args) throws MalformedURLException {
		
		URL urlTeste = new URL("http://www.emailnewsletter.com.br/");
		File fileTeste = new File("C:/Users/Murilo/Documents/javawork/cursoJava/buscador/arquivo.html");
		
        Pagina novaPagina = new Pagina(urlTeste,fileTeste);
        
        try {
        	novaPagina.getPage();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
