package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();	//link to our original JunitTesting class and make a "test" object
		int output = test.square(10);			//this takes our "square" method in our JunitTesting and tests it against some number (10)
		assertEquals(100, output);				//"assertEquals" is what we want to find (what we expect, the input)
	}

}
