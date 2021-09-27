package clases;

import java.util.ArrayList;

import interfaces.ICRUD;

public class GestionCRUD <T1, T2> implements ICRUD<T1, T2>
{
	public GestionCRUD() 
	{
		listado = new ArrayList<T1>();
	}
	
	ArrayList<T1> listado;

	@Override
	public void nuevo(T1 item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T1 leer(T2 id) {
		
		return null;
	}

	@Override
	public ArrayList<T1> listar() {
		
		return null;
	}

	@Override
	public void editar(T2 id, T1 item) {
		
		
	}

	@Override
	public void eliminar(T1 item) {
		
		
	}
}
