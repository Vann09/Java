package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
	    3. Programa que lee de manera consecutiva números hasta que se introducen dos números
		iguales seguidos.
		 */
		
		Scanner sc = new Scanner (System.in);
		int num;
		int otroNum;
		boolean continuar=true;
		
		System.out.println("Introduce un nº: ");
		num = sc.nextInt();
		
		do {
			System.out.println("Introduce otro nº: ");
			otroNum = sc.nextInt();
			
			if (num==otroNum) {
				continuar = false;
			}
			num = otroNum;
			
		}while (continuar==true);
		
		sc.close();
		System.out.println("Fin");
	}

}
