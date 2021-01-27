
public class Manipula_Cadenas_III {

	public static void main(String[] args) {
		// Uso del Método equals de la clase String para verificar si 2 cadenas de caracteres son iguales
		
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		System.out.println(alumno1.equals(alumno2));  // Verifica si las 2 cadenas son iguales, retorna true o false
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2)); // Verifica si las 2 cadenas son iguales, pero ignorando mayúsc y minúsc - Retorna true or false
		
	}

}
