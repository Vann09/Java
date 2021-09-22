package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		 int numero;
		 double miDoble;
		 float miFloat;
		 Scanner sc = new Scanner(System.in);
		 
		 numero = Integer.MAX_VALUE;
		 miDoble = Double.MAX_VALUE;
		 miFloat = Float.MAX_VALUE;
		 
		 System.out.println("El valor más grande para un tipo int es " + numero);
		 System.out.println("El valor más grande para un tipo double es " + miDoble);
		 System.out.println("El valor más grande para un tipo float es " + miFloat);
		 sc.close();
	};

}
