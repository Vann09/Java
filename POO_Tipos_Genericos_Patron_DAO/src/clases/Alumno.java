package clases;

public class Alumno {
	public int matricula; //PK
	public String nombre;
	
	public Alumno(int matricula, String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}
	public Alumno(int matricula) 
	{
		matricula = matricula;
	}
	
	public Alumno() 
	{
	}
	@Override
	public String toString() {
		
		return "MATRICULA: "+matricula+"\n"
				+"NOMBRE: "+nombre+"\n";
	}
	
	
	
	/* 
	@Override
	public boolean equals(Object obj) 
	{
		return ((Alumno)obj).matricula == this.matricula;
	} */
	
	
	
}
