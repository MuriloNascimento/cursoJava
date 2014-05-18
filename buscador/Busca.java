package buscador;

import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Busca {
	
	private Pagina pagina;
	private URL url;
	private String titulo = "<title\\>\\a\\z\\<//title\\>";
	private String autor = "<meta name='author' content='\\w+'>";
	
	public Busca(Pagina novaPagina){
		this.pagina = novaPagina;
	}
	
	public void buscar() throws IOException{
		Matcher mat;
		String conteudo = pagina.getPage().toString();
		mat = Pattern.compile(titulo).matcher(conteudo);
		while(mat.find()){
			System.out.println(mat.group());
		}
	}
}
