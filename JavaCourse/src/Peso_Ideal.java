
import javax.swing.*;

public class Peso_Ideal {

	public static void main(String[] args) {
		
		// Video Nro 20 - Uso del do while
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Ingresa tu género (F/M)");
			
			
			
		} while ((genero.equalsIgnoreCase("F")) == false && (genero.equalsIgnoreCase("M") == false));

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura en cm"));
		
		int peso_ideal = 0;
		
		if (genero.equalsIgnoreCase("M")) {
			peso_ideal = altura - 110;
		} else if (genero.equalsIgnoreCase("F")) {
			peso_ideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es: " + peso_ideal + "Kgaa");
	}

}
