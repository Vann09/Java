package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/* 6. Programa que lee 4 números, y en el caso en el que el primero 
		   introducido sea igual al último, nos muestra la media. 
		   En caso contrario, no se mostrará nada. */
		
		Scanner sc = new Scanner (System.in);
		int primer;
		int ultimo=0;
		int suma=0; //acumulador
		float media;
		
		System.out.println("Introduce un nº: ");
		primer = sc.nextInt();
		suma += primer;
		
		for (int i=2; i<5; i++) {
			System.out.println("Introduce otro nº: ");
			ultimo = sc.nextInt();
			suma += ultimo;			
		}
				
		sc.close();
		
		if (primer == ultimo) {
			media = suma/4F;
			System.out.println("La media es "+ media);
		}	

	}

}