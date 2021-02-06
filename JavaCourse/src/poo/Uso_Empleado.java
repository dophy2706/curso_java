package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleado empleado1 = new Empleado("Rodolfo", 43500.55, 2007, 01, 24);
		
		Empleado empleado2 = new Empleado("Pedro Mansilla", 35000, 1998, 12, 13);
		
		Empleado empleado3 = new Empleado("María José", 72500.5, 2002, 03, 10);
		
		empleado1.subeSueldo(5.54);
		empleado2.subeSueldo(3);
		empleado3.subeSueldo(2.07);
		
		System.out.println("Nombre:  " + empleado1.getNombre() + " - Sueldo: " + empleado1.getSueldo() + " - Fecha de Alta: " + empleado1.getFechaAltaContrato());
		
		System.out.println("Nombre:  " + empleado2.getNombre() + " - Sueldo: " + empleado2.getSueldo() + " - Fecha de Alta: " + empleado2.getFechaAltaContrato());

		System.out.println("Nombre:  " + empleado3.getNombre() + " - Sueldo: " + empleado3.getSueldo() + " - Fecha de Alta: " + empleado3.getFechaAltaContrato());
		*/
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 1998, 8, 8); // Creando instancia de class Jefatura
		
		jefe_RRHH.setIncentivo(1500);
		
			
		
		Empleado[] misEmpleados = new Empleado[7];
		
		misEmpleados[0] = new Empleado("Rodolfo", 43500.55, 2007, 01, 14);
		misEmpleados[1] = new Empleado("Pedro Mansilla", 35000, 1998, 12, 13);
		misEmpleados[2] = new Empleado("María José", 72500.5, 2002, 03, 8);
		misEmpleados[3] = new Empleado("Antonio Maciegas", 30000, 1987, 06, 27);
		misEmpleados[4] = new Empleado("Priscila Dávila");
		
		misEmpleados[5]	= jefe_RRHH; // Ejemplo de Polimorfismo - Principio de sustitución
		
		misEmpleados[6] = new Jefatura("Carolina", 58754, 1999, 1, 12);
		
		Jefatura jefe_Financiero = (Jefatura)misEmpleados[6];
		
		System.out.println(jefe_Financiero.tomarDecisiones("Pagar Salarios"));
		
		jefe_Financiero.setIncentivo(1950);
		System.out.println("La Jefa " + jefe_Financiero.getNombre() + " tiene un bonus de $ " + jefe_Financiero.estableceBonus(500));
		
		System.out.println("El Empleado " + misEmpleados[1].getNombre() + " tiene un bonus de $ " + misEmpleados[1].estableceBonus(1000));
		
		/*
		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		
		Empleado director_comercial = new Jefatura("Guzmán", 85400, 2004, 12, 15);
		
		Comparable ejemplo = new Empleado("Elizabeth", 33890, 2001, 8, 24);
		
		if (director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if (ejemplo instanceof Comparable) {
			System.out.println("Implementa interfaz comparable");
		}
		
		
		for (Empleado empleado : misEmpleados) {
			  
			empleado.subeSueldo(5.00);
		}
		
		
		/*
		for (int y = 0; y < misEmpleados.length; y += 1) {
			System.out.println("Nombre: " + misEmpleados[y].getNombre() 
					+ " - Sueldo: " + misEmpleados[y].getSueldo()
					+ " - Fecha de alta: " + misEmpleados[y].getFechaAltaContrato());
		}*/
		
		
		Arrays.sort(misEmpleados);
		
		
		for (Empleado empleado : misEmpleados) {
			
			System.out.println("Nombre: " + empleado.getNombre() 
					+ " - Sueldo: " + empleado.getSueldo()
					+ " - Fecha de alta: " + empleado.getFechaAltaContrato());
		}
		
	}

}


class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sueld, int anio, int mes, int dia) {
		 
	 	this.nombre = nom;
	 	this.sueldo = sueld;
		 
	 	GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		 
	 	this.alta_contrato = calendario.getTime();
	 	
	 	Id = Id_Proximo;
	 	Id_Proximo ++;
		 
 	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 1993, 10, 8); // implementación del this() pra encontrar un constructor que tenga 5 args y cargar datos
		
	}
	
	
	
	// Parametros para ordenar por sueldo
	// Definicion de meetodo compareTo de la interface Comparable
	public int compareTo(Object mi_Obj) {
		
		Empleado emp = (Empleado)mi_Obj;
		if(this.sueldo < emp.sueldo) {
			return -1;
		}
		
		if(this.sueldo > emp.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonus_base + gratificacion;
	}
	
	
	 
	public String getNombre() {
	 
		return this.nombre + " ID  =  " + Id;
	}
	 
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
	 
	 
 	private String nombre;
 	private double sueldo;
 	private Date alta_contrato;
 	private int Id;	
	private static int Id_Proximo = 1;
	 
}

class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;
	
	
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre, sueldo, anio, mes, dia);	
	
	}


	public double getSueldo() {
		
		double sueldoJefe = super.getSueldo();  //utilizando super nos llama a la class padre y al metodo definido
		
		return sueldoJefe + incentivo;
	}


	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	
	public String tomarDecisiones(String decision) {
		return "Un Mienbro de la Dirección ha tomado la decisión de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
}

class Director extends Jefatura {
	
	
	public Director(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre, sueldo, anio, mes, dia);
		
	}
}
