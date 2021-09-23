package ejecuta;

import clases.Curso;

public class inicio {

	public static void main(String[] args) {
		
		Curso java = new Curso();
		
		java.setDenominacion("Beca Java");
		java.setHoras(400);
		java.setAcademia("Experis");
		
		java.mostrar();
		
		Curso git = new Curso("Github", 5,"Telefonica");
		
		git.mostrar();
		
	}

}
