package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		//Mostrar las 10 primeras tablas de multiplicar
		
		
		for (int num=1; num<=10; num++) {
			int suma=0;
			System.out.println("Tabla de multiplicar de " + num);
			System.out.println("================================");
			for(int i=1;i<=10;i++) {							
				System.out.println(num + " x " + i + " = " + num*i);
				suma = suma + num*i;
			}			
			System.out.println("La suma vale "+ suma);
			System.out.println();
		}
	}
}
