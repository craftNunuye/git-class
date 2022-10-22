package calculatorProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void addTest() {
		assertEquals(33, calc.add(12,7) );
	}
	
	@Test
	public void subtractTest() {
		assertEquals(5, calc.subtract(12,7) );
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(84, calc.multiply(12,7) );
	}
	
	@Test
	public void divideTest() {
		assertEquals(1, calc.divide(12,7) );
	}
	
	@Test
	public void modulusTest() {
		assertEquals(5, calc.modulus(12,7) );
	}

	
}
