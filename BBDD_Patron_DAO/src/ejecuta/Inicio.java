package ejecuta;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Alumno;
import repositorios.RepoAlumno;

public class Inicio {

	public static void main(String[] args) 
	{
		RepoAlumno repo = new RepoAlumno(/*servidor, usuario, password, bbdd*/);
		Alumno alumno = new Alumno();
		int matricula;
		ArrayList<Alumno> datos;
		Scanner sc = new  Scanner(System.in);
		
		int opcion;
		String menu = "\n--MENÚ--\n"
					+ "1. NUEVO\n"
					+ "2. LISTAR\n"
					+ "3. LEER\n"
					+ "4. ELIMINAR\n"
					+ "5. MODIFICAR\n"
					+ "6. SALIR\n";
		
		do 
		{
			System.out.println(menu);
			System.out.print("Introduzca opción: ");
			opcion = Integer.parseInt( sc.nextLine() );
			
			switch(opcion)
			{
				
			case 1:
					alumno = new Alumno();
				
					System.out.println("Introduzca matrícula");
					alumno.matricula = Integer.valueOf( sc.nextLine() );
					
					System.out.println("Introduzca nombre");
					alumno.nombre = sc.nextLine();
					
					System.out.println("Introduza apellido");
					alumno.apellido = sc.nextLine();
					
					try
					{
						repo.nuevo(alumno);
					} 
					catch (Exception e) 
					{
						System.out.println("No se ha añadido. Se ha producido un error.");
					}			
					break;
				
				case 2:
					try 
					{
						datos = repo.listar();
						
						if(datos.size()==0)
						{
							System.out.println("Sin datos.");
						}
						else
						{
							for(Alumno al : datos) 
							{
								System.out.println( al.toString() );
							}
						}
					}
					catch (Exception e) 
					{
						System.out.println("No se han listado las filas. Se ha producido un error.");
					}					
					break;
				
				case 3:
					try 
					{
						System.out.println("Introduzca matrícula");
						matricula = Integer.valueOf( sc.nextLine() );
						
						alumno = repo.leer(matricula);
						if(alumno!=null)
						{
							System.out.println( alumno.toString() );	
						}
						else
						{
							System.out.println("No se ha encontrado la fila.");
						}
					}
					catch (Exception e) 
					{
						System.out.println("Se ha producido un error al leer la fila.");		
					}					
					break;
				
				case 4:
					System.out.println("Introduzca matrícula");
					matricula = Integer.valueOf( sc.nextLine() );
					
					try 
					{
						repo.eliminar(matricula);
					} 
					catch (Exception e) 
					{
						System.out.println("Se ha producido un error al eliminar el registro.");
					}					
					break;
				
				case 5:
					alumno=new Alumno();
					
					System.out.println("Introduzca matrícula del alumno a modificar:");
					matricula = Integer.valueOf( sc.nextLine() );
					
					System.out.println("A continuación se le pedirán los nuevos datos del alumno:");
					
					System.out.print("\tMATRICULA: ");
					alumno.matricula = Integer.valueOf( sc.nextLine() );
					
					System.out.print("\tNOMBRE: ");
					alumno.nombre = sc.nextLine();
					
					System.out.print("\tAPELLIDO: ");
					alumno.apellido = sc.nextLine();
					
					try 
					{
						repo.editar(matricula, alumno);
					} 
					catch (Exception e) 
					{
						System.out.println("Se ha producido un error al modificar la fila.");
					}					
					break;
				
				case 6:
					System.out.println("Fin Programa.");
					break;
				default:
					System.out.println("Opción incorrecta.");
					break;
			}
			
		} while(opcion!=6);
		
		sc.close();
	}
}
