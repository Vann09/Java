package paquete;

import java.util.Calendar;
import java.util.Scanner;

public class Ejecuta {

	public static void main(String[] args) {
		
		/*11. Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
		a�o de nacimiento. */
		
		Scanner sc = new Scanner (System.in);
		float edadMedia;
		int edad, yearNaci, edadMin= Integer.MAX_VALUE, contalum=0, sumaEdad=0;
		int year=Calendar.getInstance().get(Calendar.YEAR);
		String nombreMenor ="";
		String nombre;
		
		System.out.println("Introduce nombre: ");
		nombre=sc.nextLine();
		
		while (nombre.toLowerCase().equals("fin")==false) {	
			
			contalum++;
			System.out.println("Introduce a�o de nacimiento: ");
			yearNaci=Integer.parseInt(sc.nextLine());
			edad = year - yearNaci;
			sumaEdad += edad;
				
			if (edad < edadMin) {
				edadMin = edad;
				nombreMenor=nombre;
			}
			System.out.println("Introduce nombre: ");
			nombre=sc.nextLine();
			
		};
		
		sc.close();
		edadMedia = (float)sumaEdad / (float)contalum;
		System.out.println("La media de edad de los alumnos es de "+ edadMedia + "\n"
							+"y el m�s joven es "+nombreMenor);
	}

}