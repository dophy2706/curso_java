package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche ObjCoche = new Coche();  // INSTANCIAR UNA CLASE , EJEMPLARIZAR CLASE Coche
		
		ObjCoche.setColor(JOptionPane.showInputDialog("Especifica el color del coche, por favor"));
		
		System.out.println(ObjCoche.getDatosGenerales());
		System.out.println(ObjCoche.getColor());
		
		ObjCoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero? (Si / No)?"));
		System.out.println(ObjCoche.getAsientos());
		
		ObjCoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene Climatizador? (Si / No)?"));
		
		System.out.println(ObjCoche.getClimatizador());
		
		System.out.println(ObjCoche.retornaPesoCoche());
		
		System.out.println("El precio final del coche es " + ObjCoche.retornaPrecioCoche());
		
		
		
	}

}
