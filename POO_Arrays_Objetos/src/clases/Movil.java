package clases;

public class Movil 
{
	public Movil () 
	{	
	}
	
	public Movil(int memoria, String marca, int pantalla) {
		this.memoria = memoria;
		this.marca = marca;
		this.pantalla = pantalla;
	}
	
	
	private int memoria;
	private String marca;
	private int pantalla;
	
	
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPantalla() {
		return pantalla;
	}
	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}
	
	@Override
	public String toString() {
		String texto;
		
		texto = "MEMORIA: " + memoria + "\n"
				+ "MARCA: "+ marca +"\n"
				+ "TAMAÑO PANTALLA: "+pantalla+ "\n";
		
		return texto;
	}
	public void aumentaMemoria() 
	{
		memoria++;
	}
	
	
	
	
	
	
}
