package buscador;


import java.io.IOException;
import java.net.URL;
import javax.swing.JOptionPane;

public class Buscador {

	public static void main(String[] args) throws IOException {
		
		
		String urlDigitada = JOptionPane.showInputDialog("Informe a url:");
		
		URL urlTeste = new URL(urlDigitada);
		
        Pagina novaPagina = new Pagina(urlTeste);
        
        Busca b = new Busca(novaPagina);
        
        String resultadoBusca = b.buscar();
        
        TelaResultado t = new TelaResultado();
        t.exibeResultado(resultadoBusca);
        
        
	}

}
