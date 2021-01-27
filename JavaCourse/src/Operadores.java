
/* Todos los Operadores en Java con Ejemplos */

public class Operadores {

	public static void main(String[] args) {
		
		/*Operadores aritméticos

		Se utilizan para realizar operaciones aritméticas simples en tipos de datos primitivos.

		    *: Multiplicación
		    /: División
		    %: Modulo
		    +: Suma
		    –: Resta
		*/
		
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
		
		boolean condition = true;
		
	    String x = "Thank", y = "You";
	    
	    // Operador + y -
	    
	    System.out.println("a + b = " + (a + b));
	    System.out.println("a - b = " + (a - b));
	    System.out.println("d + e + c - f = " + (d + e + c - f));
	    
	    
	    // El operador + si se usa con strings concatena las cadenas dadas.
	    
	    System.out.println("x + y = " + x + y);
	    
	    
	    // Operador * y /
	    
	    System.out.println("a * b = " + (a * b));
	    System.out.println("a / b = " + (a / b));
	    
	    
	    // operador de módulo da el resto de dividir el primer operando con el segundo
	    
	    System.out.println("a % b = "+(a % b));
	    
	    // si el denominador es 0 en la división
	    // System.out.println(a/c);
	    // lanzaría una java.lang.ArithmeticException
	    
	    ///////////////////////////////////////////////////////////////////////////////////////
	    
	    
	    // operador de pre-incremento
	    // a = a+1 y entonces c = a;
	    c = ++a;
	    System.out.println("Valor de c (++a) = " + c);
	    
	    
	    // operador de post-incremento
	    // c=b entonces b=b+1 (b pasa a ser 11)
	    c = b++;
	    System.out.println("Valor de c (b++) = " + c);
	    
	    
	    // operador de pre-decremento
	    // d=d-1 entonces c=d
	    c = --d;
	    System.out.println("Valor de c (--d) = " + c);
	    
	    
	    // operador de post-decremento
	    // c=e entonces e=e-1 (e pasa a ser 39)
	    c = e--;
	    System.out.println("Valor de c (e--) = " + c);
	    
	    // Operador lógico not
	    System.out.println("Valor de !condition = " + !condition);

	    
	}

}
