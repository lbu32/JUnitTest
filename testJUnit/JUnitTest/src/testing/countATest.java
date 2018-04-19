package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JUnit_Testing test = new JUnit_Testing();
		int output = test.countA("alphabet");
		assertEquals(2, output);
	}
	

}
