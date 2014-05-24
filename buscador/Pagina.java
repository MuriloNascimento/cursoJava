package buscador;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;


public class Pagina {

	private URL url;
	
	public Pagina(URL url){
		this.url = url;
	}
	
	public URL getURL(){
		return this.url;
	}
	
	public ArrayList<String> getPage() throws IOException {
		
        BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
        String inputLine;
        ArrayList<String> linhas = new ArrayList<>();
		while ((inputLine = in.readLine()) != null) {
			linhas.add(inputLine);
		}
        in.close();
        return linhas;
    }
	
}
