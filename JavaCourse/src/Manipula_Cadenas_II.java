
public class Manipula_Cadenas_II {

	public static void main(String[] args) {
		
		// Uso del método substring de la clase String y uso de concatenación de cadenas
		
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen = frase.substring(0, 29) + " ir a la playa y olvidarse de todo..." + " y " + frase.substring(29);
		
		System.out.println(frase);
		System.out.println(frase_resumen);

	}

}
