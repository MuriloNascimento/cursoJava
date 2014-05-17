package buscador;
import java.io.*;
import java.net.URL;

public class Pagina {

	private URL url;
	private File file;
	
	public Pagina(URL url,File file){
		this.url = url;
		this.file = file;
	}
	
	public URL getURL(){
		return this.url;
	}
	
	public File getFile(){
		return this.file;
	}
	
	public void getPage() throws IOException {
		
        BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
        BufferedWriter out = new BufferedWriter(new FileWriter(this.file));
        String inputLine;
 
        while ((inputLine = in.readLine()) != null) {
            // Imprime página no console
            System.out.println(inputLine);
            // Grava pagina no arquivo
            out.write(inputLine);
            out.newLine();
        }
 
        in.close();
        out.flush();
        out.close();
    }
	
}
