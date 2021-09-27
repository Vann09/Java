package clases;



public class Coche extends Vehiculo
{
	public boolean camara;
	public ECombustible combustible;
	
	public Coche(String tipo, int peso, String color, boolean camara, ECombustible combustible) {
		super(tipo, peso, color);
		this.camara = camara;
		this.combustible = combustible;
	}

	public Coche() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+ "CÁMARA: " + (camara? "Sí":"No") + "\n"
				+ "COMBUSTIBLE: "+ combustible +"\n";
	}

	
	
	
}
