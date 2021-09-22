package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		/*19.Realiza un programa que lea desde teclado 4 números y posteriormente muestre
		solamente los que sean pares. */
		
		Scanner sc = new Scanner(System.in);
		int n=4;
		int[] numeros = new int [n];
		
		System.out.println("Introduce "+n+" numeros");
		for (int i=0;i<n;i++) {
			numeros[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println();
		System.out.println("Los nº pares son: ");
		for (int i=0;i<n;i++) {
			if(numeros[i]%2==0) {
				
				System.out.println(numeros[i]);
			}
		}
		System.out.println("El contenido de la array es --> "+Arrays.toString(numeros));
		
	}
}