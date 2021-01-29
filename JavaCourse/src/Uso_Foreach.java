import javax.swing.JOptionPane;

public class Uso_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] paises = new String[8];
		
		for (int i = 0; i < paises.length; i++) {
			paises[i] = JOptionPane.showInputDialog("Ingrese Un País");
		}
		
		for (String countries : paises) {
			System.out.println(countries);
		}
	}

}
