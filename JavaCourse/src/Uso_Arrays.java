
public class Uso_Arrays {

	public static void main(String[] args) {
		// Video Nro 23 - Arrays (Matrices)
		
		int[] mi_array = new int[5]; // Declaración del Array con [] en el tipo
		//int mi_array2[]  = new int[5]; // Declaraciíon del Array con [] en el nombre
		int[] matriz = {5, 12, -3, 33, 89}; //Declaración implícita en una línea
		
		mi_array[0] = 5;
		mi_array[1] = 12;
		mi_array[2] = -3;
		mi_array[3] = 33;
		mi_array[4] = 89;

		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("Valor del índice " + i + " es " + mi_array[i]);
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Valor del índice " + i + " es " + matriz[i]);
		}
		
	}

}
