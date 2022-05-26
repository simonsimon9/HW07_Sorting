package main;

public class MissionTwo<T extends Comparable<? super T>> {

	public T[] data; //public for testing purposes
	private int size;
	/**
	 * Default Constructor
	 */
	public MissionTwo(int maxCapacity) {
		// TODO Constructor
		data =  (T[]) new Comparable[maxCapacity];
		size= 0;
	}
	
	/**
	 * Adds the item to the structure, must be
	 * 
	 * in-place
	 * stable
	 * O(n)
	 * 
	 * @param item
	 */
	public void add(T item)  {
		// TODO Method
		if(size == data.length) {
			
		}else if(size == 0) {
			data[0] = item;
			size++;
		}else {
			data[size] = item;
			size++;
			for(int i = size-1; i != 0 ; i--) {
				if(data[i].compareTo(data[i-1]) > 0) {
					T temp = data[i];
					data[i] = data[i-1];
					data[i-1] = temp;
				
				}
			}
		}
			
		
		
	}
	
	/**
	 * This must return the smallest element in this structure, must be
	 * 
	 * in-place
	 * stable
	 * O(1)
	 * 
	 * @return the smallest element currently in this structure
	 */
	public T remove() {
		if(size == 0) {
			return null;
		}else {
			T output = data[size-1];
			data[size-1] = null;
			size--;
			return output;
		}
	
	}
	
}