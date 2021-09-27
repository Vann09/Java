package paquete;

import java.util.Scanner;

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

			String menu;
			Scanner sc = new Scanner (System.in);
			int [] numeros= new int[18];
			int num;
			int i=0;
			int j;
			int contIntercambio;
			int aux;
			int opcion;
			
			menu="MENÚ \n"
				+"1.- Introducir número entero. \n"
				+"2.- Listar números.\n"
				+"4.- Eliminar un número. \n"
				+"3.- Eliminar todos los números. \n"
				+"5.- Salir.\n";
			
			do 
			{
				System.out.println(menu);
				System.out.print("Introduzca opción: ");
				opcion = sc.nextInt();
				
				switch (opcion) 
				{
				case 1:
					if (i==18)
					{
						System.out.println("Lista llena.");
					}
					else 
					{
						//Pedimos nº y comprobamos que no se repita
						System.out.println("Introduzca nº: ");
						num = sc.nextInt();
						
						for (j=0;j<i && numeros[j]!=num;j++);
						
						if (i==j) 
						{
							numeros[i]=num;
							i++;
							//Ordeno ascendentemente
							do
							{
								contIntercambio=0;
								//Recorro desde el principio hasta el penultimo elemento
								for (j=0;j<-1;j++)
								{
									if(numeros[j]>numeros[j+1])
									{
										aux = numeros[j];
										numeros[j]=numeros[j+1];
										numeros[j+1]=aux;
										contIntercambio++;
									}
								}
							}while (contIntercambio>0);
						}
						else 
						{
							System.out.println("Número repetido. No se añadirá a la lista.\n");
						}			
					}							
					break;
					
				case 2:
					if(i==0)
					{
						System.out.println("Sin datos.");
					}
					else 
					{
						System.out.println("Contenido del array:");
						for(j=0; j<i; j++) System.out.println( numeros[j] );
					}
				break;
					
				case 3:
					System.out.println("Introduzca nº: ");
					num=sc.nextInt();
					
					for (j=0; j<1 && numeros[j]!=num; j++);
										
					if (i==j) System.out.println("No encontrado.");
					else 
					{
						for (int k=j; k<i-1;k++)
						{
							numeros[k] = numeros[k+1];
						}							
						//Reducimos en una unidad i, puesto que se ha eliminado un elemento	
						i--;
					}	
					break;
					
				case 4:
						i=0;
						numeros = new int[18];
					break;
					
				case 5:
							System.out.println("Programa cerrado.");			
					break;
					
				default:
					System.out.println("Opción incorrecta");
					break;
				}
				
			}while (opcion!=5);		
			sc.close();
	}

}
