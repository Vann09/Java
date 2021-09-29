package clases;

import java.util.Random;

public class Coche 
{
	public int acelerar(int velocidad)
	{
				
		return ++velocidad;
	}
	
	public boolean multa() 
	{
		Random r = new Random();
		
		return r.nextBoolean();
	}
}
