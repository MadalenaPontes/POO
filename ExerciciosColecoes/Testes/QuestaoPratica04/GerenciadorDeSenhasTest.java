package QuestaoPratica04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import QuestaoPratica04.Senha;
import QuestaoPratica04.GerenciadorDeSenhas;

public class GerenciadorDeSenhasTest {
	GerenciadorDeSenhas gerenciador;
	Senha s1;
	Senha s2;

	@Before
	public void setUp() throws Exception {
		gerenciador = new GerenciadorDeSenhas(true);
		gerenciador.emitirSenha("Madalena", 18, 657771717);
		gerenciador.emitirSenha("Victoria", 68, 256666666);
		
	}

	@Test
	public void testEmitirSenha() {
		assertEquals(gerenciador.getSenhas().size(),2);
	}
	@Test
	public void testProximaSenha() {
		
		Senha sen = new Senha("Victoria",68,256666666);
		assertEquals(gerenciador.proximaSenha(),sen);
		
	}

}
