package ejecuta;

import java.util.HashMap;


public class Inicio {

	public static void main(String[] args) {
		
		// HashMap<String, Integer> temperaturas = new HashMap <String, Integer>();
		var temperaturas = new HashMap <String, Integer>();
		
		temperaturas.put("Otoño", 25);
		temperaturas.put("Invierno", 5);
		temperaturas.put("Primavera", 28);
		temperaturas.put("Verano", 40);
		
		for (String i : temperaturas.keySet()) 
		{
			System.out.println("Estación: " + i + " Temp Max: "+temperaturas.get(i)+"ºC");
			
		}
		System.out.println("");
		temperaturas.remove("Primavera");

		for (String i : temperaturas.keySet()) 
		{
			System.out.println("Estación: " + i + " Temp Max: "+temperaturas.get(i)+"ºC");
		}
		System.out.println("");
		temperaturas.replace("Verano", 40, 44);
		
		for (String i : temperaturas.keySet()) 
		{
			System.out.println("Estación: " + i + " Temp Max: "+temperaturas.get(i)+"ºC");
		}
	
		
		
	}

}
