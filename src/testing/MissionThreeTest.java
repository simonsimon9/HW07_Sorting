package testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MissionOne;
import main.MissionThree;

public class MissionThreeTest {
	@Test
	public void test() {
		Integer[] test = new Integer[] {1,2,3,5,8,10};
		Integer[] expectedTest = new Integer[] {4,6,7,9};

		MissionThree.merge(test, expectedTest);
		assertEquals(MissionThree.merge(test, expectedTest), 3);


	}
}
