
// Para uso de la class Scanner - Entrada por consola
import java.util.Scanner;

// Para Uso de la Class JOptionPane - Entrada desde Cuadro Di�logo
import javax.swing.JOptionPane;

public class Areas {
	
	/* Video Nro 17 - Condicionales 2 (swith case)*/

	public static void main(String[] args) {
		// Calcular �reas de figuras geom�tricas
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elije una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");
	
		int figura = entrada.nextInt();
		
		double area = 0.0;
		String msj = "";
		
		switch (figura) {
		case 1: {
			
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el Lado"));
			area = Math.pow(lado, 2);
			msj = "El Area del cuadrado es: ";
			
			break;
		}
		case 2: {
			
			double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la base"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la altura"));
			area = base * altura;
			msj = "El Area del Rect�ngulo es: ";
			
			break;
		}
		case 3: {
			
			double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la base"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la altura"));
			area = base * altura / 2;
			msj = "El Area del Tri�ngulo es: ";
			
			break;
		}
		case 4: {
			
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida del Radio"));
			area = Math.PI * (Math.pow(radio, 2));
			msj = "El Area del C�rculo es: ";
			
			break;
		}
		default:
			msj = "Opci�n incorrecta \n El c�lculo de �rea Es: ";
			// throw new IllegalArgumentException("Unexpected value: " + figura);
		}
		
		System.out.printf(msj + "%1.2f", area);
		
	}

}
