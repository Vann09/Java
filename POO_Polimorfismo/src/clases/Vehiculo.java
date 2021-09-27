package clases;

public class Vehiculo 
{
	public String tipo;
	public int peso;
	public String color;
	
	public Vehiculo(String tipo, int peso, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.color = color;
	}

	public Vehiculo() 
	{}

	@Override
	public String toString() {
		//return String.format("Vehiculo [tipo=%s, peso=%s, color=%s]", tipo, peso, color);
		String texto;
		texto = "TIPO: "+tipo + "\n"
				+"PESO: "+peso+ "\n"
				+ "COLOR: "+color+"\n";
		return texto;
	}
	
	public void mostrar(Vehiculo v)
	{
		Tren t;
		Coche c;
		if(v instanceof Tren)
		{
			t = (Tren) v;
			System.out.println(t.toString());
		}
		else if ( v instanceof Coche)
		{
			c = (Coche) v;
			System.out.println(c.toString());
		}
	}
		
	
	
}
