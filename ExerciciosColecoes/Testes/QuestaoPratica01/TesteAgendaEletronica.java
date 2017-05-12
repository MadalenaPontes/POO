package QuestaoPratica01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import QuestaoPratica01.AgendaEletronica;
import QuestaoPratica01.Contato;;

public class TesteAgendaEletronica {
	AgendaEletronica AE;
	Contato cont1;
	Contato cont2;
	Contato cont3;

	@Before
	public void setUp() throws Exception {
		AE = new AgendaEletronica();
		cont1 = new Contato("José",2222,"jose@gmail");
		cont2 = new Contato("Mercia",99999,"mercia@gmail");
		AE.addContato(cont1);
		AE.addContato(cont2);
		
		
	}

	@Test
	public void testAddContato() {
		Contato cont3 = new Contato("João",888888,"joao@gmail.com");
		AE.addContato(cont3);
		System.out.println(AE.getListContatos().size());
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
