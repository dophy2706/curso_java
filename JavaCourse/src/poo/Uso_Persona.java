/**
 * 
 */
package poo;

import java.util.*;

/**
 * @author AdRodolfo
 *
 */
public class Uso_Persona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("José", 28756, 2004, 07, 19);
		
		lasPersonas[1] = new Alumno("Karen", "Análisis y Desarrollo de Sistemas");
		
		for (Persona persona : lasPersonas) {
			System.out.println(persona.getNombre() + " - " + persona.getDescripcion());
		}
		
	}

}

/*Clase abstracta porque tiene un método abstracto*/
abstract class Persona {
	
	private String nombre;

	
	//Construct
	public Persona(String nombre) {
		
		this.nombre = nombre;
	}


	public String getNombre() {
		
		return nombre;
	}
	
	public abstract String getDescripcion();
	
	
}



class Empleado2 extends Persona {
	
	private double sueldo;
 	private Date alta_contrato;
 	private int Id;	
	private static int Id_Proximo;
	
	// Construct
	public Empleado2(String nom, double sueldo, int anio, int mes, int dia) {
		
		super(nom);
		 
	 	this.sueldo = sueldo;
		 
	 	GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		 
	 	alta_contrato = calendario.getTime();
	 	
	 	++ Id_Proximo;
	 	Id = Id_Proximo;
 	}
	
	
	public String getDescripcion() {
		
		return "Este empleado tiene un Id = " + this.Id + " con un sueldo de $ " + this.sueldo;
	}
	
	
	/* 
	public String getNombre() {
	 
		return this.nombre + " ID  =  " + Id;
	}*/
	 
	public double getSueldo() {
		 
		return this.sueldo;
 	}
	 
	public Date getFechaAltaContrato() {
		
		return this.alta_contrato;
	}
	 
	public void subeSueldo(double porcentaje) {
		
		double aumento = this.sueldo * porcentaje / 100;
		 
	 	this.sueldo += aumento;
	}
	 
}

class Alumno extends Persona {
	
	private String carrera;
	
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		
		this.carrera = carrera;
	}
	
	public String getDescripcion() {
		
		return "Este alumno está estudiando la carrera de " + carrera;
	}
}