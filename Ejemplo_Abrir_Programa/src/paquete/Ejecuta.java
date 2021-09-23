package paquete;


import java.io.IOException;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("MENU");
		System.out.println("===================");
		System.out.println("1 - Calculadora");
		System.out.println("2 - Bloc de notas");
		System.out.println("3 - Salir");
		System.out.println("Introduce opcion");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			try {
			
			Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
			} 
			catch (IOException e) {
			
			System.out.println("Programa no encontrado.");
			}
			break;
		case 2:
			try {
			
			Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
			} 
			catch (IOException e) {
			
			System.out.println("Programa no encontrado.");
			}
			break;
		case 3:
			
			System.out.println("Fin.");
			break;
		}
		sc.close();
		
	}

}
