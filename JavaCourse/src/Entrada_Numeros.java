import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		
		// Video Nro 15
		
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero ");

		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));

	}

}
