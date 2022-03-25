package tests.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import main.model.ContaCorrente;

public class ContaCorrenteTest {
	private ContaCorrente c;
	
	@BeforeEach
	public void setup() {
		c = new ContaCorrente(1, 48923.43, 0);
	}
	
	@Test
	public void deveRetornarUmResultadoVerdadeiroCasoDepositoSejaEfetuado() {
		c = new ContaCorrente(1, 48923.43, 0);
		boolean resultado = c.depositar(382);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deveRetornarUmResultadoFalssoCasoODepositoNaoSejaEfetuado() {
		c = new ContaCorrente(1, 48923.43, 0);
		boolean resultado = c.depositar(0);
		assertEquals(false, resultado);
	}
	@Test
	public void deveRetornarUmResultadoVerdadeiroCasoOSacSejaEfetuado() {
		c = new ContaCorrente(1, 48923.43, 0);
		boolean resultado = c.sacar(48.32);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deveRetornarUmResultadoNegativoCasoOSacNaoSejaEfetuado() {
		c = new ContaCorrente(1, 48923.43, 0);
		boolean resultado = c.sacar(-1);
		assertEquals(false, resultado);
	}
}
