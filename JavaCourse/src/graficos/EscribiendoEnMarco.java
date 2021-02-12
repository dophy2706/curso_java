package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
	
		MarcoConTexto marcoConTexto = new MarcoConTexto();
		 
		marcoConTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
	
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer Texto (Título)");
		
		Panel01 miPanel = new Panel01();
		
		add(miPanel); 
	}
	
}

class Panel01 extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}
