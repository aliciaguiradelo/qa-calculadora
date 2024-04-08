package calculadora;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestClass {

	Calculadora calc = new Calculadora();
	@Test
	public void testSoma() {
		int valor1 = 2;
		int valor2 = 3;
		int resultado = calc.somar(valor1,valor2);
		assertEquals(5, resultado);
		
	}

}
