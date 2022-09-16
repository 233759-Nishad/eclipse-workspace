package test.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Testcalculator {
	Calculator c = null;
	@Before
	public void setup(){
		c = new Calculator();
	}
	@Test
	public void testadd()
	{
		assertEquals(7,c.add(4, 3));
		assertEquals(8,c.add(5, 3));
		assertEquals(10,c.add(7, 3));
		assertEquals(34,c.add(4, 30));
	}

}
