package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
		2. Programa que lee 3 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
		mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
		se hayan introducido 3 n�meros v�lidos y mostrar� el n�mero m�ximo y minimo introducido de los
		3 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos.
		*/
		
		Scanner sc = new Scanner(System.in);
		int numero;
		int contNumValid = 0;
		int contError = 0;
		int maximo = 19;
		int minimo = 41;
		String mensaje;
		
		do {
			System.out.println("Introduce n�: ");
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
				System.out.println("Fuera de rango. Introduzca un n� entre 20 y 40");
				contError++;
			}
				
		}while (contNumValid <3);
		
		sc.close();
		
		mensaje = "El n� m�ximo es " + maximo + "\n" 
				+ "El n� m�nimo es " + minimo + "\n" 
				+ contError + " n�meros no han sido v�lidos";
		
		System.out.println(mensaje);		
		
		/* NO RECOMENDABLE
		  	for (int i=1; i<=3;){
			System.out.println("Introduce n�: ");
			numero = sc.nextInt();
			
			if (numero<20 || numero >40) {
				System.out.println("Fuera de rango. Introduzca un n� entre 20 y 40");
			}
			else i++;
		}*/
	}

}
