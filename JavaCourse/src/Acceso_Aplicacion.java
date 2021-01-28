import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// Video 18 - Bucles
		
		String clave = "admin";
		
		String pass = "";
		
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Ingrese la contraseña");
			
			if (clave.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");
			}
			
		}
		
		System.out.println("Contraseña Correcta. Acceso permitido");

	}

}
