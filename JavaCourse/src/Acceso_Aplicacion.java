import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// Video 18 - Bucles
		
		String clave = "admin";
		
		String pass = "";
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Ingrese la contraseņa");
			
			if (clave.equals(pass) == false) {
				System.out.println("Contraseņa incorrecta");
			}
			
		}
		
		System.out.println("Contraseņa Correcta. Acceso permitido");

	}

}
