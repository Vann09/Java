package clases;

import java.util.ArrayList;
import java.util.Collections;

import interfaces.IGestionListado;

public class GestionListado implements IGestionListado {

	public ArrayList <Integer> listado; 
	
	
	public GestionListado() 
	{
		listado = new ArrayList<Integer>();
	}
	
	@Override
	public void nuevo(int numero) 
	{
		if (listado.size()==18)
		{
			System.out.println("No introducido, el listado esta lleno.");		
		}
		else if (listado.contains(numero))
		{
			System.out.println("No introducido, número ya incluido");
		}
		else listado.add(numero);
	}

	@Override
	public void listar() 
	{
		if (listado.size()==0) {
			System.out.println("Listado sin datos");
		}
		else
		{
			System.out.println("Contenido del listado: ");
			Collections.sort(listado);
			//listado.sort(null);
			for (int i=0; i < listado.size(); i++)
			{
				System.out.println(listado.get(i));
			}
			System.out.println("");
		}		
	}

	@Override
	public void eliminar(Integer numero) {
		//Elimino y compruebo si el elemento esta a la vez
		if(listado.remove(numero)==false)
		{
			System.out.println("No se ha eliminado, elemento no encontrado.");
		}		
	}

	@Override
	public void eliminar() {
		listado.clear();
		System.out.println("El listado ha sido vaciado.");		
	}

}
