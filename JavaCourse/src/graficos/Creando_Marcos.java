package graficos;

import java.awt.*;
import javax.swing.*;

public class Creando_Marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize()); 
		
		Mi_Marco obj_Marco1 = new Mi_Marco();
		
		obj_Marco1.setVisible(true);
		obj_Marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Mi_Marco extends JFrame {
	
	public Mi_Marco() {
		
		//setSize(550, 300);
		
		//setLocation(500, 300);
		
		setBounds(200, 200, 550, 300);
		
		//setResizable(true);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi Primera Ventana");
	}
	
}
