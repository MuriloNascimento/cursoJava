package buscador;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class Busca {
	
	private Pagina pagina;
	private ArrayList<String> parametrosSaida = new ArrayList<> ();
	private ArrayList<String> parametrosBusca = new ArrayList<> ();
	
	
	public Busca(Pagina novaPagina){
		this.pagina = novaPagina;
	}
	
	public String buscar() throws IOException{
		
		
		parametrosBusca.add("radius fonte\">(.|\\s)+?</h2>");
		parametrosBusca.add("rel=\"author\">(.|\\s)+?</a>");
		parametrosBusca.add("no dia (.|\\s)+?</li>");
		parametrosBusca.add("entry\">(.|\\s)+?</p>");
		
		Matcher mat;
		String conteudo = pagina.getPage().toString(); 
		
		
		for(String p : parametrosBusca){
			mat = Pattern.compile(p).matcher(conteudo);
			while(mat.find()){
				parametrosSaida.add(mat.group());
			}
		}
		
		return "Link = " + pagina.getURL()
			 + "\nTitulo = " + parametrosSaida.get(0).replaceAll("radius fonte\">", "").replaceAll("</h2>", "")
			 + "\nAutor = " + parametrosSaida.get(1).replaceAll("rel=\"author\">", "").replaceAll("</a>", "")
			 + "\nData = " + parametrosSaida.get(2).replaceAll("no dia ", "").replaceAll("</li>", "")
			 + "\nTexto = " + parametrosSaida.get(3).replaceAll("entry\">(.|\\s)+?<p>", "").replaceAll("</p>", "");
	}
}
