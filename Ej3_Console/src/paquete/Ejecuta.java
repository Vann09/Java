package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		int numero1, numero2, suma;
		Scanner sc; 
		String mensaje;
		
		try 
		{
			sc = new Scanner(System.in);
			
			System.out.println("Introduce n�mero");
			numero1 = sc.nextInt();
			System.out.println("Introduce otro n�mero");
			numero2 = sc.nextInt();
			
			suma = numero1 + numero2;
			System.out.println("La suma es: "+ suma);
			sc.close();

		}
		catch(InputMismatchException e)
		{
			System.out.println("Formato Incorrecto. Debe introducir un n�mero entero");
		}
		catch (Exception e) 
		{
			mensaje = "Se ha producido un error desconocido." + e.getMessage();
			System.out.println(mensaje);
		}
		
	}

}
