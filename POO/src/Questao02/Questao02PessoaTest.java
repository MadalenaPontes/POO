package Questao02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Questao02PessoaTest {
	
	Pessoa p;
	@Before
	public void setUp() throws Exception {
		p = new Pessoa("Maria",15,1.60,60,"feminino");
	}

	@Test
	public void testCalculaIMC() {
		Assert.assertEquals(23.43, p.calculaIMC(),0.01);
	}
	


}
