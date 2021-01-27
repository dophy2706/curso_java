
public class DeclaracionesOperadores {

	public static void main(String[] args) {
		
		final double apulgadas = 2.54;
		
		int operador1, operador2, resultado;  // Esto es una declaración de variables en una misma línea
		
		operador1 = 8;
		operador2 = 7;
		
		resultado = operador1 + operador2;
		
		System.out.println(resultado);
		
		double cm = 6;
		
		double resulta = cm / apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resulta + " pulgadas");

	}

}
