package Questao08;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Questao08FuncionarioTest {

	Data dataNascimento;
	@Before
	public void setUp() throws Exception {
		dataNascimento = new Data(20,11,1980);
	}

	@Test
	public void testCalculaImpostoFuncionarioComum() {
		Funcionario funcionario = new Funcionario("Marcos",dataNascimento,15000);
		Assert.assertEquals(450, funcionario.calculaImposto(), 0.001);
	}
	@Test
	public void testCalculaImpostoGerente(){
		Gerente gerente = new Gerente("Vinicius",dataNascimento,30000,"TI");
		Assert.assertEquals(1500, gerente.calculaImposto(), 0.01);
	}
}
