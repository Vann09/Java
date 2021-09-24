package ejecuta;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		/* Movil moviles[] = {new Movil (8,"Samsung",8),
		 					new Movil(4,"Nokia",6),
		   					new Movil(12,"Apple",10)
		   					};*/
		
		Movil moviles[] = new Movil[3];
		Movil m1 = new Movil(8,"Samsung",8);
		Movil m2 = new Movil(4,"Nokia",6);
		Movil m3 = new Movil(12,"Apple",10);
		
		moviles[0] = m1;
		moviles[1] = m2;
		moviles[2] = m3;
		
		for (int i=0;i<moviles.length;i++) System.out.println(moviles[i].toString());

	}

}
