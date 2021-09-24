package ejecuta;

import clases.Hamster;

public class Inicio {

	public static void main(String[] args) {
		
		/*Mascota mascota1= new Mascota("Fluffy",3);
		
		//System.out.println(mascota1.mostrar());
		
		System.out.println(mascota1.toString());*/
		
		Hamster miHamster = new Hamster("pardo","Orijen", "Lans", 2);
		
		System.out.println(miHamster.toString());
	}

}
