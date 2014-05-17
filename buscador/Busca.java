package buscador;

import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Busca {
	
	private Pagina pagina;
	private URL url;
	private String conteudo;
	private String titulo = "<title>\\w+</title>";
	private String autor = "<meta name='author' content='\\w+'>";
	
	public Busca(Pagina novaPagina){
		this.pagina = novaPagina;
	}
	
	public void buscar(){
		try {
        	this.pagina.getPage();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
