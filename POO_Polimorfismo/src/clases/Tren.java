package clases;

public class Tren extends Vehiculo 
{
	public int vagones;
	public boolean largoRecorrido;
	
	public Tren(String tipo, int peso, String color, int vagones, boolean largoRecorrido) {
		super(tipo, peso, color);
		this.vagones = vagones;
		this.largoRecorrido = largoRecorrido;
	}

	public Tren() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+"Nº Vagones: " + vagones+ "\n"+"Largo Recorrido: "+ (largoRecorrido? "Sí":"No"+"\n");
	}
	
	
	
}
