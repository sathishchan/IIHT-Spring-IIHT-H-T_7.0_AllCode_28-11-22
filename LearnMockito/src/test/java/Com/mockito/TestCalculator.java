package Com.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	Calculator c = null;
	
	
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new Calculator(service);
		}
	
	@Test
	public void testperform() {
		
		when(service.add(110, 40)).thenReturn(150);
		assertEquals(150,c.perform(110, 40));
	}
	
}
	
	//@Test
	//public void testAdd() {
	//	assertEquals(150,c.add(100, 150));	
	//}
	//
	//@Test
	//public void testSub() {
	//	assertEquals(25,c.sub(30, 5));	
	//}
	
	//@Test
	//public void testMultiply() {
	//	assertEquals(25,c.multiply(5, 5));	
	//}

