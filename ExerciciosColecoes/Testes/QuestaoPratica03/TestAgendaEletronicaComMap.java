package QuestaoPratica03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import QuestaoPratica03.AgendaEletronicaComMap;
import QuestaoPratica03.ContatoComMap;

public class TestAgendaEletronicaComMap {
	

	AgendaEletronicaComMap AE;
	ContatoComMap c1;
	ContatoComMap c2;
	ContatoComMap c3;
	ContatoComMap c4;
	
	@Before
	public void setUp() throws Exception {
		AE = new AgendaEletronicaComMap();
		 c1 = new ContatoComMap(2222,"jose@gmail");
		 AE.addContato("José", c1);
		 c2 = new ContatoComMap(99999,"mercia@gmail");
		 AE.addContato("Mércia", c2);
		 c3 = new ContatoComMap(555555,"joel@gmail");
		 AE.addContato("Joel", c3);
		 
		
	}

	@Test
	public void testAddContato() {
		c4 = new ContatoComMap(8888888,"italo@gmail");
		AE.addContato("Italo", c4);
		assertEquals(4,AE.getListContatos().size());
		
	}
	@Test
	public void testRemoverContato(){
		
		assertTrue(AE.removerContato(c2));
	}
	@Test
	public void testRemoverVarios(){
		
		assertEquals(3,AE.getListContatos().size());
		AE.removerContatos("J");
		assertEquals(1,AE.getListContatos().size());
	}
	@Test
	public void testListarContatos(){
		assertEquals(1,AE.listarContatos("M").size());
		
	}
	
	
}
	


