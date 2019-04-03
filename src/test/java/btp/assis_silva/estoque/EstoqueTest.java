package btp.assis_silva.estoque;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstoqueTest {
	
	private Estoque estoque;
	
	
	@Before
	public void setup() {
		estoque = new Estoque();
		
	}
	
    @Test
    public void givenEstoqueWhenqtdlessthan0ThenError() {
    	String actual = estoque.novo_produto("Prod1", -5, 120.56);
    	String expected = "Err: quantidade muito baixa";
    	assertEquals(expected, actual);
    }
    
    @Test
    public void givenEquivalenceqtdtestWhenvalidThenSuccess() {
    	String actual = estoque.novo_produto("Prod1", 5, 120.56);
    	String expected = "success";
    	assertEquals(expected, actual);
    }
    
    @Test
    public void givenEquivalenceqtdtestWheninvalidThenError() {
    	String actual = estoque.novo_produto("Prod1", 1570, 120.56);
    	String expected = "Err: quantidade muito alta";
    	assertEquals(expected, actual);
    }
    
    @Test
    public void givenEquivalencevalortestWhenvalidThenSuccess() {
    	String actual = estoque.novo_produto("Prod1", 500, -0.001);
    	String expected = "Err: valor muito baixo";
    	assertEquals(expected, actual);
    }
}
