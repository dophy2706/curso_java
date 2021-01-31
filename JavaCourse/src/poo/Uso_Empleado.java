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
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Rodolfo", 43500.55, 2007, 01, 14);
		misEmpleados[1] = new Empleado("Pedro Mansilla", 35000, 1998, 12, 13);
		misEmpleados[2] = new Empleado("María José", 72500.5, 2002, 03, 8);
		
		/*
		for (int i = 0; i < misEmpleados.length; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for (Empleado empleado : misEmpleados) {
			  
			empleado.subeSueldo(5.98);
		}
		
		
		/*
		for (int y = 0; y < misEmpleados.length; y += 1) {
			System.out.println("Nombre: " + misEmpleados[y].getNombre() 
					+ " - Sueldo: " + misEmpleados[y].getSueldo()
					+ " - Fecha de alta: " + misEmpleados[y].getFechaAltaContrato());
		}*/
		
		for (Empleado empleado : misEmpleados) {
			
			System.out.println("Nombre: " + empleado.getNombre() 
					+ " - Sueldo: " + empleado.getSueldo()
					+ " - Fecha de alta: " + empleado.getFechaAltaContrato());
		}
		
	}

}


class Empleado {
	
	public Empleado(String nom, double sueld, int anio, int mes, int dia) {
		 
	 	this.nombre = nom;
	 	this.sueldo = sueld;
		 
	 	GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		 
	 	this.alta_contrato = calendario.getTime();
		 
 	}
	 
	public String getNombre() {
	 
		return this.nombre;
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
	 
}
