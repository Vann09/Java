package clases;

public class Hamster extends Mascota {

	public String colorPelo;
	public String marcaPienso;
	
	public Hamster(String colorPelo, String marcaPienso,
				String nombre, int edad) 
	{
		super(nombre, edad);
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}

	public Hamster() 
	{
		super();
	}
	
	@Override
	public String toString() 
	{
		String texto;
		
		texto=super.toString()
				+ "COLOR PELO: "+ colorPelo + "\n"
				+ "MARCA DE PIENSO: "+ marcaPienso + "\n";
		
		return texto;
	}
	
}
