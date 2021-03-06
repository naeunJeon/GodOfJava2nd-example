package chapter02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NumberObjectTest {

	@Test
	void test() {
		NumberObject num = new NumberObject();
		assertEquals(-1, num.parseLong("r1024"));
		assertEquals(1024, num.parseLong("1024"));
		
		String[] strings = {"10000000000", "400", "2000"};
		assertArrayEquals(strings, num.printOtherBase(1024));
	}

}


