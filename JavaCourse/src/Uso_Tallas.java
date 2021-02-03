
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
	}

	public static void main(String[] args) {
		// Tipos Enumerados
		/*Talla s =Talla.MINI;
		Talla m = Talla.MEDIANO;
		Talla l = Talla.GRANDE;
		Talla xl = Talla.MUY_GRANDE;*/	

	}

}
