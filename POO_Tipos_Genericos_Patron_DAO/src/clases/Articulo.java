package clases;

public class Articulo 
{
	public String referencia; //PK
	public String nombre;
	public float precio;
	
	public Articulo(String referencia, String nombre, float precio) 
	{
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Articulo() 
	{
	}
	
	@Override
	public String toString() 
	{
		return "REFERENCIA: "+referencia+"\n"
				+"NOMBRE: "+nombre+"\n"
				+"PRECIO: " + precio + "€\n";
	}
	
	//Modifico el metodo equals para usarlo en el remove de RepoArticulo
	@Override
	public boolean equals(Object obj)
	{
		
		return ((Articulo)obj).referencia.equals(referencia);
	}
	
	
	
	
}
