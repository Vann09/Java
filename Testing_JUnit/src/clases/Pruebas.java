package clases;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas 
{

	@Test
	public void test() {
		
		int numeros1[]= {1,2,3};
		int numeros2[] = {1,2,3};
		
		assertArrayEquals(numeros1, numeros2);
	}
	@Test
	public void test2() {
		
		int numeros1[]= {1,2,3};
		int numeros2[] = {1,4,3};
		
		assertArrayEquals(numeros1, numeros2);
	}

}