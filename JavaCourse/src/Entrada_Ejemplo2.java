
import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu Nombre, Por Favor");
		
		String edad = JOptionPane.showInputDialog("Ingresa tu edad");
		
		int edad_user = Integer.parseInt(edad);
		
		System.out.println("Hola " + nombre_usuario + ", El año que viene tendrás " + (edad_user + 1) + " años");
		

	}

}
