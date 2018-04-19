package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JUnit_Testing test=new JUnit_Testing();
		int output = test.square(5);
		
		assertEquals(25, output);
	}

}
