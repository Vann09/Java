package clases;

public class Mascota {

	//Campos
	public String nombre;
	public int edad;
	
	//Constructores
	public Mascota() {}
	
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Metodos
	/*public String mostrar() 
	{
		String texto;
		
		texto = "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
		
		return texto;
	}*/

	@Override
	public String toString() 
	{
		String texto;
		
		texto = "NOMBRE: " + nombre + "\n"
				+ "EDAD: " + edad + "\n";
		
		return texto;
	}



	
	
	
}
