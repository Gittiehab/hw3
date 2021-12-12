package test;

import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator 
{
	//All Tests worked as expected.
	Calculator calculator = new Calculator();
	int a = -4;
	int b = 3;
	int c = 0;
	
	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		Assert.assertTrue(calculator.add(a,b) == -1);
	}

	@ParameterizedTest
	@CsvSource({"2, 3", "-1, 6"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		Assert.assertTrue(calculator.add(valueOne, valueTwo) == 5);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		Assert.assertTrue(calculator.sub(b,a) == 7);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		Assert.assertTrue(calculator.multiply(a,b) == -12);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		Assert.assertTrue(calculator.divide(b,a) == -0.75f);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		assertThrows(ArrayIndexOutOfBoundsException.class , () -> calculator.divide(b,c));	
	}
}
