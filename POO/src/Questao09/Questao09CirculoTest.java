package Questao09;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Questao09CirculoTest {
	Circulo c;
	@Before
	public void setUp() throws Exception {
		c = new Circulo(2.0);
	}

	@Test
	public void testCalculaPerimetroCirculo() {
		Assert.assertEquals(12.56,c.calculaPerimetro(), 0.01);
	}
	@Test
	public void testCalculaAreaDoCirculo(){
		Assert.assertEquals(12.56, c.calculaArea(), 0.01);
	}
}
