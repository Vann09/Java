package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		
		//String nombre;
		
		//nombre = "Juan";
		
		//var apellido = "Perez";
		//var edad = 54;
		
		int dividendo = 8;
		int divisor = 3;
		
		System.out.println((double)dividendo / (double)divisor);
		
		System.out.println("El divisor vale " + String.valueOf(divisor) );
		
		int resto = 30%2;
		
		if (resto ==0) {
			System.out.println("Par");
		}
		else
			System.out.println("Impar");

	}

}
