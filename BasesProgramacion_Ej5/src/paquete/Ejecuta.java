package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/* 5. Programa que nos informa si un n�mero introducido es primo o no. */
		
		Scanner sc = new Scanner (System.in);
		int cont=0;
		int num;
		
		System.out.println("Introduce un n�: ");
		num = sc.nextInt();
		
		for (int i=1 ;i<=num;i++) {
			if (num%i ==0) cont++;
		}
		if (cont <=2 && cont !=1) System.out.println("El n� es primo");
		else System.out.println("El n� no es primo");
		sc.close();
	}

}
