package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		// Entras si eres mayor de edad y me enseñas el DNI o pasaporte
		
		int  edad ;
		boolean dni;
		boolean pasaporte;
		
		edad = 17;
		dni = true;
		pasaporte = false;
		
		if ( edad >= 18 && (dni == true || pasaporte == true)) {
			System.out.println("Entras");
		}
		else
			System.out.println("No entras");
	}
}