package Aniversarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAniversariante {
	Aniversariante a;
	Aniversariante b;

	@Before
	public void setUp() throws Exception {
		a = new Aniversariante("Maria",11,10,1998);
		b = new Aniversariante("João",23,12,1990);
	}

	@Test
	public void testEhAniversarianteDomMes() {
		assertTrue(a.ehAniversarianteDoMes(10));
		assertFalse(b.ehAniversarianteDoMes(11));
		
		
	}

}
