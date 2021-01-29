import javax.swing.JOptionPane;

public class Comprueba_Mail {

	public static void main(String[] args) {
		
		// Video Nro. 21 - Uso de for - Buscar @
		
		int arroba = 0;
		boolean punto = false;
		
		String correo = JOptionPane.showInputDialog("Ingrese una dirección de Mail");
		
		for (int i = 0; i < correo.length(); i++) {
			if (correo.charAt(i) == '@') {
				arroba += 1;
			}
			
			if ((correo.charAt(i) == '.') && !(correo.charAt(correo.length() - 1) == '.') && !(correo.charAt(0) == '.')) {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto) {
			System.out.println("Formato de e-Mail Correcto");
		} else {
			System.out.println("Formato de e-Mail incorrecto! Ex. ejemplo@domain.com");
		}
		
		

	}

}
