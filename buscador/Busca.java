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
	private ArrayList<String> parametrosSaida = new ArrayList<> ();
	private ArrayList<String> parametrosBusca = new ArrayList<> ();
	
	
	public Busca(Pagina novaPagina){
		this.pagina = novaPagina;
	}
	
	public String buscar() throws IOException{
		
		parametrosBusca.add("<title>(.|\\s)+?</title>");
		parametrosBusca.add("<meta name=\"author\" content=\"(.|\\s)+?\" />");
		parametrosBusca.add("<meta name=\"description\" content=\"(.|\\s)+?\" />");
		
		Matcher mat;
		String conteudo = pagina.getPage().toString();
		
		for(String p : parametrosBusca){
			mat = Pattern.compile(p).matcher(conteudo);
			while(mat.find()){
				parametrosSaida.add(mat.group());
			}
		}
		
		return "Link = " + pagina.getURL() + "\nTitulo = " + parametrosSaida.get(0).replaceAll("<title>", "").replaceAll("</title>", "") + "\nAutor = " + parametrosSaida.get(1).replaceAll("<meta name=\"author\" content=\"", "").replaceAll("\" />", "") + "\nDescricao = " + parametrosSaida.get(2).replaceAll("<meta name=\"description\" content=\"", "").replaceAll("\" />", "");
		
	}
}
