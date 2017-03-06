package Questao01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Questao01RetanguloTest {

	Retangulo r ;
	@Before
	public void setUp() throws Exception {
		r = new Retangulo(3.0,5.0);
	}

	@Test
	public void testPerimetro() {
		Assert.assertEquals(16.0,r.perimetro(),0.001);
		
	}

	@Test
	public void testAreaRetangulo(){
		Assert.assertEquals(15.0, r.areaRetangulo(),0.001);
		
	}

}