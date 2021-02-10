package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		
		Reloj objReloj = new Reloj();

		objReloj.enMarcha(4000, true);
		
		JOptionPane.showMessageDialog(null, "Presiona Ok para Detener");
		
		System.exit(0);
	}

}

class Reloj {
	
	
	public void enMarcha(final int intervalo, final boolean sonido) {
		
		class DameLaHora2 implements ActionListener {
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Muestro la hora cada " + (intervalo/1000) + " sg.: " + ahora);
				
				if (sonido) {
				
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		
		ActionListener escucha = new DameLaHora2();
		 
		Timer mitemporizador = new Timer(intervalo, escucha);
		
		mitemporizador.start();
	}
	
}
