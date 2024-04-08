package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void testAssertArrayEquals() {
		// compara arrays: pegar arrays e comparar bytes
		byte[] esperado = "teste".getBytes();
		byte[] atual = "teste".getBytes();
		assertArrayEquals(esperado, atual);
	}

	@Test
	public void testAssertEquals() {
		// compara arrays: validar duas strings
		assertEquals("text", "text");
	}

	public void testAssertFalse() {
		// validar booleano: validar se objeto é false ou verdadeiro
		assertFalse(false);
	}

	@Test
	public void testAssertNotNull() {
		// Validar assert notNull "se objetos não esta retornando valor null"
		assertNotNull(new Object());

	}

	@Test
	public void testAssertNotSame() {
		// Validar assert notSame "se objetos não são os mesmos"
		assertNotSame(new Object(), new Object());

	}

	@Test
	public void testAssertNull() {
		// Validar assert Null "se objetos realmente esta null"
		assertNull(null);

	}

	@Test
	public void testAssertSame() {
		// Validar assert Same "se objetos são os mesmos"
		Integer aNumber = Integer.valueOf(765);
		assertSame(aNumber, aNumber);

	}

}
