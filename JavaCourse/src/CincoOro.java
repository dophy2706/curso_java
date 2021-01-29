
import java.util.Arrays;

public class CincoOro {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		int pos_nros = 0;
		
		while (pos_nros < numeros.length) {
			
			int flag = 0;
			
			int aleatorio = (int)(Math.random() * 100);
			
			if (aleatorio < 49) {
				
				for (int a = 0; a < numeros.length; a++) {
					
					if (aleatorio == numeros[a]) {
						flag = 1;
					}
				}
				
				if (flag == 0) {
					
					numeros[pos_nros] = aleatorio;
					pos_nros ++;
				}				
			}			
		}
		
		// Ordenar Nros
		
		//Arrays.sort(numeros);
		
	    for (int x = 0; x < numeros.length; x++) {
	    	
	        for (int y = 0; y < numeros.length - x - 1; y++) {
	        	
	            if(numeros[y] > numeros[y + 1]){
	            	
	                int aux = numeros[y + 1];
	                numeros[y + 1] = numeros[y];
	                numeros[y] = aux;
	            }
	        }
	    }
		
				
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}	
	}
}
