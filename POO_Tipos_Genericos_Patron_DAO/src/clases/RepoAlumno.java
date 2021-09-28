package clases;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.ICRUD;

public class RepoAlumno implements ICRUD <Alumno, Integer>{

	public RepoAlumno() {
		listado=new HashMap<Integer, Alumno>();
	}
	
	public HashMap<Integer, Alumno> listado;
	
	@Override
	public void nuevo(Alumno clase) {
		listado.put(clase.matricula, clase);
		
	}

	@Override
	public Alumno leer(Integer id) {
		Alumno alumno = listado.get(id);
		return alumno;
	}

	@Override
	public ArrayList<Alumno> listar() {
		
		return null;
	}

	@Override
	public HashMap<Integer, Alumno> listar2() {
		
		return listado;
	}

	@Override
	public void editar(Integer id, Alumno clase) {
		listado.put(id,clase);
		
	}

	@Override
	public void eliminar(Alumno clase) {
		listado.remove(clase.matricula);
		
	}
	
	@Override
	public void eliminar2(Integer id) {
		
		if( this.listado.remove(id) == null) {
			System.out.println("No se ha eliminado porque no se encuentra.");
		}
		else {
			System.out.println("Eliminado.");
		}
	}

}
