package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class DivideTest {
	
	private Divider divider;

	
	@SuppressWarnings("deprecation")
	@Test
	public void WholeNumberTest() {
		divider = new Divider ();
		int expectedValue= 2;
		int actualValue = (int) divider.divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

	
	


}
