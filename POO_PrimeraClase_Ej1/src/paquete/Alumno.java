package paquete;

public class Alumno {
	
	//Campos o propiedades
	public String nombre;
	public String apell1;
	public String apell2;
	
	//Constructores
	public Alumno() {
		
	}
	
	public Alumno(String p_nombre, String p_apell1, String p_apell2) {
		this.nombre = p_nombre;
		this.apell1 = p_apell1;
		this.apell2 = p_apell2;
		
	}
	
	//Metodos
	public void mostrar() {
		String mensaje;
		mensaje = "NOMBRE: " + this.nombre + "\n"
				+"PRIMER APELLIDO: " + this.apell1 + "\n"
				+"SEGUNDO APELLIDO: " + this.apell2;
		System.out.println(mensaje);
	}
	
	public int notas(int p_nota1, int p_nota2) {
		return  p_nota1+p_nota2;
	}
	public float notas(float p_nota1, float p_nota2) {
		return  p_nota1+p_nota2;
	}
}
