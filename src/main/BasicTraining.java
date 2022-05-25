package main;

public class BasicTraining {

	/**
	 * Sort the array using quick sort, this must be:
	 * 
	 * in-place (no temporary arrays)
	 * O(n log n)
	 * 
	 * @param array
	 * @return a sorted array
	 */
	public static <T extends Comparable<? super T>> T[] quickSort(T[] a) {
		
		int middle = (a.length - 1) / 2;
		int last = (a.length - 1);
		
		swap(a, middle, last);
		int pivot = last;
		
		int left = 0;
		int right = last - 1;
		
		while(left < right) {
			if(a[left].compareTo(a[pivot]) < 0 ) {
				left++;
			}
			
			if(a[right].compareTo(a[pivot]) > 0){
				right--;
			}
			
			if(a[left].compareTo(a[pivot]) > 0 && a[right].compareTo(a[pivot]) < 0) {
				swap(a, left, right);
				left++;
				right--;
			}
			
		}
		
		swap(a, pivot, left);
		
		//T temp = array[last];
		//array[last] = array[middle];
		//array[middle] = temp;
		
		return a;
	}
	
	public static  <T extends Comparable<? super T>> void swap(T[] array, int firstIndex , int secondIndex) {
		T temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		
		//passes by reference, returns by reference
		
	}
	
	public static <T extends Comparable<? super T>> T[] partition(T[] a, int firstIndex, int lastIndex) {
		int middle = (lastIndex + firstIndex)/ 2;
		int last = lastIndex;
		
		swap(a, middle, last);
		int pivot = last;
		
		int left = firstIndex;
		int right = pivot - 1;
		
		while(left < right) {
			if(a[left].compareTo(a[pivot]) < 0 ) {
				left++;
			}
			
			if(a[right].compareTo(a[pivot]) > 0){
				right--;
			}
			
			if(a[left].compareTo(a[pivot]) > 0 && a[right].compareTo(a[pivot]) < 0) {
				swap(a, left, right);
				System.out.println("swapped");
				left++;
				right--;
			}
			print(a, pivot, left, right);
		}
		
		swap(a, pivot, left);
		
		//T temp = array[last];
		//array[last] = array[middle];
		//array[middle] = temp;
		
		return a;
		
	}
	public static <T extends Comparable<? super T>> void print(T[] array, int pivot, int first, int last) {
		
		for(T element: array){
			System.out.print(element + " ");
		}
		System.out.print("    pivot is at: " + pivot +
						 " left is at: " +first+
						 " right is at: " + last);
		System.out.println("\n-------------");
	}
	
}