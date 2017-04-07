package Aniversarios;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TesteMinhaAgendaDeAniversario {
	MinhaAgendaDeAniversarios agenda;

	@Before
	public void setUp() throws Exception {
		agenda = new MinhaAgendaDeAniversarios();
	}
	@Test
	public void testAdicionarAniversariante() {
		agenda.adicionarAniversariante("João", 22, 11, 2000);
		assertEquals(1,agenda.getAniversarios().size());
		
		agenda.adicionarAniversariante("Maria", 15, 07, 1999);
		assertEquals(2,agenda.getAniversarios().size());
		
		agenda.adicionarAniversariante("Meire", 31, 01, 1995);
		assertNotEquals(5,agenda.getAniversarios().size());
		
	}
	@Test
	public void testobterAniversariantesDoMes(){
		List<String> aniversariantesDoMes;
		agenda.adicionarAniversariante("Thiago", 14, 12, 1970);
		agenda.adicionarAniversariante("Lucas", 29, 10, 1998);
		agenda.adicionarAniversariante("Miguel", 14, 12, 1999);
		aniversariantesDoMes = agenda.obterAniversariantesDoMes(12);
		assertEquals(2, aniversariantesDoMes.size());
		assertNotEquals(6,aniversariantesDoMes.size());
		
	}	
	@Test
	public void testRemoverAniversariante(){
		agenda.adicionarAniversariante("Elen", 25, 11, 1999);
		agenda.adicionarAniversariante("Márcia", 12, 11, 1979);
		agenda.adicionarAniversariante("Mara", 11, 01, 1997);
		agenda.removerAniversariante("Elen");
		assertEquals(2,agenda.getAniversarios().size());
		assertNotEquals(3,agenda.getAniversarios().size());
		
	}
		
}


