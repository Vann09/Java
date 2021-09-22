package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/* Programa que lee 4 números. Al finalizar mostrará el máximo introducido, y cuántas veces
		se repite dicho máximo. */
		
		Scanner sc = new Scanner (System.in);
		int num;
		int maximo = Integer.MIN_VALUE;
		int contRepetMax=0;
		
		for (int i=1; i<=4; i++) {
			System.out.println("Introduce un nº entero: ");
			num = sc.nextInt();
			
			if (num>maximo) {
				maximo = num;
				contRepetMax = 0;
			}
			
			else if (num == maximo) contRepetMax++;
		}
		sc.close();
		System.out.println("El mayor nº es " + maximo + " y se repite "+contRepetMax );
	}

}
