package ejecuta;

import java.util.Scanner;

import clases.Alumno;
//import clases.Articulo;
import clases.RepoAlumno;
//import clases.RepoArticulo;

public class Inicio {

	public static void main(String[] args) {
		
		/* Ejemplo para el modelo Articulo----
		
		RepoArticulo repo=new RepoArticulo();
		Articulo articulo1 = new Articulo("A123","Monitor", 250F);
		Articulo articulo2 = new Articulo("A456","Teclado", 25F);
		Articulo art;
		
		repo.nuevo(articulo1);
		repo.nuevo(articulo2);
		
		art = repo.leer("A123");
		System.out.println(art.toString());
		
		repo.listar();
		
		//repo.eliminar(articulo1);
		art = new Articulo("A123", "Monitor curvo",300F);
		repo.editar("A123", art);
		
		repo.listar(); */
		
		
		RepoAlumno repo= new RepoAlumno();
		Scanner sc = new Scanner (System.in);
		int matricula;
		int opcion;
		Alumno alumno;
		String menu = "--MENÚ--\n"
				+"1. Listar \n"
				+"2. Leer alumno\n"
				+"3. Eliminar\n"
				+"4. Editar\n"
				+"5. Nuevo\n"
				+"6. Salir\n";
		
		do 
		{
			System.out.println(menu);
			System.out.println("Introduzca opción: ");
			opcion=Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			case 1:
				for (int matri: repo.listar2().keySet()) {
					alumno=repo.listar2().get(matri);
					System.out.println(alumno);
				}
				break;
				
			case 2:
				System.out.println("Introduce el número de matrícula");
				matricula=Integer.parseInt(sc.nextLine());
				
				if(repo.leer(matricula)==null)
				{
					System.out.println("No encontrado");
				}
				else
				{
					System.out.println(repo.leer(matricula));
				}
				break;
				
			case 3:
				System.out.println("Introduce el número de matrícula");
				matricula=Integer.parseInt(sc.nextLine());
				
				repo.eliminar2(matricula);
				break;
				
			case 4:
				System.out.print("Introduzca matrícula del alumno que desea modificar:");
				matricula = Integer.parseInt( sc.nextLine() );
				
				alumno = new Alumno();
				System.out.println("A continuación se le pedirá que introduzca los datos modificados:");
				
				System.out.println("\tMATRICULA: ");
				alumno.matricula = Integer.valueOf( sc.nextLine() );
				
				System.out.println("\tNOMBRE: ");
				alumno.nombre = sc.nextLine();
				
				repo.editar(matricula, alumno);
				break;
				
			case 5:
				alumno = new Alumno();
				System.out.println("A continuación se le pedirá que introduzca los datos del nuevo alumno:");
				
				System.out.println("\tMATRICULA: ");
				alumno.matricula = Integer.valueOf( sc.nextLine() );
				
				System.out.println("\tNOMBRE: ");
				alumno.nombre = sc.nextLine();	
				
				repo.nuevo(alumno);
				break;
				
			case 6:
				System.out.println("FIN DE PROGRAMA.");
				break;
				
			default:
				System.out.println("Opción incorrecta.");
				break;
			}
			
		}while(opcion!=6);
		sc.close();
	}

}
