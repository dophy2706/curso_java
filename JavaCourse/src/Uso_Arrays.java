
public class Uso_Arrays {

	public static void main(String[] args) {
		// Video Nro 23 - Arrays (Matrices)
		
		int[] mi_array = new int[5]; // Declaraci�n del Array con [] en el tipo
		//int mi_array2[]  = new int[5]; // Declaraci�on del Array con [] en el nombre
		int[] matriz = {5, 12, -3, 33, 89}; //Declaraci�n impl�cita en una l�nea
		
		mi_array[0] = 5;
		mi_array[1] = 12;
		mi_array[2] = -3;
		mi_array[3] = 33;
		mi_array[4] = 89;

		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("Valor del �ndice " + i + " es " + mi_array[i]);
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Valor del �ndice " + i + " es " + matriz[i]);
		}
		
	}

}
