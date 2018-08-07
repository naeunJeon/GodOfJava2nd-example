package chapter02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NumberObjectTest {

	@Test
	void test() {
		NumberObject num = new NumberObject();
		assertEquals(-1, num.parseLong("r1024"));
		assertEquals(1024, num.parseLong("1024"));
	}
}

