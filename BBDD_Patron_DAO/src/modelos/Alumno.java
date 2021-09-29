package modelos;

public class Alumno 
{
	public int matricula; //PK
	public String apellido;
	public String nombre;
	
	public Alumno(int matricula, String apellido, String nombre) {
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public Alumno(int matricula) {
		this.matricula = matricula;
	}

	public Alumno() 
	{
	}

	@Override
	public String toString() {
		return "Alumno -> "+" Matricula: "+matricula+" Nombre: "+nombre+" Apellido: "+apellido;
	}
	
	
}
