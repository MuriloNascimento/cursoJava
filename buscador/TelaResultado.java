package buscador;

import java.io.UnsupportedEncodingException;
import javax.swing.*;

public class TelaResultado {
	
	public void exibeResultado(String resultado) throws UnsupportedEncodingException{
		
		String texto = new String(resultado.getBytes(), "UTF-8");
        JTextArea  msg = new JTextArea(texto);
        msg.setLineWrap(true);
        msg.setWrapStyleWord(true);

        JFrame frame = new JFrame("Resultado da Busca");
        frame.add(msg);
        frame.setSize(800, 400);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
	}

}
