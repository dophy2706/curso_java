import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// Video 18 - Bucles
		
		String clave = "admin";
		
		String pass = "";
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Ingrese la contrase�a");
			
			if (clave.equals(pass) == false) {
				System.out.println("Contrase�a incorrecta");
			}
			
		}
		
		System.out.println("Contrase�a Correcta. Acceso permitido");

	}

}
