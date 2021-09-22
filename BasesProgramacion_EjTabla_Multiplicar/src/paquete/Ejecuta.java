package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		// Tabla de multiplicar
		
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.println("Dime un nº: ");
		num = sc.nextInt();
		
		System.out.println("Tabla de multiplicar de " + num);
		System.out.println("===================================");
		
		sc.close();
		for (int i=0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
			

	}

}
