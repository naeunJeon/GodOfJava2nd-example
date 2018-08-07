package chapter03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxFinderTest {

	@Test
	void test() {
		MaxFinder finder = new MaxFinder();
		assertSame(3, finder.getMax(1, 2, 3));
		assertSame(3, finder.getMax(3, 1, 2));
		assertSame(3, finder.getMax(2, 3, 1));
		assertSame("c", finder.getMax("a", "b", "c"));
		assertSame("c", finder.getMax("b", "c", "a"));
		assertSame("c", finder.getMax("a", "b", "c"));
	}

}
