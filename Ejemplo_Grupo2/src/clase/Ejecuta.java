package clase;

import paquete.Coche;

public class Ejecuta {

	public static void main(String[] args) {
	
		Coche C1 = new Coche("JMFGH","Renault","Verde", 120, true);
		Coche C2= new Coche();
		
		C2.setMatricula("JHYTM");
		C2.setModelo("Citröen");
		C2.setColor("Plateado");
		C2.setCv(90);
		C2.setTechosolar(false);
		
		C1.mostrar();
		C2.mostrar();
		
		C1.setColor("Rojo");
		C1.setTechosolar(false);
		C1.mostrar();
	}

}
