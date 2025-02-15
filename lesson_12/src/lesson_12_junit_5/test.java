package lesson_12_junit_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void testFactorial() {
		assertEquals(1,5, Factorial(0)); //специально неверное число внесла, чтобы проверить на работоспособность - вместо 1,5 написать 1
		assertEquals(1, Factorial(1));
		assertEquals(2, Factorial(2));
		assertEquals(6, Factorial(3));
		assertEquals(24, Factorial(4));
	}

	private Integer Factorial(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
