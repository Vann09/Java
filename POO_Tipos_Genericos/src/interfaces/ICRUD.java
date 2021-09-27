package interfaces;

import java.util.ArrayList;

public interface ICRUD <T1, T2>
{
	//T1 es el tipo de datos del objeto
	//T2 es el tipo de datos del campo del objeto que lo identifica como único. En una base de datos es la primary key.
	void nuevo (T1 item);	
	T1 leer(T2 id);
	ArrayList <T1> listar();
	void editar(T2 id, T1 item);
	void eliminar(T1 item);
	
}
