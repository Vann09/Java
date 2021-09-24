package clases;

public class Movil 
{
	public Movil () 
	{	
	}
	
	public Movil(int imei, int memoria, String marca, int pantalla) {
		this.imei = imei;
		this.memoria = memoria;
		this.marca = marca;
		this.pantalla = pantalla;
	}
	
	private int imei;
	private int memoria;
	private String marca;
	private int pantalla;
	
	
	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

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
	public boolean equals(Object objetoCompara)
	{
		Movil movilCompara = (Movil )objetoCompara;
		boolean iguales = this.pantalla == movilCompara.pantalla;
				
		return iguales;
	}
	
	
	
	
	
}
