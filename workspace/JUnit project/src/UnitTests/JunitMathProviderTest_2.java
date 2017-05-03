package UnitTests;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Application.MathProvider;

public class JunitMathProviderTest_2 {
	MathProvider provider;
	
	public JunitMathProviderTest_2() {
		provider = new MathProvider();
	}

	@Test
	public void multiply() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 2;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void devide() {
		System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 2;
		assertEquals(firstNumber / secondNumber, provider.Device(firstNumber, secondNumber));
		System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
}
