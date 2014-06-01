package buscador;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Busca {
	
	private String link;
	private String titulo;
	private String autor;
	private String data;
	private String texto; 
	
	private Pagina pagina;
	private ArrayList<String> parametrosSaida = new ArrayList<> ();
	private ArrayList<String> parametrosBusca = new ArrayList<> ();
	
	
	public Busca(Pagina novaPagina){
		this.pagina = novaPagina;
	}
	
	public String buscar() throws IOException, SQLException, NoSuchAlgorithmException, ClassNotFoundException{
		
		
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
		
		
		this.link = pagina.getURL().toString();
		this.titulo = parametrosSaida.get(0).replaceAll("radius fonte\">", "").replaceAll("</h2>", "");
		this.autor = parametrosSaida.get(1).replaceAll("rel=\"author\">", "").replaceAll("</a>", "");
		this.data = parametrosSaida.get(2).replaceAll("no dia ", "").replaceAll("</li>", "");
		this.texto = parametrosSaida.get(3).replaceAll("entry\">(.|\\s)+?<p>", "").replaceAll("</p>", "");
		
		
		String[] parametros = {this.link,this.titulo,this.autor,this.data,this.texto};
		
		Persistencia p = new Persistencia();
		p.salvar(parametros);
		
		return "Link = " + this.link + "\nTitulo = " + this.titulo + "\nAutor = " + this.autor + "\nData = " + this.data + "\nTexto = " + this.texto;
	}
}
