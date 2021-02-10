package poo;

import java.util.*;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dame_La_Hora Obj_oyente = new Dame_La_Hora();
		
		//Otra opcion para instenciar
		ActionListener Obj_oyente2 = new Dame_La_Hora();
		
		Timer miTemporizador = new Timer(5000, Obj_oyente);	

		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Presiona aceptar para detener");
		
		System.exit(0);
		
	}
	
	
	

}

class Dame_La_Hora implements ActionListener {
	
	
	public void actionPerformed(ActionEvent evento ) {
		
		Date ahora = new Date();
		
		System.out.println("Te muestro la hora cada 5 segs: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}
