package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/* 4. Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no
		se incluir� el propio n�mero */
		
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Introduce un n� mayor a cero: ");
		num = sc.nextInt();
		
		for (int posibleDivisor=1; posibleDivisor<num; posibleDivisor++)
		//for (int i=1; i<num/2; i++)
		{
				if (num%posibleDivisor == 0) {
					System.out.println(posibleDivisor);
				}
			}
		sc.close();
	}
}
