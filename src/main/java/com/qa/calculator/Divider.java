package com.qa.calculator;

public class Divider {

	public double divide(int num1, int num2) {
		if (num2 != 0) {

			double sum = num1 / num2;
			return sum;
		}
		else
		{
			System.out.println("Cannot Divide By Zero");
			return 0;
		}
	}
}
