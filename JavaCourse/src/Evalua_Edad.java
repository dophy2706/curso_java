
import java.util.*;

public class Evalua_Edad {

	public static void main(String[] args) {
		
		// Video Nro. 16 - Estructuras de control de flujo IF ELSE
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una Edad");
		
		int edad = entrada.nextInt();
		
		String msj;
		
		if (edad < 18) {
			
			msj = "Eres Adolescente";
			
		} else if (edad < 40) {
			
			msj = "Eres Joven";
			
		} else if (edad < 65) {
			
			msj = "Eres Maduro";
			
		} else {
			
			msj = "Anciano";
		}

		System.out.println(msj);
		entrada.close();
	}

}
