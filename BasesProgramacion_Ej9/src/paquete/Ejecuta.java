package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*  Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
		el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
		llegaste”, según corresponda. De la misma manera, y al terminar el programa, se
		mostrarán los mensajes “Acertaste” o bien “Intentos agotados”. */
		
		Scanner sc = new Scanner (System.in);
		int player1;
		int player2=0;
		int guess=0;
		
		System.out.println("Introduce un número entre el 1 y 100");
		player1 = sc.nextInt();
		
		 while (player2 != player1) {
			System.out.println("Adivina el nº ");
		    player2 = sc.nextInt();
		    guess += 1;
		    if (guess == 10) break;
		    else if (player2 < player1) System.out.println ("Tú número es demasiado pequeño, sigue intentandolo");
		    else if (player2 > player1) System.out.println("Tú número es demasiado grande, sigue intentandolo");
		    else if (player2 == player1) System.out.println("Felicidades, has acertado");		   		    	
		 }
		 sc.close();
		 
		 if(guess == 10) {
			 System.out.println("Intentos agotados");
		 }
		
		else System.out.println("Has necesitado " + guess +" intentos.");
		
		

	}

}
