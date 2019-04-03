package btp.assis_silva.estoque;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DescontoTest {
	@Test
	public void descontoTest()
	{
		double actual = new Desconto().porcentagem(3, 100.00);
		double expected = 0;
		assertEquals(expected, actual, 0.01);		
	}
}
