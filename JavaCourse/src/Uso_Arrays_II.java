//import javax.swing.*;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// Video Nro 24 - Arrays 2  Matriz tipo string
		
		String[] paises = new String[8];
		
		paises[0] = "Espa�a";
		paises[1] = "M�xico";
		paises[2] = "Colombia";
		paises[3] = "Per�";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		
		
		for (int pos = 0; pos < paises.length; pos += 1) {
			System.out.println("Pa�s " + (1 + pos) + " = " + paises[pos]);
		}
		
		
		/*
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Ingrese Un Pa�s");
		}
		*/
		
		for (String countries : paises) {
			System.out.println(countries);
		}
		
		
	}

}
