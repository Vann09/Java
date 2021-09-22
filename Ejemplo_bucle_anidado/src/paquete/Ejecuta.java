package paquete;

import java.util.Random;

public class Ejecuta {

	public static void main(String[] args) {
		
		int segundos;
		int aleatorio;
		Random r= new Random();
		
		for(int corredor=1;corredor<=10;corredor++) {
			segundos=0;
			aleatorio = r.nextInt(20)+1;
			//Generamos un valor aleatorio entre 0 y 19
			for(;segundos<=aleatorio;segundos++) 
			if (segundos<10) {
				System.out.println("Rápido, su tiempo ha sido de " + segundos);
			}
			else System.out.println("Lento, su tiempo ha sido de " + segundos);
		}	

	}

}
