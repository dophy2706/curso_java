package poo;


public class Pruebas {

	public static void main(String[] args) {
		// Hasta Video 37 - Uso Static
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("María");
		Empleados trabajador3 = new Empleados("Rodolfo");
		Empleados trabajador4 = new Empleados("Karla");
		Empleados trabajador5 = new Empleados("Guillermo");
	
		trabajador1.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.retornaDatos() + "\n" +
							trabajador2.retornaDatos() + "\n" +
							trabajador3.retornaDatos() + "\n" + 
							trabajador4.retornaDatos() + "\n" + 
							trabajador5.retornaDatos());
		
		System.out.println(Empleados.getIdProximo());
		
	}

}

class Empleados {
	
	private final String nombre;  //Declaración de nombre como constante, ya que no puede ser modificado luego de ser generado por el contructor
	
	private String seccion;
	
	private int Id;
	
	private static int Id_Proximo = 1;
	
	
	/*Constructor de Class*/
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		this.seccion = "Administración";
		
		this.Id = Id_Proximo ;
		Id_Proximo  ++;
	}
	
	
	public void cambiarSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	
	public String retornaDatos() {
		
		return "En nombre es: " + this.nombre + " y la sección es: " + this.seccion + " y el Id = " + Id;
	}
	
	public static String getIdProximo() {
		
		return "El próximo Id es " + Id_Proximo;
	}
	
}
