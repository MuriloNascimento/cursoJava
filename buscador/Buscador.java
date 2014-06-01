package buscador;


import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Buscador {

	public static void main(String[] args) throws IOException, SQLException, NoSuchAlgorithmException, ClassNotFoundException {
		
		
		String urlDigitada = JOptionPane.showInputDialog("Informe a url:");
		
		URL urlTeste = new URL(urlDigitada);
        Pagina novaPagina = new Pagina(urlTeste);
        Busca b = new Busca(novaPagina);
        TelaResultado t = new TelaResultado();
        
        t.exibeResultado(b.buscar());
        
	}

}
