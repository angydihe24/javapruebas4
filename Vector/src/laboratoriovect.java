import java.util.Random;


public class laboratoriovect {
	
	
	public static void main(String [] args) {
		
		Random rm=new Random();
		int i, num;
		
		
		//CREANDO VECTOR
		
		
		int vector[]=new int[5];
		System.out.println("Creando vector");
		
		
		//ciclo repetitivo( length posicion maxima) i++(de uno en uno)
		
		for (i=0;i<vector.length;i++) {
			num=rm.nextInt(9);
			
			vector[i]=num;
				
		}
		System.out.println("Imprimiendo Vector" );
		
		for (i=0;i<vector.length;i++) {
			System.out.println(i+"=["+vector[i]+"]");
		}
		
		System.out.println("Vector imprimiendo con exito");
		
		
	}

}
