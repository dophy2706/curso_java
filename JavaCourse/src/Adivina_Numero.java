import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// Video 19 - Bucles - Juego Adivina Nro
		
		int aleatorio = (int)(Math.random() * 100);
		//System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0, intentos = 0;
		/*
		while (num != aleatorio) {
			
			intentos +=1;
			
			System.out.println(" Introduce un Número");
			
			num = entrada.nextInt();
			
			if (aleatorio < num) {
				System.out.println("Pruebe con un nro. menor");
			} else {
				System.out.println("Pruebe con un nro. mayor");
			}
		}
		*/
		
		 do {
			
			intentos +=1;
			
			System.out.println(" Introduce un Número");
			
			num = entrada.nextInt();
			
			if (aleatorio < num) {
				System.out.println("Pruebe con un nro. menor");
			} else {
				System.out.println("Pruebe con un nro. mayor");
			}
		} while (num != aleatorio);
		
		
		System.out.println("Felicitaciones, Logrado en el intento Nro. " + intentos);
		
		entrada.close();
	}

}
