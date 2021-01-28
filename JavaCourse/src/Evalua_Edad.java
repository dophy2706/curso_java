
import java.util.*;

public class Evalua_Edad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una Edad");
		
		int edad = entrada.nextInt();
		
		String msj;
		
		if (edad > 0 && edad < 18) {
			
			msj = "Es menor de edad";
			
		} else if (edad >= 18) {
			
			msj = "Es Mayor";
		} else {
			msj = "Número Inválido";
		}

		System.out.println(msj);
	}

}
