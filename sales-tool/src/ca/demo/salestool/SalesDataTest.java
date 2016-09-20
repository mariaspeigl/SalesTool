package ca.demo.salestool;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalesDataTest {

	@Test
	public void testDisplay() {
		SalesData data = new SalesData();
		String test = data.getStringTest();
		assertTrue("test" == test);
	}

}
