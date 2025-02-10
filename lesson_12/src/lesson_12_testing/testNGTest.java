package lesson_12_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testNGTest {

	public class lesson_12_testing {

		@Test
		public void testCalculateFactorial() {
			assertEquals(Factorial(0), 1);
			assertEquals(Factorial(1), 1);
			assertEquals(Factorial(2), 2);
			assertEquals(Factorial(3), 6);
			assertEquals(Factorial(4), 24);
		}

		private Integer Factorial(int i) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}