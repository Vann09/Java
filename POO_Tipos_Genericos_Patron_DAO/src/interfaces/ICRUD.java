package interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public interface ICRUD <CLASE, ID>
{
	
	void nuevo (CLASE clase);	
	
	CLASE leer(ID id);
	ArrayList <CLASE> listar();
	HashMap<ID, CLASE> listar2();
	
	void editar(ID id, CLASE clase);
	
	void eliminar(CLASE clase);
	void eliminar2(ID id);
	
}
