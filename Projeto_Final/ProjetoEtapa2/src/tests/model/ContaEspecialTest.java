package tests.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.ContaEspecial;

public class ContaEspecialTest {
	private ContaEspecial c;
	
	@BeforeEach
	public void setup() {
		c = new ContaEspecial(1, 3984.93, 1, 500.00);
	}
	
	@Test
	public void deveRetornarUmResultadoVerdadeiroCasoOSacSejaEfetuado() {
		c = new ContaEspecial(1, 3500, 1, 500.00);
		boolean resultado = c.sacar(4000);
		assertEquals(true, resultado);
	}
	
	@Test
	public void deveRetornarUmResultadoFalsoCasoOSacNãoSejaEfetuado() {
		c = new ContaEspecial(1, 3500, 1, 500.00);
		boolean resultado = c.sacar(4001);
		assertEquals(false, resultado);
	}
}
