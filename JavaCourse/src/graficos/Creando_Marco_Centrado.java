/**
 * 
 */
package graficos;

import java.awt.*;
import javax.swing.*;

/**
 * @author AdRodolfo
 *
 */
public class Creando_Marco_Centrado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado objMarcoCentrado = new MarcoCentrado();
		objMarcoCentrado.setVisible(true);
		objMarcoCentrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanhoPantalla = miPantalla.getScreenSize();
		
		int alturaPantalla = tamanhoPantalla.height;
		int anchoPantalla = tamanhoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		setTitle("Marco Centralizado");
		
		Image mi_Icono = miPantalla.getImage("src/graficos/icono.gif"); 
		setIconImage(mi_Icono);    
		
		System.out.println(tamanhoPantalla);
		
		System.out.println("El Alto de mi pantalla es: " + alturaPantalla + "px. y el Ancho es: " + anchoPantalla + "px.");
	}
}