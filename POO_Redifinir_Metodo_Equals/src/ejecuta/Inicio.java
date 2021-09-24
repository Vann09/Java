package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Inicio {

	public static void main(String[] args) {
		
		HashMap<Integer, Movil> moviles = new HashMap <Integer,Movil>();
		//var moviles = new HashMap<Integer, Movil>();
		Movil movilJulian = new Movil (112, 4, "Xiaomi", 8);
		Movil movilMaria = new Movil (12, 5, "Poco", 8);
		Movil movilPedro = new Movil (121, 6, "Samsung", 10);
		
		Movil movilBusqueda = new Movil(12, 5, "Poco", 10);
		/* var movilJulian = new Movil (112, 4, "Xiaomi", 8);
		var movilMaria = new Movil (12, 5, "Poco", 8);
		var movilPedro = new Movil (121, 6, "Samsung", 10); */
		
		moviles.put(121, movilPedro);
		moviles.put(movilJulian.getImei(), movilJulian);
		moviles.put(12, movilMaria);
		
		
		
		System.out.println(movilJulian.equals(movilBusqueda));
		
	}

}
