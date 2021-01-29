
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		// Video Nro 22 - Factorial

		long resultado = 1L;
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Nro. Entero"));
		
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}
		
		System.out.println("El Factorial de " + numero + " es " + resultado);
	}

}
