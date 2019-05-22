import java.util.Scanner;
import javax.swing.JOptionPane;



public class posiciones {
	
	public static void main(String[] args) {
		
		int a, i;
		
		a= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el total de posiciones del vector"));
		
		int vectortotal[]= new int [a];
		for(i=0; i<vectortotal.length; i++) {
			
			vectortotal[i]=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el valor del vector en la posicion " + i));
		
		}
		
		for(i=0; i<vectortotal.length; i++){
			
			System.out.println(vectortotal[i]);
		}
	}
	
	
}
