package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.Calculator;

class CalculatorTest {


	@Test
	void additionTest() {
		Calculator out = new Calculator();
		assertEquals(25,out.addition("2 23"));
		assertEquals(-3,out.addition("2 -5"));
	}
	@Test
	void multiplicationTest() {
		Calculator out=new Calculator();
		assertEquals(12,out.multiplication("3 4"));
		assertEquals(-1,out.multiplication("1 -1"));
		assertEquals(1,out.multiplication("-1 -1"));
	}
	@Test
	void divisioTest() {
		Calculator out=new Calculator();
		assertEquals(0,out.division(0, 2));
		
		assertThrows(ArithmeticException.class, () -> out.division(1, 0));
	}


}
