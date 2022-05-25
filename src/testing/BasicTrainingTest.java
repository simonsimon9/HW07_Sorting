package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BasicTraining;

public class BasicTrainingTest {

	
	@Test
	public void testSwap() {
		Integer[] test = new Integer[] {2,6,5,3,8,7,1,0};
		Integer[] expectedTest = new Integer[] {2,6,5,0,8,7,1,3};
		int last = test.length-1;
		int middle=  (test.length - 1) / 2;
		
		BasicTraining.swap(test, middle, last);
		
		assertArrayEquals(test,expectedTest);
	}
	
	@Test
	public void testPartition() {
		Integer[] test = new Integer[] {2,6,5,3,8,7,1,0};
		Integer[] expectedTest = new Integer[] {2,1,0,3,8,7,6,5};
		int first = 0;
		int last = test.length - 1;
		BasicTraining.partition(test, first, last);
		assertArrayEquals(test,expectedTest);
		
	}
	
	@Test
	public void testPartition0to4() {
		Integer[] test = new Integer[] {2,1,0,3,8,7,6,5};
		Integer[] expectedTest = new Integer[] {2,1,0,3,6,5,7,8};
	
		int first = 4;
		int last = (test.length - 1);
		BasicTraining.partition(test, first, last);
		for(int element: test) {
			System.out.print(element + " ");
		}
		System.out.println("");
		for(int element: expectedTest){
			System.out.print(element + " ");
		}
		assertArrayEquals(test,expectedTest);
	}
}
