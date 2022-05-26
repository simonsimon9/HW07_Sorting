package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MissionOne;
import main.MissionTwo;

public class MissionTwoTest {

	
	@Test
	public void testAdd() {
		Integer[] expected = new Integer[] {5,3, 1, null, null};
		MissionTwo<Integer> test = new MissionTwo<>(5);
		test.add(5);
		test.add(3);
		test.add(1);
		
		assertArrayEquals(test.data, expected);
	}
	
	@Test
	public void testAddOutOfOrder() {
		Integer[] expected = new Integer[] {5,3, 1, null, null};
		MissionTwo<Integer> test = new MissionTwo<>(5);
		test.add(1);
		test.add(5);
		test.add(3);
		assertArrayEquals(test.data, expected);
	}
	
	@Test
	public void testAddToFull() {
		Integer[] expected = new Integer[] {8,6,4, 3, 2};
		MissionTwo<Integer> test = new MissionTwo<>(5);
		test.add(2);
		test.add(8);
		test.add(3);
		test.add(4);
		test.add(6);
		
		assertArrayEquals(test.data, expected);

	}
	
	@Test
	public void testAddToOverSize() {
		Integer[] expected = new Integer[] {5,3, 1};
		MissionTwo<Integer> test = new MissionTwo<>(3);
		test.add(1);
		test.add(5);
		test.add(3);
		test.add(10);
		assertArrayEquals(test.data, expected);
	}

	@Test
	public void testRemove() {
		Integer[] expected = new Integer[] {8,6,4, 3, null};
		MissionTwo<Integer> test = new MissionTwo<>(5);
		test.add(2);
		test.add(8);
		test.add(3);
		test.add(4);
		test.add(6);
		
		assertEquals(test.remove(), (Integer)2 );
		assertArrayEquals(test.data, expected);
		

	}

	@Test
	public void testRemoveToEmpty() {
		Integer[] expected = new Integer[] {null, null, null};
		MissionTwo<Integer> test = new MissionTwo<>(3);
		test.add(2);
		test.add(8);
		test.add(3);
		
		test.remove();
		test.remove();
		test.remove();
		assertArrayEquals(test.data, expected);
		

	}
	
	@Test
	public void testRemoveToEmptyOver() {
		Integer[] expected = new Integer[] {null, null, null};
		MissionTwo<Integer> test = new MissionTwo<>(3);
		test.add(2);
		test.add(8);
		test.add(3);
		
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		test.remove();
		assertArrayEquals(test.data, expected);
		

	}
	
}
