package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*
	    3. Programa que lee de manera consecutiva n�meros hasta que se introducen dos n�meros
		iguales seguidos.
		 */
		
		Scanner sc = new Scanner (System.in);
		int num;
		int otroNum;
		boolean continuar=true;
		
		System.out.println("Introduce un n�: ");
		num = sc.nextInt();
		
		do {
			System.out.println("Introduce otro n�: ");
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
