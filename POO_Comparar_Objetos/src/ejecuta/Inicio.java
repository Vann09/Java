package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		/* Movil moviles[] = {new Movil (8,"Samsung",8),
		 					new Movil(4,"Nokia",6),
		   					new Movil(12,"Apple",10)
		   					};*/
		
		Movil movilPedro = new Movil(1, 8,"Samsung",8);
		Movil movilJulia = new Movil(2, 4,"Nokia",6);
		
		if (movilPedro.getImei() == movilJulia.getImei()) 
		{
			System.out.println("Mismo movil");
		}
		else System.out.println("Diferente");
		
		

	}

}
