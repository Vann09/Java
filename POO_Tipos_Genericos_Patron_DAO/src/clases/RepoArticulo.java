package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoArticulo implements ICRUD<Articulo, String>
{
	//Constructor
	public RepoArticulo() 
	{
		listado = new ArrayList<Articulo>();
	}
	//Campos
	public ArrayList <Articulo> listado;
	
		
	//Metodos
	@Override
	public void nuevo(Articulo clase) {
		listado.add(clase);
		
	}
	@Override
	public Articulo leer(String id) {
		Articulo articulo=null;
		
		for(int i=0; i<listado.size();i++)
		{
			articulo=listado.get(i);
			
			if(articulo.referencia.equals(id)==true)
			{
				break;
			}
		}
		return articulo;
	}
	@Override
	public ArrayList<Articulo> listar() {
		for (int i=0; i < listado.size(); i++)
		{
			System.out.println(listado.get(i));
		}
		return listado;
	}
	
	@Override
	public HashMap<String, Articulo> listar2() {
		
		return null;
	}
	
	@Override
	public void editar(String id, Articulo clase) {
		Articulo articulo;
		
		for(int i=0; i<listado.size();i++)
		{
			articulo=listado.get(i);
			boolean ok=false;
			
			if(articulo.referencia.equals(id)==true)
			{
				listado.set(i, clase);
				ok=true;
				break;
			}
			if (ok) {
				System.out.println("Elemento modificado.");
			}
			else System.out.println("Elemento no encontrado");
		}
		
	}
	
	@Override
	public void eliminar(Articulo clase) 
	{
		//Requiere @override del método equals de la clase Articulo
		boolean ok;
		
		ok=listado.remove(clase);
		
		if(ok==true) {
			System.out.println("ELIMINADO.");
		}
		else System.out.println("Registro no encontrado."); 
		
		/*
		Articulo articulo;
		boolean ok=false;
		for (int i=0; i<listado.size();i++) {
			articulo = listado.get(i);
			 
			if(articulo.referencia.equals(clase.referencia)==true) {
				listado.remove(i);
				ok = true
				break;
			 }
		}
		if(ok==true) {
			System.out.println("ELIMINADO.");
		}
		else System.out.println("Registro no encontrado."); 		 
		*/
	}
	
	@Override
	public void eliminar2(String id)
	{
		
	}
	


}
