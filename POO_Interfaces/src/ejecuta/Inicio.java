package ejecuta;

import java.util.Scanner;

import clases.GestionListado;

public class Inicio {

	public static void main(String[] args) {
		/*  Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
		de 18 elementos. No se permitirán repetidos:
		
		Menú:
		1.- Introducir número entero.
		2.- Listar números.
		3.- Eliminar número.
		4.- Eliminar todos los números.
		5.- Salir. */
		
		GestionListado gestion = new GestionListado();
		Scanner sc = new Scanner (System.in);
		int opcion;
		int numero;
		String menu = "\n MENÚ \n"
				+ "1.- Introducir número entero.\n"
				+ "2.- Listar números.\n"
				+ "3.- Eliminar número.\n"
				+ "4.- Eliminar todos los números.\n"
				+ "5.- Salir.\n";
		
		do 
		{
			System.out.println(menu);
			System.out.println("Seleccione opción: ");
			
			try 
			{
				opcion=Integer.parseInt(sc.nextLine());
				switch (opcion)
				{
				case 1:
					System.out.println("Introduzca nº: ");
					numero = Integer.parseInt(sc.nextLine());				
					gestion.nuevo(numero);
					break;
					
				case 2:
					gestion.listar();
					break;
					
				case 3:
					System.out.println("Introduzca nº: ");
					numero = Integer.parseInt(sc.nextLine());
					gestion.eliminar(numero);
					break;
					
				case 4:
					gestion.eliminar();
					break;
					
				case 5:
					System.out.println("Programa cerrado.");
					break;
					
				default:
					System.out.println("Opción incorrecta.");
					break;
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Opcion incorrecta, debe introducir un número");
				opcion = 0;
			}
			
			
		}while (opcion!=5);
		sc.close();
	}

}
