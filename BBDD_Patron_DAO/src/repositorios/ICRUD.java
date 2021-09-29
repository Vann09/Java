package repositorios;

import java.util.ArrayList;

public interface ICRUD <MODELO, PK> 
{
	ArrayList<MODELO> listar() throws Exception;
	MODELO leer(PK pk);
	
	void nuevo(MODELO modelo)throws Exception;
	void editar (PK pk, MODELO modelo);
	
	void elimar (PK pk) throws Exception;
}
