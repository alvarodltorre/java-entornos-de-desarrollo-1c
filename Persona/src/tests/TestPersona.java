package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelos.Persona;

class TestPersona {

	/**
	 * Comprueba que una persona de 0 anios se muestra como men0r de edad.
	 */
	@Test
	void testPersonaEdad0() {
		Persona p = new Persona("nombre", "apellidos", 0);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 17 anios se muestra como menor de edad.
	 */
	@Test
	void testPersonaEdad17() {
		Persona p = new Persona("nombre", "apellidos", 17);
		String esperado = "Menor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 18 anios se muestra como mayor de edad.
	 */
	@Test
	void testPersonaEdad18() {
		Persona p = new Persona("nombre", "apellidos", 18);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 65 anios se muestra como mayor de edad.
	 */
	@Test
	void testPersonaEdad65() {
		Persona p = new Persona("nombre", "apellidos", 65);
		String esperado = "Mayor de edad";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que una persona de 66 anios se muestra como jubilada.
	 */
	@Test
	void testPersonaEdad66() {
		Persona p = new Persona("nombre", "apellidos", 66);
		String esperado = "Jubilado";
		String obtenido = p.mostrarEdad();
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que al intentar instanciarse una persona con edad negativa se lanza 
	 * la excepcion esperada.
	 */
	@Test
	void testPersonaEdadInvalidaMenos1() {
		Exception e = assertThrows(IllegalArgumentException.class,
				() -> new Persona("nombre", "apellidos", -1));
		
		String esperado = "La edad debe estar entre 0 y 130.";
		String obtenido = e.getMessage();
		assertEquals(esperado, obtenido);
	}
	
}
