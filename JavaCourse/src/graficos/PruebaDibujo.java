package graficos;

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;


public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos objMarcoConDibujos = new MarcoConDibujos();

		
		System.out.println("Rodolfo");
	}

}


class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos() {
		// Constructor de Class
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("Prueba de Dibujo");
		
		setSize(400, 400);
		
		setVisible(true);
		
		PanelConFiguras miPanel = new PanelConFiguras();
		add(miPanel);
		
		
	}
}

class PanelConFiguras extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		/*g.drawRect(50, 50, 200, 200);
		g.drawLine(20, 20, 300, 200);
		g.drawArc(10, 100, 100, 200, 120, 150);*/
		
		Graphics2D graph2d = (Graphics2D) g;
		
		Rectangle2D rectang = new Rectangle2D.Double(50, 50, 200, 150);
		
		graph2d.draw(rectang);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectang);
		
		graph2d.draw(elipse);
		
		
		graph2d.draw(new Line2D.Double(50, 50, 250, 200));
		
	
	}
	
}
