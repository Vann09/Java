package paquete;


public class Ejecuta {

	public static void main(String[] args) {
		Alumno alumno1;
		Alumno alumno2;
		
		alumno1 = new Alumno();
		alumno1.nombre = "Jose";
		alumno1.apell1 = "Santos";
		alumno1.apell2 = "Hera";
		
		alumno1.mostrar();
		var suma = alumno1.notas(2, 10);
		System.out.println(suma+ "\n");
		
		alumno2 = new Alumno("Maria","Esteban","Vidal");	
		alumno2.mostrar();
		
		var suma2 = alumno2.notas(5.8f, 5.5f);
		System.out.println(suma2 + "\n");
	}

}
