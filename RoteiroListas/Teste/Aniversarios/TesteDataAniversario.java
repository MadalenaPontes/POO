package Aniversarios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TesteDataAniversario {
	DataAniversario d1;
	DataAniversario d2;
	DataAniversario d3;


	@Before
	public void setUp() throws Exception {
		d1 = new DataAniversario(11,06,1998);
		d2 = new DataAniversario(15,12,2000);
		d3 = new DataAniversario(11,06,1998);
	}

	@Test
	public void test() {
		assertEquals(d1,d3);
		assertNotEquals(d1,d2);

	}
}
