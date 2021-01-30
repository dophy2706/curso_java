package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche ObjCoche = new Coche();  // INSTANCIAR UNA CLASE , EJEMPLARIZAR CLASE Coche
		
		ObjCoche.setColor("Verde");
		
		System.out.println(ObjCoche.getDatosGenerales());
		System.out.println(ObjCoche.getColor());
		
		ObjCoche.setAsientos("Si");
		System.out.println(ObjCoche.getAsientos());
		
		
		/*Falta Terminar la práctica
		 * 2021-01-30 - 00:38
		 * AdRodolfo@hp
		 * */
		
	}

}
