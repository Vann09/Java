package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		// 1. Programa que lee dos números A y B, y nos informa si B es divisor de A o no.
				
		Scanner sc = new Scanner(System.in);
		String mensaje;
		
		System.out.println("Introduce el nº A");
		int a = sc.nextInt();
		
		System.out.println("Introduce el nº B");
		int b = sc.nextInt();
		
		if (a%b == 0) {
			mensaje = "Es divisor";
			//mensaje = b + " es divisor de " + a;
			//mensaje = String.valueOf(b) + " es divisor de " + String.valueOf(a);
			//mensaje = String.format("%d es divisor de %d", b, a);
		}
		else 
			mensaje = "No es divisor";
			//mensaje = b + " no es divisor de " + a;
			//mensaje = String.valueOf(b) + " no es divisor de " + String.valueOf(a);
			//mensaje = String.format("%d no es divisor de %d", b, a);
		
		System.out.println(mensaje);		
		sc.close();
		
	}
}
