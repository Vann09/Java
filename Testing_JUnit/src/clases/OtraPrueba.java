package clases;

import static org.junit.Assert.*;

import org.junit.Test;

public class OtraPrueba {

	@Test
	public void test() {
		Coche miCoche=new Coche();
		//fail("Not yet implemented");
		//assertEquals(101, miCoche.acelerar(100));
		assertTrue(miCoche.multa());
	}

}
