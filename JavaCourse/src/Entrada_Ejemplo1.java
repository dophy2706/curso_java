import java.util.*;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// Video Nro. 14
		
		// Leer datos digitados por usuario 

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu Nombre, por favor: ");
		
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce tu Edad, por favor: ");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombreUsuario + ", el a�o que viene tendr�s " + (edad + 1) + " a�os.");
		
		entrada.close();
	}

}
