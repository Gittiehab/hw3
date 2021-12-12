package test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import main.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

class TestCalendar {
	@ParameterizedTest
	@ValueSource(ints = {400, 1604, 2000, 1996, 12})
	public void Should_return_true(int year) {
		// Implement
		Calendar c = new Calendar(year);
		Assert.assertTrue(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {1300, 2021, 1400, 1994, -40})
	public void Should_return_false(int year) {
		// Implement
		Calendar c = new Calendar(year);
		Assert.assertTrue(!c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {564, 546, 7612, 7458, 3645})
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		Calendar c = new Calendar(year);
		GregorianCalendar g = new GregorianCalendar();
		Assert.assertEquals(c.isLeapYear(), g.isLeapYear(year));
	}

	// Create a new method for boundary testing
	@Test
	public void BoundaryTest()
	{
		int a = 0;
		
		//Ab hier Reste Mod 4 betrachtet.
		
		//Dieser Block sollte false sein, da die Zahlen <0 sind.
		int rest0smallest = Integer.MIN_VALUE;
		int rest1smallest = Integer.MIN_VALUE+1;
		int rest2smallest = Integer.MIN_VALUE+2;
		int rest3smallest = Integer.MIN_VALUE+3;
		
		//Nur 2000 sollte in diesem Block korrekt sein.
		int rest0typical = 2000;
		int rest1typical = 2001;
		int rest2typical = 2002;
		int rest3typical = 2003;
		
		//Nur Max_Value-3 sollte in diesem Block korrekt sein.
		int rest0largest = Integer.MAX_VALUE-3;
		int rest1largest = Integer.MAX_VALUE-2;
		int rest2largest = Integer.MAX_VALUE-1;
		int rest3largest = Integer.MAX_VALUE;
		
		//Ab hier 400 betrachtet.
		//Nur 400 sollte korrekt sein.
		int _400r399 = 399;
		int _400r0 = 400;
		int _400r1 = 401;	
		
		Assert.assertFalse(new Calendar(a).isLeapYear());
		
		Assert.assertFalse(new Calendar(rest0smallest).isLeapYear());
		Assert.assertFalse(new Calendar(rest1smallest).isLeapYear());
		Assert.assertFalse(new Calendar(rest2smallest).isLeapYear());
		Assert.assertFalse(new Calendar(rest3smallest).isLeapYear());
		
		Assert.assertTrue(new Calendar(rest0typical).isLeapYear());
		Assert.assertFalse(new Calendar(rest1typical).isLeapYear());
		Assert.assertFalse(new Calendar(rest2typical).isLeapYear());
		Assert.assertFalse(new Calendar(rest3typical).isLeapYear());
		
		Assert.assertTrue(new Calendar(rest0largest).isLeapYear());
		Assert.assertFalse(new Calendar(rest1largest).isLeapYear());
		Assert.assertFalse(new Calendar(rest2largest).isLeapYear());
		Assert.assertFalse(new Calendar(rest3largest).isLeapYear());
		
		Assert.assertFalse(new Calendar(_400r399).isLeapYear());
		Assert.assertTrue(new Calendar(_400r0).isLeapYear());
		Assert.assertFalse(new Calendar(_400r1).isLeapYear());
	}
}
