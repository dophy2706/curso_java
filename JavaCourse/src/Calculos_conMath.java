
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double raiz = Math.sqrt(9);
		
		double num1 = 5.85;
		
		int resultado = (int)Math.round(num1); // Refundición
		
		long redondeo = Math.round(num1);
		
		System.out.println(resultado);
		System.out.println(redondeo);
		
		/////////////////////////////
		
		double base = 5;
		double exponente = 3;
		
		double result = Math.pow(base, exponente);
		
		System.out.println("El Resultado de " + base + " elevado a " + exponente + " es " + result);
		
		
		
		
	}

}
