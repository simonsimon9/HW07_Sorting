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
		
		return sorting(a, 0, a.length-1);
	}
	
	public static <T extends Comparable<? super T>> T[] sorting(T[] a, int low, int high ) {
		if (low < high)
	    {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	        int pi = partition(a, low, high);

	        sorting(a, low, pi - 1);  // Before pi
	        sorting(a, pi + 1, high); // After pi
	    }
		return a;
	}
	
	public static  <T extends Comparable<? super T>> void swap(T[] array, int firstIndex , int secondIndex) {
		T temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		
		//passes by reference, returns by reference
		
	}
	
	public static <T extends Comparable<? super T>> int partition(T[] a, int firstIndex, int lastIndex) {
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
				right--;
				left++;
			}
			
		}
	
		if(a[left].compareTo(a[pivot]) < 0 ) {
			left++;
		}
		if(a[right].compareTo(a[pivot]) > 0 ) {
			right++;
		}
	
		if(a[left].compareTo(a[pivot])> 0) {
			
			swap(a, left, pivot);
			return left;
			
		}else {
			swap(a,right, pivot);
			return right;
		}
		
		//T temp = array[last];
		//array[last] = array[middle];
		//array[middle] = temp;
		
		
	}
	
	
}