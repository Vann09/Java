package ejecuta;

import java.util.ArrayList;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil movilJuan = new Movil(111,8,"Samsung",8);
		Movil movilAdrian = new Movil(135,12,"Apple",8);
		Movil movilMarta = new Movil(120,12,"Honor",10);
		
		moviles.add(movilJuan);
		moviles.add(movilAdrian);
		moviles.add(movilMarta);
		
		for ( Movil i:moviles) System.out.println(i);
	}

}
