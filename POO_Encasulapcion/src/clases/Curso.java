package clases;

public class Curso {
	
	//Constructor
	public Curso() {
		
	}
	public Curso(String denominacion, int horas, String academia) {
		setDenominacion(denominacion);
		setHoras(horas);
		setAcademia(academia);
	}
	
	//Campos	
	private String denominacion;
	private int horas;
	private String academia;
	
	//Metodos
	// setters
	
	public String getDenominacion() {
		String respuesta;
		//return this.denominacion;
		if(this.denominacion.equals("")==true) respuesta="Sin denominación";
		else respuesta=this.denominacion.toUpperCase();
		return respuesta;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public String getAcademia() {
		return this.academia;
	}
	
	//getters
	
	public void setDenominacion(String p_denominacion) {
		this.denominacion=p_denominacion;
	}
	
	public void setHoras(int p_horas) {
		this.horas=p_horas;
	}
	
	public void setAcademia(String p_academia) {
		this.academia=p_academia;
	}
	
	public void mostrar() {
		System.out.println(getDenominacion());
		System.out.println(getHoras()+" horas");
		System.out.println(getAcademia()+"\n");
	}
}
