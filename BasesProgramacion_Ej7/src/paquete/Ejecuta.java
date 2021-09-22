package paquete;

import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		/* 7. Programa que pide el número de calificaciones a introducir, y una nota de corte. A
		continuación se introducirán las calificaciones, para finalmente indicar cuántas
		calificaciones han igualado o superado la nota de corte. */
		
		float nota;
		float notaCorte;
		int cantidadNotas;
		int contCalificacion=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cuantas notas vas a guardar?");
		cantidadNotas = sc.nextInt();
		
		System.out.println("Introduce nota de corte");
		notaCorte =  sc.nextFloat();
		
		for (int contNota=1; contNota <= cantidadNotas; contNota++) {
			System.out.println("Introduce nota: ");
			nota = sc.nextFloat();
			if (nota >= notaCorte) {
				contCalificacion++;				
			}
		}
		
		sc.close();
		System.out.println(contCalificacion + " calificacion/es han igualado o superado la nota de corte");
		
	}

}
