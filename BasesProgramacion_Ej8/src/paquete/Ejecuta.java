package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/* Programa que lee 4 n�meros. Al finalizar mostrar� el m�ximo introducido, y cu�ntas veces
		se repite dicho m�ximo. */
		
		Scanner sc = new Scanner (System.in);
		int num;
		int maximo = Integer.MIN_VALUE;
		int contRepetMax=0;
		
		for (int i=1; i<=4; i++) {
			System.out.println("Introduce un n� entero: ");
			num = sc.nextInt();
			
			if (num>maximo) {
				maximo = num;
				contRepetMax = 0;
			}
			
			else if (num == maximo) contRepetMax++;
		}
		sc.close();
		System.out.println("El mayor n� es " + maximo + " y se repite "+contRepetMax );
	}

}
