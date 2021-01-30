
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		final int MI = 4, MJ = 5;
		
		int [][] matrix = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27}
		};
		
		// Leer matriz con for each
		
		for (int[] is : matrix) {
			
			System.out.printf("\n");
			for (int z : is) {
				System.out.print(z + " ");
			}
		}
		
		
		
		//int [][] matrix = new int[MI][MJ];
		
		/*	// Llenar matriz
		for (int i = 0; i < MI; i++) {
			
			for (int j = 0; j < MJ; j++) {
				
				matrix[i][j] = (int)Math.round(Math.random()*100);
			}
		}*/
		
		/*	// Leer matriz
		for (int i = 0; i < MI; i++) {
			System.out.printf("\n");
			
			for (int j = 0; j < MJ; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}*/

	}

}
