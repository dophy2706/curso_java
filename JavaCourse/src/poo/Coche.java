package poo;

public class Coche {

	private int 	ruedas;
	private int 	largo;
	private int 	ancho;
	private int 	motor;
	private int 	peso_plataforma;
	private String 	color;
	private int 	peso_total;
	private boolean asientos_cuero, climatizador;
	
	
	// Método Constructor (public NombreClass)
	
	public Coche() {
		
		ruedas = 4;
		largo = 4000; 	// Milímetros
		ancho = 300;		// Centímetros
		motor = 1600;
		peso_plataforma = 500;
		
	}
	
	
	/*Getters*/
	
	public String getLargo() {
		
		return "El largo del coche es " + largo;
	}
	
	public String getColor() {	
		
		return "El Color del coche es " + color;
	}
	
	public String getAsientos() {
		return (this.asientos_cuero) ? 
				"El coche tiene asientos de cuero." : 
					"El coche no tiene asientos de serie";
	}
	
	public String getClimatizador() {
		return (this.climatizador == true) ? 
				"El coche tiene climatizador incorporado." : 
					"El coche lleva aire acondicionado";
	}
	
	
	
	/*Setters*/
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public void setLargo(int pLargo) {
		
		this.largo = pLargo;
	}
	
	public void setAsientos(String asientos_cuero) {
				
		this.asientos_cuero = (asientos_cuero.equalsIgnoreCase("si")) ? true : false;
	}
	
	public void setClimatizador(String climatizador) {
		
		this.climatizador = (climatizador.equalsIgnoreCase("si")) ? true : false ;
	}
	
	
	/*Others Methods*/
	
	public String getDatosGenerales() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas. " + 
		"Mide " + largo / 1000 + " metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " Kg.";
	}
	
}
