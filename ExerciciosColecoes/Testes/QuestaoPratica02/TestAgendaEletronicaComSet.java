package QuestaoPratica02;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import QuestaoPratica02.AgendaEletronicaComSet;
import QuestaoPratica02.ContatoComSet;

public class TestAgendaEletronicaComSet {
	

	AgendaEletronicaComSet AE;
	ContatoComSet cont1;
	ContatoComSet cont2;
	ContatoComSet cont3;

	@Before
	public void setUp() throws Exception {
		AE = new AgendaEletronicaComSet();
		cont1 = new ContatoComSet("José",2222,"jose@gmail");
		cont2 = new ContatoComSet("Mercia",99999,"mercia@gmail");
		AE.addContato(cont1);
		AE.addContato(cont2);
		
		
	}

	@Test
	public void testAddContato() {
		ContatoComSet c1 = new ContatoComSet("João",888888,"joao@gmail.com");
		AE.addContato(c1);
		assertEquals(3,AE.getListContatos().size());
	}
	@Test
	public void testRemoverContato(){
		assertTrue(AE.removerContato(cont2));
	}
	@Test
	public void testRemoverVarios(){
		assertEquals(2,AE.getListContatos().size());
		AE.removerContato("Jo");
		assertEquals(1,AE.getListContatos().size());
	}
	@Test
	public void testListarContatos(){
		AE.listarContatos("M");
		assertEquals(1,AE.listarContatos("M").size());
		
	}
	
	
	
	
}
