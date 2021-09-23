package paquete;

public class Vacaciones {
	
	//Campos
	private int dias;
	protected String destino;
	private boolean playa;
	
	//Constructores
	public Vacaciones(int dias, String destino, boolean playa) 
	{
		this.dias = dias;
		this.destino = destino;
		this.playa = playa;
	}

	public void mostrar() 
	{
		String texto = "DIAS: "+ this.dias+"\n"
						+ "DESTINO: "+ this.destino + "\n"
						+ "PLAYA: " + ((this.playa==true)?"Sí":"No");
		System.out.println(texto);
	}
	
}
