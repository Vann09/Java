package paquete;

public class Coche {

	private String matricula;
	private String modelo;
	private String color;
	private int cv;
	private boolean techosolar;
	
	public Coche() {
		
	}

	public Coche(String matricula, String modelo, String color, int cv, boolean techosolar) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
		this.cv = cv;
		this.techosolar = techosolar;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public boolean isTechosolar() {
		return techosolar;
	}

	public void setTechosolar(boolean techosolar) {
		this.techosolar = techosolar;
	}
	
	public void mostrar() {
		System.out.println("Matricula: "+ matricula + "\n" 
				+ "Modelo: "+ modelo +"\n" + "Color: "+ color + "\n" 
				+ "Potencia: "+ cv + "\n" 
				+ "Techo solar: " + ((techosolar)? "Sí":"No") + "\n" );
	}

}
