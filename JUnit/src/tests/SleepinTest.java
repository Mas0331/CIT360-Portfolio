package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class SleepinTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		assertFalse(test.areFirstLastSame(""));
		assertFalse(test.areFirstLastSame("A"));
		assertTrue(test.areFirstLastSame("AAA"));
		assertTrue(test.areFirstLastSame("BBB"));
		assertTrue(test.areFirstLastSame("AAJDFSIDRAA"));
		
		
		
	}

}
