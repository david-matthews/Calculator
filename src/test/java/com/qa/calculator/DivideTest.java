package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class DivideTest {
	
	private Divider divider;

	
	@Test
	public void test() {
		divider = new Divider ();
		double expectedValue= 2.0;
		double actualValue = divider.divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
