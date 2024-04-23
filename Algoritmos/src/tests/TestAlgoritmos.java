package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmos {

	@Test
	void sumatorio() {
		int sumaEsperada = 10;
		int sumaObtenida = Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada, sumaObtenida);
	}
	
	@Test
	void sumatorioParamIncorrecto() {
		Exception e = assertThrows(IllegalArgumentException.class,
				() -> Algoritmos.sumatorio(-1));
		String esperado = ("El numero debe ser igual o superior a 00.");
		String obtenido = e.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void factorial() {
		int factorialEsperado = 6;
		int factorialObtenido = Algoritmos.sumatorio(3);
		assertEquals(factorialEsperado, factorialObtenido);
	}

}
