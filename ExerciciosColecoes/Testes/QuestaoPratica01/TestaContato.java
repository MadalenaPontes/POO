package QuestaoPratica01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaContato {
	
	@Test
	public void testEquals() {
		
		Contato c1 = new Contato("Maria",99882288,"maria@gmail.com");
		Contato c2 = new Contato("Marcos",99881122,"marcos@gmail.com");
		Contato c3 = new Contato("Maria",99882288,"maria@gmail.com");
		
		assertEquals(false,c1.equals(c2));
		assertEquals(true,c1.equals(c3));
	}

	

}
