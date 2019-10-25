package br.com.fiap.tddcriptografia;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestadorCriptografico {

	@Test
	public void testeCriptograficoA() {

		Criptografadora conversor = new Criptografadora();
		int nroConvertido = conversor.criptografa('A');
		assertEquals(19, nroConvertido);
	}
	@Test
	public void testeCriptograficoB() {

		Criptografadora conversor = new Criptografadora();
		int nroConvertido = conversor.criptografa('B');
		assertEquals(11, nroConvertido);
	}
}