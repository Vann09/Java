package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		2. Programa que lee 3 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 3 números válidos y mostrará el número máximo y minimo introducido de los
		3 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		*/
		
		Scanner sc = new Scanner(System.in);
		int numero;
		int contNumValid = 0;
		int contError = 0;
		int maximo = 19;
		int minimo = 41;
		String mensaje;
		
		do {
			System.out.println("Introduce nº: ");
			numero = sc.nextInt();
			
			if (numero>=20 && numero<=40) {
				contNumValid++;
				if (maximo<numero) {
					maximo = numero;
				}
				if (minimo>numero) {
					minimo = numero;
				}	
			}
			else {
				System.out.println("Fuera de rango. Introduzca un nº entre 20 y 40");
				contError++;
			}
				
		}while (contNumValid <3);
		
		sc.close();
		
		mensaje = "El nº máximo es " + maximo + "\n" 
				+ "El nº mínimo es " + minimo + "\n" 
				+ contError + " números no han sido válidos";
		
		System.out.println(mensaje);		
		
		/* NO RECOMENDABLE
		  	for (int i=1; i<=3;){
			System.out.println("Introduce nº: ");
			numero = sc.nextInt();
			
			if (numero<20 || numero >40) {
				System.out.println("Fuera de rango. Introduzca un nº entre 20 y 40");
			}
			else i++;
		}*/
	}

}
