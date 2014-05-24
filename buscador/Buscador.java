package buscador;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Buscador {

	public static void main(String[] args) throws IOException {
		
		
		String urlDigitada = JOptionPane.showInputDialog("Informe a url:");
		
		URL urlTeste = new URL("http://"+urlDigitada);
		
        Pagina novaPagina = new Pagina(urlTeste);
        
        Busca b = new Busca(novaPagina);
        String resultadoBusca = b.buscar();
        JOptionPane.showMessageDialog(null, resultadoBusca);
        
	}

}
