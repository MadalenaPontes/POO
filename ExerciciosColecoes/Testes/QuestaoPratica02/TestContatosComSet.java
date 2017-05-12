package QuestaoPratica02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestContatosComSet {

	@Test
	public void testContato() {
		ContatoComSet c1 = new ContatoComSet("Victor",99999,"victor@gmail");
		ContatoComSet c2 = new ContatoComSet("Joana",7777,"joana@gmail");
		assertEquals(c1.compareTo(c1),0);
		assertNotEquals(c1.compareTo(c2),1);
		
	}

}
