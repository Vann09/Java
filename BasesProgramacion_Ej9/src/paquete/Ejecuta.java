package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/*  Programa consistente en un juego en el que el Jugador1 introduce un n�mero entre el 1 y
		el 100 y el Jugador2 tendr� que adivinarlo en un m�ximo de 10 intentos. Por cada intento
		del Jugador2, y en el caso de no acertar, se mostrar� el mensaje �Te pasaste�, o �No
		llegaste�, seg�n corresponda. De la misma manera, y al terminar el programa, se
		mostrar�n los mensajes �Acertaste� o bien �Intentos agotados�. */
		
		Scanner sc = new Scanner (System.in);
		int player1;
		int player2=0;
		int guess=0;
		
		System.out.println("Introduce un n�mero entre el 1 y 100");
		player1 = sc.nextInt();
		
		 while (player2 != player1) {
			System.out.println("Adivina el n� ");
		    player2 = sc.nextInt();
		    guess += 1;
		    if (guess == 10) break;
		    else if (player2 < player1) System.out.println ("T� n�mero es demasiado peque�o, sigue intentandolo");
		    else if (player2 > player1) System.out.println("T� n�mero es demasiado grande, sigue intentandolo");
		    else if (player2 == player1) System.out.println("Felicidades, has acertado");		   		    	
		 }
		 sc.close();
		 
		 if(guess == 10) {
			 System.out.println("Intentos agotados");
		 }
		
		else System.out.println("Has necesitado " + guess +" intentos.");
		
		

	}

}
