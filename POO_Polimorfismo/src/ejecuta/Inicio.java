package ejecuta;

import clases.Coche;
import clases.ECombustible;
import clases.Tren;
import clases.Vehiculo;

public class Inicio {

	public static void main(String[] args) {
		
		Vehiculo[] vehiculos=new Vehiculo[2];
		
		Coche miCoche = new Coche("Coche",1300, "Rojo",true,ECombustible.diesel);
		Tren miTren = new Tren("Tren", 14000, "Amarillo", 5, false);
		
		//System.out.println(miCoche.toString());
		//System.out.println(miTren.toString());
		
		//1. Hago uso del polimorfismo para almacenar en el array objetos de distinto tipo
		vehiculos[0]=miCoche;
		vehiculos[1]=miTren;
		
		for (int i=0; i<vehiculos.length;i++)
		{
			Vehiculo veh = vehiculos[i];
			if(veh instanceof Tren)
			{
				miTren = (Tren) veh;
				System.out.println(miTren.toString());
			}
			else if (veh instanceof Coche)
			{
				miCoche = (Coche) veh;
				System.out.println(miCoche.toString());
			}
			
		}
		//2. Instanciar un objeto de un tipo como otro
		Vehiculo v = new Tren();
		
		//3. Traspaso de parametros
		v.mostrar(miTren);
		v.mostrar(miCoche);
		
	}

}
