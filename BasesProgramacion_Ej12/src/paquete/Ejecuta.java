package paquete;

public class Ejecuta {

	public static void main(String[] args) {
		/*12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		número es primo si tiene dos únicos divisores que son el 1 y él mismo.*/ 
		
		boolean primo;
		//el primero primo es 2, empiezo desde aqui
		for (int num=2;num<=100;num++) {
			primo=true;
			for(int divisor=2;divisor<=num/2;divisor++) {
				if(num%divisor==0) primo = false;
			}
			if (primo) System.out.println(num);
		}
		System.out.println("FIN");
	}
}
