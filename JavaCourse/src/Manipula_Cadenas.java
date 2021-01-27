
public class Manipula_Cadenas {

	public static void main(String[] args) {
		
		
		String nombre = "Rodolfo Daniel Macedo Suárez";
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		int ult_letra = nombre.length() - 1;
		
		System.out.println("La última letra de " + nombre + " es la " + nombre.charAt(ult_letra));
	}

}
