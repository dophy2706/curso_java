import java.util.Scanner;

public class Uso_Tallas {
	
	/* Los enum deben ser declarados fuera del método main */
	
	/*enum Talla {
		MINI,
		MEDIANO,
		GRANDE,
		MUY_GRANDE
	};*/
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL"); 
		
		private String abreviatura; 
	
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		
		public String getAbreviatura() {
			
			return this.abreviatura;
		}
	}

	public static void main(String[] args) {
		// Tipos Enumerados
		/*Talla s =Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;*/	
		
		
		Scanner leerTalla = new Scanner(System.in);
		
		System.out.println("Escribe una Talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
		String ent_datos = leerTalla.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, ent_datos);
		
		System.out.println("Talla = " + laTalla);
		System.out.println("Abreviatura = " + laTalla.abreviatura);
		
		leerTalla.close();
		

	}

}
