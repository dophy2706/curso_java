
// Para uso de la class Scanner - Entrada por consola
import java.util.Scanner;

// Para Uso de la Class JOptionPane - Entrada desde Cuadro Diálogo
import javax.swing.JOptionPane;

public class Areas {
	
	/* Video Nro 17 - Condicionales 2 (swith case)*/

	public static void main(String[] args) {
		// Calcular Áreas de figuras geométricas
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elije una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
	
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
			msj = "El Area del Rectángulo es: ";
			
			break;
		}
		case 3: {
			
			double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la base"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida de la altura"));
			area = base * altura / 2;
			msj = "El Area del Triángulo es: ";
			
			break;
		}
		case 4: {
			
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce la medida del Radio"));
			area = Math.PI * (Math.pow(radio, 2));
			msj = "El Area del Círculo es: ";
			
			break;
		}
		default:
			msj = "Opción incorrecta \n El cálculo de Área Es: ";
			// throw new IllegalArgumentException("Unexpected value: " + figura);
		}
		
		System.out.printf(msj + "%1.2f", area);
		
	}

}
