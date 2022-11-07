package WeightConverter;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightConvertTest {
	
	WeghtConvert k = new WeghtConvert();

	@Test
	public void kiloConvertTest() {
		assertEquals(55, k.poundToKilo(110));
	}

	@Test
	public void poundConvertTest() {
		assertEquals(110, k.kiloToPound(55));
	}
	
}
