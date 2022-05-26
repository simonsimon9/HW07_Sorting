package main;

public class MissionOne {

	/**
	 * Sort the array using an in-place sort, this algorithm must be:
	 * 
	 * in-place (no temporary arrays)
	 * stable
	 * O(n^2)
	 * 
	 * @param array
	 * @return array sorted
	 */
	public static <T extends Comparable<? super T>> T[] inplaceSort(T[] array) {
		for(int i = 0; i < array.length ; i++) {
			int sorted = array.length ;
			for(int j = 1; j < sorted;j--) {
				if(array[j].compareTo(array[j-1]) < 0) {
					T temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
			sorted--;
		}
		return array;
	}
	
}