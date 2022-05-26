package testing;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.MissionOne;

public class MissionOneTest {
	@Test
	public void testQuickSort() {
		Integer[] test = new Integer[] {10,7,12,6,3,2,8};
		Integer[] expectedTest = new Integer[] {2,3,6,7,8,10,12};

		MissionOne.inplaceSort(test);
		for(Integer element: test) {
			System.out.print(element + " ");
		}
		assertArrayEquals(test, expectedTest );
		
	}
	
	@Test
	public void testQuickSort2() {
		Integer[] test = new Integer[] {10,1,4,3,11,2};
		Integer[] expectedTest = new Integer[] {1,2,3,4,10,11};

		MissionOne.inplaceSort(test);
		
		assertArrayEquals(test, expectedTest );
		
	}
}
